//最初に大文字が出現する位置を返す関数
fun firstUpperCase(str:String): Int{
  tailrec fun go(str:String,index:Int): Int =
    when {
      str.isEmpty() -> -1
      str.first().isUpperCase() -> index
      else -> go(str.drop(1),index + 1)
    }
    return go(str,0)
}
