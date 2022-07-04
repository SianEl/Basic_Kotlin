fun main(){
     val obj1 = TestClass1(100, 200)
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

    obj1.a1 = 1000
    println("obj1.a1 : ${obj1.a1}" )
    /*
        결과
        obj1.a1 : 100
        obj1.a2 : 200
        obj1.a1 : 1000
     */

    println("-----------------------------------")

    val obj2 = TestClass2()
    obj2.v1 = 100 // 실제 Java로 디컴파일 하면 setter로 작성하는 부분
    // obj2.v2 = 500 // TestClass2의 v2변수는 val로 선언 되어 있어 getter만 사용할 수 있다.
    println("obj2.v1 : ${obj2.v1}")
    println("obj2.v2 : ${obj2.v2}")

    obj2.v3 - 5000
    println("obj2.v3 : ${obj2.v3}" )
}


class TestClass1 constructor(var a1:Int, val a2:Int){
    /*constructor(var a1:Int, val a2:Int, var a3:Int) : this (a1, a2){
        // 보조 생성자에서 선언하는 변수들에게는 var, val을 사용할 수 없다.

    }*/
}

class TestClass2 {
    var v1:Int = 0
    val v2:Int = 0
    get() {
        println("v2 호출")
        return field
    }
    var v3:Int = 100
       // get() = field
    get() {
        println("get 호출")
           return field
    }
    set(value) {
        println("set 호출")
        field = value
    }
}