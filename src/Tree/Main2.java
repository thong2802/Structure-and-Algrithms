package Tree;

public class Main2 {
    public static void main(String[] args) {
   //     myBinaryTree2 binaryTree2 = new myBinaryTree2();
   //     binaryTree2.init();

        myBST2 bst2 = new myBST2();
        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 5);
        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 1);
        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 6);
        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 0);
        bst2.mRoot2 = bst2.insert1(bst2.mRoot2, 3);
        System.out.println("done");
    }
}
