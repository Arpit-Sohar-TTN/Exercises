/**
 * Created by arpit on 19/4/17.
 */
class Exercise10 {
    public static void main(String[] args) {
        Range range = (1..10)
        println "Range is "+ range
        int first = range.first()
        int last = range.last()
        int second = range.get(1)
        println "First element of range is "+first
        println "Second element of range is "+second
        println "Last element of range is "+last

        assert first == 1
        assert second == 2
        assert last == 10
    }
}
