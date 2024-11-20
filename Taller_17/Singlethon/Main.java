package Taller_17.Singlethon;

public class Main {
    public static void main(String[] args) {
        Settings settings = Settings.getInstancia();

        System.out.println("Tema actual: " + settings.getConfiguraciones("theme"));
        System.out.println("Idioma actual: " + settings.getConfiguraciones("language"));

        settings.setConfiguraciones("theme", "white");
        settings.setConfiguraciones("language", "es");

        System.out.println("Tema actualizado: " + settings.getConfiguraciones("theme"));
        System.out.println("Idioma actualizado: " + settings.getConfiguraciones("language"));

        Settings otraSettings = Settings.getInstancia();
        System.out.println("¿Son lo misma instancia? " + (settings == otraSettings));

    }
    
}
