package kotlinTest

import org.omg.CORBA.Object


fun callCall(){

    var i:Int = 20;
    println("${i.javaClass.name} ai = $i")
    var u:UInt = 20u;
    println("${u.javaClass.name} au = $u")
    var l:Long = 20L;
    println("${l.javaClass.name} al = $l")
    var f:Float = 20.2f;
    println("${f.javaClass.name} af = $f")
    var d:Double = 20.2;
    println("${d.javaClass.name} ad = $d")

    val e = 10;
    println("constant int e =  $e")
    val ee:Int
    ee = 20;

    var s1:String
    s1= "hello"
    var s2:String
    s2 ="world"

    var s3:String = s1 + " " +s2
    println("string merge s3 =  $s3")
    var s4:String = "$s1 $s2 !!"
    println("template literals s4 =  $s4")

    var ai = 20;
    println("auto convert ${ai.javaClass.name} ai = $ai")
    var au = 20u;
    println("auto convert ${au.javaClass.name} au = $au")
    var al = 20L;
    println("auto convert ${al.javaClass.name} al = $al")
    var af = 20.2f;
    println("auto convert ${af.javaClass.name} af = $af")
    var ad = 20.2;
    println("auto convert ${ad.javaClass.name} ad = ${ad}")


    var sumN = ai.plus(al);
    println("auto convert ${sumN.javaClass.name} ai + al = ${sumN}")
    var subtractN = ai - ad
    println("auto convert ${subtractN.javaClass.name} ai - ad = ${subtractN}")
    var multiplyN = ai * af ;
    println("auto convert ${multiplyN.javaClass.name} ai * af = ${multiplyN}")
    var diviedN = ai / af ;
    println("auto convert ${diviedN.javaClass.name} ai / af = ${diviedN}")

    var as1 = "auto convert";
    println("auto convert string as1 = $as1")


    var arrayN = arrayOf(1,2,3,4,5)
    println("auto convert ${arrayN.javaClass.name} ${arrayN[0]}")
    println("testFn return ${testFn().javaClass.name} ${testFn()}")

    val ur = User()
   // ur.age
    ur.age = 20
    ur.userName = "tony"

    println("user name: ${ur.userName}, age: ${ur.age}")
    ur.see("sky")
    ur.speak("my name is ${ur.userName}")


    var ifi = 20
    var ifj = 3


    if (ifi == 10){
        ifj = 20
    }
    else{
     ifj = 40
    }

    println("Statement if: ifi = $ifi so ifj=$ifj")

    var if2i = 20
    var if2j = if(if2i == 20){
        60
    }else{
        70
    }

    println("Expression if: if2i = $if2i so if2j=$if2j")

    var wi = 10;
    var wj = 0;

    when(wi){
        0 ->{
            wj = 4
        }
        10 ->{
            wj=10
        }
        else ->{
           wj = 20
        }
    }
    println("Statement when: wi = $wi so wj=$wj")

    var w2i = 10
    var w2j = when(wi){
        0 ->{
             14
        }
        10 ->{
            1
        }
        else ->{
            30
        }
    }
    println("Expression when: w2i = $w2i so w2j=$w2j")

    var arr = intArrayOf(1,2,3,8,7,8,9)

    if(8 in arr){
        println("search... there is 8")
    }else{
        println("not found")
    }

    for (arrI in arr.indices){
        println(arr[arrI])
    }

    var asI = 10
    var strI = asI.toString()
    if(strI is String){
        println("strI = $strI")
    }
}

fun testFn():Int{
    return 10;
}
open class human(){
    var sex:String = "man"
        set(value) {
            field = value
        }
        get() = field
    var age:Int = 0

    init{

    }

    open fun speak(v:String) = println(v)
    open fun see(v: String) = println(v)
}
class User:human() {
    var name = ""
    var userName
        get() = "~$name~"
        set(v){
            name = v
        }

    override fun speak(v: String) {
        println("I'm speaking....")
        super.speak(v)

    }

    override fun see(v: String) {
        println("I'm seeing....")
        super.see(v)

    }
}

class User2 {
    var age = 10
    // 私有函数，所以其返回类型是匿名对象类型
    private fun getUserName() = object {
        val userName = "Czh"
    }

    // 公有函数，所以其返回类型是 Any
    fun getAge() = object{
        var age:Int = 0

        public fun getMyAge():Int{
            return age
        }
    }

    fun get() {
        getUserName().userName
        //getAge().age //编译错误
    }
}