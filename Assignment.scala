object Assignment{
  def main(args:Array[String]) {

    sudesh()
  }
  def sudesh(): Unit ={
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var s:String = "SUDESH"
    val E=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
    val D=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)

    val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))
    val ct=cipher(E,s,1,alphabet)
    val pt=cipher(D,ct,1,alphabet)

    println(s)
    println(ct)
    println(pt)
  }
  }