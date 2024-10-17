class Solution {
    public int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public boolean check1(int num) {
        return num % 2 == 0;
    }

    public boolean check2(int num) {
        if (num < 20) {
            return num % 11 == 0 || num % 2 == 0;
        }
        return num % 11 == 0;
    }

    public boolean check(int num) {
        for (int i = 0; i <= num; i++) {
            if (i + reverse(i) == num) {
                return true;
            }
        }
        return false;
    }

    public boolean sumOfNumberAndReverse(int num) {
        if (num % 10 == 0 && num != 0) {
            return num == 10;
        }

        switch (Integer.toString(num).length()) {
            case 1 -> {
                return check1(num);
            }
            case 2 -> {
                return check2(num);
            }
            default -> {
                return check(num);
            }
        }
    }
}
