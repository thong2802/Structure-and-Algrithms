package Tree;

public class Main2 {
    public static void main(String[] args) {
//   //     myBinaryTree2 binaryTree2 = new myBinaryTree2();
//   //     binaryTree2.init();
//
//        myBST2 bst2 = new myBST2();
//        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 5);
//        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 1);
//        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 6);
//        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 0);
//        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 3);
//        System.out.println("done");
//
//      //  bst2.mRoot2 = bst2.delete(bst2.mRoot2, 6);
//      //  bst2.searchBST(bst2.mRoot2, 6);
//
//        System.out.println("done");


        TreeNode2 n0 = new TreeNode2(0);
        TreeNode2 n1 = new TreeNode2(1);
        TreeNode2 n2 = new TreeNode2(2);
        TreeNode2 n3 = new TreeNode2(3);
        TreeNode2 n4 = new TreeNode2(4);
        TreeNode2 n5 = new TreeNode2(5);
        TreeNode2 n6 = new TreeNode2(6);
        TreeNode2 n7 = new TreeNode2(7);


        // lien ket cac not

        n0.left = n1; n0.right = n2;
        n2.left = n5;
        n1.left = n3;
        n1.right = n4;
        n4.left = n6;
        n4.right = n7;

        myBST2.preOder(n0);
    }
}
