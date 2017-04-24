/**
 * Created by arpit on 18/4/17.
 */

//Run Exercise2.main


class Employee extends Person {
    int empId;
    String company;
    Long salary;
    @Override
     String toString() {
        super.toString()+
         "He Works for "
                ${company}  ' with employee id ' +
                empId+
                " and draws  " + salary +
                " lots of money.";
    }
}
class Exercise2 {
     static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Arpit Sohar")
        employee.setAge(22)
        employee.setGender("Male")
        employee.setEmpId(2607)
        employee.setCompany("To The New")
        employee.setSalary(200000)
        employee.setAddress("Ghaziabad, India")
        println "Values by setter"
        println """                   ${employee.getName()}  
                    ${employee.getSalary()}
                    ${employee.getGender()}
                    ${employee.getCompany()}
                    ${employee.getAddress()}
                    """

        println "Values by . operator"
        println """                   ${employee.name}  
                    ${employee.salary}
                    ${employee.gender}
                    ${employee.company}
                    ${employee.address}
                  
                    """

        println "Values by @ operator"
        println """                   ${employee.@name}  
                    ${employee.@salary}
                    ${employee.@gender}
                    ${employee.@company}
                    ${employee.@address}
                  
                    """

    }



}