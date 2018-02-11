class Couter{
  private var cnt =0

  fun countUp():Unit{
    cnt++
  }
  fun getCount():Int =cnt
}



//countUpの仕事としてcntを値を変化させることであり、何か面白い値を返すことではない
//返り値の型がUnitであることに注意が必要。Unitは関心のある値ではないことを意味する型。そのため、返り値の型がUnitである関数の中でreturnする必要はない。
//返り値の型がUnitである関数は、実は際には値を返す。Unitは型であryち
