/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "ruta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ruta.findAll", query = "SELECT r FROM Ruta r")
    , @NamedQuery(name = "Ruta.findByIdRuta", query = "SELECT r FROM Ruta r WHERE r.idRuta = :idRuta")
    , @NamedQuery(name = "Ruta.findByNombre", query = "SELECT r FROM Ruta r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Ruta.findByCapacidad", query = "SELECT r FROM Ruta r WHERE r.capacidad = :capacidad")
    , @NamedQuery(name = "Ruta.findByDescripcion", query = "SELECT r FROM Ruta r WHERE r.descripcion = :descripcion")
    , @NamedQuery(name = "Ruta.findByDescripcionRetorno", query = "SELECT r FROM Ruta r WHERE r.descripcionRetorno = :descripcionRetorno")
    , @NamedQuery(name = "Ruta.findByDescripcionSalida", query = "SELECT r FROM Ruta r WHERE r.descripcionSalida = :descripcionSalida")
    , @NamedQuery(name = "Ruta.findByFrecuencia", query = "SELECT r FROM Ruta r WHERE r.frecuencia = :frecuencia")
    , @NamedQuery(name = "Ruta.findByGabela", query = "SELECT r FROM Ruta r WHERE r.gabela = :gabela")
    , @NamedQuery(name = "Ruta.findByLongitud", query = "SELECT r FROM Ruta r WHERE r.longitud = :longitud")
    , @NamedQuery(name = "Ruta.findByTiempoRecorrido", query = "SELECT r FROM Ruta r WHERE r.tiempoRecorrido = :tiempoRecorrido")
    , @NamedQuery(name = "Ruta.findByPlanillaControl", query = "SELECT r FROM Ruta r WHERE r.planillaControl = :planillaControl")})
public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRuta")
    private Integer idRuta;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "capacidad")
    private Integer capacidad;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "descripcionRetorno")
    private String descripcionRetorno;
    @Column(name = "descripcionSalida")
    private String descripcionSalida;
    @Column(name = "frecuencia")
    private Integer frecuencia;
    @Column(name = "gabela")
    private Integer gabela;
    @Column(name = "longitud")
    private String longitud;
    @Column(name = "tiempoRecorrido")
    private Integer tiempoRecorrido;
    @Column(name = "planillaControl")
    private Integer planillaControl;

    public Ruta() {
    }

    public Ruta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public Integer getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionRetorno() {
        return descripcionRetorno;
    }

    public void setDescripcionRetorno(String descripcionRetorno) {
        this.descripcionRetorno = descripcionRetorno;
    }

    public String getDescripcionSalida() {
        return descripcionSalida;
    }

    public void setDescripcionSalida(String descripcionSalida) {
        this.descripcionSalida = descripcionSalida;
    }

    public Integer getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Integer frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Integer getGabela() {
        return gabela;
    }

    public void setGabela(Integer gabela) {
        this.gabela = gabela;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Integer getTiempoRecorrido() {
        return tiempoRecorrido;
    }

    public void setTiempoRecorrido(Integer tiempoRecorrido) {
        this.tiempoRecorrido = tiempoRecorrido;
    }

    public Integer getPlanillaControl() {
        return planillaControl;
    }

    public void setPlanillaControl(Integer planillaControl) {
        this.planillaControl = planillaControl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRuta != null ? idRuta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ruta)) {
            return false;
        }
        Ruta other = (Ruta) object;
        if ((this.idRuta == null && other.idRuta != null) || (this.idRuta != null && !this.idRuta.equals(other.idRuta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Ruta[ idRuta=" + idRuta + " ]";
    }
    
}
