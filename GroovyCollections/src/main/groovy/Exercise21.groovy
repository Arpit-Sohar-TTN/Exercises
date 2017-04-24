/**
 * Created by arpit on 19/4/17.
 */
class Exercise21 {
    public static void main(String[] args) {
       Map m = ['Computing' : ['Computing' :600, 'Information Systems' :300],
       'Engineering' : ['Civil' : 200,'Mechanical' : 100], 'Management' : ['Management' : 800]  ]
        int noOfDeptt = m.size()
        int noOfProgeamsInComputingDeptt = m.get('Computing').size()
       println "Total number of departments : "+noOfDeptt
        println "No of Programs in Computing Department : "+ noOfProgeamsInComputingDeptt
        int studentsCivilDeptt = m.Engineering.Civil
        println " No of students in civil deptt"+studentsCivilDeptt


//        String a = "aaab"
//        println a.findAll('a');



    }
}
