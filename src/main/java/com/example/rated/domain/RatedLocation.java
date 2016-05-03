package com.example.rated.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name="rated_location")
@XmlAccessorType(XmlAccessType.FIELD)
@Table(name="rated_location")
public class RatedLocation extends NamedLocation implements Serializable {
    protected double rating;
    
    /**
     * Gets the value of rating
     *
     * @return the value of rating
     */
    public final double getRating() {
        return this.rating;
    }

    /**
     * Sets the value of rating
     *
     * @param argRating Value to assign to this.rating
     */
    public final void setRating(final double argRating) {
        this.rating = argRating;
    }
}
    
