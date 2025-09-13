import java.util.Scanner;

public class GameRecommender {
    public static void main(String[] args) {
        System.out.println("1.Action");
        System.out.println("2.Advanture");

        Scanner movie= new Scanner(System.in);
        System.out.println("Enter the option:");
        int n=movie.nextInt();
        switch (n) {
            case 1:
                System.out.println("Grand Theft Auto");
                break;
            case 2:
                System.out.println("The Legend of Zelda:Breath of the Wild");
                break;
        
            default:
                break;
        }
        movie.close();

    }
    
}
