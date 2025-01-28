public class Distance {
    private int feet;
    private float inches;

    // Constructor
    public Distance(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
        normalize();
    }

    // Normalize inches (convert to feet if inches >= 12)
    private void normalize() {
        if (inches >= 12) {
            feet += (int) (inches / 12);
            inches = inches % 12;
        }
    }

    // Method to add two Distance objects
    public Distance add(Distance other) {
        int totalFeet = this.feet + other.feet;
        float totalInches = this.inches + other.inches;
        return new Distance(totalFeet, totalInches);
    }

    // Method to compare two Distance objects
    public int compareTo(Distance other) {
        if (this.feet > other.feet || (this.feet == other.feet && this.inches > other.inches)) {
            return 1; // This object is greater
        } else if (this.feet < other.feet || (this.feet == other.feet && this.inches < other.inches)) {
            return -1; // This object is smaller
        } else {
            return 0; // Both objects are equal
        }
    }

    // Override toString() for printing the Distance object
    @Override
    public String toString() {
        return feet + " feet " + inches + " inches";
    }

    // Main method for testing
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 9.5f);
        Distance d2 = new Distance(3, 11.8f);

        // Adding distances
        Distance d3 = d1.add(d2);
        System.out.println("Sum: " + d3);

        // Comparing distances
        int comparison = d1.compareTo(d2);
        if (comparison > 0) {
            System.out.println(d1 + " is greater than " + d2);
        } else if (comparison < 0) {
            System.out.println(d1 + " is smaller than " + d2);
        } else {
            System.out.println(d1 + " is equal to " + d2);
        }
    }
}
