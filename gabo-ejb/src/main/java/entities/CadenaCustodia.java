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
public class CadenaCustodia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
       
    @NotNull(message = "Debe ingresar el RUC")
    private Long RUC;
    
    @NotNull(message = "Debe ingresar el RIT")
    private Long RIT;
    
    @NotNull(message = "Debe ingresar el delito")
    private String delito;
    
    @NotNull(message = "Debe ingresar una fecha")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @NotNull(message = "Debe ingresar una hora")
    private String hora;
    
    @NotNull(message = "Debe ingresar la dirección de la S.S.")
    private String SS;
    
    @NotNull(message = "Debe ingresar un lugar de levantamiento")
    private String obtencion;
    
    @NotNull(message = "Debe ingresar una descripcción de la especie")
    private String descripcion;
    
    @NotNull(message = "Debe ingesar el número de parte")
    private long parte;
    
    @NotNull(message = "Debe ingresar la únidad policial")
    private String unidadPolicial;
    
    @NotNull(message = "Debe ingresar observaciones, en caso de no tener observaciones, poner 'sin observaciones'")
    private String observaciones;
    
    @NotNull(message = "Debe ingresar el nombre de quién levantó la CC")
    private String levantada;
    
    @NotNull(message = "Debe ingresar el RUN de la persona")
    private String RUN;
    
    @NotNull(message = "Debe ingresar el cargo de la persona")
    private String cargo;
    
    @NotNull(message = "Debe ingresar el NUE")
    private Long NUE;
    
    @ManyToOne
    private Informe informe;
   
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Informe getInforme() {
        return informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }
   
    public String getLevantada() {
        return levantada;
    }

    public void setLevantada(String levantada) {
        this.levantada = levantada;
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
  
    public Long getRUC() {
        return RUC;
    }

    public void setRUC(Long RUC) {
        this.RUC = RUC;
    }

    public Long getRIT() {
        return RIT;
    }

    public void setRIT(Long RIT) {
        this.RIT = RIT;
    }

    public String getDelito() {
        return delito;
    }

    public void setDelito(String delito) {
        this.delito = delito;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getSS() {
        return SS;
    }

    public void setSS(String SS) {
        this.SS = SS;
    }

    public String getObtencion() {
        return obtencion;
    }

    public void setObtencion(String obtencion) {
        this.obtencion = obtencion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getParte() {
        return parte;
    }

    public void setParte(long parte) {
        this.parte = parte;
    }

    public String getUnidadPolicial() {
        return unidadPolicial;
    }

    public void setUnidadPolicial(String unidadPolicial) {
        this.unidadPolicial = unidadPolicial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNUE() {
        return NUE;
    }

    public void setNUE(Long NUE) {
        this.NUE = NUE;
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
        if (!(object instanceof CadenaCustodia)) {
            return false;
        }
        CadenaCustodia other = (CadenaCustodia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cadena de Cusotdia: "+NUE;
    }
    
}
