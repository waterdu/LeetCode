package PocketGemsMianjing;

/**
 * Created by zqz on 2016/10/5.
 * 举个例⼦子，就是
 a?b?c:d:e转化成
 a
 / \
 b e
 / \
 c d
 这题的基本思路就是⽤用stack，遇到”?"，⼊入栈，遇到":"，出栈。
 */
public class TernaryExpressionToBinaryTree {
    public static TreeNode solve(String s){
        if(s==null || s.length()==0) return null;
        if(s.length()==1)
        return new TreeNode(s.charAt(0));
        int flag=0; int mid=0;
        for(int i=2;i<=s.length()-1;i++){
            if(s.charAt(i)=='?')
                flag++;
            else if(s.charAt(i)==':'){
                if(flag==0){
                    mid=i;
                    break;
                }
                else flag--;
            }
        }
        TreeNode head=new TreeNode(s.charAt(0));
        TreeNode temp_left=solve(s.substring(2,mid));
        TreeNode temp_right=solve(s.substring(mid+1,s.length()));.
        head.left=temp_left;
        head.right=temp_right;
        return head;
    }
}
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int value){
        this.value=value;
        left=null;
        right=null;
    }
}
