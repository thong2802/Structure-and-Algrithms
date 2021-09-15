package Tree;

public class _112PathSum {
    // kiem tra xem co phải node lá không, nếu phải thì so sánh với target
    public boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
    // ham duyet
    public boolean duyet(TreeNode curNode, int curSum, int targetSum){
       if (curNode == null) return false;
       // truoc khi so sanh thi phai cong cac gia tri truoc no da di qua
       curSum += curNode.val;
       if (isLeaf(curNode)){
           return curSum == targetSum;
       }

       boolean kqTrai =  duyet(curNode.left, curSum, targetSum);
       boolean kqPhai =  duyet(curNode.right, curSum, targetSum);

       return kqPhai || kqTrai;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
      return duyet(root, 0, targetSum);
    }
}
