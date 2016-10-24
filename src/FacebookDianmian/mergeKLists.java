package FacebookDianmian;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by zqz on 2016/10/20.
 */
public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0) return null;
        ListNode dummy=new ListNode(0);
        PriorityQueue<ListNode> q=new PriorityQueue<>(1, new Comparator<ListNode>(){
           public int compare(ListNode n1,ListNode n2){
               return n1.data-n2.data;
           }
        });
        //put all to q
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null) q.offer(lists[i]);//we can store list once to priorityQ immediately
        }
        ListNode current=dummy;
        while(!q.isEmpty()){
            current.next=q.poll();
            current=current.next;
            if(current.next!=null){
                q.offer(current.next);
                current.next=null;
            }
        }
        return dummy.next;
    }
}
//public class ListNode {
//       int val;
//       ListNode next;
//        ListNode(int x) { val = x; }
//}