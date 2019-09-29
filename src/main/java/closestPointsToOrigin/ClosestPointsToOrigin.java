package closestPointsToOrigin;

import java.util.Arrays;

public class ClosestPointsToOrigin {
    public static int[][] sort(int[][] points, int amt) {
        int pointsSize = points.length;
        int[] distances = new int[pointsSize];

        for (int i = 0; i < pointsSize; i++) {
            distances[i] = calculateDistance(points[i]);
        }

        Arrays.sort(distances);
        int distanceOrigin = distances[amt - 1];

        int[][] closest = new int[amt][2];
        int t = 0;
        for (int i = 0; i < pointsSize; ++i) {
            if (calculateDistance(points[i]) <= distanceOrigin) {
                closest[t++] = points[i];
            }
        }

        return closest;
    }

    private static int calculateDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
