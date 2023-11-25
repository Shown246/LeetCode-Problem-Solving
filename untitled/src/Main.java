import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer[] values = {1,2,2,null,3,null,3};

        // Create the binary tree
        TreeNode root = createBinaryTree(values,0);
        SymmetricTree solution = new SymmetricTree();
        assert root != null;
        boolean ans = solution.isSymmetric(root);
        //printTree(root);

        System.out.println(ans);
    }
    private static TreeNode createBinaryTree(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        return createBinaryTree(values, 0);
    }

    private static TreeNode createBinaryTree(Integer[] values, int index) {
        if (index < values.length && values[index] != null) {
            TreeNode node = new TreeNode(values[index]);
            node.left = createBinaryTree(values, 2 * index + 1);
            node.right = createBinaryTree(values, 2 * index + 2);
            return node;
        }

        return null;
    }

    private static void printTree(TreeNode root){
        //Print tree in level order traversal
        Queue<TreeNode> E = new LinkedList<>();
        E.add(root);
        while (!E.isEmpty()){
            TreeNode treeNode = E.poll();
            System.out.print(treeNode.val+",");
            if (treeNode.left!=null)
                E.add(treeNode.left);
            if (treeNode.right != null)
                E.add(treeNode.right);
        }
    }
}
