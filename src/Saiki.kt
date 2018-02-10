/* fun sum(vararg ints: Int):Int{
  var sum = 0
  for(i in ints){
    sum += i
  }
  return sum
} */


tailrec fun sum(numbers: List<Long>,accumulator: Long = 0 ):Long=
  if(numbers.isEmpty()) 0
  else numbers.first() + sum(numbers.drop(1))

fun main(args : Array<String>)
  {
   sum((1.1111).toList())
  }
//isEmptyはListメソッドでリストの要素数が空の場合に限りtrueを返し、リストが空か否かを判断している。
//空でない場合firstはリストの先頭要素を返すメソッド。dropはリストの先頭から指定された数の分だけ要素を取り除いた新しいリストを返すメソッド
//ここではnumbers.drop(1)としているため、numbersの先頭の要素を除いた、残りの要素で構成されたリスト返します。
//TCOを有効にするには、tailrecを関数につける必要がある。
