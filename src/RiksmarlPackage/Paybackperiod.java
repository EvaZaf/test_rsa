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
@Table(name = "paybackperiod", catalog = "testxampp", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paybackperiod.findAll", query = "SELECT p FROM Paybackperiod p")
    , @NamedQuery(name = "Paybackperiod.findById", query = "SELECT p FROM Paybackperiod p WHERE p.id = :id")
    , @NamedQuery(name = "Paybackperiod.findByUsername", query = "SELECT p FROM Paybackperiod p WHERE p.username = :username")
    , @NamedQuery(name = "Paybackperiod.findByArxkostos", query = "SELECT p FROM Paybackperiod p WHERE p.arxkostos = :arxkostos")
    , @NamedQuery(name = "Paybackperiod.findByEpitokio", query = "SELECT p FROM Paybackperiod p WHERE p.epitokio = :epitokio")
    , @NamedQuery(name = "Paybackperiod.findByXronia", query = "SELECT p FROM Paybackperiod p WHERE p.xronia = :xronia")
    , @NamedQuery(name = "Paybackperiod.findByEpithimitoEtos", query = "SELECT p FROM Paybackperiod p WHERE p.epithimitoEtos = :epithimitoEtos")
    , @NamedQuery(name = "Paybackperiod.findByResult", query = "SELECT p FROM Paybackperiod p WHERE p.result = :result")
    , @NamedQuery(name = "Paybackperiod.findByEtosEpaneispraksis", query = "SELECT p FROM Paybackperiod p WHERE p.etosEpaneispraksis = :etosEpaneispraksis")
    , @NamedQuery(name = "Paybackperiod.findByDate", query = "SELECT p FROM Paybackperiod p WHERE p.date = :date")})
public class Paybackperiod implements Serializable {

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
    @Column(name = "epitokio")
    private double epitokio;
    @Basic(optional = false)
    @Column(name = "xronia")
    private int xronia;
    @Basic(optional = false)
    @Column(name = "epithimito_etos")
    private double epithimitoEtos;
    @Basic(optional = false)
    @Column(name = "result")
    private double result;
    @Basic(optional = false)
    @Column(name = "etos_epaneispraksis")
    private double etosEpaneispraksis;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Paybackperiod() {
    }

    public Paybackperiod(Short id) {
        this.id = id;
    }

    public Paybackperiod(Short id, String username, double arxkostos, double epitokio, int xronia, double epithimitoEtos, double result, double etosEpaneispraksis, Date date) {
        this.id = id;
        this.username = username;
        this.arxkostos = arxkostos;
        this.epitokio = epitokio;
        this.xronia = xronia;
        this.epithimitoEtos = epithimitoEtos;
        this.result = result;
        this.etosEpaneispraksis = etosEpaneispraksis;
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

    public double getEpitokio() {
        return epitokio;
    }

    public void setEpitokio(double epitokio) {
        double oldEpitokio = this.epitokio;
        this.epitokio = epitokio;
        changeSupport.firePropertyChange("epitokio", oldEpitokio, epitokio);
    }

    public int getXronia() {
        return xronia;
    }

    public void setXronia(int xronia) {
        int oldXronia = this.xronia;
        this.xronia = xronia;
        changeSupport.firePropertyChange("xronia", oldXronia, xronia);
    }

    public double getEpithimitoEtos() {
        return epithimitoEtos;
    }

    public void setEpithimitoEtos(double epithimitoEtos) {
        double oldEpithimitoEtos = this.epithimitoEtos;
        this.epithimitoEtos = epithimitoEtos;
        changeSupport.firePropertyChange("epithimitoEtos", oldEpithimitoEtos, epithimitoEtos);
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        double oldResult = this.result;
        this.result = result;
        changeSupport.firePropertyChange("result", oldResult, result);
    }

    public double getEtosEpaneispraksis() {
        return etosEpaneispraksis;
    }

    public void setEtosEpaneispraksis(double etosEpaneispraksis) {
        double oldEtosEpaneispraksis = this.etosEpaneispraksis;
        this.etosEpaneispraksis = etosEpaneispraksis;
        changeSupport.firePropertyChange("etosEpaneispraksis", oldEtosEpaneispraksis, etosEpaneispraksis);
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
        if (!(object instanceof Paybackperiod)) {
            return false;
        }
        Paybackperiod other = (Paybackperiod) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RiksmarlPackage.Paybackperiod[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
