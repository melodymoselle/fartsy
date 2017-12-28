package com.melodymoselle.fartsy.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIO_SECTION_ITEMS")
public class BioSectionItem extends DatabaseEntity {

    @Column
    private int year;
    @Column
    private String detail;
    @Column
    private boolean display;
    @Column
    private int sequence;
}
