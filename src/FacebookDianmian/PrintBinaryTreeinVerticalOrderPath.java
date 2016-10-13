package FacebookDianmian;

import java.util.ArrayList;
import java.util.*;

/**
 * Given a binary tree, print it in ver­ti­cal order path
 * http://www.geeksforgeeks.org/print-binary-tree-vertical-order/
 * http://algorithms.tutorialhorizon.com/print-the-binary-tree-in-vertical-order-path/
 * Do the inorder traversal.
 Take a vari­able called level, when ever you go left, do level++ AND when ever you go right do level–.
 With step above we have sep­a­rated out the lev­els vertically.
 Now you need to store the ele­ments of each level, so cre­ate a TreeMap and the (key,value) pair will be (level,elements at that level).
 At the end iter­ate through the TreeMap and print the results.
 */
public class PrintBinaryTreeinVerticalOrderPath {
    public static TreeMap<Integer,ArrayList> ht=new TreeMap<>();
    public static int level;
    public ArrayList<Integer> al;
    public Node vertical(Node root,int level){
        if(root==null) return null;//base case
        Node y=vertical(root.left,level--);
        if(y==null) level++;
        //store list from treemap to list
        if(ht.get(level)!=null){
            ArrayList x=ht.get(level);
            x.add(root.data);
            ht.put(level,x);
        }else{
            al=new ArrayList<>();
            al.add(root.data);
            ht.put(level,al);
        }
        return vertical(root.right,level++);
    }
    public void printResult(TreeMap ht){
        Set<Integer> i=ht.keySet();
        for(int key:i){
            System.out.println(key);
        }
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        PrintBinaryTreeinVerticalOrderPath p=new PrintBinaryTreeinVerticalOrderPath();
        p.vertical(root,0);
        p.printResult(ht);
    }
}

//define node and ListNode
class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class ListNode {
    int data;
    ListNode next;
    public ListNode(int data) {
        this.data = data;
        next = null;
    }
}