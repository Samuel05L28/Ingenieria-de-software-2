package Tercera_pregunta;

interface Factura {
    String getCodigo();
    double getTotal();
    Cliente getCliente();
}


class Cliente {
    private String identificacion;
    private String nombre;
    private String correo;
    
    public Cliente(String identificacion, String nombre, String correo) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}


class FacturaFisica implements Factura {
    private String codigo;
    private double total;
    private Cliente cliente;

    public FacturaFisica(String codigo, double total, Cliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.cliente = cliente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }


}

class FacturaElectronica implements Factura {
    private String codigo;
    private double total;
    private String numeroElectronico;
    private Cliente cliente;

    public FacturaElectronica(String codigo, double total, String numeroElectronico, Cliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.numeroElectronico = numeroElectronico;
        this.cliente = cliente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumeroElectronico() {
        return numeroElectronico;
    }

    public void setNumeroElectronico(String numeroElectronico) {
        this.numeroElectronico = numeroElectronico;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }


}

public class Main {
    public static void main(String[] args) {
        Factura facturaFisica = new FacturaFisica();
        Factura facturaElectronica = new FacturaElectronica();


    }
}
