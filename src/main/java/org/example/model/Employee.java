package org.example.model;

import lombok.*;
import org.example.service.City;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor

@ToString
@Entity
@Table(name="employee")
@EqualsAndHashCode(of = {"id"})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name="gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
    public Employee(){}

    public Employee(int id, String first_name, String last_name, String gender, int age, City city) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Employee(String first_name, String last_name, String gender, int age, City city) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }
}
