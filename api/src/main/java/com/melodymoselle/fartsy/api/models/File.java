package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "FILES")
public class File extends DatabaseEntity {

    @Column
    private String filename;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private boolean display;
    @Column
    @ManyToMany(mappedBy = "files",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Artist> artists;
    @Column
    @ManyToMany(mappedBy = "files",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Work> works;
    @Column
    @ManyToMany(mappedBy = "files",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Exhibition> exhibitions;
}
