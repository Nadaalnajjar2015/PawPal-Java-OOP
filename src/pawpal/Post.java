
package pawpal;


public abstract class Post {
    private String title;
    private String description;
    private User author;
    // composition
    // Parameterized constructor
    public Post(String title, String description, String name, String email, String phone) {
        this.title = title;
        this.description = description;
        this.author = new User(name, email, phone);
        
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    // Abstract method to be implemented by child classes
    public abstract void displayPostDetails();
    
    
}