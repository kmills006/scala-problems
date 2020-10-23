package lists {
  object P05 {
    def reverseList[A](ls: List[A]): List[A] = ls.reverse

    def reverseRecursive[A](ls: List[A]): List[A] =
      ls match {
        case Nil       => Nil
        case h :: tail => reverseRecursive(tail) ::: List(h)
      }

    def reverseTailRecursive[A](ls: List[A]): List[A] = {
      def reverseR(result: List[A], currentList: List[A]): List[A] =
        currentList match {
          case Nil       => result
          case h :: tail => reverseR(h :: result, tail)
        }

      reverseR(Nil, ls)
    }

    def reverseFunctional[A](ls: List[A]): List[A] =
      ls.foldLeft(List[A]()) { (r, h) => h :: r }
  }
}
