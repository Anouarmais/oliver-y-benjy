package Partido;

import java.util.Date;
import Equipo.equipo;

public class Partidos {
    private Date Fecha;
    private equipo equipoLocal;
    private equipo equipoVisiitante;
    private  String resultado;

    public Partidos(Date fecha, equipo equipoLocal, equipo equipoVisiitante, String resultado) {
        Fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisiitante = equipoVisiitante;
        this.resultado = "";
    }
    public void jugarPartidos (int golesLocal , int golesVisitante){
    this.resultado= golesLocal + "-"+ golesVisitante;
    }

    public equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public equipo getEquipoVisiitante() {
        return equipoVisiitante;
    }

    public void setEquipoVisiitante(equipo equipoVisiitante) {
        this.equipoVisiitante = equipoVisiitante;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
}
