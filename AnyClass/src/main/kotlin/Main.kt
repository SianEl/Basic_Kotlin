fun main(){
    val obj1 = TestClass1()
    println("obj1 : $obj1")
    /*
        결과
        obj1 : TestClass1의 객체입니다.
     */
    println("--------------------------")
    val obj2 = TestClass2()
    val obj3 = TestClass3()

    testFun1(obj1)
    testFun1(obj2)
    testFun1(obj3)
    /*
        결과
        obj: TestClass1의 객체입니다.
        obj: TestClass2의 객체입니다.
        obj: TestClass3의 객체입니다.
     */
}

class TestClass1 {
    override fun toString(): String {
        return "TestClass1의 객체입니다."
    }
}

class TestClass2 {
    override fun toString(): String {
        return "TestClass2의 객체입니다."
    }
}

class TestClass3 {
    override fun toString(): String {
        return "TestClass3의 객체입니다."
    }
}

fun testFun1(obj:Any){
    println("obj: $obj")
}