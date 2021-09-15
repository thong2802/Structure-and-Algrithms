package Tree;

public class myBST {
    public TreeNode mRoot;

    public myBST(){

    }

    //insert == loop
    public TreeNode inSertTree(TreeNode root, int value){
    //TH1: ROOT == null
        TreeNode newNode = new TreeNode(value);
        if (root == null){
            root = newNode;
                return root;
        }else {
            //TH2: ROOT != null
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
        //TH1: ROOT == null
        if (rootNode == null){
           return new TreeNode(value);
        }
        //TH2: ROOT != null
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

    // search == Recursion
    public TreeNode searchBST(TreeNode root, int key) {
        //TH1: ROOT == null
        if (root == null){
            return null;
        }
        //TH2: ROOT != null
        if (key < root.val){
            return  searchBST(root.left, key);
        }else if (key > root.val){
            return searchBST(root.right, key);
        }else { // root.val == key
            return root;
        }
    }

    // delete node in tree
    // Step 1 : xac dinh node x can xoa
    // Step 2 : xoa node x
    // TH 1 : X không có node con (node leaf) => trỏ node cha của nó thành null
    // TH2 : x có một node con => tìm node cha trỏ vào node cần xoá trỏ vào node con của nó. vd: 5-6-7, node xoá là 6, trỏ 5-7
    // TH3 : PHỨC TẠP NHẤT LÀ CÓ 2 NODE
              // có 2 cách xoá  :
              /*
              cách 1 : thay đổi trái cùng của cay con bên phải
              cách 2: thay đổi phải cùng của cây con bên trái
               */
    //=> sau khi xoá có thể có 2 cây binary tree tồn
    public TreeNode findLeftNode(TreeNode root){
        if (root == null){
            return null;
        }
        TreeNode leftNode = root;
        while(leftNode.left != null){
            leftNode = leftNode.left;
        }
        return leftNode;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
           return null;
        }
        // xác định key cần xoá lớn hơn hay nhỏ hơn root để xác định hướng đi
        //buoc 1: di tim node xoa
        if (key > root.val){ // key > root
         root.right =  deleteNode(root.right, key);
        }else if (key < root.val){ // key < root
         root.left =  deleteNode(root.left, key);
        }else { // root == key
            // buoc 2 : xoa node
            // TH1 : ROOT LA NODE LA, KHONG CO NODE CON
            if (root.left == null && root.right == null){
                return null;
            }
            // TH2 : Chi co mot con ben trai
            if (root.left != null && root.right == null){
                return root.left;
            }
            // TH2 : Chi co mot con ben phai
            if (root.left == null && root.right != null){
                return root.right;
            }
            // TH3 : TON TAI 2 CON.
            // cách 1 : thay đổi trái cùng của cay con bên phải
              TreeNode leftNode = findLeftNode(root.right);
            // gan root == left
              root.val = leftNode.val;
            // xoa left da gan thanh root
              root.right = deleteNode(root.right, leftNode.val);
        }
       return root;
    }

    // duyệt cây
    /*
     1. pre-oder (N-L-R)
     2. in-oder  (L-N-R)
     3. Post-oder(L-R-N)
     */
    public static void preOder(TreeNode curNode){ // N-L-R
        if (curNode == null){
            return;
        }
        // duyet curNode truoc
        System.out.print(curNode.val + " ");
        // duyet ben trai | duyet ben phai
        preOder(curNode.left);
        preOder(curNode.right);
    }

    public static void inOder(TreeNode root){ // L-N-R
     if (root == null) return;
     // duyet ben trai
      inOder(root.left);
      // duyet root
      System.out.print(root.val + "-");
      // duyet ben phai
      inOder(root.right);
     }

    public static void postOder(TreeNode root){ // L-R-N
        if (root == null) return;
        // duyet ben trai
        postOder(root.left);
        // duyet ben phai
        postOder(root.right);
        // duyet root
        System.out.print(root.val + "-");
    }

}
