package objektwerks

import gears.async.{Async, Future, Retry, SyncChannel, withTimeout}
import gears.async.Channel.Closed
import gears.async.Retry.Delay
import gears.async.default.given

import scala.concurrent.duration.DurationInt

@main
def runApp: Unit = ???

private def future(): Unit =
  Async.blocking:
    val joke = Future( getJoke() ).await
    println(s"* future: $joke")

private def futures(): Unit =
  Async.blocking:
    Seq(
      Future( getJoke() ),
      Future( getJoke() )
    )
    .awaitAll
    .foreach(joke => println(s"* futures: $joke"))

private def select(): Unit =
  Async.blocking:
    val number = Future( factorial(11) )
    val list = Future( reverse( List(3, 2, 1) ) )
    val winner = Async.select(
      number.handle: n =>
        // always wins! so is it a race? :)
        s"async select > factorial of 11 = ${n.get}",
      list.handle: l =>
        s"async select > reversed List(3, 2, 1) = ${l.get}"

    )
    println(s"* $winner")

private def timeout(): Unit =
  Async.blocking:
    withTimeout(10.seconds):
      println(s"* timeout: ${getJoke()}")

private def retry(): Unit =
  Async.blocking:
    Retry
      .untilSuccess
      .withMaximumFailures(2)
      .withDelay( Delay.constant(3.seconds) ):
        println(s"* retry: ${getJoke()}")