/**
 * Created by arpit on 19/4/17.
 */
class Exercise2 {
     static void main(String[] args) {
         List list = [1,1,2,3,4,4,5]
         println "Original List " +list
         println "Removing Duplicate elements by converting list into set"
         Set set = list.toSet()
         println set
         println "Removing Duplicate elements without converting list into set"
         assert set ==  [1, 2, 3, 4, 5] as Set
         list.unique()
         println  list

         assert list == [1,2,3,4,5]

    }
}
