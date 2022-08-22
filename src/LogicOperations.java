public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //Operadores asignacion
        System.out.println("Si a es igual a b? -> " + (a == b));
        System.out.println("Si a es diferente a b? -> " + (a != b));
        System.out.printf("--------------");
        //Operadores Relacionales
        System.out.println("\nSi a es Menor a b1? -> " + (a < b));
        System.out.println("Si a es Mayor a b1? -> " + (a > b));
        System.out.println("Si a es Menor igual a b1? -> " + (a <= b));
        System.out.println("Si a es Mayor igual a b1? -> " + (a >= b));
        System.out.printf("--------------");



        if (a == b){
            System.out.println("Si a es igual a b? -> " );

        } else if ((a != b) && (a > b )) {
            System.out.println("Si a es diferente a b? -> ");

        } else if (a < b) {
            System.out.println("Si a es menor a b? -> ");

        } else if (a > b) {
            System.out.println("Si a es mayor a b? -> ");

        } else if (a <= b) {
            System.out.println("Si a es menor igual a b? -> ");

        } else if (a >= b) {
            System.out.println("Si a es mayor igual a b? -> ");

        }

        }

    }




