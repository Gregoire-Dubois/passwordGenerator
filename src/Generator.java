import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Generator {

    public void generator(){

        //to user input the size of password
        System.out.println("---------------------------------------------------------------");
        System.out.println("Indiquez le nombre de caractères voulus dans votre mot de passe");
        System.out.println("---------------------------------------------------------------");
        Scanner sizeCaracters = new Scanner(System.in);
        int sizePass = sizeCaracters.nextInt();

        // Creation of arraylist for recive the password
        ArrayList<Character> arrayPass = new ArrayList<Character>();

        int i=0;
        while(i < sizePass){
            // Random caracter generator
            int min=0;
            int max = 126;

            Random randomNumber = new Random();
            int asciiNumber = randomNumber.nextInt(min,max);
            char letter = (char)asciiNumber;
            arrayPass.add(letter);
            i++;
        }
        String str = arrayPass.toString().replace(",","");
        String res = str.substring(1, str.length()-1);

        System.out.println("---------------------------------------------------------------");
        System.out.println("Le mot de passe proposé est :");
        System.out.println(res);
        System.out.println("---------------------------------------------------------------");

    }
}
