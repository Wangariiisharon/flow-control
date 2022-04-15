fun main (){

    oddNumbers()
    printmutiples()
    serve(18)
}



fun oddNumbers(){
    for (num in 1..100){
       (num%2 !=0)
      println(num)
  }
}
fun namesArray(names:Array<String>):Int{
    var x=0
    for (name in names){
        if (name.length>5)
            x++
    }
    return x
}
fun printmutiples(){
   for (number in 1..100)
    if (number %3==0 && number % 5==0) {
        println("Fizzbuzz")
    }
   else if  (number% 3==0){
            println("fizz")
       }
    else if (number%5==0)  {
      println("buzz")
   }
    else{
        println(number)

}
}
fun serve(age:Int){
    if(age <6){
println("glass of milk")
    }
    else if (age <=6 && age>=15){
        println("bottle of fanta orange")
    }
    else {
println("CocaCola")
    }
}
