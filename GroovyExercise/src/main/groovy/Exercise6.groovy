/**
 * Created by arpit on 18/4/17.
 */
class Exercise6 {
     static void main(String[] args) {
         println "10 multiples of 3 by times method"
        10.times{x->println 3*(x+1) }
        println """

=============================================================================



"""
         println "10 multiples of 3 by for loop"
         for (int i = 0; i < 10 ; i++) {
             println 3*(i+1)
         }

         println """

=============================================================================



"""
         println "10 multiples of 3 by each "

         (1..10).each {
             println 3*it
         }
    }
}