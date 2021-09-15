package Tree;

public class _700SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        if (key < root.val){
            return  searchBST(root.left, key);
        }else if (key > root.val){
            return searchBST(root.right, key);
        }else { // root.val == key
            return root;
        }
    }
}
