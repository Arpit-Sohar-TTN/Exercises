/**
 * Created by arpit on 19/4/17.
 */
class Exercise20 {
    public static void main(String[] args) {
        Map map = ["Arpit sohar":21,"Mayank":24,"Jay":24,"Ajay":21,"Akshay":24,"Prateek":22,"Sumit":12]
       boolean flag = map.keySet().contains("Jaya")
        if (flag) {
            println "Success"
        }
        else println "Failure"
        assert flag == false
    }
}
