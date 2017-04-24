/**
 * Created by arpit on 19/4/17.
 */
class Exercise19 {
    public static void main(String[] args) {
        Map m = ['1' : 2, '2' : 3, '3' : 4, '2':5]
        int x = m['2']
        println m
        println x
        assert  x ==  5
    }
}
