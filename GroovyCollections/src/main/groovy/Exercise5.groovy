/**
 * Created by arpit on 19/4/17.
 */
class Exercise5 {
    public static void main(String[] args) {
        List list = [11,12,13,14,15,16,17,18,19,20]
        List newList = []
        list.eachWithIndex{ int entry, int i ->
            if( (i%2 != 0))
                newList.add(entry)
        }
        list = list- newList
        println list
        assert list == [11,13,15,17,19]
    }
}
