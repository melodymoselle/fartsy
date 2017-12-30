package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "IMAGE")
public class Image extends DatabaseEntity {

    @Column(nullable = false)
    private String filename;
    @Column(nullable = false)
    private String title;
    @Column
    private String description;
    @Column(nullable = false)
    private boolean display = true;
    @Column
    @ManyToMany(mappedBy = "images",
                cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Artist> artists;
    @Column
    @ManyToMany(mappedBy = "images",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Work> works;
    @Column
    @ManyToMany(mappedBy = "images",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Exhibition> exhibitions;

    public Image() {
    }

    public Image(String filename, String title, String description) {
        this.filename = filename;
        this.title = title;
        this.description = description;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public Set<Work> getWorks() {
        return works;
    }

    public void setWorks(Set<Work> works) {
        this.works = works;
    }

    public Set<Exhibition> getExhibitions() {
        return exhibitions;
    }

    public void setExhibitions(Set<Exhibition> exhibitions) {
        this.exhibitions = exhibitions;
    }
}
