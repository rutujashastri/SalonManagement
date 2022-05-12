
public class Node {
    String Name;
    long phone_no;
    int membership;
    String service;
    int price;
    Node next;
    Node(String n,long ph,int mem,String ser,int price){
        this.Name=n;
        this.phone_no=ph;
        this.membership=mem;
        this.service=ser;
        this.price=price;
        next=null;
    }
}
