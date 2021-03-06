//バケツオブジェクトの作成
fun main(args: Array<String>){
  val backet = object{

    //バケツの容量
    val capacity: Int = 5

    //入っている水の量
    var quantity: Int = 0

    //バケツを水で満たす
    fun fill(){
      quantity = capacity
    }

    //排水する
    fun drainAway(){
      quantity = 0
    }
    //入っている水の量を出力する
    fun printQuantity(){
      println(quantity)
    }
  }

  backet.printQuantity()
  backet.fill()
  backet.printQuantity()
  backet.drainAway()
  backet.printQuantity()
}
