package com.example.rated.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name="location")
@XmlAccessorType(XmlAccessType.FIELD)
public class Location extends NamedLocation implements Serializable {
    private Set<RatedLocation> ratedLocations;
    
    @ManyToMany(targetEntity=com.example.rated.domain.RatedLocation.class,  fetch=FetchType.EAGER)
    @JoinTable(name="location_ratedlocations",
               joinColumns={ @JoinColumn(name="location_id", referencedColumnName="id") }, // this class
               inverseJoinColumns={ @JoinColumn(name="rated_location_id", referencedColumnName="id") } // the other class
    )
    public Set<RatedLocation> getRatedLocations() {
        return this.ratedLocations;
    }

    public void setRatedLocations(Set<RatedLocation> ratedLocations) {
        this.ratedLocations = ratedLocations;
    }
}
    
