import java.util.Scanner;

public class Palindrome {
    static boolean checkPalindrome(String word) {   

        int left=0 , right =word.length()-1;

        while ( left < right )
        {
            if(word.charAt(left) != word.charAt(right))
            {
                return false;
            }
            left ++ ;
            right --;
        }
        return true;
    }    
        
    public static void main(String [] args )

    {
        Scanner word=new Scanner(System.in);
        System.out.println("Enter a word:");
       String str = word.nextLine();
        String cleaned=str.replaceAll("\\W" , "");
        if(Palindrome.checkPalindrome(cleaned))
        {
            System.out.println("It's Palindrome");
        }
        else 
        {
            System.out.println("It's not Palindorme");
        }
            word.close();
    }
    }

