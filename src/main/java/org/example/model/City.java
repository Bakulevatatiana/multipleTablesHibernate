package org.example.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")

@ToString
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int cityId;
    @Column(name="city_name")
    private String cityName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<Employee>employees;
    public City( String city_name,int city_id) {
        this.city_name = city_name;
        this.city_id = city_id;

    }
    public City(String city_name){this.city_name=city_name;}
    public City(int city_id){this.city_id=city_id;}
    public City(){}
    @Override
    public String toString(){return  city_name;}

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    private int city_id;
    private String city_name;
}

