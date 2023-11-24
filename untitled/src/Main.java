import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer[] values = {1,3};
        Integer[] values2= {1,1,2};

        // Create the binary tree
        TreeNode p = createBinaryTree(values,0);
        TreeNode q = createBinaryTree(values2, 0);
        SameTree solution = new SameTree();

        boolean ans = solution.isSameTree(p,q);
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
}
