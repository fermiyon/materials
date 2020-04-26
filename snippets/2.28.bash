$ ./mill foo.test
[info] Compiling 1 Scala source ...
[info] Done compiling.
-------------------------------- Running Tests --------------------------------
+ foo.ExampleTests.hello 8ms  Hello World
+ foo.ExampleTests.iAmCow 0ms  I am Cow

$ ./mill foo.test foo.ExampleTests.hello
--------------------- Running Tests foo.ExampleTests.hello ---------------------
+ foo.ExampleTests.hello 8ms  Hello World

$ ./mill foo.test foo.ExampleTests.iAmCow
-------------------- Running Tests foo.ExampleTests.iAmCow --------------------
+ foo.ExampleTests.iAmCow 7ms  I am Cow
