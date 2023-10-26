

public class tree2 extends new1 {
    static class node{
    int data;
    node left,right;
    //create constructor
    public node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    }
   node root;
  public  void tt(int []nodes)
  {
       root=binarytree( nodes);
            

   }
  static int inx=-1;

   public static node binarytree(int nodes[]){
    inx++;
    if(nodes[inx]==-1){
        return null;
    }
    node newnode=new node(nodes[inx]);
    newnode.left=binarytree(nodes);
    newnode.right=binarytree(nodes);
    return newnode;
   }
   public static void preorder(node root){
    if(root==null){
        return ;
    }
    System.out.print(root.data +" ");
    preorder(root.left);

    preorder(root.right);
   }
   public static void main(String[] args) {
    //int arrs[]={2,3,4,-1,-1,-1,-1,};
    tree2 t=new tree2();
    new1 n=new new1();
   // int rr=n.man();
    t.tt(n.arrs1);
    preorder(t.root);


   }


}
