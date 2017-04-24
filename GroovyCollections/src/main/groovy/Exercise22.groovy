/**
 * Created by arpit on 19/4/17.
 */
class Exercise22 {

     static void main(String[] args) {
        List list = new ArrayList();
        for (int i=1; i<=20 ; i++){
            list.add(new Employee1(name: "Emp${i}",age: 20+i,deptt: "CS",empNumber: i, salary: 1000 * i))
        }
         for (int i=21; i<=40 ; i++){
             list.add(new Employee1(name: "Dmp${i}",age: 20+i,deptt: "ME",empNumber: i, salary: 1000 * i))
         }
         for (int i=41; i<=50 ; i++){
             list.add(new Employee1(name: "Fmp${i}",age: 10+i,deptt: "IT",empNumber: i, salary: 1000 * i))
         }

         def list1=list.groupBy {
             if(it.getSalary()<=5000)
             {
                 return "${0}-${5000}"
             }
             int num = it.getSalary() - (it.getSalary() % 5000)
             return "${num+1}-${num+5000}"
         }
         def list2=list.groupBy {
             return it.deptt
         }
         List list3 = new ArrayList()
         list.each {
             if(it.age>17 && it.age<36)
                 list3.add(it)
         }
       def list4 =  list.groupBy ({it.name.charAt(0)},{it.age>20})
         println "Ques 1"
        list1.each {println it}
         println "Ques 2"
         list2.each {println(it.getKey()+" "+it.getValue().size+" students")}
         println "Ques 3"
         list3.each {println it}
         println "Ques 4"
         list4.each {println it}
         println "Ques 5"
         list2.each {println it} //Q.5
     }

}
class Employee1 {
    String name;
    int age;
    String deptt
    int empNumber
    Long salary


    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", deptt='" + deptt + '\'' +
                ", empNumber=" + empNumber +
                ", salary=" + salary +
                '}';
    }
}