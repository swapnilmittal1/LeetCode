class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        // Use a set to store the unique distances
        Set<Integer> distances = new HashSet<>();
        distances.add(findDist(p1, p2));
        distances.add(findDist(p1, p3));
        distances.add(findDist(p1, p4));
        distances.add(findDist(p2, p3));
        distances.add(findDist(p2, p4));
        distances.add(findDist(p3, p4));

        // There should be only 2 unique distances for a valid square (sides and diagonals)
        // And ensure no distance is zero (no repeated points)
        return distances.size() == 2 && !distances.contains(0);
    }

    private int findDist(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }
}
