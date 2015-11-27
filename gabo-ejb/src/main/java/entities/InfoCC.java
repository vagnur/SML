/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.validation.constraints.*;

/**
 *
 * @author Gabriel
 */
@Entity
public class InfoCC implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Debe ingresar la fecha de entrega")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @NotNull(message = "Debe ingresar la hora de entrega")
    private String hora;
    
    @NotNull(message = "Debe ingresar la unidad de quien entrega")
    private String entregaUnidad;
    
    @NotNull(message = "Debe ingresar un nombre para la persona que entrega")
    private String entregaNombre;
    
    @NotNull(message = "Debe ingresar un cargo para la persona que entrega")
    private String entregaCargo;
    
    @NotNull(message = "Debe ingresar el RUN de la persona que entrega")
    private String entregaRun;
    
    @NotNull(message = "Debe ingresar la unidad de quien recibe")
    private String recibeUnidad;
    
    @NotNull(message = "Debe ingresar un nombre para la persona que recibe")
    private String recibeNombre;
    
    @NotNull(message = "Debe ingresar un cargo para la persona que recibe")
    private String recibeCargo;
    
    @NotNull(message = "Debe ingresar el RUN de la persona que recibe")
    private String recibeRun;
    
    @NotNull(message = "Debe ingresar un motivo de la lista")
    private String motivo;
    
    @ManyToOne
    private CadenaCustodia cadenaCustodia;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEntregaNombre() {
        return entregaNombre;
    }

    public void setEntregaNombre(String entregaNombre) {
        this.entregaNombre = entregaNombre;
    }

    public String getEntregaCargo() {
        return entregaCargo;
    }

    public void setEntregaCargo(String entregaCargo) {
        this.entregaCargo = entregaCargo;
    }

    public String getRecibeNombre() {
        return recibeNombre;
    }

    public void setRecibeNombre(String recibeNombre) {
        this.recibeNombre = recibeNombre;
    }

    public String getRecibeCargo() {
        return recibeCargo;
    }

    public void setRecibeCargo(String recibeCargo) {
        this.recibeCargo = recibeCargo;
    }
       
    public CadenaCustodia getCadenaCustodia() {
        return cadenaCustodia;
    }

    public void setCadenaCustodia(CadenaCustodia cadenaCustodia) {
        this.cadenaCustodia = cadenaCustodia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEntregaUnidad() {
        return entregaUnidad;
    }

    public void setEntregaUnidad(String entregaUnidad) {
        this.entregaUnidad = entregaUnidad;
    }

    public String getEntregaRun() {
        return entregaRun;
    }

    public void setEntregaRun(String entregaRun) {
        this.entregaRun = entregaRun;
    }

    public String getRecibeUnidad() {
        return recibeUnidad;
    }

    public void setRecibeUnidad(String recibeUnidad) {
        this.recibeUnidad = recibeUnidad;
    }

    public String getRecibeRun() {
        return recibeRun;
    }

    public void setRecibeRun(String recibeRun) {
        this.recibeRun = recibeRun;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
        if (!(object instanceof InfoCC)) {
            return false;
        }
        InfoCC other = (InfoCC) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etapa: "+id;
    }
    
}
