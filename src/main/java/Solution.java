import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(graph, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[][] graph, int i, List<Integer> currentPath, List<List<Integer>> result) {
        if(i == graph.length - 1){
            currentPath.add(i);
            result.add(new ArrayList<>(currentPath));
            currentPath.remove(currentPath.size() - 1);
            return;
        }
        for (int j = 0; j < graph[i].length; j++) {
            currentPath.add(i);
            dfs(graph, graph[i][j], currentPath, result);
            currentPath.remove(currentPath.size() - 1);
        }
    }

}
