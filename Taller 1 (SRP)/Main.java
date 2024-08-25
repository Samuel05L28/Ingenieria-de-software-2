// Se crea la clase usuario que contiene la informaion solamente del usuario utilzando SRP
class Usuario {
    private String nombre;
    private String correo;
    private String contraseña;
    private double horasTrabajadas;
    private double tarifaPorHora;

    public Usuario(String nombre, String correo, String contraseña, double horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
}

// Esta clase obteien toda la informacion del usuario y la imprime 
class ObtenerUsuario {
    public void mostrarInformacionUsuario(Usuario usuario) {
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Horas trabajadas: " + usuario.getHorasTrabajadas());
        System.out.println("Tarifa por hora: $" + usuario.getTarifaPorHora());
    }
}

// Verifica si la contraseña del usuario coincide con la de validar contraseña
class ValidadorContraseña {
    public boolean validarContraseña(Usuario usuario, String contraseñaIngresada) {
        return usuario.getContraseña().equals(contraseñaIngresada);
    }
}

// Se envia un correo a el correo del ususario
class EnviarCorreo {
    public void enviarCorreo(Usuario usuario, String mensaje) {
        System.out.println("Enviando correo a: " + usuario.getCorreo());
        System.out.println("Mensaje: " + mensaje);
    }
}

// Se calcula el salario de la persona dependiendo de las horas tranjadas y cuanto se gane por hora 
class CalculadorSalario {
    public double calcularSalario(Usuario usuario) {
        return usuario.getHorasTrabajadas() * usuario.getTarifaPorHora();
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear un nuevo usuario
        Usuario usuario = new Usuario("Samuel", "samuel@gmail.com", "hola123", 46, 60000);

        // Creamos los servicios
        ObtenerUsuario ObtenerUsuario = new ObtenerUsuario();
        ValidadorContraseña validadorContraseña = new ValidadorContraseña();
        EnviarCorreo EnviarCorreo = new EnviarCorreo();
        CalculadorSalario calculadorSalario = new CalculadorSalario();

        // Mostramos la inofrmacion del ususiario
        ObtenerUsuario.mostrarInformacionUsuario(usuario);

        // Validar contraseña
        boolean esValida = validadorContraseña.validarContraseña(usuario, "hola123");
        System.out.println("Contraseña válida: " + esValida);

        // Enviar correo
        EnviarCorreo.enviarCorreo(usuario, "Bienvenido a nuestra plataforma");

        // Calcular salario
        double salario = calculadorSalario.calcularSalario(usuario);
        System.out.println("El salario calculado es: $" + salario);
    }
}
