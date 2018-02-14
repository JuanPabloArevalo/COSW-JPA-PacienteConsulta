package edu.eci.cosw.jpa.sample.model;
// Generated Mar 9, 2016 7:01:57 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Pacientes generated by hbm2java
 */
@Entity
@Table(name = "PACIENTES")
public class Paciente implements java.io.Serializable {

    private PacienteId id;
    private String nombre;
    private Date fechaNacimiento;
    private Set<Consulta> consultas = new HashSet<>(0);

    public Paciente() {
    }

    public Paciente(PacienteId id, String nombre, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Paciente(PacienteId id, String nombre, Date fechaNacimiento, Set<Consulta> consultas) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.consultas = consultas;
    }

    @EmbeddedId
    public PacienteId getId() {
        return this.id;
    }

    public void setId(PacienteId id) {
        this.id = id;
    }

    @Column(name = "nombre", nullable = false, length = 45)
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   @Column(name = "fecha_nacimiento", nullable = false)
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumns({
        @JoinColumn(name = "PACIENTES_id", referencedColumnName = "id", nullable = false),
        @JoinColumn(name = "PACIENTES_tipo_id", referencedColumnName = "tipo_id", nullable = false)
    })
    public Set<Consulta> getConsultas() {
        return this.consultas;
    }

    public void setConsultas(Set<Consulta> consultases) {
        this.consultas = consultases;
    }

}
