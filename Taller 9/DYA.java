public class DYA {

    public void condiciones(String email){
        if (!email.contains("@") || !email.contains(".")){
            System.out.println("Email invalido");
        }else{
            System.out.println("Email valido");
        }
    }

    public static void main(String[] args) {
        DYA main = new DYA();
        main.condiciones("samuelescobaralvarez@gmial.com");
        }
}

