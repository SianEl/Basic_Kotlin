fun main(){
    // 반복문 : for, while, do-while

    val a1 = 1..10 // 1부터 10까지 범위 변수

    // kotlin에서 for문은 java 처럼 선언문, 조건문, 증감문 형태가 아닌 변수 in 배열 형태로 ( ) 안에 있는 배열 범위만큼 무조건 반복한다.
    for(item in a1){
        println("a1: ${item}")
    }
    /*
        결과
        a1: 1
        a1: 2
        a1: 3
        a1: 4
        a1: 5
        a1: 6
        a1: 7
        a1: 8
        a1: 9
        a1: 10
     */

    println("-----------------------------")

    // 범위 변수
    val a2 = 1..10 step 2 // 1부터 10까지 2씩 증가하는 값들만 갖는 범위변수
    for(item in a2){
        println("a2: ${item}")
    }
    /*
        결과
        a2: 1
        a2: 3
        a2: 5
        a2: 7
        a2: 9
     */

    println("--------------------------")

    val a3 = 10..1 // 10부터 1까지 증가? 조건이 맞지 않지만 오류를 발생하지 않고 빈 객체를 변수에 담는다.
    for(item in a3){
        println("a3: ${item}")
    }
    /*
        결과

     */

    println("--------------------------")

    val a4 = 10 downTo 1 // 10부터 1까지 감소하여 만드는 범위 변수
    for(item in a4){
        println("a4: ${item}")
    }
    /*
        결과
        a4: 10
        a4: 9
        a4: 8
        a4: 7
        a4: 6
        a4: 5
        a4: 4
        a4: 3
        a4: 2
        a4: 1
     */

    println("---------------------------")

    val a5 = 10 downTo 1 step 2 // downTo에서도 step을 사용할 수 있다.
    for(item in a5){
        println("a5: ${item}")
    }

    /*
        결과
        a5 10
        a5 8
        a5 6
        a5 4
        a5 2
     */

    println("-----------------------------")

    // while문 및 do-while문
    var a6 = 0
    while(a6 < 10){
        println("a6: ${a6}")
        a6++ // while문은 for문 처럼 배열을 갖고 반복하는 것이 아닌 조건식만으로 판단하기에 내부 코드에서 반드시 증감식이 있어야 반복문을 벗어날 수 있다.
    }

    /*
        결과
        a6: 0
        a6: 1
        a6: 2
        a6: 3
        a6: 4
        a6: 5
        a6: 6
        a6: 7
        a6: 8
        a6: 9
     */

    println("-----------------------------")

    var a7 = 100
    while(a7 < 10){
        println("a7: ${a7}")
        a7++
    }

    /*
        결과

     */

    println("------------------------------")

    var a8 = 0
    do{
        println("a8: ${a8}")
        a8++
    }while(a8 < 10)

    /*
        결과
        a8: 0
        a8: 1
        a8: 2
        a8: 3
        a8: 4
        a8: 5
        a8: 6
        a8: 7
        a8: 8
        a8: 9
     */

    println("------------------------------")

    var a9 = 100
    do{
        println("a9: ${a9}")
        a9++
    }while(a9 < 10)

    /*
        결과
        a9: 100
     */

    println("--------------------------------")

    /*
        while문과 do-while문의 차이점은 조건식의 위치로
        while문은 조건이 거짓이면 while문 내부 코드를 수행하지 않고 넘어가지만
        do-while문은 조건이 거짓이여도 최소 한 번은 내부 코드를 수행한 후 넘어간다.
     */
}