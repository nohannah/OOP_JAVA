package Mid;

public class Titanic {
    
        String Directorname;
        String Featuresong;
        
        public  Titanic(String Directorname, String Featuresong)
        {
            this.Directorname = Directorname;
            this.Featuresong = Featuresong;
        }
        public void showDetails()
        {
            System.out.println("Director Name : " +Directorname);
            System.out.println("Feature Song : " +Featuresong);
        }
     public static void main(String[] args) {
        Titanic name= new Titanic("Hannah mothana ", "my heart will go on");
        name.showDetails();
    }
}  
    

