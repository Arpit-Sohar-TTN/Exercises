/**
 * Created by arpit on 18/4/17.
 */
class Exercise11 {
     static void main(String[] args) {
    def src = new File("src/images/logo.png")
         def dest = new File("src/copyFiles/copy2.png")
    dest << src
         println "Image Copied"
     }
}
