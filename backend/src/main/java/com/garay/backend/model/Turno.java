/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garay.backend.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "turno")
@NamedQueries({
    @NamedQuery(name = "Turno.findAll", query = "SELECT t FROM Turno t"),
    @NamedQuery(name = "Turno.findById", query = "SELECT t FROM Turno t WHERE t.id = :id"),
    @NamedQuery(name = "Turno.findByFecha", query = "SELECT t FROM Turno t WHERE t.fecha = :fecha"),
    @NamedQuery(name = "Turno.findByPrecio", query = "SELECT t FROM Turno t WHERE t.precio = :precio")})
public class Turno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha")
    private int fecha;
    @Basic(optional = false)
    @Column(name = "precio")
    private int precio;
    @JoinColumn(name = "accion1", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Accion accion1;
    @JoinColumn(name = "accion2", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Accion accion2;
    @JoinColumn(name = "accion3", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Accion accion3;
    @JoinColumn(name = "accion4", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Accion accion4;
    @JoinColumn(name = "accion5", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Accion accion5;
    @JoinColumn(name = "cliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario cliente;
    @JoinColumn(name = "medico", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario medico;

    public Turno() {
    }

    public Turno(Integer id) {
        this.id = id;
    }

    public Turno(Integer id, int fecha, int precio) {
        this.id = id;
        this.fecha = fecha;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Accion getAccion1() {
        return accion1;
    }

    public void setAccion1(Accion accion1) {
        this.accion1 = accion1;
    }

    public Accion getAccion2() {
        return accion2;
    }

    public void setAccion2(Accion accion2) {
        this.accion2 = accion2;
    }

    public Accion getAccion3() {
        return accion3;
    }

    public void setAccion3(Accion accion3) {
        this.accion3 = accion3;
    }

    public Accion getAccion4() {
        return accion4;
    }

    public void setAccion4(Accion accion4) {
        this.accion4 = accion4;
    }

    public Accion getAccion5() {
        return accion5;
    }

    public void setAccion5(Accion accion5) {
        this.accion5 = accion5;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Usuario getMedico() {
        return medico;
    }

    public void setMedico(Usuario medico) {
        this.medico = medico;
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
        if (!(object instanceof Turno)) {
            return false;
        }
        Turno other = (Turno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.garay.backend.model.Turno[ id=" + id + " ]";
    }
    
}
