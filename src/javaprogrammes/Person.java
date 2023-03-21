package javaprogrammes;

public class Person {

    // Instance variables
    String firstName;
    String lastName;
    int age;

    // with return type no parameter method
    public String getFirstName() {
        return firstName;
    }

    // with return type no parameter method
    public String getLastName() {
        return lastName;
    }

    // with return type no parameter method
    public int getAge() {
        return age;
    }

    // No return type with parameter method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // No return type with parameter method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // With return type with parameter method
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        } else {
            this.age = age;
        }
    }

    // With return type no parameter method
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    // With return type no parameter method
    public String getFullName() {
        String fullName = "";

        // if-else statement to check condition
        if (this.firstName.isEmpty()) {
            return this.lastName;
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        } else if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return fullName;
        } else {
            return this.firstName + this.lastName;
        }

    }

    //  Driver method
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
