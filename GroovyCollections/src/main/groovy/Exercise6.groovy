/**
 * Created by arpit on 19/4/17.
 */
class Exercise6 {
    public static void main(String[] args) {
        List list = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]
        list.each {println it.class}
        def result = list.get(6).get(9)
        println "Element is " + result
        assert result == 9
    }
}
