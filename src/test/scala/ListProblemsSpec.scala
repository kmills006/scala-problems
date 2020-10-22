import org.scalatest.flatspec.AnyFlatSpec

import lists.{P01}

// import List.P01

class ListProblemsSpec extends AnyFlatSpec {
  val fabFive: List[String] =
    List("Mickey", "Minnie", "Donald", "Goofy", "Pluto")

  "P01.last" should "return the last element" in {
    val result = P01.last(fabFive)
    assert(result == "Pluto")

    println(P01)
  }

  "P01.lastRecursive" should "return the last element recursively" in {
    val result = P01.lastRecursive(fabFive)
    assert(result == "Pluto")
  }

  "P01.lastRecursive" should "throw NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      P01.lastRecursive(List())
    }
  }
}
