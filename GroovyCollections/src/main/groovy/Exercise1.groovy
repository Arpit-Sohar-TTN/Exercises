import org.w3c.dom.ranges.Range

/**
 * Created by arpit on 19/4/17.
 */
class Exercise1 {
     static void main(String[] args) {
    List list = (1..10)
         List evenElemenmtsList = []
         list.each {
           if(  it%2 == 0 )
               evenElemenmtsList.add(it)
         }
         println "Even Elements list : "+evenElemenmtsList
         assert evenElemenmtsList == [2,4,6,8,10]
    }
}
