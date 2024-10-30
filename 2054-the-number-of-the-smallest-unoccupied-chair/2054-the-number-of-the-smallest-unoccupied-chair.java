import java.util.Arrays;

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int[] chairs = new int[n];
        Arrays.fill(chairs, -1);
        int[][] events = new int[2 * n][2];
        for (int i = 0; i < n; i++) {
            events[2 * i] = new int[]{times[i][0], i};
            events[2 * i + 1] = new int[]{times[i][1], -i-1 };
        }

        Arrays.sort(events, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        for (int[] event : events) {
            int time = event[0];
            int friendIndex = event[1];

            if (friendIndex < 0) {
                friendIndex = -friendIndex -1;
                for (int j = 0; j < n; j++) {
                    if (chairs[j] == friendIndex) {
                        chairs[j] = -1;
                        break;
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (chairs[j] == -1) {
                        chairs[j] = friendIndex;
                        if (friendIndex == targetFriend) {
                            return j;
                        }
                        break;
                    }
                }
            }
        }
        return -1;
    }
}
