package Interviews;

/**
 * Created by AG044529 on 10/18/2018.
 */
/**
 * Definition for a binary tree node.
 * */

class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode p_left = new TreeNode(2);
        TreeNode p_left_left = new TreeNode(4);
        p_left.left = p_left_left;
        TreeNode p_right = new TreeNode(3);

        p.left = p_left;
        p.right = p_right;

        TreeNode q = new TreeNode(1);
        TreeNode q_left = new TreeNode(2);
        TreeNode q_left_left = new TreeNode(4);
        q_left.left = q_left_left;
        TreeNode q_right = new TreeNode(3);
        q.left = q_left;
        q.right = q_right;


        SameTree sameTree = new SameTree();
        boolean isSame = sameTree.isSameTree(p,q);
        if (isSame) {
            System.out.println("Trees are same");
        } else {
            System.out.println("Trees are not same");
        }


    }
}