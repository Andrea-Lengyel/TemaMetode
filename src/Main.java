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

        JavaLogo();
//        Exercise 3
        System.out.println(average(3, 4, 6));
//        Exercise 4
        robotics();
//        Exercise 5
        System.out.println(modul(80,3));
//        Exercise 6

        float F = 103.5f;
        System.out.println(temp(F));
//        Exercise 7

        Float D = 26.15f;
        System.out.println(distance(D));
//        Exercise 8

        int d1 = 15;
        int th = 2;
        int tm = 3;
        int ts = 7;

        speed(d1, th, tm, ts);
//Exercise 9
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

    public static void JavaLogo()
    {
        System.out.println("   J     a    v     v   a");
        System.out.println("   J    a a    v   v   a a");
        System.out.println("J  J   aaaaa    V V   aaaaa");
        System.out.println(" JJ   a     a    V   a     a ");
    }

    public static float average(float n1, float n2, float n3){
        float average = (n1 + n2 + n3)/3;
        return average;
    }

    public static void robotics()
    {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '_' |");
        System.out.println(" +-----+");
    }

    public static int modul(int n1, int n2){
        int mod = n1%n2;
        return mod;
    }
    public static float temp(float f){
        float C = 5/9f*(f-32);
        return C;
    }
    public static float distance(float d){
        float dist = d * 0.0254f;
        return dist;
    }

    public static void speed(float A, float B, float C, float D){
        float v1 = A/(B * 3600 + C * 60 + D);
        System.out.println(v1);
        float v2 = (A/1000)/(B + C/60 + D/3600);
        System.out.println(v2);
        float v3 = (A/1609)/(B + C/60 + D/3600);
        System.out.println(v3);
    }
}
