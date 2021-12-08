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
}
