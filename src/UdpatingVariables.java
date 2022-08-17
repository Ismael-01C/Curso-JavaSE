public class UdpatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //Bono de $200
        salary = salary + 200;
        System.out.println(salary);
        //Descuento $50
        salary = salary - 50;
        System.out.println(salary);
        //2 horas extra $30 c/u
        //comida: $45
        salary = salary +(30*2) - 45;
        System.out.println(salary);
        //Actualizando Cadenas de texto
        String employeeName = "Ismael Carreño";
        employeeName = employeeName + " Escalante";
        System.out.println(employeeName);
        employeeName = "Alejandro " + employeeName;
        System.out.println( "Tu nombre es: " + employeeName);

    }
}
