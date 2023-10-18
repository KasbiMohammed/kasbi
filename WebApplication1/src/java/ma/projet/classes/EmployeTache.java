/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeTache {
       @EmbeddedId
   private EmployeTachePK id;
       
   private Date dadeDebutReelle;
     private Date dadeFinReelle;
       @ManyToOne()
    @JoinColumn(name="employe",referencedColumnName="id",insertable = false,updatable = false)
    private Employe employe;
    

    @ManyToOne()
    @JoinColumn(name="tache",referencedColumnName="id",insertable = false,updatable = false)
    private Tache tache;

    public EmployeTache() {
    }

    public EmployeTache(EmployeTachePK id, Date dadeDebutReelle, Date dadeFinReelle) {
        this.id = id;
        this.dadeDebutReelle = dadeDebutReelle;
        this.dadeFinReelle = dadeFinReelle;
    }

    public EmployeTache(Date dadeDebutReelle, Date dadeFinReelle, Employe employe, Tache tache) {
        this.dadeDebutReelle = dadeDebutReelle;
        this.dadeFinReelle = dadeFinReelle;
        this.employe = employe;
        this.tache = tache;
    }

    public EmployeTachePK getId() {
        return id;
    }

    public void setId(EmployeTachePK id) {
        this.id = id;
    }

    public Date getDadeDebutReelle() {
        return dadeDebutReelle;
    }

    public void setDadeDebutReelle(Date dadeDebutReelle) {
        this.dadeDebutReelle = dadeDebutReelle;
    }

    public Date getDadeFinReelle() {
        return dadeFinReelle;
    }

    public void setDadeFinReelle(Date dadeFinReelle) {
        this.dadeFinReelle = dadeFinReelle;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }
    
}
