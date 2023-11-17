import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void allPathsSourceTargetTest1() {
        int[][] graph = {
                {1, 2},
                {3},
                {3},
                {}
        };
        List<List<Integer>> expected = List.of(List.of(0, 1, 3), List.of(0, 2, 3));
        List<List<Integer>> actual = new Solution().allPathsSourceTarget(graph);

        Assert.assertEquals(expected, actual);
    }
}
