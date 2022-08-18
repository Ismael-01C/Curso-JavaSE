public class Casting {
    public static void main(String[] args) {

        //En un año ubicar 30 perritos
        //Cuantos perritos ubique al mes

        double monthlyDgos = 30.0/12.0;
        System.out.println(monthlyDgos);

        //Estimacion
        int estimatedMonthlyDogs = (int) monthlyDgos;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud

        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        //Conversion automatica
        double c = a/b;
        System.out.println(c);

        //Requiere un casting
        double C = (double) a/b;
        System.out.println(C);

        char n = '1';
        int nI = n;   //un char es mas pequeño que un entero(se hace la conversion automatica)
        System.out.println(nI);

        short nS = (short) n; //un short es mas grande que en un char(se hace un casting)
        System.out.println(nS);



    }
}
