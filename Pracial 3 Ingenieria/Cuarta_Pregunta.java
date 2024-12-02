//Aplicando el patron Singleton

class configuracionuracion{
    private static configuracionuracion instancia;

    private String url;
    private String usuario;
    private String password;

    
   public static configuracionuracion getInstancia(){
    if (instancia == null) {
        instancia = new configuracionuracion();
    }
    return instancia;
   }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public configuracionuracion() {
        this.url = "htpp://localhost:8080/compraya";
        this.usuario = "root";
        this.password = "password";
    }

}


public class Cuarta_Pregunta {
    public static void main(String[] args) {

        configuracionuracion configuracion = configuracionuracion.getInstancia() ;

        System.out.println("URL: " + configuracion.getUrl());
        System.out.println("Usuario: " + configuracion.getUsuario());
        System.out.println("Password: " + configuracion.getPassword());

        configuracionuracion otraconfiguracion = configuracionuracion.getInstancia();
        System.out.println("Son iguales las instancia: " + (configuracion == otraconfiguracion));
       }
    
}
