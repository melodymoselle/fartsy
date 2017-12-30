package com.melodymoselle.fartsy.api.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BIOGRAPHY")
public class Biography extends DatabaseEntity {

    @Column
    private int birthYear;
    @Column
    private String birthLocation;
    @Column
    private String liveWorkLocation;

    @Column
    @OneToMany(cascade = {CascadeType.ALL})
    private Set<BioSection> bioSections;

    public Biography() {
    }

    public Biography(int birthYear, String birthLocation, String liveWorkLocation) {
        this.birthYear = birthYear;
        this.birthLocation = birthLocation;
        this.liveWorkLocation = liveWorkLocation;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public String getLiveWorkLocation() {
        return liveWorkLocation;
    }

    public void setLiveWorkLocation(String liveWorkLocation) {
        this.liveWorkLocation = liveWorkLocation;
    }

    public Set<BioSection> getBioSections() {
        return bioSections;
    }

    public void setBioSections(Set<BioSection> bioSections) {
        this.bioSections = bioSections;
    }
}
