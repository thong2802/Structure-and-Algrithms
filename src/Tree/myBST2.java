package Tree;

public class myBST2 {
    public TreeNode2 mRoot2;

    public myBST2() {

    }


    //insert == loop
    public TreeNode2 insert(TreeNode2 root, int value){
        TreeNode2 newNode = new TreeNode2(value);

        // TH1 : root == null
        if (root == null){
            root = newNode;
            return root;
        }else {
            //TH2: ROOT != null
            TreeNode2 temp = root;
            while (true) {
                if (value > temp.val) { // right
                    // neu temp tro vao null thi them node moi vao
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {// neu khong tro vao null thi tiep tuc dich chuyen sang ben phai
                        temp = temp.right;
                    }
                } else { // left
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    //insert == recurion
    public TreeNode2 insert1(TreeNode2 root, int value){
        TreeNode2 newNode = new TreeNode2(value);
        // TH1 : ROOT == NULL
        if (root == null){
            return new TreeNode2(value);
        }else {
            // TH2 : ROOT ! NULL
            if (value > root.val) {
                if (root.right == null){
                    root.right = newNode;
                }else {
                    insert1(root.right, value);
                }
            }else {
                if (root.left == null){
                    root.left = newNode;
                }else {
                    insert1(root.left, value);
                }
            }
        }
       return root;
    }

    // delete
    // The first : Find node X need delete
    // Second : delete node X
    // TH1 : X khong co node con (x la node leaf) -> Tro node root cua Node x ve null
    // TH2 : X co mot node con -> tim node cha cua node can delete sau do tro vao node con cua no : example : 5-6-7 -> 5->6
    // TH3 : X co 2 node con
            // We are have two solution :
            // C1 : tim node con trai cung cua cay con ben phai
            // C2 : tim node con phai cung cua cay con ben trai
    // => then delete : there are can have two binary search tree
    public  TreeNode2 findLeftEnd(TreeNode2 root){
        if (root == null){
            return null;
        }
        TreeNode2 nodeLeft = root;
        while(nodeLeft.left != null){
            nodeLeft = nodeLeft.left;
        }
        return nodeLeft;
    }
    public TreeNode2 delete(TreeNode2  root, int key) {
        if (root == null) {
            return null;

            // B1 : FIND NODE NEED DELETE
        }else if (key > root.val) { // key right
           root.right = delete(root.right, key);
        }else if (key < root.val) { // key left
            root.left = delete(root.left, key);
        }else {
            // b2 : xoa

            // TH1 : X Khong co node con (x dont have node leaf)
            if (root.right == null && root.left == null) {
                return null;
            }
            // TH2 : X have a node right || x have a node left
            // TH2 : Chi co mot con ben phai
            if (root.right != null && root.left == null) {
                return root.right;
            }
            // TH2 : Chi co mot con ben trai
            if (root.left != null && root.right == null) {
                return root.left;
            }

            // TH3 : X Co 2 node con
            // choosse solution : find left end of tree node right
            TreeNode2 leftNode = findLeftEnd(root.right);
            // gan root = leftNode
            root.val = leftNode.val;
            // delete leftNode da gan thanh root
            root.right = delete(root.right, leftNode.val);
        }
        return root;
    }
    // Search
    public TreeNode2 searchBST(TreeNode2 root, int val) {
        if (root == null) {
            return null;
        }
        if (val > root.val){
            return searchBST(root.right, val);
        }else if (val < root.val) {
            return searchBST(root.left, val);
        }else { // val == root
            return root;
        }
    }

    // Traversal
    /*
     1. pre-oder (N-L-R)
     2. in-oder  (L-N-R)
     3. Post-oder(L-R-N)
     */
    public static void preOder(TreeNode2 curNode) {// N-L-R
        if (curNode == null) {
            return;
        }
        // traverse root
        System.out.println("curNode : " + curNode.val);
        // traversal left
        preOder(curNode.left);
        //  traversal right
        preOder(curNode.right);
    }

    public static void inOder(TreeNode2 root){ // 2. in-oder  (L-N-R)
        if (root == null) return;

        // traversal left
        inOder(root.left);
        // traverse root
        System.out.println("curNode: " + root.val);
        //  traversal right
        inOder(root.right);
    }

    public static void postOder(TreeNode2 root){ // 3. Post-oder(L-R-N)
        if (root == null) return;

        // traversal left
        postOder(root.left);
        //  traversal right
        postOder(root.right);
        // traverse root
        System.out.println("curNode: " + root.val);
    }
}
