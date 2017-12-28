package com.melodymoselle.fartsy.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "BIO_SECTIONS")
public class BioSection extends DatabaseEntity {

    @Column
    private String title;
    @Column
    private int sequence;
    @Column
    private boolean display;
    @Column
    @OneToMany
    private Set<BioSectionItem> items;
}
