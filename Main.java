import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Beverage Machine Start...");


        BeverageMachine User = new BeverageMachine();

        while (true) {
            System.out.println("Enter 1 to Continue\nEnter 0 if you want to exit");
            Scanner iin = new Scanner(System.in);
            int button = iin.nextInt();

            if (button == 1) {
                System.out.println("Hello! What do you want to drink today :)");
                System.out.println("------------------------------------------");

                System.out.println("Enter the number\n1 - Beverage Name \n2 - The amount of calories in the cup that last produced \n3 - Total number of coffee+tea cups\n------------------------------------------");
                Scanner in = new Scanner(System.in);
                int consoleIn = in.nextInt();


                if (consoleIn == 1){
                    User.BevChooser();
                }
                else if (consoleIn == 2){
                    if (User.Beverage.size() == 0){
                        System.out.println("No cup has produced previously\n");
                    }
                    else{
                        User.calories();}
                }
                else if (consoleIn == 3){
                    if (User.Beverage.size() == 0){
                        System.out.println("No cup has produced previously\n");
                    }
                    else{
                        User.totalcups();}
                }
                else{
                    System.out.println("Invalid Input...");
                }
            }
            else{
                break;
            }
        }

        System.out.println("Beverage machine stop...");


    }
}
