/**
 * Created by arpit on 19/4/17.
 */
class Exercise9 {
     static void main(String[] args) {
         String s = "this string needs to be split"
         List tokenize1 = s.tokenize(" ")
         List tokenize2 = s.tokenize()
         println tokenize1
         println tokenize2

         String s1 = "this string needs to be split"
        List split1 = s1.split(" ")
         println split1
         println s1.split(/\s/)
         println s1.tokenize(/\s/)
         String s2 = "are.you.trying.to.split.me.mister?"
        println s2.tokenize(".")
        println s2.split(".")

    }
}
