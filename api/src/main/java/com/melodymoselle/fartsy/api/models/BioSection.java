package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BIO_SECTION")
public class BioSection extends DatabaseEntity {

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private int sequence;
    @Column(nullable = false)
    private boolean display = true;
    @Column
    @OneToMany(cascade = {CascadeType.ALL})
    private Set<BioItem> items;

    public BioSection() {
    }

    public BioSection(String title, int sequence) {
        this.title = title;
        this.sequence = sequence;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public Set<BioItem> getItems() {
        return items;
    }

    public void setItems(Set<BioItem> items) {
        this.items = items;
    }
}
