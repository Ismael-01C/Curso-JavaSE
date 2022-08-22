public class Funciones {
    public static void main(String[] args) {

        double y = 3;
        //Area de un circulo
        //pi * r2

        //se puede imprimir con variable o solo el metodo
        circleArea(y);

        //Area de una esfera
        //4*PI*r2
        sphereArea(y);

        //Volumen de una esfera
        //(4/3)*pi*r3
        sphereVolumen(y);

        System.out.println("PESOS A DOLARES:" + converToDolar(1000, "COP"));
        
    }

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }
    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantify Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double converToDolar(double quantify, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantify = quantify * 0.052;
                break;
            case "COP":
                quantify = quantify * 0.00031;


        }
        return quantify;
    }
}
