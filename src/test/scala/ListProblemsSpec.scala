import org.scalatest.flatspec.AnyFlatSpec

import lists.{P01, P02}

class ListProblemsSpec extends AnyFlatSpec {
  val fabFive: List[String] =
    List("Mickey", "Minnie", "Donald", "Goofy", "Pluto")

  "P01.last" should "return the last element" in {
    val actual: String = P01.last(fabFive)
    assert(actual == "Pluto")
  }

  "P01.lastRecursive" should "return the last element recursively" in {
    val actual: String = P01.lastRecursive(fabFive)
    assert(actual == "Pluto")
  }

  "P01.lastRecursive" should "throw NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      P01.lastRecursive(List())
    }
  }

  "P02.lastButOne" should "return the second to last element." in {
    val actual: String = P02.lastButOne(fabFive)
    assert(actual == "Goofy")
  }

  "P02.lastButOne" should "throws NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      P02.lastButOne(List())
    }
  }

  "P02.lastNth" should "return the element at the nth position." in {
    val actual: String = P02.lastNth(2, fabFive)
    assert(actual == "Goofy")
  }

  "P02.lastNth" should "throws IllegalArgumentException" in {
    assertThrows[IllegalArgumentException] {
      P02.lastNth(0, fabFive)
    }
  }

  "P02.lastNth" should "throws NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      P02.lastNth(10, fabFive)
    }
  }
}
