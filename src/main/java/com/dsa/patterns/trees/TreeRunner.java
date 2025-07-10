package com.dsa.patterns.trees;

import com.dsa.patterns.trees.easy.LeftRightView;
import com.dsa.patterns.trees.easy.LevelOrderTraversal;

import java.util.List;

public class TreeRunner {
    public static void main(String[] args) {
        TreeNode l4 = new TreeNode(80);
        TreeNode r4 = new TreeNode(90);
        TreeNode l3 = new TreeNode(60, l4, null);
        TreeNode r3 = new TreeNode(70, null, r4);
        TreeNode l2 = new TreeNode(40);
        TreeNode r2 = new TreeNode(50);
        TreeNode l1 = new TreeNode(20, l2, r2);
        TreeNode r1 = new TreeNode(30, l3, r3);
        TreeNode root = new TreeNode(10, l1, r1);

        LevelOrderTraversal.printLevelOrderTraversal(root);
        System.out.println();
        //displayList(LeftRightView.leftView(root));
        displayList(LeftRightView.rightView(root));

    }

    private static void displayList(List<Integer> list) {
        for(Integer val: list) {
            System.out.println(val);
        }
    }
}
