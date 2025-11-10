package Week9;
import java.io.BufferedReader;
import java.io.IO;
import java.io.PrintWriter;
import java.util.ArrayList;
public class ContactBook {
    private ArrayList<Contact> contacts;
    private static final String FILE_NAME="contacts.txt";

    public ContactBook() {
        contacts = new ArrayListContact<>();
        loadContact(); // keep data persistent
    }
    public void addContact(Contact c) {
        contacts.add(c);
        saveContacts(); // keep data persistent
        System.out.println("Contact added successfully.");
    }
    public void viewContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts available.");
        }
        else {
            for(Contact c: contacts){
                System.out.println(c);
            }
        }
    }
    public void searchContact(String name)
    {
        boolean found= false;
        for (Contact c : contacts)
        {
            if(c.getName().equalsIgnoreCase(item)||
            c.getPhone().equalsIgnoreCase(item)||
            c.getEmail().equalsIgnoreCase(item)){
                found=true;
                System.out.println("Contact found: " + c);
            }
        }
        if found (!found) {
            System.out.println("Contact not found.");
        }
    }
    public void deleteContact(String name) {
        boolean found = false;
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            if (c.getName().equalsIgnoreCase(name)) {
                contacts.remove(i);
                found = true;
                saveContacts(); // keep data persistent
                System.out.println("Contact deleted successfully.");
                break;
            }
        }
        if (removed){
            saveContacts();
            System.out.println("Contact deleted successfully.");

        } 
        else {
            System.out.println("Contact not found.");
        }
    }
    public void saveContacts() {
     
        // Code to save contacts to FILE_NAME
        try (PrintWriter pw= new PrintWriter(new Filewriter(FILE_NAME)))
        {
            for(Contact c: contacts){
                pw.println(c.getName()+ "," + c.getPhone()+ "," + c.getEmail());
            }
        }catch(IOException e)
        {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }
    public void loadContact(){
        File file= new File (FILE_NAME);
        if(!file.exists()){
            System.out.println("Could not find contact");
            return; // No contacts to load
        }
        try(BufferedReader br= new BufferedReader (new FileReader(FILE_NAME)))
        {
            String line;
            while((line= br.readLine()) != null){
                String[] parts= line.split(",");
                if(parts.length==3){
                    Contact c= new Contact(parts[0], parts[1], parts[2]);
                    contacts.add(c);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        }
    }
}
