
package pawpal;


import java.util.ArrayList;


public class Platform {
    private String platformName;
    private ArrayList<Post> posts;

    // Parameterized constructor
    public Platform(String platformName) {
        this.platformName = platformName;
        this.posts = new ArrayList<>();
        
    }

    // Add a post to the platform
    public void addPost(Post post) {
        posts.add(post);
        System.out.println("Post added successfully to " + platformName);
    }
    
    // Display all posts on the platform
    public void displayAllPosts() {
        System.out.println("Displaying all posts on the platform: " + platformName);
        for (Post post : posts) {
            System.out.println("----------------------------");
            post.displayPostDetails(); // here abstraction appears
        }
    }
    // Display Posts By Type
    public void displayPostsByType(String postType) {
        boolean found = false;
        for (Post post : posts) {
                 // reference class// name of the class as String
            if (post.getClass().getSimpleName().equals(postType)) {
                post.displayPostDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No posts found of type: " + postType);
        }
    }


}