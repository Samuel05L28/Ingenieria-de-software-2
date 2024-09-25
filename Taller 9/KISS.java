public class KISS {
    public static String invertirCadena(String cadena){
        StringBuilder builder = new StringBuilder(cadena);
        String sCadenaInvertida = builder.reverse().toString();
        return sCadenaInvertida;
    }
    public static void main(String[] args) {
        System.out.println(invertirCadena("Hola Mundo"));
    }
}