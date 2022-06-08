import java.util.ArrayList;
import java.util.Scanner;

public class BeverageMachine {

    ArrayList<String> Beverage = new ArrayList<String>();
    int count;

    public void BevChooser(){
        //Beverage.add("none");
        System.out.println("Enter your Beverage number\n------------------------------------------\n1 - water\n2 - coffee\n3 - Tea\n------------------------------------------");

        Scanner in = new Scanner(System.in);
        int beverage = in.nextInt();

        if (beverage == 1){
            System.out.println("Cup No: "+(Beverage.size()+1));
            System.out.println("Your water is ready...\n");
            Beverage.add("water");
        }
        else if(beverage == 2){
            System.out.println("Cup No: "+(Beverage.size()+1));
            System.out.println("Your coffee is ready...\n");
            Beverage.add("coffee");
            count += 1;
        }
        else if(beverage == 3){
            System.out.println("Cup No: "+(Beverage.size()+1));
            System.out.println("Your tea is ready...\n");
            Beverage.add("tea");
            count += 1;
        }
    }

    public void calories(){
        String bev = Beverage.get(Beverage.size()-1);
        if (bev == "coffee"){
            System.out.println("Calories in coffee is 134Cal\n");
        }
        else if (bev == "tea"){
            System.out.println("Calories in tea is 200Cal\n");
        }
        else if(bev == "water"){
            System.out.println("Calories in water is 0Cal\n");
        }

    }

    public void totalcups(){
        System.out.println("Total cups of coffee and tea is "+count+"\n");
    }
}
