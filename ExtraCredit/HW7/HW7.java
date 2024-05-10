import java.util.Arrays;

public class HW7 {
    public int minMeetingRooms(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int minNumOfServers = 0;
        int count = 0;
        int i = 0; // pointer for start array
        int j = 0; // pointer for end array

        while (i < intervals.length) {
            if (start[i] < end[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }
            minNumOfServers = Math.max(minNumOfServers, count);
        }
        return minNumOfServers;
    }
}
