/**
 * Created by arpit on 19/4/17.
 */
class Exercise3 {
     static void main(String[] args) {
        List firstList = [11, 12, 13, 14]
        List secondList =  [13, 14, 15]
        List result = firstList - secondList
        print result
         assert  result == [11,12]
    }
}
