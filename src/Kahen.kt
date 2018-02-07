fun sum(vararg ints: Int):Int{
  var sum = 0
  for(i in ints){
    sum += i
  }
  return sum
}

fun main(args : Array<String>)
{
 sum(1,2,3)
}
