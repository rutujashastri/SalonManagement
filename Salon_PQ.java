
import java.util.Scanner;

public class Salon_PQ {
    Node front=null,q,ptr,curr;
    Scanner sc = new Scanner(System.in);
    public void insertQ(){
        String n,ser;
        long ph;
        int price,mem;
        System.out.println("Enter name: ");
        n = sc.next();
        System.out.println("Enter phone number: ");
        ph=sc.nextLong();
        System.out.print("Enter the service : ");
         ser= sc.next();
         System.out.println("Enter the price for service: ");
        price = sc.nextInt();
        System.out.println("Do you have a membership?");
        System.out.println("Press SuperElite=1,Elite=2,Normal=3,No membership=4");
        mem = sc.nextInt();

        Node tmp= new Node(n,ph,mem,ser,price);
        tmp.Name=n;tmp.phone_no=ph;tmp.membership=mem;tmp.service=ser;tmp.price=price;

        if(front==null || mem<front.membership){
            tmp.next=front;
            front=tmp;
        }
        else
        {
            q=front;
            while(q.next!=null && q.next.membership<=mem)
            {
                q=q.next;
            }
            tmp.next=q.next;
            q.next=tmp;
        }
    }

    public void displayQ(){
        ptr=front;
        if(front==null){
            System.out.println("Empty Queue");
        }
        else
        {
            System.out.println("-------------Display Customer priority list-----------");
            while(ptr!=null){
                System.out.println("Name: "+ptr.Name);
                System.out.println("Service: "+ptr.service);
                System.out.println("------------------------------------------------");
                ptr=ptr.next;
            }
        }
    }
    public double discount(Node ptr){

        double total=0.0;
        if(ptr==null){
            System.out.println("NAA");
        }
        else
        {
            if(ptr.membership==1){
                total = ptr.price-(ptr.price*0.45);
            }
            else if(ptr.membership==2){
                total = ptr.price-(ptr.price*0.30);
            }
            else if(ptr.membership==3){
                total=ptr.price- (ptr.price*0.15);
            }
            else{
                total=ptr.price;
            }

        }
        return total;
    }

    public String member(Node ptr){
        String str=null;
        if(ptr==null){
            System.out.println("NA");
        }
        else
        {
            if(ptr.membership==1){
                str= "Super Elite";
            }
            else if(ptr.membership==2){
                str="Elite";
            }
            else if(ptr.membership==3){
                str= "Normal";
            }
            else
            {
                str= "Not a member";
            }
        }
        return str;
    }
    public void bill(){
        Salon_PQ sll=new Salon_PQ();
        ptr=front;
        if(front==null){
            System.out.println("Empty Queue");
        }
        else
        {

            while(ptr!=null){
                System.out.println("-------------Bill of "+ptr.Name+" -----------");
                System.out.println("Name: "+ptr.Name);
                System.out.println("Service: "+ptr.service);
                System.out.println("Membership: "+sll.member(ptr));
                System.out.println("Total Bill: "+sll.discount(ptr));
                System.out.println("------------------------------------------------");
                ptr=ptr.next;
            }
        }
    }
}
