package taller7;

import java.sql.Date;

public class Orden {
    private Date fecha;
    private String lugarorigen;
    private String lugardestino;

    public Orden(Date fecha, String lugarorigen, String lugardestino) {
        this.fecha = fecha;
        this.lugarorigen = lugarorigen;
        this.lugardestino = lugardestino;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getLugarorigen() {
        return lugarorigen;
    }
    public void setLugarorigen(String lugarorigen) {
        this.lugarorigen = lugarorigen;
    }
    public String getLugardestino() {
        return lugardestino;
    }
    public void setLugardestino(String lugardestino) {
        this.lugardestino = lugardestino;
    }
    
}
