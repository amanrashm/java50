class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(10);
        root.left = new TreeNode1(5);
        root.right = new TreeNode1(15);
        root.left.left = new TreeNode1(3);
        root.left.right = new TreeNode1(7);

        System.out.println("Inorder traversal of the BST:");
        inorderTraversal(root);
    }

    public static void inorderTraversal(TreeNode1 node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }
}