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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "gasto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gasto.findAll", query = "SELECT g FROM Gasto g")
    , @NamedQuery(name = "Gasto.findByIdgasto", query = "SELECT g FROM Gasto g WHERE g.idgasto = :idgasto")
    , @NamedQuery(name = "Gasto.findByAcpm", query = "SELECT g FROM Gasto g WHERE g.acpm = :acpm")
    , @NamedQuery(name = "Gasto.findByAseo", query = "SELECT g FROM Gasto g WHERE g.aseo = :aseo")
    , @NamedQuery(name = "Gasto.findBySueldoconductor", query = "SELECT g FROM Gasto g WHERE g.sueldoconductor = :sueldoconductor")
    , @NamedQuery(name = "Gasto.findByOtros", query = "SELECT g FROM Gasto g WHERE g.otros = :otros")
    , @NamedQuery(name = "Gasto.findByTurno", query = "SELECT g FROM Gasto g WHERE g.turno = :turno")
    , @NamedQuery(name = "Gasto.findByTotalGatos", query = "SELECT g FROM Gasto g WHERE g.totalGatos = :totalGatos")
    , @NamedQuery(name = "Gasto.findByProducidoNeto", query = "SELECT g FROM Gasto g WHERE g.producidoNeto = :producidoNeto")})
public class Gasto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgasto")
    private Integer idgasto;
    @Column(name = "acpm")
    private Integer acpm;
    @Column(name = "aseo")
    private Integer aseo;
    @Column(name = "sueldoconductor")
    private Integer sueldoconductor;
    @Column(name = "otros")
    private Integer otros;
    @Column(name = "turno")
    private Integer turno;
    @Column(name = "totalGatos")
    private Integer totalGatos;
    @Column(name = "producidoNeto")
    private Integer producidoNeto;
    @OneToOne(mappedBy = "idgasto")
    private Panillarecaudo panillarecaudo;

    public Gasto() {
    }

    public Gasto(Integer idgasto) {
        this.idgasto = idgasto;
    }

    public Integer getIdgasto() {
        return idgasto;
    }

    public void setIdgasto(Integer idgasto) {
        this.idgasto = idgasto;
    }

    public Integer getAcpm() {
        return acpm;
    }

    public void setAcpm(Integer acpm) {
        this.acpm = acpm;
    }

    public Integer getAseo() {
        return aseo;
    }

    public void setAseo(Integer aseo) {
        this.aseo = aseo;
    }

    public Integer getSueldoconductor() {
        return sueldoconductor;
    }

    public void setSueldoconductor(Integer sueldoconductor) {
        this.sueldoconductor = sueldoconductor;
    }

    public Integer getOtros() {
        return otros;
    }

    public void setOtros(Integer otros) {
        this.otros = otros;
    }

    public Integer getTurno() {
        return turno;
    }

    public void setTurno(Integer turno) {
        this.turno = turno;
    }

    public Integer getTotalGatos() {
        return totalGatos;
    }

    public void setTotalGatos(Integer totalGatos) {
        this.totalGatos = totalGatos;
    }

    public Integer getProducidoNeto() {
        return producidoNeto;
    }

    public void setProducidoNeto(Integer producidoNeto) {
        this.producidoNeto = producidoNeto;
    }

    public Panillarecaudo getPanillarecaudo() {
        return panillarecaudo;
    }

    public void setPanillarecaudo(Panillarecaudo panillarecaudo) {
        this.panillarecaudo = panillarecaudo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgasto != null ? idgasto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gasto)) {
            return false;
        }
        Gasto other = (Gasto) object;
        if ((this.idgasto == null && other.idgasto != null) || (this.idgasto != null && !this.idgasto.equals(other.idgasto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Gasto[ idgasto=" + idgasto + " ]";
    }
    
}
