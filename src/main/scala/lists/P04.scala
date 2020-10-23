package lists {
  // Find the number of elements in a a list.
  object P04 {
    def length[A](ls: List[A]): Int = ls.length

    def lengthRecursive[A](ls: List[A]): Int =
      ls match {
        case Nil       => 0
        case _ :: tail => 1 + lengthRecursive(tail)
      }

    def lengthTailRecursive[A](ls: List[A]): Int = {
      def lengthR(result: Int, currentList: List[A]): Int =
        currentList match {
          case Nil       => result
          case _ :: tail => lengthR(result + 1, tail)
        }

      lengthR(0, ls)
    }

    // foldLeft() takes an associative binary operator function as a param
    // and will use it to collapse elements from the collection.
    // recursive function and will help prevent stack-overflow exceptions
    def lengthFunctional[A](ls: List[A]): Int =
      ls.foldLeft(0) { (c, _) => c + 1 }
  }
}
