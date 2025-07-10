package com.dsa.patterns.trees.easy;

import com.dsa.patterns.trees.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeftRightView {

    public static ArrayList<Integer> leftView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        LinkedList<TreeNode> qu = new LinkedList<>();
        TreeNode curr = root;
        qu.addFirst(curr);
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(!qu.isEmpty()) {
            int size = qu.size();
            TreeNode firstTreeNode = qu.peekFirst();
            res.add(firstTreeNode.val);
            while(size-- != 0) {
                TreeNode rem = qu.removeFirst();
                if(rem.left != null) {
                    qu.addLast(rem.left);
                }
                if(rem.right != null) {
                    qu.addLast(rem.right);
                }
            }
        }
        return res;
    }

    public List<Integer> leftSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        leftSideViewHelper(root, res, 0);
        return res;
    }

    private void leftSideViewHelper(TreeNode node, List<Integer> res, int level) {
        if(node == null) return;
        if(res.size() == level) {
            res.add(node.val);
        }
        leftSideViewHelper(node.left, res, level + 1);
        leftSideViewHelper(node.right, res, level + 1);
    }


    public static ArrayList<Integer> rightView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        LinkedList<TreeNode> qu = new LinkedList<>();
        TreeNode curr = root;
        qu.addFirst(curr);
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(!qu.isEmpty()) {
            int size = qu.size();
            TreeNode firstTreeNode = qu.peekFirst();
            res.add(firstTreeNode.val);
            while(size-- != 0) {
                TreeNode rem = qu.removeFirst();
                if(rem.right != null) {
                    qu.addLast(rem.right);
                }
                if(rem.left != null) {
                    qu.addLast(rem.left);
                }
            }
        }
        return res;
    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        rightSideViewHelper(root, res, 0);
        return res;
    }

    private void rightSideViewHelper(TreeNode node, List<Integer> res, int level) {
        if(node == null) return;
        if(res.size() == level) {
            res.add(node.val);
        }
        rightSideViewHelper(node.right, res, level + 1);
        rightSideViewHelper(node.left, res, level + 1);
    }
}
