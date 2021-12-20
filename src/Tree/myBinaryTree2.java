package Tree;

public class myBinaryTree2 {
   private TreeNode2 root;

   public myBinaryTree2() {

   }

   public void init(){
       TreeNode2 n0 = new TreeNode2(0);
       TreeNode2 n1 = new TreeNode2(1);
       TreeNode2 n2 = new TreeNode2(2);
       TreeNode2 n3 = new TreeNode2(3);
       TreeNode2 n4 = new TreeNode2(4);
       TreeNode2 n5 = new TreeNode2(5);

       // lien ket cac not
       root = n0;

       n0.left = n1;
       n0.right = n2;
       n1.left = n3;
       n1.right = n4;
       n2.right = n5;
   }
}
