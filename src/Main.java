import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to media catalog.");
        try {
            MediaParser.loadIn();
            System.out.println("You have successfully loaded in");
        }
        catch (IOException e){
            System.out.println("There was an error loading in your file");
        }

        MediaParser.menu(scanner);

    }
    }