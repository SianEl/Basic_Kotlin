import kr.co.softcampus.module.pkg1.TestClass1
import kr.co.softcampus.module.pkg1.TestClass2
import kr.co.softcampus.module.pkg2.TestClass3
import kr.co.softcampus.module.pkg2.TestClass4

// 서로 다른 모듈 안의 기능을 사용하기 위해서는 모듈을 등록해야 한다.

fun main(){
    val obj1 = TestClass1()
    val obj2 = TestClass2()
    val obj3 = TestClass3()
    val obj4 = TestClass4()

    obj1.testMethod1()
    obj2.testMethod2()
    obj3.testMethod3()
    obj4.testMethod4()
}