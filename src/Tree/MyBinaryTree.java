package Tree;

public class MyBinaryTree {
    // not root quan li cac node ben trong
    private TreeNode root;

    public MyBinaryTree(){

    }

    public void init(){
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);


        // lien ket cac not

        n0.left = n1; n0.right = n2;
        n2.left = n5;
        n1.left = n3;
        n1.right = n4;

        // tro dinh cao nhat vao root
        root = n0;



    }
}
