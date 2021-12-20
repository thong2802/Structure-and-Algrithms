package Tree;

public class Main {

    public static void main(String[] args) {
//      myBST myBST = new myBST();
//      myBST.mRoot = myBST. insertIntoBST(myBST.mRoot, 5);
//      myBST.mRoot = myBST. insertIntoBST(myBST.mRoot, 6);
//      myBST.mRoot = myBST. insertIntoBST(myBST.mRoot, 7);
//      myBST.mRoot = myBST. insertIntoBST(myBST.mRoot, 1);
//      myBST.mRoot = myBST. insertIntoBST(myBST.mRoot, 0);
//      myBST.mRoot = myBST. insertIntoBST(myBST.mRoot, 3);
//      myBST.mRoot = myBST. insertIntoBST(myBST.mRoot, 2);
//      myBST.mRoot = myBST. insertIntoBST(myBST.mRoot, 4);
//        System.out.println("dome");

      TreeNode n0 = new TreeNode(0);
      TreeNode n1 = new TreeNode(1);
      TreeNode n2 = new TreeNode(2);
      TreeNode n3 = new TreeNode(3);
      TreeNode n4 = new TreeNode(4);
      TreeNode n5 = new TreeNode(5);
      TreeNode n6 = new TreeNode(6);
      TreeNode n7 = new TreeNode(7);


      // lien ket cac not

      n0.left = n1; n0.right = n2;
      n2.left = n5;
      n1.left = n3;
      n1.right = n4;
      n4.left = n6;
      n4.right = n7;


      myBST.postOder(n0);
      System.out.println("done");
    }
}
