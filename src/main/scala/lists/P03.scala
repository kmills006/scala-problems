package lists {
  // Find the Kth element of a list
  object P03 {
    def findElement[A](n: Int, ls: List[A]): A =
      if (n >= 0) ls(n)
      else throw new NoSuchElementException

    def findElementRecursive[A](n: Int, ls: List[A]): A =
      (n, ls) match {
        // Return the element at the index
        case (0, h :: _) => h

        // Call the method again
        // tail() turns a collection consisting of the all the elements
        // except the first one
        case (n, _ :: tail) => findElementRecursive(n - 1, tail)

        // Throw error
        case (_, Nil) => throw new NoSuchElementException
      }
  }
}
