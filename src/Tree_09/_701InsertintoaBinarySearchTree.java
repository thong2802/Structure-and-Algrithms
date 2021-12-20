package Tree_09;

public class _701InsertintoaBinarySearchTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }

 //insert == loop
 public TreeNode inSertTree(TreeNode root, int value){
  //TH1: ROOT == null
  TreeNode newNode = new TreeNode(value);
  if (root == null){
   root = newNode;
   return root;
  }else {
   TreeNode temp = root;
   while (true) {
    if (value > temp.val) { // value > temp
     // neu temp tro vao null thi them node moi vao
     if (temp.right == null) {
      temp.right = newNode;
      break;
     } else { // neu khong tro vao null thi tiep tuc dich chuyen sang ben phai
      temp = temp.right;
     }
    } else { // value < temp
     // neu temp tro vao null thi them node moi vao
     if (temp.left == null) {
      temp.left = newNode;
      break;
     } else {// neu khong tro vao null thi tiep tuc dich chuyen sang ben trai
      temp = temp.left;
     }
    }
   }
   return root;
  }
 }

 // insert == Recursion
 public TreeNode insertIntoBST(TreeNode rootNode, int value){
  TreeNode newNode = new TreeNode(value);
  if (rootNode == null){
   return new TreeNode(value);
  }

  if (value < rootNode.val){
   if (rootNode.left == null){
    rootNode.left = newNode;
   }else {
    insertIntoBST(rootNode.left, value);
   }
  }else {
   if (rootNode.right == null){
    rootNode.right = newNode;
   }else {
    insertIntoBST(rootNode.right, value);
   }
  }
  return rootNode;
 }
}
