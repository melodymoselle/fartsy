package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "EXHIBITIONS")
public class Exhibition extends DatabaseEntity {

    @Column
    private String title;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @Column
    private String Location;
    @Column
    @ManyToMany(mappedBy = "exhibitions",
                cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Artist> artists;
    @Column
    @ManyToMany(mappedBy = "exhibitions",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Work> works;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Image> images;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Bibliography> bibliographies;
    @Column
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<File> files;
}
