Gears Native
------------
>Gears Native feature tests using uJson, Sttp and Scala 3.

Failure
-------
```
[info] Linking (multithreadingEnabled=true, disable if not used) (2704 ms)
[info] Discovered 2167 classes and 15868 methods after classloading
[info] Loaded 0 service provider(s) for 1 referenced service(s):
[info] |------------------------------------------------------------------|
[info] | Service                              | Service Provider | Status |
[info] |------------------------------------------------------------------|
[info] | java.nio.charset.spi.CharsetProvider | ---              | NoProviders |
[info] |------------------------------------------------------------------|
[info] Checking intermediate code (quick) (131 ms)
[info] Discovered 1744 classes and 7791 methods after optimization
[info] Optimizing (release-fast mode) (8959 ms)
[info] Produced 81 LLVM IR files
[info] Generating intermediate code (8362 ms)
[info] Compiling to native code (10183 ms)
[info] Linking with [pthread, dl, idn2, curl]
[error] ld: library 'idn2' not found
[error] clang: error: linker command failed with exit code 1 (use -v to see invocation)
[info] Total (24370 ms)
[error] Failed to link /Users/tripletail/workspace/gears.native/target/scala-3.4.2/native/objektwerks.runApp
[error] (Compile / nativeLink) Failed to link /Users/tripletail/workspace/gears.native/target/scala-3.4.2/native/objektwerks.runApp
[error] Total time: 25 s, completed May 24, 2024, 10:46:38 AM
```

Build
-----
1. sbt clean compile

Run
---
1. sbt run

Resources
---------
* [Gears Github](https://github.com/lampepfl/gears)
* [Gears Book](https://blog.nkagami.me/gears-book/introduction.html)
* [Scala Direct Style Gears](https://github.com/lampepfl/gears)
* [Odersky Direct Style Talk](https://www.youtube.com/watch?v=0Fm0y4K4YO8)
* [Odersky Scala Turns 20](https://www.youtube.com/watch?v=sNos8aGjJMA)