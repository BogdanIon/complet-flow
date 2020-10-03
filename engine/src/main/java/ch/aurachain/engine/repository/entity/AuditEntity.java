package ch.aurachain.engine.repository.entity;

import javax.persistence.*;

@Entity
@Table(name = "AUDIT")
public class AuditEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NUMBER")
    private Integer number;

    public AuditEntity(){

    }

    public AuditEntity(Integer id, Integer number) {
        this.id = id;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
