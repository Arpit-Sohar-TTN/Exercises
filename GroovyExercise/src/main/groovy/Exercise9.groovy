/**
 * Created by arpit on 19/4/17.
 */
class Exercise9 {
   static boolean odd = true

     static void main(String[] args) {
         int index = 1
    def file1 = new File("src/files/Demo1.txt")
         def copyFile = new File("src/copyFiles/oddCopyFile.txt")
     //    def copyFile2 = new File("src/copyFiles/copyFile2.txt")
         

         file1.eachLine {String li->

             if (odd) {
                 copyFile << index+li+'\n'
                index++
                 odd = false
             }
             else {
                 index++
                 odd = true
             }

         }
         println "File Copied in copyFiles directory"
         }

    }

