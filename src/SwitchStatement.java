public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "1";
        //es una manera de tomar una decisión a partir de un valor dado, con varios resultados posibles
        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
                //se ejecuta siempre y cuando el resto de cases del switch no se corresponda con el valor que tenemos
                default:
                System.out.println("Seleccione una opcion");
        }

    }
}
