public class linked{
    
    node head;
    class node{
      String data ;
      node next;

      //constructor of node
      node(String data){
        this.data=data;
        this.next=null;

      }
    }

    // add first node
    public void addfirst(String data){
        node newnode=new node(data);
        if(head==null){
          head=newnode;
          return;
        }
         newnode.next=head;
         head=newnode;
    }
    //add last node
    public void addlast(String data){
        node newnode=new node(data);
        if(head == null) {
          head=newnode;
          return;
        }
        node currnode=head;
        while (currnode.next !=null) {
            currnode=currnode.next;
            
        }
        currnode.next=newnode;

        
    }


    //print
     
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
node currnode=head;
      while(currnode !=null){
        System.out.println(currnode.data);
        currnode=currnode.next;
      }
      System.out.println("null");
    }
    //delete first
    public void deletefirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
    }
    //delete last
    public void deletelast(){
        if(head==null){
            System.out.println("thr list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        node lsd=head;
        node lastn=head.next;
    while(lastn.next!=null){
        lastn=lastn.next;
        lsd=lsd.next;
    }
        lsd.next=null;
    }
public static void main(String[] args) {

    linked list=new linked();
    list.addfirst("kumar");
    list.addfirst("arvind");
    list.addlast("pram");
    list.printlist();
    list.deletelast();
    list.printlist();

    
}
}