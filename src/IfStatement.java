public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Se envio el archivo");

        }
        else {
            fileSended--;
            System.out.println("No se envio el archivo");
        }
        System.out.println(fileSended);
    }
}

