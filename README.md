Java Kata Seed
==============

This is a seed for working on Scala katas.

Tasks
-----

[SBT](http://www.scala-sbt.org/) is used for execution of tasks.

Source Code
-----------

Code is located in standard directories:

* src/test/scala: Directory with test packages and classes
* src/main/scala: Directory with implementation packages and classes

Running Tests
-------------

[Specs2](http://etorreborre.github.io/specs2/) dependency is provided for test asserts.

To run all tests:

```bash
sbt test
```

To run tests whenever there is a change in the code:
 
```bash
sbt ~test-quick
```
 



