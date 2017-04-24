/**
 * Created by arpit on 18/4/17.
 */
class Exercise8 {
    static void main(String[] args) {

        def destination = new File("src/copyFiles/dest.text")
        new File("src/files").eachFile() {
            file-> destination<< file.text
        }

    }

}
