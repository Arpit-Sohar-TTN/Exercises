/**
 * Created by arpit on 19/4/17.
 */
class Exercise11 {
     static void main(String[] args) {
//         println "Table of 2 \n\n"
//    10.times {i-> println 2*(i+1)}
//    println "Table of 12\n\n"
//         1.upto(10){ it-> println 12*it}
        println "Please Enter number "
         Scanner scanner = new Scanner(System.in)
         int x = scanner.nextInt()
         println( "Table of "+x)
         10.times {it-> println x*(it+1)}
    }
}
