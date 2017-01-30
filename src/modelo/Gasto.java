/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    , @NamedQuery(name = "Gasto.findByPanillaRecaudoidPanillaRecaudo", query = "SELECT g FROM Gasto g WHERE g.panillaRecaudoidPanillaRecaudo = :panillaRecaudoidPanillaRecaudo")
    , @NamedQuery(name = "Gasto.findByAcpm", query = "SELECT g FROM Gasto g WHERE g.acpm = :acpm")
    , @NamedQuery(name = "Gasto.findByAseo", query = "SELECT g FROM Gasto g WHERE g.aseo = :aseo")
    , @NamedQuery(name = "Gasto.findBySueldoconductor", query = "SELECT g FROM Gasto g WHERE g.sueldoconductor = :sueldoconductor")
    , @NamedQuery(name = "Gasto.findByOtros", query = "SELECT g FROM Gasto g WHERE g.otros = :otros")
    , @NamedQuery(name = "Gasto.findByTurno", query = "SELECT g FROM Gasto g WHERE g.turno = :turno")
    , @NamedQuery(name = "Gasto.findByTotalGatos", query = "SELECT g FROM Gasto g WHERE g.totalGatos = :totalGatos")
    , @NamedQuery(name = "Gasto.findByProducidoNeto", query = "SELECT g FROM Gasto g WHERE g.producidoNeto = :producidoNeto")})
public class Gasto implements Serializable {

    @JoinColumn(name = "panillarecaudo_idPanillaRecaudo", referencedColumnName = "idPanillaRecaudo")
    @OneToOne(optional = false)
    private Panillarecaudo panillarecaudoidPanillaRecaudo;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgasto")
    private Integer idgasto;
    @Basic(optional = false)
    @Column(name = "PanillaRecaudo_idPanillaRecaudo")
    private int panillaRecaudoidPanillaRecaudo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "acpm")
    private BigDecimal acpm;
    @Column(name = "aseo")
    private BigDecimal aseo;
    @Column(name = "sueldoconductor")
    private BigDecimal sueldoconductor;
    @Column(name = "otros")
    private BigDecimal otros;
    @Column(name = "turno")
    private BigDecimal turno;
    @Column(name = "totalGatos")
    private BigDecimal totalGatos;
    @Column(name = "producidoNeto")
    private BigDecimal producidoNeto;

    public Gasto() {
    }

    public Gasto(Integer idgasto) {
        this.idgasto = idgasto;
    }

    public Gasto(Integer idgasto, int panillaRecaudoidPanillaRecaudo) {
        this.idgasto = idgasto;
        this.panillaRecaudoidPanillaRecaudo = panillaRecaudoidPanillaRecaudo;
    }

    public Integer getIdgasto() {
        return idgasto;
    }

    public void setIdgasto(Integer idgasto) {
        this.idgasto = idgasto;
    }

    public int getPanillaRecaudoidPanillaRecaudo() {
        return panillaRecaudoidPanillaRecaudo;
    }

    public void setPanillaRecaudoidPanillaRecaudo(int panillaRecaudoidPanillaRecaudo) {
        this.panillaRecaudoidPanillaRecaudo = panillaRecaudoidPanillaRecaudo;
    }

    public BigDecimal getAcpm() {
        return acpm;
    }

    public void setAcpm(BigDecimal acpm) {
        this.acpm = acpm;
    }

    public BigDecimal getAseo() {
        return aseo;
    }

    public void setAseo(BigDecimal aseo) {
        this.aseo = aseo;
    }

    public BigDecimal getSueldoconductor() {
        return sueldoconductor;
    }

    public void setSueldoconductor(BigDecimal sueldoconductor) {
        this.sueldoconductor = sueldoconductor;
    }

    public BigDecimal getOtros() {
        return otros;
    }

    public void setOtros(BigDecimal otros) {
        this.otros = otros;
    }

    public BigDecimal getTurno() {
        return turno;
    }

    public void setTurno(BigDecimal turno) {
        this.turno = turno;
    }

    public BigDecimal getTotalGatos() {
        return totalGatos;
    }

    public void setTotalGatos(BigDecimal totalGatos) {
        this.totalGatos = totalGatos;
    }

    public BigDecimal getProducidoNeto() {
        return producidoNeto;
    }

    public void setProducidoNeto(BigDecimal producidoNeto) {
        this.producidoNeto = producidoNeto;
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

    public Panillarecaudo getPanillarecaudoidPanillaRecaudo() {
        return panillarecaudoidPanillaRecaudo;
    }

    public void setPanillarecaudoidPanillaRecaudo(Panillarecaudo panillarecaudoidPanillaRecaudo) {
        this.panillarecaudoidPanillaRecaudo = panillarecaudoidPanillaRecaudo;
    }
    
}
