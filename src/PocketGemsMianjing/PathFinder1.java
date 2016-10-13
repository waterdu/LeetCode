package PocketGemsMianjing;
import java.util.HashSet;
import java.util.List;
import java.util.*;

/**
 * Created by zqz on 2016/10/12.
 */
public class PathFinder1 {
    public List<String> pathFinder(List<String> lines) {
        Set<String> visited=new HashSet<>();//store visited point here
        Map<String,List<String>> graph=new HashMap<>();
        List<String> result=new ArrayList<String>();
        String[] startEnd=lines.get(0).split(" ");//A E
        String start=startEnd[0];//A
        String end=startEnd[1];//E
        //save graph to map
        for(int i=1;i<lines.size();i++){
            String line=lines.get(i);
            String[] nodes=line.trim().split(":");//A,B C D
            //trim remove starting and ending space
            String from=nodes[0];
            List<String> to=Arrays.asList(nodes[1].trim().split(" "));
            graph.put(from,to);
        }
//        dfs(result,visited,graph,start,end,"");
        traversal(start,end,"",visited,result,graph);
        return result;
    }
//    private void dfs(List<String> result,Set<String> visited,Map<String,List<String>> graph,String from,String end,String path){
//        ;//add the node
//        String currentPath = path;
//        currentPath += from;
//        visited.add(from);
//        if(from.equals(end)){
//            System.out.println("go here?");
//            result.add(currentPath);
//        }else{
//            List<String> next=graph.get(from);
//            if(next!=null){
//            for(String nextNode:next){
//                if(!visited.contains(nextNode)){
//                    dfs(result,visited,graph,nextNode,end,currentPath);
//                }
//            }}
//        }
//        visited.remove(from);//remove it back
//    }
private static void traversal(String start, String end, String path, Set<String> visited,
                              List<String> res, Map<String, List<String>> graph) {
    String curPath = path;
    curPath += start;
    visited.add(start);
    if(start.equals(end)) {
        res.add(curPath);
    } else {
        List<String> adj = graph.get(start);
        if(adj != null) {
            for(String adjNode: adj) {
                if(!visited.contains(adjNode)) {
                    traversal(adjNode, end, curPath, visited, res, graph);
                }
            }
        }
    }
    visited.remove(start);}


    public static void main(String[] args){
        PathFinder1 t=new PathFinder1();

        List<String> input1 = new ArrayList<String>();
        input1.add("A E");
        input1.add("A : B C D");
        input1.add("B : C");
        input1.add("C : E");
        input1.add("D : B");
        List<String> result=t.pathFinder(input1);
        for(String i:result){
            System.out.println(i);
        }
    }
}
