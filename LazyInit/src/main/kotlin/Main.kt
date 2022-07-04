fun main(){
    val obj = TestClass1()
    println("obj.a1 : ${obj.a1}")

    // println("obj1.a3 : ${obj.a3}")
    // 결과 : lateinit pro  perty a3 has not been initialized -> 변수가 초기화 되기 전에 사용해서 발생한 오류

    obj.testMethod1()
    println("obj.a3 : ${obj.a3}")
    /*
        결과
        a3 : 문자열
        obj.a3 : 문자열
     */
    println("obj.a4 : ${obj.a4}")
    /*
        결과
        a4 init
        obj.a4 : 문자열
     */


}

class TestClass1{
    var a1:Int = 100
    var a2:Int // 변수 선언과 동시에 초기화 하지 않고 init을 사용한 케이스, 변수 선언에서 반드시 자료형을 붙여야 한다는 조건이 있다.
    lateinit var a3:String //초기화를 사용자가 원하는 시점에서 할 수 있도록 하는 케이스, val을 사용할 수 없으며 일반 자료형은 lateinit을 사용할 수 없다.
    val a4:String by lazy {
        println("a4 init")
        "문자열"
    }
    init {
        a2 = 200
    }

    fun testMethod1(){
        if(::a3.isInitialized == false){
            a3 = "문자열"
        }
        println("a3 : $a3")
    }
}