package com.mycompany.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id", unique = true)
    private Long id;
    @Column(name = "namee")
    private String namee;

    public Department() {
    }

    public Department(Long id, String namee) {
        this.id = id;
        this.namee = namee;
    }

    public Department(String namee) {
        this.namee = namee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", namee=" + namee + '}';
    }

}
