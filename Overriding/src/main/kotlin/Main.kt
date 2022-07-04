fun main(){
    val obj1 = SubClass1()
    println("obj1.subA1 : ${obj1.subA1}")
    obj1.subMethod1()

    println("obj1.superA1 : ${obj1.superA1}")
    obj1.superMethod1()
    /*
        결과
        obj1.subA1 : 200
        SubClass1의 subMethod1입니다.
        obj1.superA1 : 100
        SuperClass1의 superMethod1입니다.
     */

    println("-----------------------------------------")

    val obj2:SuperClass1 = obj1
    println("obj2.sueperA1 : ${obj2.superA1}")
    obj2.superMethod1()
    /*
        결과
        obj2.superA1 : 100
        SuperClass1의 superMethod1입니다.

        obj1은 subClass로 만든 객체주소를 가지고 있다.(자기 안에 sub관련 내용 만듬)
        obj1의 주소값을 부모클래스 참조변수인 obj2에 담았다,(부모 클래스형 타입의 변수이므로 자식클래스 내용은 사용 할 수 없다.)
     */

    println("---------------------------------------------")

    val obj3:SubClass2 = SubClass2()
    obj3.SuperMethod2()

    val obj4:SuperClass2 = obj3
    obj4.SuperMethod2()

    println("----------------------------------------------")
    val obj5:SuperClass3 = SuperClass3()
    overridingTest(obj5)

    val obj6:SubClass3 = SubClass3()
    overridingTest(obj6)
    // overridingTest의 매개변수는 부모클래스 참조변수여서 부모 클래스에 정의된 메서드를 사용할 것 같았지만
    // Overriding효과로 인해 자식 클래스 참조변수를 통해 만들어진 부모 클래스 참조 변수는 자식의 Overriding한 메서드 내용을 호출 한다.
    /*
        결과
        SuperClass3의 superMethod3
        SubClas3의 superMethod3
     */

}

open class SuperClass1 {
    var superA1 = 100

    fun superMethod1(){
        println("SuperClass1의 superMethod1입니다.")
    }
}

class SubClass1 : SuperClass1() {
    var subA1 = 200

    fun subMethod1(){
        println("SubClass1의 subMethod1입니다.")
    }
}

open class SuperClass2 {
    open fun SuperMethod2(){
        println("SuperClass2의 superMethod2")
    }
}

class SubClass2 : SuperClass2() {
    override fun SuperMethod2() {
        println("SubClass2의 superMethod2")
    }
}

open class SuperClass3 {
    open fun superMethod3(){
        println("SuperClass3의 superMethod3")
    }
}

class SubClass3 : SuperClass3(){
    override fun superMethod3() {
        println("SubClas3의 superMethod3")
    }
}

fun overridingTest(obj1:SuperClass3){
    obj1.superMethod3()
}