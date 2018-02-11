//与えられた文字列で、最初にKが出現する位置を返す。
fun firstK(str: String):Int{
  tailrec fun go(str: String, index:Int): Int =
    when{
      str.isEmpty() -> 1
      str.first() == 'K' -> index
      else -> go(str.drop(1),index + 1)
    }
    return go(str,0)
}
