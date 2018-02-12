//最初に●●が出現する位置を返す関数
fun first(str : String): Int{
  tailrec fun go(str:String,index:Int):Int =
    when{
      str.isEmpty() -> -1
      str.first() ->index
      else -> go(str.drop(1),index + 1)
    }

    return go(str , 0)
}
//末尾再帰（tail recursion）として知られる関数型プログラミングのスタイルのサポートをしている。
//これは通常ループで各アルゴリズムを、スタックオーバーフローを起こすリスクなく再起を使ってかけるようにしてくれる。
//要求される形を満たした上で関数の頭にtailrec修飾子をつけると、コンパイラが再起を高速で効率的なループに置き換えて最適化する。
