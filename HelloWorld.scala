import cats.implicits._

object HelloWorld extends App {
  println("Hello, World!")

  // Using a cats function
  implicit val tupleSemigroup: cats.Semigroup[(Int, Int)] = Semigroup.instance {
    case ((a1, b1), (a2, b2)) => (a1 + a2, b1 + b2)
  }

  val result = (1, 2).combine((3, 4))
  println(s"Result of combining (1, 2) and (3, 4): $result")
}

