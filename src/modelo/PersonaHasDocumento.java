/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "persona_has_documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonaHasDocumento.findAll", query = "SELECT p FROM PersonaHasDocumento p")
    , @NamedQuery(name = "PersonaHasDocumento.findByPersonaidPersona", query = "SELECT p FROM PersonaHasDocumento p WHERE p.personaHasDocumentoPK.personaidPersona = :personaidPersona")
    , @NamedQuery(name = "PersonaHasDocumento.findByDocumentoidDocumento", query = "SELECT p FROM PersonaHasDocumento p WHERE p.personaHasDocumentoPK.documentoidDocumento = :documentoidDocumento")})
public class PersonaHasDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonaHasDocumentoPK personaHasDocumentoPK;

    public PersonaHasDocumento() {
    }

    public PersonaHasDocumento(PersonaHasDocumentoPK personaHasDocumentoPK) {
        this.personaHasDocumentoPK = personaHasDocumentoPK;
    }

    public PersonaHasDocumento(int personaidPersona, int documentoidDocumento) {
        this.personaHasDocumentoPK = new PersonaHasDocumentoPK(personaidPersona, documentoidDocumento);
    }

    public PersonaHasDocumentoPK getPersonaHasDocumentoPK() {
        return personaHasDocumentoPK;
    }

    public void setPersonaHasDocumentoPK(PersonaHasDocumentoPK personaHasDocumentoPK) {
        this.personaHasDocumentoPK = personaHasDocumentoPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personaHasDocumentoPK != null ? personaHasDocumentoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonaHasDocumento)) {
            return false;
        }
        PersonaHasDocumento other = (PersonaHasDocumento) object;
        if ((this.personaHasDocumentoPK == null && other.personaHasDocumentoPK != null) || (this.personaHasDocumentoPK != null && !this.personaHasDocumentoPK.equals(other.personaHasDocumentoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.PersonaHasDocumento[ personaHasDocumentoPK=" + personaHasDocumentoPK + " ]";
    }
    
}
