fun sum(numbers: List<Long>):Long{
  tailrec fun go(numbers:List<Long>,accumulator: Long):Long=
      if(numbers:isEmpty()) accumulator
      else go(numbers.drop(1),accumulator + numbers.first())
      return go(numbers,0)
}
//関数の定義の中に、別の関数を定義することができる。これをローカル関数という。
//ローカル関数の使い方として、スコープの制限をしたい時である。
