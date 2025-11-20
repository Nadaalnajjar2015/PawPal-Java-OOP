
package pawpal;

 import java.util.ArrayList;
import java.util.Scanner;
public class PawPal {


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to PawPal!");

        // Step 1: Create a User
        System.out.println("\n Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Enter your phone number:");
        String phone = scanner.nextLine();

        User user = new User(name, email, phone);
        user.displayUserInfo();

        // Step 2: Create a Platform
        Platform platform = new Platform("PawPal");

        // Step 3: Create a list to hold posts
        ArrayList<Post> posts = new ArrayList<>();

        // Step 4: Choose the type of post
        System.out.println("\n Choose the type of post you want to create from 1 to 5:");
        System.out.println("1. Adoption");
        System.out.println("2. Lost Pet");
        System.out.println("3. Found Pet");
        System.out.println("4. Rescue");
        System.out.println("5. Mating");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Step 5: Input animal details
        System.out.println("Enter the animal details:");
        System.out.println("Animal name:");
        String animalName = scanner.nextLine();
        System.out.println("Animal type (e.g., Dog, Cat):");
        String animalType = scanner.nextLine();
        System.out.println("Animal age:");
        int animalAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.println("Animal gender (Male/Female):");
        String animalGender = scanner.nextLine();
        Animal animal = new Animal(animalName, animalType, animalAge, animalGender);

        // Step 6: Input location details
        System.out.println("\n Enter place name:");
        String placeName = scanner.nextLine();
        System.out.println("Enter address details:");
        String addressDetails = scanner.nextLine();
        Location location = new Location(placeName, addressDetails);

        // Step 7: Create the appropriate post based on user's choice
        Post post = null;
        String postType = "none";

        switch (choice) {
            case 1:
                // Adoption Post
                postType = "Adoption";
                System.out.println("Enter adoption post title:");
                String adoptionTitle = scanner.nextLine();
                System.out.println("Enter adoption post description:");
                String adoptionDescription = scanner.nextLine();
                post = new Adoption(animal, location, adoptionTitle, adoptionDescription, name, email, phone);
                break;
            case 2:
                // Lost Pet Post
                postType = "LostPet";
                System.out.println("\n Enter lost pet post title:");
                String lostTitle = scanner.nextLine();
                System.out.println("Enter lost pet post description:");
                String lostDescription = scanner.nextLine();
                post = new LostPet(animal, location, lostTitle, lostDescription, name, email, phone);
                break;
            case 3:
                // Found Pet Post
                postType = "FoundPet";
                System.out.println("\n Enter found pet post title:");
                String foundTitle = scanner.nextLine();
                System.out.println("Enter found pet post description:");
                String foundDescription = scanner.nextLine();
                post = new FoundPet(animal, location, foundTitle, foundDescription, name, email, phone);
                break;
            case 4:
                // Rescue Post
                postType = "Rescue";
                System.out.println("\n Enter rescue post title:");
                String rescueTitle = scanner.nextLine();
                System.out.println("Enter rescue post description:");
                String rescueDescription = scanner.nextLine();
                post = new Rescue(animal, location, rescueTitle, rescueDescription, name, email, phone);
                break;
            case 5:
                // Mating Post
                postType = "Mating";
                System.out.println("\n Enter mating post title:");
                String matingTitle = scanner.nextLine();
                System.out.println("Enter mating post description:");
                String matingDescription = scanner.nextLine();
                post = new Mating(animal, location, matingTitle, matingDescription, name, email, phone);
                break;
            default:
                System.out.println("\n Invalid choice. Please restart and select a valid option.");
                return; // Exit the program for invalid choice
        }

        // Step 8: Add the post to the ArrayList and Platform
        if (post != null) {
            posts.add(post);
            platform.addPost(post); // Adding the post to the platform
        }
        
        
        // Step 9: Display all posts on the platform
        System.out.println("");
        platform.displayAllPosts();

        // Step 10: Display posts by type
        System.out.println("\n Displaying posts of type"+postType+":");
        platform.displayPostsByType(postType);
        
        
    }

}

    

