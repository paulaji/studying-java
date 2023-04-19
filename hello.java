class helloworld
{
    public static void main(String a[])
    {
        boolean b = true;
        char c = 'k';
        byte marks = 127;
        short s = 32000;
        long l = 34445555;
        float f = 4.5f;
        double result = (c + marks + s + l + f);
        int num = 0x6F;
        int num1 = 00_00_000;
        double num2 = 1e1;

        System.out.println(num2);
        System.out.println(num1);
        System.out.println(num);
        System.out.println(b);
        System.out.println(result);
        // System.out.println(c + marks + s + l + f);
    }
}