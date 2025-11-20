
package pawpal;

public class Location {
    private String placeName;
    private String details;

    // Parameterized constructor
    public Location(String placeName, String details) {
        this.placeName = placeName;
        this.details = details;
    }

    // Getters and Setters
    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
     // Method to display location details
    public void displayLocationDetails() {
        System.out.println("Location Details:");
        System.out.println("Place name: " + placeName);
        System.out.println("Details: " + details);
    }

    @Override
    public String toString() {
        return "Location{" + "placeName=" + placeName + ", details=" + details + '}';
    }
    
    
}