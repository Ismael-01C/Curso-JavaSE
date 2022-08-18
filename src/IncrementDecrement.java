public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4
        //Operadores Postfija
        lives--; //Decremento
        System.out.println(lives); //3

        lives++; //Incremento
        System.out.println(lives); //4

        //Operadores Prefija
        int gift = 100 + ++lives; //Gana un regalo por ganar una vida
        System.out.println(gift);

    }
}
