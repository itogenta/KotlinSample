//ラムダ式と高階関数
fun firstWhitespace(str: String): Int{
  val isWhitespace: (Char) -> Boolean = {
    it.isWhitespace()
  }
  return first(str,isWhitespace)//ここでエラーが発生する。
}
