public class Potencia {
    public static void main(String[] args) {
        Integer base = 2;
        Integer expoente = 5;
        Integer resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
