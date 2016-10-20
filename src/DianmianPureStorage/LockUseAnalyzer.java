package DianmianPureStorage;

import java.util.*;

/**
 * Created by zqz on 2016/10/17.
 */
public class LockUseAnalyzer {
    public int LockUseAnalyzer(String[] input){
        String[] status=new String[input.length];
        Integer[] number=new Integer[input.length];
        Stack<Integer> locked=new Stack<>();
        Set<Integer> acquired=new HashSet<>();
        for(int i=0;i<input.length;i++){
            String[] line=input[i].trim().split(" ");
            status[i]=line[0];
            number[i]=Integer.parseInt(line[1]);
            if(status[i].equals("ACQUIRE")){
                if(acquired.contains(number[i])) return i+1;//first index is 0
                acquired.add(number[i]);
                locked.add(number[i]);
            }else if(status[i].equals("RELEASE")){
                if(!acquired.contains(number[i])) return i+1;//release a lock not acquire before
                if(!number[i].equals(locked.peek())){
                    return i+1;//wrong order
                }
                acquired.remove(number[i]);
                locked.pop();
            }
        }
        if(!acquired.isEmpty()) return input.length+1;//upon terminating
        return 0;
    }
    public static void main(String[] strg){
        LockUseAnalyzer ob=new LockUseAnalyzer();

//        Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable, inputString.

        String[] input1={
                "ACQUIRE 364",
                "ACQUIRE 84",
//                "ACQUIRE 364",
//                "RELEASE 84",
//                "RELEASE 364",
        };

        System.out.println(ob.LockUseAnalyzer(input1));
        int[] array={1,2,3};
        System.out.println(3);
        System.out.println("1 2 3");
        System.out.println(2);

    }
}
