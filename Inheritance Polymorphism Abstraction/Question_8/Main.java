package Inheritance.Question_8;

// Q8. Define an interface named Filterable with abstract methods
// like apply_filter(filter_type) and reset_filter().
// Create two classes, ImageProcessor and DataAnalyzer, that
// both implement the Filterable interface.
// Implement the methods in each class to perform distinct actions relevant to image
// and data processing respectively, showcasing a shared contract with different implementations.

interface Filterable {
    void apply_filter(String filter_type);

    void reset_filter();
}

// Image processing class
class ImageProcessor implements Filterable {

    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to the image...");
    }

    @Override
    public void reset_filter() {
        System.out.println("Resetting image to original state...");
    }
}

// Data analysis class
class DataAnalyzer implements Filterable {

    @Override
    public void apply_filter(String filter_type) {
        System.out.println("Filtering data using " + filter_type + " method...");
    }

    @Override
    public void reset_filter() {
        System.out.println("Resetting data filters...");
    }
}

public class Main {
    public static void main(String[] args) {

        // Using ImageProcessor
        ImageProcessor img = new ImageProcessor();
        img.apply_filter("Blur");
        img.reset_filter();

        System.out.println();

        // Using DataAnalyzer
        DataAnalyzer data = new DataAnalyzer();
        data.apply_filter("Outlier Removal");
        data.reset_filter();
    }
}

/*
 * Sample Output:
 * 
 * Applying Blur filter to the image...
 * Resetting image to original state...
 * 
 * Filtering data using Outlier Removal method...
 * Resetting data filters...
 */
