```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y // Forgot to handle potential exceptions
  }
}
```