//import java.util.*;

public class tree1 {

 static class node{
    String data;
    node left;
    node right;

    public node (String data){
        this.data=data;
       this.left=null;
        this.right=null;
    }
}
static class binarytree{
   static int inxd=-1;
    public static node buildtree(String nodes[]){
 inxd++;
 if(nodes[inxd]=="null"){
    return null;
 }
 node newnode=new node(nodes[inxd]);

 newnode.left=buildtree(nodes);
  newnode.right=buildtree(nodes);

 return newnode;
    }
}

public static void preorder(node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
}

public static void main(String[] args) {
    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    String[] ar={"ram","seeta","geeta","null","null","null","null"};
    binarytree t=new binarytree();
   node root= t.buildtree(ar);
  // System.out.println(root.data);
    
   preorder(root);
}
}

