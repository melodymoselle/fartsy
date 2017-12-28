package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "BIBLIOGRAPHIES")
public class Bibliography extends DatabaseEntity {

    @Column
    private String title;
    @Column
    private String author;
    @Column
    private String url;
    @Column
    private LocalDate publicationDate;
    @Column
    @ManyToMany(mappedBy = "bibliographies",
                cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Artist> artists;
    @Column
    @ManyToMany(mappedBy = "bibliographies",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Work> works;
    @Column
    @ManyToMany(mappedBy = "bibliographies",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Exhibition> exhibitions;

}
