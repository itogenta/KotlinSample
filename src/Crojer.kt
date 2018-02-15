/* fun foo():Int{
  val a = 1
  val b = 2
  return a + b
} */

/* fun bar(): Int{
  val  c = 3
  return a + c //aにアクセスできずにコンパイルエラーがでる。
} */

//クロージャーについて、getCounterが返す関数オブジェクトを介して、getCounterで宣言された変数countにアクセスしてます。
//関数getCounterで定義されたローカル変数鵜を関数mainでアクセスすることができる。
//このようにコードを記述した時のスコープで変数が扱える関数オブジェクトをクロージャーと読んでいる。
fun getCounter(): () -> Int{
  var count=0
  return{
    count++
  }
}

fun main(args: Array<String>){
  val counter1 =getCounter()
  val counter2 =getCounter()

  println(counter1())
  println(counter1())
  println(counter2())
  println(counter1())
  println(counter2())
  println(counter1())

}
