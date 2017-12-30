package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "EXHIBITION")
public class Exhibition extends DatabaseEntity {

    @Column(nullable = false)
    private String title;
    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @Column
    private String location;
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

    public Exhibition() {
    }

    public Exhibition(String title, LocalDate startDate, LocalDate endDate, String location) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }
}
