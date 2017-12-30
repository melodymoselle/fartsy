package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "WORK")
public class Work extends DatabaseEntity {

    @Column(nullable = false)
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

    public Work() {
    }

    public Work(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Set<Exhibition> getExhibitions() {
        return exhibitions;
    }

    public void setExhibitions(Set<Exhibition> exhibitions) {
        this.exhibitions = exhibitions;
    }
}
