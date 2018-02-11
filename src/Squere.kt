fun squere(i: Int): Int= i*i


fun main(args: Array<String>){
  //普通の関数のように呼び出している。
  val functionObject = ::squere
  println(functionObject(5))
}
