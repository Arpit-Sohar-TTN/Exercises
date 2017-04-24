/**
 * Created by arpit on 19/4/17.
 */
class Exercise10 {
    static void removeWhiteSpaces(File source,File destination) {
        String fileText=source.text
        destination.text=fileText.replaceAll("\\s","")
    }
    static void main(String[] args) {
        //String projectpath = "/home/arpit/IdeaProjects/Groovy/GroovyExercise"
        File old=new File( "src/files/FileWithWhiteSpaces")
        File newFile=new File( "src/copyFiles/FileWithoutWhiteSpaces")

        removeWhiteSpaces(old,newFile)
        println "File copied without any spaces"
    }
}
