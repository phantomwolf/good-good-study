/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package shortestpathinagridwithobstacleselimination;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    private int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};

    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        if (m == 1 && n == 1) {
            return 0;
        }
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][][] visited = new boolean[m][n][k + 1];
        visited[0][0][0] = true;
        q.add(new int[]{0, 0, 0});
        int steps = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] v = q.remove();
                for (int[] dir : dirs) {
                    int nextX = v[0] + dir[0], nextY = v[1] + dir[1];
                    if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n) {
                        continue;
                    }
                    int nextK = v[2] + grid[nextX][nextY];
                    if (nextK <= k && !visited[nextX][nextY][nextK]) {
                        if (nextX == m - 1 && nextY == n - 1) {
                            return steps + 1;
                        }
                        visited[nextX][nextY][nextK] = true;
                        q.add(new int[]{nextX, nextY, nextK});
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}


public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 0},
        };
    }
}
