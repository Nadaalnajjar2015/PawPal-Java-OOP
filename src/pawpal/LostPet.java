
package pawpal;

public class LostPet extends Post {
    private Animal animal;
    private Location location;
    // Parameterized constructor

    public LostPet(Animal animal, Location location, String title, String description, String name, String email, String phone) {
        super(title, description, name, email, phone);
        this.animal = animal;
        this.location = location;
    }
    
    

    // Getters and Setters
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    // Overriding displayPostDetails
    @Override
    public void displayPostDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Description: " + getDescription());
        System.out.println("Author: " + getAuthor().getName());
        System.out.println("Lost Animal Details:");
        animal.displayAnimalDetails();
        System.out.println("Location: " + location.getDetails());
    }

    @Override
    public String toString() {
        return "LostPetPost{"+"Title:"+super.getTitle()+"\n"+
                ",Description: " + super.getDescription()+"\n"+ 
                ",Author: " + getAuthor().getName()+"\n"+   
                ","+animal +"\n"+ 
                ","+location + '}';
    }
}