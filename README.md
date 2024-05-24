Gears Native
------------
>Gears Native feature tests using uJson, Sttp and Scala 3.

Build
-----
1. sbt clean compile

Run
---
1. sbt run

Publish
-------
1. sbt clean compile nativeLink
2. mv target/scala-{version}/scala-native-out target/scala-{version}/gears-app
3. sudo cp target/scala-{version}/gears-app /usr/local/bin

Execute
-------
1. gears-app

Resources
---------
* [Gears Github](https://github.com/lampepfl/gears)
* [Gears Book](https://blog.nkagami.me/gears-book/introduction.html)
* [Scala Direct Style Gears](https://github.com/lampepfl/gears)
* [Odersky Direct Style Talk](https://www.youtube.com/watch?v=0Fm0y4K4YO8)
* [Odersky Scala Turns 20](https://www.youtube.com/watch?v=sNos8aGjJMA)