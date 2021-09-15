package Tree;

public class _450DeleteNodeinaBST {
    /*
    - xác định node cần xoá
    - xoá node cần xoá
    TH1 : Node cần xoá là node lá, không có node con => trỏ node cha của nó thành null
    TH2 : - Node cần xoá có một node con bên phải => trỏ node cha của node cần xoá về node con bên phải của nó
          - OR  Node cần xoá có một node con bên trái => trỏ node cha của node cần xoá về node con bên trái của nó
    TH3 : phức tạp nhất
        - Node cần xoá có 2 node con
        + cách 1 : tìm node con trái cùng của cây con bên phải
        + cách 2 : tìm node con phải cùng của cây con bên
        => sau khi xoá tồn tại 2 cây binary tree khác nhau nhưng vẫn đảm bảo tính chất của nó
     */
    public TreeNode findLeftNode(TreeNode root){
        if (root == null)
            return null;
        TreeNode leftNode = root;
        while (leftNode.left != null){
            leftNode = leftNode.left;
        }
        return leftNode;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
       if (root == null){
          return null;
       }
       // xac dinh key can xoa nam ben trai hay phai cua root
       // key > root => ben phai
       if (key > root.val){
           root.right = deleteNode(root.right, key);
       }
        // key < root => ben trai
       else if (key < root.val){
           root.left = deleteNode(root.left, key);
       }else { // root.val = key || xd dc node con can xoa

           // TH1 : : Node cần xoá là node lá, không có node con => trỏ node cha của nó thành null
           if (root.right == null && root.right == null){
               return null;
           }
           // TH2 :
          // - Node cần xoá có một node con bên phải
           if (root.left != null && root.right == null){
               return root.left;
           }
           // TH2 : Chi co mot con ben phai
           if (root.left == null && root.right != null){
               return root.right;
           }

           // TH3 : TON TAI 2 CON.
           // cach 1 : tim node con trai cung cua cay con ben phai
           TreeNode leftNode = findLeftNode(root.right);
           root.val = leftNode.val;
           // xoa node da gan
           root.right = deleteNode(root.right, leftNode.val);
       }
        return root;
    }
}
