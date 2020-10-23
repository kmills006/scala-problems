import org.scalatest.flatspec.AnyFlatSpec

import lists.{P01, P02, P03, P04, P05}

class ListProblemsSpec extends AnyFlatSpec {
  val fabFive: List[String] =
    List("Mickey", "Minnie", "Donald", "Goofy", "Pluto")

  "P01.last" should "return the last element" in {
    val actual = P01.last(fabFive)
    assert(actual == "Pluto")
  }

  "P01.lastRecursive" should "return the last element recursively" in {
    val actual = P01.lastRecursive(fabFive)
    assert(actual == "Pluto")
  }

  "P01.lastRecursive" should "throw NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      P01.lastRecursive(List())
    }
  }

  "P02.lastButOne" should "return the second to last element." in {
    val actual = P02.lastButOne(fabFive)
    assert(actual == "Goofy")
  }

  "P02.lastButOne" should "throws NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      P02.lastButOne(List())
    }
  }

  "P02.lastNth" should "return the element at the nth position." in {
    val actual = P02.lastNth(2, fabFive)
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

  "P03.findElement" should "return the element at the Kth position." in {
    val actual = P03.findElement(0, fabFive)
    assert(actual == "Mickey")
  }

  "P03.lastNth" should "throws NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      P03.findElement(-10, fabFive)
    }
  }

  "P03.findElementRecursive" should "return the element at the Kth position." in {
    val actual = P03.findElementRecursive(2, fabFive)
    assert(actual == "Donald")
  }

  "P03.findElementRecursive" should "throws NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      P03.findElementRecursive(-10, fabFive)
    }
  }

  "P04.length" should "return the length of the list." in {
    val actual = P04.length(fabFive)
    assert(actual == 5)
  }

  "P04.lengthRecursive" should "return the length of the list recursively." in {
    val actual = P04.lengthRecursive(fabFive)
    assert(actual == 5)
  }

  "P04.lengthRecursive" should "return 0 for an empty list." in {
    val actual = P04.lengthRecursive(List())
    assert(actual == 0)
  }

  "P04.lengthTailRecursive" should "return the length of the list recursively." in {
    val actual = P04.lengthTailRecursive(fabFive)
    assert(actual == 5)
  }

  "P04.lengthTailRecursive" should "return 0 for an empty list." in {
    val actual = P04.lengthTailRecursive(List())
    assert(actual == 0)
  }

  "P04.lengthFunctional" should "return 0 for an empty list." in {
    val actual = P04.lengthFunctional(fabFive)
    assert(actual == 5)
  }

  "P05.reverseList" should "reverse the order of the list" in {
    val actual = P05.reverseList(fabFive)
    assert(actual == fabFive.reverse)
  }

  "P05.reverseRecursive" should "reverse the order of the list" in {
    val actual = P05.reverseRecursive(fabFive)
    assert(actual == fabFive.reverse)
  }

  "P05.reverseTailRecursive" should "reverse the order of the list" in {
    val actual = P05.reverseTailRecursive(fabFive)
    assert(actual == fabFive.reverse)
  }

  "P05.reverseFunctional" should "reverse the order of the list" in {
    val actual = P05.reverseFunctional(fabFive)
    assert(actual == fabFive.reverse)
  }
}
