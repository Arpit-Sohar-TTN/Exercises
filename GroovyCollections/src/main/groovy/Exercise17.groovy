/**
 * Created by arpit on 19/4/17.
 */
class Exercise17 {
    public static void main(String[] args) {
        Map map = ["Arpit sohar":21,"Mayank":24,"Jay":24,"Ajay":21,"Akshay":24,"Prateek":22,"Sumit":12]
        Map map1 = ["Ishwar":21,"Prashant":24]
        Map map2 = map+map1
        println map2
        assert map2 == ["Arpit sohar":21, Mayank:24, Jay:24, Ajay:21, Akshay:24, Prateek:22, Sumit:12, Ishwar:21, Prashant:24]

    }
}
