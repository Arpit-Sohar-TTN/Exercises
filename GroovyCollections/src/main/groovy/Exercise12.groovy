import org.w3c.dom.ranges.Range

/**
 * Created by arpit on 19/4/17.
 */
class Exercise12 {
    public static void main(String[] args) {
       def range = "a".."z"
        println range
        def result = range.findAll{it>'j'}
      println  result
        assert result == ['k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
        result.stream()
    }
}
