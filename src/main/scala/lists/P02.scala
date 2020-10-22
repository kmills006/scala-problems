package lists {
  // Find the last but one element of a list.
  object P02 {
    // init(): find all the elements of the list except the last
    def lastButOne[T](ls: List[T]): T =
      if (ls.isEmpty) throw new NoSuchElementException
      else ls.init.last

    def lastNth[T](n: Int, ls: List[T]): T = {
      if (n <= 0) throw new IllegalArgumentException
      if (ls.length < n) throw new NoSuchElementException

      // takeRight(): a collection containing the last n elements of
      // this collection
      // head: selects the first element of the collection
      ls.takeRight(n).head
    }
  }
}
