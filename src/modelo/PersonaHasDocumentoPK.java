/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author oscar
 */
@Embeddable
public class PersonaHasDocumentoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;
    @Basic(optional = false)
    @Column(name = "Documento_idDocumento")
    private int documentoidDocumento;

    public PersonaHasDocumentoPK() {
    }

    public PersonaHasDocumentoPK(int personaidPersona, int documentoidDocumento) {
        this.personaidPersona = personaidPersona;
        this.documentoidDocumento = documentoidDocumento;
    }

    public int getPersonaidPersona() {
        return personaidPersona;
    }

    public void setPersonaidPersona(int personaidPersona) {
        this.personaidPersona = personaidPersona;
    }

    public int getDocumentoidDocumento() {
        return documentoidDocumento;
    }

    public void setDocumentoidDocumento(int documentoidDocumento) {
        this.documentoidDocumento = documentoidDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) personaidPersona;
        hash += (int) documentoidDocumento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaHasDocumentoPK)) {
            return false;
        }
        PersonaHasDocumentoPK other = (PersonaHasDocumentoPK) object;
        if (this.personaidPersona != other.personaidPersona) {
            return false;
        }
        if (this.documentoidDocumento != other.documentoidDocumento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PersonaHasDocumentoPK[ personaidPersona=" + personaidPersona + ", documentoidDocumento=" + documentoidDocumento + " ]";
    }
    
}
