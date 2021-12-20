package Tree_09;

import java.util.ArrayList;
import java.util.List;

public class _144BinaryTreePreorderTraversal {
    // duyet va luu vao List
    List<Integer> duyetOder = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
      // N-L-R
      if (root == null){
          return duyetOder;
      }
        // duyet curNode truoc
        duyetOder.add(root.val);
        // duyet ben trai | duyet ben phai
        preorderTraversal(root.left);
        preorderTraversal(root.right);

       return duyetOder;
    }
}
