/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RiksmarlPackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author cgntuser
 */
@Entity
@Table(name = "averagerateofreturn", catalog = "testxampp", schema = "")
@NamedQueries({
    @NamedQuery(name = "Averagerateofreturn_1.findAll", query = "SELECT a FROM Averagerateofreturn_1 a")
    , @NamedQuery(name = "Averagerateofreturn_1.findById", query = "SELECT a FROM Averagerateofreturn_1 a WHERE a.id = :id")
    , @NamedQuery(name = "Averagerateofreturn_1.findByUsername", query = "SELECT a FROM Averagerateofreturn_1 a WHERE a.username = :username")
    , @NamedQuery(name = "Averagerateofreturn_1.findByArxkostos", query = "SELECT a FROM Averagerateofreturn_1 a WHERE a.arxkostos = :arxkostos")
    , @NamedQuery(name = "Averagerateofreturn_1.findByKostoskefalaiou", query = "SELECT a FROM Averagerateofreturn_1 a WHERE a.kostoskefalaiou = :kostoskefalaiou")
    , @NamedQuery(name = "Averagerateofreturn_1.findByXronia", query = "SELECT a FROM Averagerateofreturn_1 a WHERE a.xronia = :xronia")
    , @NamedQuery(name = "Averagerateofreturn_1.findByResult", query = "SELECT a FROM Averagerateofreturn_1 a WHERE a.result = :result")
    , @NamedQuery(name = "Averagerateofreturn_1.findByDate", query = "SELECT a FROM Averagerateofreturn_1 a WHERE a.date = :date")})
public class Averagerateofreturn_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Short id;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "arxkostos")
    private double arxkostos;
    @Basic(optional = false)
    @Column(name = "kostoskefalaiou")
    private double kostoskefalaiou;
    @Basic(optional = false)
    @Column(name = "xronia")
    private int xronia;
    @Basic(optional = false)
    @Column(name = "result")
    private double result;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Averagerateofreturn_1() {
    }

    public Averagerateofreturn_1(Short id) {
        this.id = id;
    }

    public Averagerateofreturn_1(Short id, String username, double arxkostos, double kostoskefalaiou, int xronia, double result, Date date) {
        this.id = id;
        this.username = username;
        this.arxkostos = arxkostos;
        this.kostoskefalaiou = kostoskefalaiou;
        this.xronia = xronia;
        this.result = result;
        this.date = date;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        Short oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public double getArxkostos() {
        return arxkostos;
    }

    public void setArxkostos(double arxkostos) {
        double oldArxkostos = this.arxkostos;
        this.arxkostos = arxkostos;
        changeSupport.firePropertyChange("arxkostos", oldArxkostos, arxkostos);
    }

    public double getKostoskefalaiou() {
        return kostoskefalaiou;
    }

    public void setKostoskefalaiou(double kostoskefalaiou) {
        double oldKostoskefalaiou = this.kostoskefalaiou;
        this.kostoskefalaiou = kostoskefalaiou;
        changeSupport.firePropertyChange("kostoskefalaiou", oldKostoskefalaiou, kostoskefalaiou);
    }

    public int getXronia() {
        return xronia;
    }

    public void setXronia(int xronia) {
        int oldXronia = this.xronia;
        this.xronia = xronia;
        changeSupport.firePropertyChange("xronia", oldXronia, xronia);
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        double oldResult = this.result;
        this.result = result;
        changeSupport.firePropertyChange("result", oldResult, result);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
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
        if (!(object instanceof Averagerateofreturn_1)) {
            return false;
        }
        Averagerateofreturn_1 other = (Averagerateofreturn_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RiksmarlPackage.Averagerateofreturn_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
