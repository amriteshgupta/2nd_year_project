import java.lang.Exception
import java.util.*
import java.util.Arrays.toString

fun main() {
    // Write your code
//val s="Hello You are Learning Kotlin"
//    val stringLength = s.length
//    val stringIndex = s.get(0)
//
//    println("The length of the string is :${stringLength}")
//    println("The element at index 9: ${s[9]}")
//
//    println(stringIndex)
//    val i=9
//    println("Value is $i")
//    val newArray:Array<Any> =arrayOf("1,2,3,4")
//    println(newArray.contentToString())
//    OR
//    println(Arrays.toString(newArray))

//var string = ("Kotlin Programs")
//    val i= length(string)

//    val joey= "How you Doin."
//    println(joey[1.5])
//    var array1=arrayOf(1,3,4.5,"Hello",'c')
//    println(contentToString(array1))


//    ********************************************
//    Internship certificate work
//    println("This is line 1")
//    print("This is line 2")
//    print("This is line 1")
//    println("This is line 2")
//    var wholeNumber = 18
//    var fractionalNumber = 3.5
//    var sentence ="A new sentence"
//    var condition = false
//    var character = 's'
//    var floatingNumber =56.34f
//
//    val number = 2345
//    val decimal = 5.6
//    val name = "Internshala"
//    val conditions= true
//    val char= 'r'
//    val floatNumber = 56.34f
//
//    wholeNumber= wholeNumber+40
//    fractionalNumber= 34.56
//
//    println(wholeNumber)
//    println(fractionalNumber)
//    println(sentence)
//    println(conditions)
//
//    println(number)
//    println(decimal)
//    println(conditons)
//val s ="Welcome to Kotlin"
//    val stringlength =s.length
//    val stringIndex = s.get(12)
//
//    println(stringlength)
//    println("The character at index 12 is ${s.get(12)}")
//
//
//println(s.subSequence(0,7))
//iAmANewFunction()
//    println(timesTwo(4))
//var characterArray:Array<Char> = arrayOf('i','n','t','e','r')
//
//    val charArray= arrayOf('a','b','c','d','e')
//
//    val otherArray=arrayOf<Char>('l','m','n','o','p')
//    val newArr:Array<Any>  = arrayOf("Hello",12, 32.5, true, 'x')

//val stringArray:Array<String> = arrayOf("Hello","Kotlin", "Programmer")
//    println(stringArray [1])
//    stringArray[1] ="My New String"
//    println(stringArray[1])
//
//    println(stringArray.size)
//
//    stringArray[3]="Increasing Size"
//
//    println(stringArray[3])
//println((stringArray).contentToString())

//    val a=10
//    val b=17

//    if(b==0){
//        println("Division cannnot be performed")
//    }
//    else{
//        println(a/b)
//    }
//    if (a>b){
//        println("a is greater than b")
//    }
//    else {
//        println("b is greater than a")
//    }
//val maxValue: Int

//    if (a>b){
//        maxValue=a
//    }
//    else{
//        maxValue=b
//    }
//
//    println(maxValue)
//}
//    maxValue = if (a>b){
//        a
//    } else{
//        b
//    }
//
//    println(maxValue)
//    }
//var maxValue: Int = if(a>b){
//    a
//}
//else {
//    b
//}
//    if (a>b){
//     println("a is greater than b")
//    }
//    else if(b>a){
//        println("b is greater than a")
//    }
//    else {
//        println("Both are equal")
//    }
//     val num=2
//
//    when(num){
//        0-> println("Zero")
//        1-> println("One")
//        2->println("Two")
//        3-> println("Three")
//        else -> println("None of the above")
//    }
//val num =0
//    when{
//        num>0-> println("Positive")
//        num<0-> println("Negative")
//        else -> println("Zero")
//    }

//val a=0
//
//    if( a>0 ||  a<0){
//        println("It is a non-zero integer")
//    }
//    else {
//        println("The integer is zero")
//    }
//    var a=5
//    if(!(a>=0 && a<=5)){
//        println("The value of the integer is between 0-5")
//    }
//        else {
//            println("The value of the integer is not between 0-5")
//        }
//    var a=5
//    if(!(a in 0..5)){
//        println("The value of the integer is between 0-5")
//    }
//    else {
//        println("The value of the integer is not between 0-5")
//    }
//    val num=5
//
//    when(num){
//        in 1..10 -> println("Between 1 to 10")
//        in 11..20 -> println("Between 11 to 20")
//        else -> println("None")
//    }
//     for(i in 1..10){
//         println(i)
//     }

//var i= 1
////    while(i<=10) {
////        println(i)
////        i++
////    }
//
//    do{
//        println(i)
//        i++
//    }while (i<=10)

//    val a = arrayOf("a","b","c","d","e")
//
//    for (i in 0 until a.size){
//        println("${a[i]}")
//    }
//var i= 1
//    while (i<=10) {
//        println(i)
//        i += 2
//    }
//
//    var k =1
//    do {
//        println(k)
//        k+=2
//    }
//        while (k<=10)

//    for(i in 10 downTo 1){
//        println(i)
//    }
//var i= 10
//    while(i>0){
//        println(i)
//        i--
//    }
//    var k=10
//    do{
//        println(k)
//        k--
//    }
//while (k>0)
//val listOfThings = listOf<String>("Kotlin","C","Java","JavaScript")
//   listOfThings[1]="Python"
//println(listOfThings)
//    val listOfThings= mutableListOf<String>("Kotlin","Box","Humour")
//    listOfThings[1] = "Air"
////    listOfThings.// To find ways to perform different operations
//    listOfThings.add("Java")
//    listOfThings.add(1,"Python")
//    listOfThings.add(2,"React")
//    listOfThings.removeAt(3)
//
//    var arr= arrayOf("Node.js","React","Angular")
//    listOfThings.addAll(arr)
//
//    println(listOfThings)
//    println(listOfThings.size)
//    var arrayList= arrayListOf<String>("Kotlin","Java","Python","Anaconda")
//    println(arrayList)

//    TRY_CATCH BLOCK--------------------
//    val d = arrayOf(3,4,5,6)
//
//    try {
//        d[4]=7
//        println("Exception")
//    }catch (e: Exception){
//println("Error")
//    }
//    println(d[3])

//     var a= null
//    println(a)

//    var nullValue: String? = null
//    println(nullValue?.length ?:"This is null")

//    val nullList= listOf(1,2,4,null,5,null,6)
//
//    val nullArrayList= arrayListOf("This",null,"is","a",null,"statement")
//
//    println("This list without the null values is ${nullList.filterNotNull()}")
//    println("This array list without the null value is ${nullArrayList.filterNotNull()}")



































//fun iAmANewFunction():Unit{
//    println("I am your new function")
//}
//fun timesTwo(x: Int): Int =x*2
}
