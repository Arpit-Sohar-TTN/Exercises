/**
 * Created by arpit on 19/4/17.
 */
class Exercise7 {
    public static void main(String[] args) {
        List list = [14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35]
        println "Original list is : "+list
        List sortedList = list.unique().sort()
        println "Sorted list is : "+sortedList
        assert sortedList == [10, 11, 12, 14, 15, 16, 35, 90, 99]
    }

}
