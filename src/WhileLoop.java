public class WhileLoop {
    static boolean isTurnOnLigth = false;

    public static void main(String[] args) {

        turnOnOffLight();
        int i = 1;
        while (isTurnOnLigth && i<=10){
            printSOS();
            i++;
        }

    }
    public static void printSOS(){
        System.out.println("... ___ ...");
    }
    public  static boolean turnOnOffLight(){
        /*
        * Operador ternario
        * Se pone la variable, despues entre parentesis se pone la operacion que se va ejecutar,
        * Enseguida un signo de interrogacion para indicar que es una operacon
        * Luego el primer dato va ser el primer valor de regreso
        * Si la condicion de cumple se devuelve un dato,si no se cumple se devuelve el otro dato.
        * */

        isTurnOnLigth = (isTurnOnLigth)?false:true;
        return isTurnOnLigth;
    }
}
