fun main(){
    val obj1 = TestClass1()
    println("obj1: ${obj1}")
    /*
        결과
        객체가 생성되면 자동으로 동작하는 부분
        obj1: TestClass1@6b2fad11
     */

    val obj2 = TestClass2()
    println("obj2: ${obj2}")
    println("obj2.v1: ${obj2.v1}")
    println("obj2.v2: ${obj2.v2}")
    /*
        결과
        매개변수가 없는 생성자
        obj2: TestClass2@73f792cf
        obj2.v1: 0
        obj2.v2: 0
     */

    val obj3 = TestClass2(100, 200)
    println("obj3: ${obj3}")
    println("obj3.v1: ${obj3.v1}")
    println("obj3.v2: ${obj3.v2}")
    /*
        결과
        매개변수가 두 개인 생성자
        obj3: TestClass2@17550481
        obj3.v1: 100
        obj3.v2: 200
     */

    println("-------------------------------")
    val obj4 = TestClass3(300, 500)
    val obj5 = TestClass4(1000, 2000)

    println("obj4.a1: ${obj4.a1}")
    println("obj4.a2: ${obj4.a2}")

    println("obj5.a1: ${obj5.a1}")
    println("obj5.a2: ${obj5.a2}")

    /*
        결과
        obj4.a1: 300
        obj4.a2: 500
        obj5.a1: 1000
        obj5.a2: 2000
     */

    println("----------------------------------")

    val obj6 = TestClass5(100, 200)
    println("obj6.a1: ${obj6.a1}")
    println("obj6.a2: ${obj6.a2}")

    /*
        결과
        init 코드 수행
        a1: 100
        a2: 200
        obj6.a1: 100
        obj6.a2: 200
     */

    println("----------------------------------")

    val obj7 = TestClass5(100)
    println("obj7.a1: ${obj7.a1}")
    println("obj7.a2: ${obj7.a2}")

    /*
        결과
        init 코드 수행
        a1: 100
        a2: 100
        보조 생성자 호출
        obj7.a1: 100
        obj7.a2: 100
     */



}

class TestClass1 {
    init {
        println("객체가 생성되면 자동으로 동작하는 부분")
    }
}

class TestClass2{
    var v1:Int = 0
    var v2:Int = 0

    constructor(){
        println("매개변수가 없는 생성자")
    }

    constructor(a1:Int, a2:Int){
        println("매개변수가 두 개인 생성자")
        v1 = a1
        v2 = a2
    }
}

class TestClass3 (var a1:Int, val a2:Int){

}

class TestClass4 constructor(var a1:Int, val a2:Int){

}

class TestClass5 (var a1:Int, val a2:Int){
    init {
        println("init 코드 수행")
        println("a1: $a1")
        println("a2: $a2")
    }

    constructor(a1:Int) : this(a1, 100){
        println("보조 생성자 호출")
    }
}

class TestClass6 {
    var a1:Int = 0
    var a2:Int = 0

    init {
        println("init 코드 수행")
        println("a1: $a1")
        println("a2: $a2")
    }

    constructor(a1:Int, a2:Int){
        this.a1 = a1
        this.a2 = a2
    }
}