package CarSystemManagement;
import java.util.ArrayList;

// CustomFeaturesManager.java - Manages custom features
public class CustomFeaturesManager {
    private ArrayList<String> customFeatures;

    public CustomFeaturesManager() {
        this.customFeatures = new ArrayList<>();
    }

    public void addFeature(String feature) {
        customFeatures.add(feature);
        System.out.println("Added feature: " + feature);
    }

    public void addFeature(String... features) {
        System.out.print("Added multiple features: ");
        for (String feature : features) {
            customFeatures.add(feature);
            System.out.print(feature + " ");
        }
        System.out.println();
    }

    public void displayFeatures() {
        System.out.println("Custom Features: " + customFeatures);
    }

    public ArrayList<String> getCustomFeatures() {
        return customFeatures;
    }
}