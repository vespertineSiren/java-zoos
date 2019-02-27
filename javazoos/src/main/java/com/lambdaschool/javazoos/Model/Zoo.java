package com.lambdaschool.javazoos.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "zoo")
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long zooid;

    private String zooname;

    @OneToMany(mappedBy = "zoo")
    @JsonIgnoreProperties("zoo")
    private Set<Telephone> telephones = new HashSet<>();

    @ManyToMany(mappedBy = "zoos")
    @JsonIgnoreProperties("zoos")
    private Set<Animal> animals = new HashSet<>();


    public Zoo(){}

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public Set<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(Set<Telephone> telephones) {
        this.telephones = telephones;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
