/**
 * Created by arpit on 19/4/17.
 */
class Exercise4 {
    static void main(String[] args) {

        List firstList = [11, 12, 13, 14]
        List secondList =  [1,4]
        println """First List is ${firstList} """
        println """Second List is ${secondList} """
        boolean flag = firstList.disjoint(secondList)
       if (flag)
           print "No Common Elements"
        else
           print "Common elements found"

        assert flag ==true
    }

}
