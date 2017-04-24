/**
 * Created by arpit on 19/4/17.
 */
class Exercise8 {
     static void main(String[] args) {
        Employee employee1 = new Employee(name: "Arpit Sohar",age: 21,salary: 30000)
        Employee employee2 = new Employee(name: "Mayank Agnihotri",age: 24,salary: 31000)
        Employee employee3 = new Employee(name: "Jay",age: 24,salary: 32000)
        Employee employee4 = new Employee(name: "Akshay",age: 24,salary: 33000)
        Employee employee5 = new Employee(name: "Prashant",age: 24,salary: 3300)
        Employee employee6 = new Employee(name: "Akhil",age: 21,salary: 3000)
        Employee employee7 = new Employee(name: "Ishwar",age: 21,salary: 3090)
        Employee employee8 = new Employee(name: "Ajay",age: 21,salary: 9800)
        Employee employee9 = new Employee(name: "Prateek",age: 21,salary: 2800)
        Employee employee10 = new Employee(name: "Sumit",age: 21,salary: 4000)
         List list = [employee1,employee2,employee3,employee4,employee5,employee6,employee7,employee8,employee9,employee10]
         println "---------------------part 1---------------------\n\n"

        List result = list.findAll {it.getSalary()<5000}.name
         println "Employees having salary less than 5000 :"+result+"\n\n"
         assert result == ['Prashant', 'Akhil', 'Ishwar', 'Prateek', 'Sumit']


         println "---------------------part 2---------------------\n\n"
         list.sort {it.age}
          String youngestEmployee = list.get(0).name
         String oldestEmployee = list.get(9).name
         println """Youngest employee name : ${youngestEmployee}"""
         println """Oldest employee name : ${oldestEmployee} \n\n\n"""

         assert youngestEmployee == "Arpit Sohar"
         assert oldestEmployee == "Prashant"

         println "---------------------part 3---------------------\n\n"
      //  println list.sort{it.salary}[9].name+" having  maximum salary"
        // println list.name
         String maxSalriedPerson = list.max {it.salary}.name
        println maxSalriedPerson+" got maximum salary\n\n"
         assert maxSalriedPerson == "Akshay"

         println "---------------------part 4---------------------\n\n"

         println "Names of all employees"
         List nameList = list.name
         println nameList
         assert nameList == ["Arpit Sohar", "Akhil", "Ishwar", "Ajay", "Prateek", "Sumit", "Mayank Agnihotri", "Jay"
                             , "Akshay", "Prashant"]


    }

}
class Employee {
    String name
    int age
    Long salary

}