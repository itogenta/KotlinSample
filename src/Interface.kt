interface Bucket

fun main(args: Array<String>){
  val bucket = object : Bucket{

    val capacity: Int = 5

    var quantity: Int = 0

    fun fill(){
      quantity = capacity
    }

    fun drainAway()
    {
      quantity = 0
    }

    fun printQuantity(){
      println(quantity)
    }

    fun pourTo(that: Bucket){

    }
  }

  bucket.printQuantity()
  bucket.fill()
  bucket.printQuantity()
  bucket.drainAway()
  bucket.printQuantity()
}
