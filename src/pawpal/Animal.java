
package pawpal;

public class Animal {
    private String name;
    private String type;
    private int age;
    private String gender; // New property for gender

    // Parameterized constructor
    public Animal(String name, String type, int age, String gender) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    // Method to display animal details
    public void displayAnimalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", type=" + type + ", age=" + age + ", gender=" + gender + '}';
    }
    
    
}