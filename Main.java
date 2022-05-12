
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Accounter mode
        //Displaying order and Bill
        Scanner s = new Scanner(System.in);
        Salon_PQ sal = new Salon_PQ();
        System.out.println("-------Welcome to Enchi Hair Salon---------");
        int ch;
        do {
            System.out.println("\n1.Create\n2.Display Order\n3.Bills\n4.Exit");
            System.out.println("Enter your choice: ");
            ch=s.nextInt();
            switch (ch){
                case 1:
                    sal.insertQ();
                    break;
                case 2:
                    sal.displayQ();
                    break;
                case 3:
                    sal.bill();
                    break;
            }
        }while(ch!=4);

        System.out.println("\n-------------Hope you enjoyed your time here---------");
        System.out.println("---------------Thank you! Visit again!----------------");
    }
}
