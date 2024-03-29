/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package EditDistance;

public class App {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";

        DPSolution dpSolution = new DPSolution();
        int minDistance = dpSolution.minDistance(word1, word2);
        System.out.printf("Min edit distance: %d%n", minDistance);

        SpaceOptimizedDPSolution spaceOptimizedDPSolution = new SpaceOptimizedDPSolution();
        minDistance = spaceOptimizedDPSolution.minDistance(word1, word2);
        System.out.printf("Min edit distance: %d%n", minDistance);
    }
}
