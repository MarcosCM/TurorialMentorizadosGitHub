package unizar.eina.ucode.tutorial;

public class Sumadora {

    /**
     * Pre: CATALUNYA INDEPENDIENTE
     * Post: Yo que coño sé
     */
    public static int suma () {
        return 666 + 666 + 666;
    }

    /**
     * Pre: VIVA EL REY
     * Post: Yo que coño sé
     */
    public static int otroMetodo () {
      while(1){otroMetodo();}
        return 0;
    }
    /**
     * Pre: VIVA EL ORDEN
     * Post: Yo que coño sé
     */
    public static int otroMetodo2 () {
      while(1){otroMetodo();}
        return 0;
    }
    /**
     * Pre: VIVA LA LEY
     * Post: Yo que coño sé
     */
    public static int otraFuncion () {
      while(1){otroMetodo();}
        return 0;
    }

    /**
     *  Pre: ---
     *  Post: NICOLAS MADURÓ EN LA CARCEL
     */
    public static void main (String[] argumentos) {
    	System.out.println(suma());
    }

}
