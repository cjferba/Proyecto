package GestionDeTemporadas;

import GestionActividades.Actividad;
import GestionDeAlumnos.Alumno;
import GestionDeEquipos.Equipo;
import GestionDeGrupos.Grupo;
import java.util.List;

/**
 * Clase que representa la temporada.
 *
 * @author Alex Moreno
 * @version 1.0
 */

/*
 ******************************************************************************
                   (c) Copyright 2013 
                   * 
                   * Moisés Gautier Gómez
                   * Julio Ros Martínez
                   * Francisco Javier Gómez del Olmo
                   * Francisco Santolalla Quiñonero
                   * Carlos Jesús Fernández Basso
                   * Alexander Moreno Borrego
                   * Jesús Manuel Contreras Siles
                   * Diego Muñoz Rio
 
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************
 */

public class Temporada {

    
    
    private int idTemporada;
    private String curso;
    private String fechaInicio;
    private String fechaFin;
    private double importeMensual;
    
    private List<Equipo> equipos;
    private List<Actividad> actividades;
    private List<Grupo> grupos;
    
    private List<Alumno> alumnos;
    
    public Temporada(String c){
        curso = c;
    }

    public Temporada(int curso, String inicio, String fin, double importe) {
        this.curso = Integer.toString(curso);
        this.fechaInicio = inicio;
        this.fechaFin = fin;
        this.importeMensual = importe;
    }

    public String getCurso() {
        return curso;
    }

    public String getTemporada() {
        return curso;
    }

    public void setIdTemporada(int idTemp) {
        this.idTemporada = idTemp;
    }

    void setCursoCompleto(String cursoComp) {
        this.curso = cursoComp;
    }

    String getInicio() {
        return this.fechaInicio;
    }
    
    String getFin() {
        return this.fechaFin;
    }

    double getImporte() {
        return this.importeMensual;
    }
    
    
}
