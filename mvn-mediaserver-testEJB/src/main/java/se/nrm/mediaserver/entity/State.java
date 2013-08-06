package se.nrm.mediaserver.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ingimar
 */
@Entity
@Table(name = "STATES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "States.findAll",
            query = "SELECT s FROM State s"),
    @NamedQuery(name = "States.findById",
            query = "SELECT s FROM State s WHERE s.id = :id"),
    @NamedQuery(name = "States.findByAbbrev",
            query = "SELECT s FROM State s WHERE s.abbrev = :abbrev"),
    @NamedQuery(name = "States.findByName",
            query = "SELECT s FROM State s WHERE s.name = :name")})
public class State implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;

    @Size(max = 2)
    @Column(name = "ABBREV")
    private String abbrev;

    @Size(max = 50)
    @Column(name = "NAME")
    private String name;

    public State() {
    }

    public State(Integer id) {
        this.id = id;
    }

    public State(String abbrev, String name) {
        this.abbrev = abbrev;
        this.name = name;
    }

    public State(Integer id, String abbrev, String name) {
        this.id = id;
        this.abbrev = abbrev;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof State)) {
            return false;
        }
        State other = (State) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.abbrev + " " + this.name;
    }
}
