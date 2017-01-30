/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "documento_has_bus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentoHasBus.findAll", query = "SELECT d FROM DocumentoHasBus d")
    , @NamedQuery(name = "DocumentoHasBus.findByDocumentoidDocumento", query = "SELECT d FROM DocumentoHasBus d WHERE d.documentoidDocumento = :documentoidDocumento")
    , @NamedQuery(name = "DocumentoHasBus.findByFechaExpedicion", query = "SELECT d FROM DocumentoHasBus d WHERE d.fechaExpedicion = :fechaExpedicion")
    , @NamedQuery(name = "DocumentoHasBus.findByFechaExpiracion", query = "SELECT d FROM DocumentoHasBus d WHERE d.fechaExpiracion = :fechaExpiracion")})
public class DocumentoHasBus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Documento_idDocumento")
    private Integer documentoidDocumento;
    @Basic(optional = false)
    @Column(name = "fechaExpedicion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpedicion;
    @Basic(optional = false)
    @Column(name = "fechaExpiracion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpiracion;
    @JoinColumn(name = "bus_idBus", referencedColumnName = "idBus")
    @ManyToOne(optional = false)
    private Bus busidBus;

    public DocumentoHasBus() {
    }

    public DocumentoHasBus(Integer documentoidDocumento) {
        this.documentoidDocumento = documentoidDocumento;
    }

    public DocumentoHasBus(Integer documentoidDocumento, Date fechaExpedicion, Date fechaExpiracion) {
        this.documentoidDocumento = documentoidDocumento;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaExpiracion = fechaExpiracion;
    }

    public Integer getDocumentoidDocumento() {
        return documentoidDocumento;
    }

    public void setDocumentoidDocumento(Integer documentoidDocumento) {
        this.documentoidDocumento = documentoidDocumento;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Bus getBusidBus() {
        return busidBus;
    }

    public void setBusidBus(Bus busidBus) {
        this.busidBus = busidBus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentoidDocumento != null ? documentoidDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoHasBus)) {
            return false;
        }
        DocumentoHasBus other = (DocumentoHasBus) object;
        if ((this.documentoidDocumento == null && other.documentoidDocumento != null) || (this.documentoidDocumento != null && !this.documentoidDocumento.equals(other.documentoidDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DocumentoHasBus[ documentoidDocumento=" + documentoidDocumento + " ]";
    }
    
}
