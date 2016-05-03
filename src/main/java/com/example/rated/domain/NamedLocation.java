package com.example.rated.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class NamedLocation extends DatabaseObject implements Serializable {
    protected String name;
    protected double latitude;
    protected double longitude;
    
    /**
     * Gets the value of name
     *
     * @return the value of name
     */
    public final String getName() {
        return this.name;
    }

    /**
     * Sets the value of name
     *
     * @param argName Value to assign to this.name
     */
    public final void setName(final String argName) {
        this.name = argName;
    }

    /**
     * Gets the value of latitude
     *
     * @return the value of latitude
     */
    public final double getLatitude() {
        return this.latitude;
    }

    /**
     * Sets the value of latitude
     *
     * @param argLatitude Value to assign to this.latitude
     */
    public final void setLatitude(final double argLatitude) {
        this.latitude = argLatitude;
    }

    /**
     * Gets the value of longitude
     *
     * @return the value of longitude
     */
    public final double getLongitude() {
        return this.longitude;
    }

    /**
     * Sets the value of longitude
     *
     * @param argLongitude Value to assign to this.longitude
     */
    public final void setLongitude(final double argLongitude) {
        this.longitude = argLongitude;
    }
}
    
