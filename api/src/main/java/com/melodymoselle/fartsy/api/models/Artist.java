package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ARTISTS")
public class Artist extends DatabaseEntity {

    @Column
    private String name;
    @Column
    @OneToMany(cascade = {CascadeType.ALL})
    private Set<BioSection> bioSections;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Work> works;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Exhibition> exhibitions;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Bibliography> bibliographies;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Image> images;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<File> files;



}

