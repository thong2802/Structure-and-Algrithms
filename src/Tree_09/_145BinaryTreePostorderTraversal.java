package Tree_09;

import java.util.ArrayList;
import java.util.List;

public class _145BinaryTreePostorderTraversal {
    List<Integer> duyetOder = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return duyetOder;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        duyetOder.add(root.val);

        return duyetOder;
    }
}
