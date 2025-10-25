package CarSystemManagement;

import java.util.ArrayList;

public class CustomerFeatureManager {
    private  ArrayList<String> customerFeatures;
    public CustomerFeatureManager() {
        customerFeatures = new ArrayList<>();
    }
    public void addFeature(String feature) {
        customerFeatures.add(feature);
        System.out.println("Feature added: " + feature);
    }
    public void addFeatures(String... features) {
        System.out.println("Adding multiple features...");
        for (String feature : features) {
            customerFeatures.add(feature);
            System.out.print("Features" + " ");
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
