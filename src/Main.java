

import java.lang.*;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

         Lock lock = new ReentrantLock();

        lock.lock();





    }


    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        seed(root);
        return max;
    }

    private int seed(TreeNode root) {
        if(root == null){
            return 0;
        }
        int rightLength = seed(root.right);
        int leftLength = seed(root.left);

        int value = rightLength + leftLength + 1;
        if(max < value){
            max = value;
        }


        return Math.max(rightLength, leftLength) + 1;
    }


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



}

