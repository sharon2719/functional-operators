fun main() {
    var name : String="Hello Sharon"
    println(name)

    var result=modulus(33,8)
    println (result)

    var reSult=addition(789,678,567,345,)
    println(reSult)

    var singer: Boolean=true
    println(singer)


}
fun modulus(num1:Int,num2: Int): Int {
    var  modulus=num1%num2
    return modulus

}
fun addition(no1: Int,no2: Int,no3: Int,no4: Int): Int {
    var addition=no1+no2+no3+no4
    return addition

}
