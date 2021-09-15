package Tree;
// duyet theo chieu sau/ do cao lon nhat
// khi đi tìm ta quy ra thành tìm chiều cao của 2 cây con bên trái và bên phải rồi so sánh bên nào lớn hơn

public class _104MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
       //DK DUNG
        if (root == null) return 0;
        // cong thuc de quy
        int heightLeft = maxDepth(root.left);
        int heightRight = maxDepth(root.right);

        // tim max cua 2 thang sau do cong 1
        int result = Math.max(heightLeft, heightRight) + 1;
      return result;
    }
}
