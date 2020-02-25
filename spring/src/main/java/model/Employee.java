package model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;

@EntityScan
public class Employee {
    @Id
    @Column(name = "id")
   private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "role")
    private String role;


    public Employee(){}

    public Employee(long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
