package Taller_16_1;

import java.util.ArrayList;
import java.util.List;

class Usuario{
    private String nombre;
    private int edad;
    private String correo;
    private List<String> intereses;


    private Usuario(Builder builder){
        this.nombre = builder.getNombre();
        this.edad = builder.getEdad();
        this.correo = builder.getCorreo();
        this.intereses = builder.getIntereses();
        
    }

    @Override
    public String toString(){
        return "Usuario{"+"nombre: "+ nombre + " / " + " edad: " + edad + " /" + " correo: " + correo + " /" + " intereses: " + intereses + " }";
    }


static class Builder {
    private String nombre;
    private int edad;
    private String correo;
    private List<String> intereses = new ArrayList<>();


    public String getNombre() {
        return nombre;
    }
    public Builder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    public int getEdad() {
        return edad;
    }
    public Builder setEdad(int edad) {
        this.edad = edad;
        return this;
    }
    public String getCorreo() {
        return correo;
    }
    public Builder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }
    public List<String> getIntereses() {
        return intereses;
    }
    public Builder setIntereses(String intereses) {
        this.intereses.add(intereses);
        return this;
    }
   

    public Usuario build() {
        return new Usuario(this);
    }
    
}
}



public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario.Builder()
                .setNombre("Samuel")
                .setEdad(18)
                .setCorreo("samuel@gmail.com")
                .setIntereses("Futbol")
                .setIntereses("Programacion")
                .setIntereses("Dormir")
                .build();

        System.out.println(usuario);
        
    }
    
}
