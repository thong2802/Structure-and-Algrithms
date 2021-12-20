package Tree;

public class _98ValidateBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isValidBST(TreeNode root) {
       return checkNode(root, null, null);
    }
    public static boolean checkNode(TreeNode curNode, TreeNode minNode, TreeNode maxNode) {
        if (curNode == null) {
            return true;
        }

        if (minNode != null && curNode.val <= minNode.val) {
            return false;
        }
        if (maxNode != null && curNode.val >= maxNode.val) {
            return false;
        }

        // check child tree on left
        boolean isLeftTreeOke = checkNode(curNode.left, minNode, curNode);
        // check child tree right
        boolean isRightoke = checkNode(curNode.right, curNode, maxNode);

        return (isLeftTreeOke && isRightoke);
    }
    public static void main(String[] args) {
        Tree.TreeNode n1 = new Tree.TreeNode(1);
        Tree.TreeNode n2 = new Tree.TreeNode(2);
        Tree.TreeNode n3 = new Tree.TreeNode(3);
        Tree.TreeNode n4 = new Tree.TreeNode(4);
        Tree.TreeNode n5 = new Tree.TreeNode(5);
        Tree.TreeNode n6 = new Tree.TreeNode(6);
        Tree.TreeNode n7 = new Tree.TreeNode(7);
        Tree.TreeNode n8 = new Tree.TreeNode(8);
        Tree.TreeNode n9 = new Tree.TreeNode(9);
        Tree.TreeNode n10 = new Tree.TreeNode(10);
        Tree.TreeNode n11 = new Tree.TreeNode(11);
        Tree.TreeNode n12 = new Tree.TreeNode(12);
        Tree.TreeNode n13 = new Tree.TreeNode(13);
        Tree.TreeNode n14 = new Tree.TreeNode(14);
        Tree.TreeNode n15 = new Tree.TreeNode(15);

        n8.left = n4;
        n8.right = n12;
        n4.left = n2;
        n4.right = n6;
        n2.left = n1;
        n2.right = n3;
        n6.left = n5;
        n6.right = n7;
        n12.left = n10;
        n12.right = n14;
        n10.left = n9;
        n10.right = n11;
        n14.left  = n13;
        n14.right = n15;


    }
}
