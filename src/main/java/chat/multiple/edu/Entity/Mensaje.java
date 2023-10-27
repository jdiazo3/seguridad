/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chat.multiple.edu.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author juand
 */

//clase que representa la tabla facturaccion en la base de datos con sus respectivos getters and setters para cada columna.

@Entity
@Table (name = "mensaje")
public class Mensaje {
    private static final Long serialVersionUID = -969060843698080433L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = serialVersionUID;
    
    @Column(length = 25)
    private Long mensaje;

    @Column(length = 25)
    private Integer sensor;

    @Column()
    private LocalDateTime fecha; 

    @Column()
    private boolean leido;

    public boolean isLeido() {
        return leido;
    }


    public void setLeido(boolean leido) {
        this.leido = leido;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Long getMensaje() {
        return mensaje;
    }


    public void setMensaje(Long mensaje) {
        this.mensaje = mensaje;
    }


    public Integer getSensor() {
        return sensor;
    }


    public void setSensor(Integer sensor) {
        this.sensor = sensor;
    }


    /** 
     * @return Long
     */
    public Long getId() {
        return id;
    }

    
    /** 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    
}
