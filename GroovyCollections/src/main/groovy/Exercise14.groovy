/**
 * Created by arpit on 19/4/17.
 */
class Exercise14 {
     static void main(String[] args) {
    def range = 1..100
         println range
      List result =   range.findAll {
             if (it%15 == 0)
                 print "FizzBuzz "
           else if (it%3 == 0)
                 print "Fizz "
            else if (it%5 == 0)
                 print "Buzz "
             else
                 print it+" "
         }
         //println result
    }
}
