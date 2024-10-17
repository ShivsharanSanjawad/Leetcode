class Solution {
    public int maximumSwap(int num) {
        char[] x = Integer.toString(num).toCharArray();
        int[] max = new int[x.length];
        int[] maxindex = new int[x.length];
        max[max.length - 1] = x[x.length - 1] - '0';
        maxindex[max.length - 1] = max.length - 1;
        for (int i = x.length - 2; i >= 0; i--) {
            if (x[i] - '0' <= max[i + 1]) {
                max[i] = max[i + 1];
                maxindex[i] = maxindex[i + 1];
            } else {
                max[i] = x[i] - '0';
                maxindex[i] = i;
            }
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] - '0' < max[i]) {
                char temp = x[i];
                x[i] = x[maxindex[i]];
                x[maxindex[i]] = temp;
                break;
            }
        }
        return Integer.parseInt(new String(x));
    }
}
