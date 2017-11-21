fun main(args: Array<String>){
    //Kotlinでは文の後ろにセミコロンはいらない
    val i =3 //頭にvalって付けると変更不可
    var j =5// 頭にvarって付けると変更可能。変更が必要でない限りvalを優先して使うと幸せになれる。

    val a:Byte = 1 // 明示的に型を指定するにはこう書く

    val sum=i+j+a

    println(sum)
}