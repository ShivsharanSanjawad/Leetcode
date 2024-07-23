class Solution {
    public String multiply(int a, int b, int x, int y) {
        long real = a * x - b * y;
        long img = a * y + b * x;
        return real + "+" + img + "i";
    }

    public String complexNumberMultiply(String num1, String num2) {
        int x1 = num1.indexOf('+');
        int x2 = num2.indexOf('+');

        int a = Integer.parseInt(num1.substring(0, x1));
        int b = Integer.parseInt(num1.substring(x1 + 1, num1.length() - 1));

        int x = Integer.parseInt(num2.substring(0, x2));
        int y = Integer.parseInt(num2.substring(x2 + 1, num2.length() - 1));

        return multiply(a, b, x, y);
    }
}
