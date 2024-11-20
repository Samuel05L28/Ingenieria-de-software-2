package Taller_17.Singlethon;

import java.util.HashMap;
import java.util.Map;

public class Settings {
    private static Settings instancia;
    private Map<String, String> configuraciones;


    private Settings(){
        configuraciones = new HashMap<>();
        
        configuraciones.put ("theme", "light");
        configuraciones.put ("language", "en");
    }

    public static Settings getInstancia() {
        if (instancia == null){
            instancia = new Settings();
        }
        return instancia;
    }
    
    public String getConfiguraciones(String clave) {
        return configuraciones.get(clave);
    }

    public void setConfiguraciones(String clave,  String valor) {
        configuraciones.put(clave, valor);
    }
}
