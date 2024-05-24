package objektwerks

import gears.async.Async

import scala.annotation.tailrec

import sttp.client4.{quickRequest, UriContext}
import sttp.client4.curl.CurlBackend

@tailrec
def factorial(n: Int, acc: Int = 1): Int =
  n match
    case i if i < 1 => acc
    case _ => factorial(n - 1, acc * n)

@tailrec
def reverse[A](list: List[A], acc: List[A] = List.empty[A]): List[A] =
  list match
    case Nil => acc
    case head :: tail => reverse(tail, head :: acc)

def getJoke()(using Async): String =
  val json = quickRequest
    .get( uri"https://api.chucknorris.io/jokes/random" )
    .send( CurlBackend() )
    .body
  parseJson(json)

private def parseJson(json: String): String = ujson.read(json)("value").str