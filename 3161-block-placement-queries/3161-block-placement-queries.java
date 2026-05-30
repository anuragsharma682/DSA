import java.util.*;

class Solution {

    class FenwickTree {
        int[] bit;

        FenwickTree(int n) {
            bit = new int[n + 1];
        }

        // Standard point update for maximums
        void update(int idx, int val) {
            while (idx < bit.length) {
                bit[idx] = Math.max(bit[idx], val);
                idx += idx & -idx;
            }
        }

        // Returns the max gap in the prefix up to idx
        int query(int idx) {
            int res = 0;
            while (idx > 0) {
                res = Math.max(res, bit[idx]);
                idx -= idx & -idx;
            }
            return res;
        }
    }

    public List<Boolean> getResults(int[][] queries) {
        // Determine the maximum coordinate boundary dynamically based on queries
        int maxCoord = 0;
        for (int[] q : queries) {
            maxCoord = Math.max(maxCoord, q[1]);
        }
        
        // Use a TreeSet to find initial adjacencies for the final state
        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);
        obstacles.add(maxCoord + 1); // Sentinel boundary

        for (int[] q : queries) {
            if (q[0] == 1) {
                obstacles.add(q[1]);
            }
        }

        // Initialize Fenwick Tree with the final state gaps
        FenwickTree ft = new FenwickTree(maxCoord + 2);
        Integer prev = 0;
        for (Integer curr : obstacles) {
            if (curr != 0) {
                ft.update(curr, curr - prev);
                prev = curr;
            }
        }

        // Prepare to process queries in reverse
        int numQueries = queries.length;
        Boolean[] finalAnsArray = new Boolean[numQueries]; 
        int ansIdx = numQueries - 1;

        for (int i = numQueries - 1; i >= 0; i--) {
            int[] q = queries[i];
            int x = q[1];

            if (q[0] == 1) {
                // Remove obstacle x: merge blocks (x - left) and (right - x) into (right - left)
                obstacles.remove(x);
                Integer left = obstacles.floor(x);
                Integer right = obstacles.ceiling(x);
                
                // Since we are merging, the gap size increases, which Fenwick Tree handles natively
                ft.update(right, right - left);
            } else {
                int sz = q[2];
                Integer lastObstacleBeforeX = obstacles.floor(x);

                // Find max gap: either entirely within prefix [0, lastObstacleBeforeX] 
                // or stretching from lastObstacleBeforeX up to x itself
                int maxGap = Math.max(ft.query(lastObstacleBeforeX), x - lastObstacleBeforeX);
                
                finalAnsArray[ansIdx] = (maxGap >= sz);
            }
            ansIdx--;
        }

        // Filter out any null entries (from type 1 queries) and build result list
        List<Boolean> ans = new ArrayList<>();
        for (Boolean b : finalAnsArray) {
            if (b != null) {
                ans.add(b);
            }
        }
        return ans;
    }
}