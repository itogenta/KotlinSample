//ラムダ式
val square:(Int) -> Int ={
  i:Int -> i*i
}

fun main(args: Array<String>){
  println(square(5))
  println(square2(10))
}

val square2:(Int) -> Int ={
  i -> i*i
}
