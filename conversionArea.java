public class conversionArea {


    //sqm to other unit
    public static void hectare(double sqm)
    {

        double s=sqm*0.0001;
        System.out.println(sqm+" sq meter---->"+s+" hectare");
    }
    public static void acre(double sqm)
    {

        double s=sqm*0.000247105;
        System.out.println(sqm+" sq meter---->"+s+" acre");

    }
    public static void sqf(double sqm)
    {

        double s=sqm*10.7639;
        System.out.println(sqm+" sq meter---->"+s+" sq feet");

    }


    //hectare to other
    public static void sqm(double hectare)
    {

        double s=hectare*10000;
        System.out.println(hectare+" hectare---->"+s+" sq meter");
    }
    public static void acre1(double hectare)
    {

        double s=hectare*2.47105;
        System.out.println(hectare+" hectare---->"+s+" acre");

    }
    public static void sqf1(double hectare)
    {

        double s=hectare*107639;
        System.out.println(hectare+" hectare---->"+s+" sq feet");

    }


    //acre to other
    public static void sqm1(double acre)
    {

        double s=acre*4046.852505043;
        System.out.println(acre+" acre---->"+s+" sq meter");
    }
    public static void hectare2(double acre)
    {

        double s=acre*0.404686;
        System.out.println(acre+" acre---->"+s+" hectare");
    }
    public static void sqf2(double acre)
    {

        double s=acre*43560;
        System.out.println(acre+" acre---->"+s+" sq feet");

    }


    //sq feet  to other
    public static void sqm2(double sqf)
    {

        double s=sqf*0.092903;
        System.out.println(sqf+" sq feet---->"+s+" sq meter");
    }
    public static void hectare3(double sqf)
    {

        double s=sqf*0.0000092903;
        System.out.println(sqf+" sq feet---->"+s+" hectare");
    }
    public static void acre3(double sqf)
    {

        double s=sqf*0.00002295683124426;
        System.out.println(sqf+" sq feet---->"+s+" acre");

    }

}
