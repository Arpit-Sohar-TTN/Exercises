/**
 * Created by arpit on 18/4/17.
 */
class Exercise7 {
    def search = { List list, def value ->
        list.contains(value)
    }

    static void main(String[] args) {
        Exercise7 exercise7=new Exercise7();
        println exercise7.search([1,2,3,4],5)
        println exercise7.search([1,5,6,3,1,'a'],'a')
    }

}
