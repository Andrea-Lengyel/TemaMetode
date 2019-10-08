public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello \nAndrea");
//        int A = 7;
//        int B = 226;
//        System.out.println(A + B);
//        float C = (float)A/B;
//        System.out.println(C);
//
//        System.out.println(- 5 + 8 * 6);
//        int x = (55 + 9) % 9;
//        System.out.println(x);
//        float y = 20 + (float)(- 3 * 5)/8;
//        System.out.println(y);
//        System.out.println(5 + 15/3 * 2 - 8 % 3);

        printMyName();

        int A = 7;
        int B = 226;
        System.out.println(sum(A,B));

        float C = division(A,B);
            System.out.println(C);
            System.out.println(Op1(-5,8,6));
            System.out.println(Op2(55, 9, 9));
            System.out.println(Op3(20, -3, 5, 8));
            System.out.println(Op4(5, 15, 3, 2, 8));
//        Exercise 1

        int x = 3;
        int y = 5;
        int result = sum(x,y);
        System.out.println("The result of sum is: " + result);
        result = substract(x,y);
        System.out.println("The result of substract is: " + result);
        float result2 = division(x,y);
        System.out.println("The result of division is: " + result2);
        result = multiply(x,y);
        System.out.println("The result of multiplication is: " + result);
//        Exercise 2

    }
    public static void printMyName(){
        System.out.println("Hello \nAndrea");
    }
    public static int sum(int X, int Y){
        int sum = X + Y;
        return sum;
    }
    public static float division(float X, float Y){
        float div = X/Y;
        return div;
    }
    public static int Op1(int X, int Y, int Z){
        int rez = X + Y * Z;
        return rez;
    }
    public static int Op2(int X, int Y, int Z){
        int rez = (X + Y) % Z;
        return rez;
    }
    public static float Op3(float a, float b, float c, float d){
        float rez = a + b * c/d;
        return rez;
    }
    public static int Op4(int a, int b, int c, int d, int e){
        int rez = a + b/c * d - e % c;
        return rez;
    }

        public static int substract(int first, int second) {
        int rez = first - second;
        return rez;
    }
        public static int multiply(int first, int second) {
        int mult = first * second;
        return mult;
    }
}
