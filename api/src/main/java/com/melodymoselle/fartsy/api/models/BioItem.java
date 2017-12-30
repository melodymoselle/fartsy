package com.melodymoselle.fartsy.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIO_ITEM")
public class BioItem extends DatabaseEntity {

    @Column
    private int year;
    @Column(nullable = false)
    private String detail;
    @Column(nullable = false)
    private boolean display = true;
    @Column
    private int sequence;

    public BioItem() {
    }

    public BioItem(int year, String detail) {
        this.year = year;
        this.detail = detail;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
