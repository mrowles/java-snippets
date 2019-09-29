package closestPointsToOrigin;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ClosestPointsToOrigin {
    int[][] points;

    public static int[][] findClosestSort(int[][] points, int amt) {
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

    public int[][] findClosestDivideAndConquer(int[][] points, int amt) {
        this.points = points;
        sort(0, points.length - 1, amt);

        return Arrays.copyOfRange(points, 0, amt);
    }

    private void sort(int i, int j, int amt) {
        if (i >= j) {
            return;
        }

        int k = ThreadLocalRandom.current().nextInt(i, j);
        swap(i, k);

        int mid = partition(i, j);
        int leftLength = mid - i + 1;

        if (amt < leftLength) {
            sort(i, mid - 1, amt);
        } else if (amt > leftLength) {
            sort(mid + 1, j, amt - leftLength);
        }
    }

    private int partition(int i, int j) {
        int oi = i;
        int pivot = calculateDistance(points[i]);
        i++;

        while (true) {
            while (i < j && calculateDistance(points[i]) < pivot) {
                i++;
            }
            while (i <= j && calculateDistance(points[j]) > pivot) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(i, j);
        }
        swap(oi, j);

        return j;
    }

    private void swap(int i, int j) {
        int temp1 = points[i][0];
        int temp2 = points[i][1];
        points[i][0] = points[j][0];
        points[i][1] = points[j][1];
        points[j][0] = temp1;
        points[j][1] = temp2;
    }

    private static int calculateDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
