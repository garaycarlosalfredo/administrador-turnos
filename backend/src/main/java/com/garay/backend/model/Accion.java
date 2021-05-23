/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.garay.backend.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name = "accion")
@NamedQueries({
    @NamedQuery(name = "Accion.findAll", query = "SELECT a FROM Accion a"),
    @NamedQuery(name = "Accion.findById", query = "SELECT a FROM Accion a WHERE a.id = :id"),
    @NamedQuery(name = "Accion.findByNombe", query = "SELECT a FROM Accion a WHERE a.nombe = :nombe"),
    @NamedQuery(name = "Accion.findByDescripcion", query = "SELECT a FROM Accion a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Accion.findByPrecio", query = "SELECT a FROM Accion a WHERE a.precio = :precio")})
public class Accion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombe")
    private String nombe;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Float precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accion1")
    private List<Turno> turnoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accion2")
    private List<Turno> turnoList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accion3")
    private List<Turno> turnoList2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accion4")
    private List<Turno> turnoList3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accion5")
    private List<Turno> turnoList4;

    public Accion() {
    }

    public Accion(Integer id) {
        this.id = id;
    }

    public Accion(Integer id, String nombe, String descripcion) {
        this.id = id;
        this.nombe = nombe;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public List<Turno> getTurnoList() {
        return turnoList;
    }

    public void setTurnoList(List<Turno> turnoList) {
        this.turnoList = turnoList;
    }

    public List<Turno> getTurnoList1() {
        return turnoList1;
    }

    public void setTurnoList1(List<Turno> turnoList1) {
        this.turnoList1 = turnoList1;
    }

    public List<Turno> getTurnoList2() {
        return turnoList2;
    }

    public void setTurnoList2(List<Turno> turnoList2) {
        this.turnoList2 = turnoList2;
    }

    public List<Turno> getTurnoList3() {
        return turnoList3;
    }

    public void setTurnoList3(List<Turno> turnoList3) {
        this.turnoList3 = turnoList3;
    }

    public List<Turno> getTurnoList4() {
        return turnoList4;
    }

    public void setTurnoList4(List<Turno> turnoList4) {
        this.turnoList4 = turnoList4;
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
        if (!(object instanceof Accion)) {
            return false;
        }
        Accion other = (Accion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.garay.backend.model.Accion[ id=" + id + " ]";
    }
    
}
