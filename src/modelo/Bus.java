/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "bus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b")
    , @NamedQuery(name = "Bus.findByIdBus", query = "SELECT b FROM Bus b WHERE b.idBus = :idBus")
    , @NamedQuery(name = "Bus.findByVial", query = "SELECT b FROM Bus b WHERE b.vial = :vial")
    , @NamedQuery(name = "Bus.findByPlaca", query = "SELECT b FROM Bus b WHERE b.placa = :placa")
    , @NamedQuery(name = "Bus.findByModelo", query = "SELECT b FROM Bus b WHERE b.modelo = :modelo")
    , @NamedQuery(name = "Bus.findByClase", query = "SELECT b FROM Bus b WHERE b.clase = :clase")
    , @NamedQuery(name = "Bus.findByMarca", query = "SELECT b FROM Bus b WHERE b.marca = :marca")
    , @NamedQuery(name = "Bus.findByCapacidad", query = "SELECT b FROM Bus b WHERE b.capacidad = :capacidad")
    , @NamedQuery(name = "Bus.findByNumeroMotor", query = "SELECT b FROM Bus b WHERE b.numeroMotor = :numeroMotor")
    , @NamedQuery(name = "Bus.findByNumeroChasis", query = "SELECT b FROM Bus b WHERE b.numeroChasis = :numeroChasis")
    , @NamedQuery(name = "Bus.findByFechaMatricula", query = "SELECT b FROM Bus b WHERE b.fechaMatricula = :fechaMatricula")
    , @NamedQuery(name = "Bus.findByObservaciones", query = "SELECT b FROM Bus b WHERE b.observaciones = :observaciones")
    , @NamedQuery(name = "Bus.findByEstado", query = "SELECT b FROM Bus b WHERE b.estado = :estado")
    , @NamedQuery(name = "Bus.findByClaseServicio", query = "SELECT b FROM Bus b WHERE b.claseServicio = :claseServicio")
    , @NamedQuery(name = "Bus.findByGrupo", query = "SELECT b FROM Bus b WHERE b.grupo = :grupo")
    , @NamedQuery(name = "Bus.findByPlanillaControl", query = "SELECT b FROM Bus b WHERE b.planillaControl = :planillaControl")})
public class Bus implements Serializable {

    @OneToOne(mappedBy = "busidBus")
    private Persona persona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "busidBus")
    private List<DocumentoHasBus> documentoHasBusList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBus")
    private Integer idBus;
    @Column(name = "vial")
    private String vial;
    @Column(name = "placa")
    private String placa;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "clase")
    private String clase;
    @Column(name = "marca")
    private String marca;
    @Column(name = "capacidad")
    private String capacidad;
    @Column(name = "numeroMotor")
    private String numeroMotor;
    @Column(name = "numeroChasis")
    private String numeroChasis;
    @Column(name = "fechaMatricula")
    private Integer fechaMatricula;
    @Basic(optional = false)
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "estado")
    private String estado;
    @Column(name = "claseServicio")
    private String claseServicio;
    @Column(name = "grupo")
    private String grupo;
    @Column(name = "planillaControl")
    private Integer planillaControl;

    public Bus() {
    }

    public Bus(Integer idBus) {
        this.idBus = idBus;
    }

    public Bus(Integer idBus, String observaciones) {
        this.idBus = idBus;
        this.observaciones = observaciones;
    }

    public Integer getIdBus() {
        return idBus;
    }

    public void setIdBus(Integer idBus) {
        this.idBus = idBus;
    }

    public String getVial() {
        return vial;
    }

    public void setVial(String vial) {
        this.vial = vial;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public Integer getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Integer fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClaseServicio() {
        return claseServicio;
    }

    public void setClaseServicio(String claseServicio) {
        this.claseServicio = claseServicio;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
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
        hash += (idBus != null ? idBus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bus)) {
            return false;
        }
        Bus other = (Bus) object;
        if ((this.idBus == null && other.idBus != null) || (this.idBus != null && !this.idBus.equals(other.idBus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Bus[ idBus=" + idBus + " ]";
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @XmlTransient
    public List<DocumentoHasBus> getDocumentoHasBusList() {
        return documentoHasBusList;
    }

    public void setDocumentoHasBusList(List<DocumentoHasBus> documentoHasBusList) {
        this.documentoHasBusList = documentoHasBusList;
    }
    
}
