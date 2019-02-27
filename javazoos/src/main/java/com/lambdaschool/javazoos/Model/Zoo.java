package com.lambdaschool.javazoos.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "zoos")
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long zooid;

    private String zooname;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "phoneid")
    @JsonIgnoreProperties("zoo")
    private Set<Telephone> telephones = new HashSet<>();

    @ManyToMany
    @JoinColumn(name = "animalid")
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
}
