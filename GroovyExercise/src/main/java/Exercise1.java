/**
 * Created by arpit on 18/4/17.
 */
public class Exercise1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Arpit Sohar");
        person.setAge(22);
        person.setGender("Male");
        person.setAddress("Ghaziabad, India");
        System.out.println("Value by getter :  "+person.getName());
        System.out.println("Value by getter :  "+person.getAge());
        System.out.println("Value by getter :  "+person.getGender());
        System.out.println("Value by getter :  "+person.getAddress());
        System.out.println("==============================================================================");
        System.out.println("Value by . operator :  "+person.name);
        System.out.println("Value by . operator :  "+person.age);
        System.out.println("Value by . operator :  "+person.gender);
        System.out.println("Value by . operator :  "+person.address);
    }
}
class Person {
public String name ;
public int age ;
public String gender ;
public String address ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  name + " is a man aged " + age +
                " who lives at " + address + '.';
    }
}
