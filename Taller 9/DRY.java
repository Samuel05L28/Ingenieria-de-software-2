public class DRY {

    public void condiciones(String email){
        if (!email.contains("@") || !email.contains(".")){
            System.out.println("Email invalido");
        }else{
            System.out.println("Email valido");
        }
    }

    public static void main(String[] args) {
        DRY main = new DRY();
        main.condiciones("samuelescobaralvarez@gmial.com");
        }
}

