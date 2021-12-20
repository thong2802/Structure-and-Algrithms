package Tree_09;

import java.util.ArrayList;
import java.util.List;

public class _94BinaryTreeInorderTraversal {
    List<Integer> duyetOder = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return duyetOder;

        inorderTraversal(root.left);
        duyetOder.add(root.val);
        inorderTraversal(root.right);


        return duyetOder;
    }
}
