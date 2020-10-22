package lists {
  // Find the last element of a list.
  object P01 {
    def last[T](ls: List[T]): T = ls.last

    def lastRecursive[T](ls: List[T]): T =
      ls match {
        case h :: Nil  => h
        case _ :: tail => lastRecursive(tail)
        case _         => throw new NoSuchElementException
      }
  }
}
