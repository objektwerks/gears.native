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