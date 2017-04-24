/**
 * Created by arpit on 19/4/17.
 */
class Exercise13 {
     static void main(String[] args) {
        String string = "sjvbfbvvbvjkevjkvk"
        String find = "v"
        int numberOfOccurences = 0
        println "Original String is "+string
        println "Character is "+find
        string.each {
            if (it == find)
                numberOfOccurences++
        }
        println find +" occured "+numberOfOccurences+" times."
         assert numberOfOccurences == 6
    }

}

