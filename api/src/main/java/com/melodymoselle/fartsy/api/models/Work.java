package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "WORKS")
public class Work extends DatabaseEntity {

    @Column
    private String title;
    @Column
    private int year;
    @Column
    private String material;
    @Column
    private String dimensions;
    @Column
    @ManyToMany(mappedBy = "works",
                cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Artist> artists;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Image> images;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Exhibition> exhibitions;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Bibliography> bibliographies;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<File> files;

}
