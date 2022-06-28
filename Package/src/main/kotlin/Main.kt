import kr.co.softcampus.pkg1.TestClass1
import kr.co.softcampus.pkg1.TestClass2
import kr.co.softcampus.pkg1.testFunction1
import kr.co.softcampus.pkg1.testFunction2
import kr.co.softcampus.pkg2.*

fun main(){
    val obj: TestClass1 = TestClass1()
    obj.testMethod1()
    testFunction1()

    val obj2:TestClass2 = TestClass2()
    obj2.testMethod2()
    testFunction2()
}