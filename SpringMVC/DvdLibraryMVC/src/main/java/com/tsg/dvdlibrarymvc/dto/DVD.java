/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.dvdlibrarymvc.dto;

import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author apprentice
 */
public class DVD {
    @NotEmpty(message="You must supply a value for Release Date")
    @Length(max=20, message="Release Date must be no more than 20 characters in length.")
    private String releaseDate;
    @NotEmpty(message="You must supply a value for Title")
    @Length(max=20, message="Title must be no more than 20 characters in length.")
    private String title;
    @NotEmpty(message="You must supply a value for Studio")
    @Length(max=20, message="Studio must be no more than 20 characters in length.")
    private String studio;
    @NotEmpty(message="You must supply a value for Director")
    @Length(max=20, message="Director must be no more than 20 characters in length.")
    private String director;
    @NotEmpty(message="You must supply a value for rating")
    @Length(max=20, message="Rating must be no more than 20 characters in length.")
    private String ratings;
    @NotEmpty(message="You must supply a value for notes")
    @Length(max=20, message="Notes must be no more than 20 characters in length.")
    private String notes;
    private int dvdId;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.releaseDate);
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.studio);
        hash = 53 * hash + Objects.hashCode(this.director);
        hash = 53 * hash + Objects.hashCode(this.ratings);
        hash = 53 * hash + Objects.hashCode(this.notes);
        hash = 53 * hash + this.dvdId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DVD other = (DVD) obj;
        if (this.dvdId != other.dvdId) {
            return false;
        }
        if (!Objects.equals(this.releaseDate, other.releaseDate)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.studio, other.studio)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.ratings, other.ratings)) {
            return false;
        }
        if (!Objects.equals(this.notes, other.notes)) {
            return false;
        }
        return true;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getDvdId() {
        return dvdId;
    }

    public void setDvdId(int dvdId) {
        this.dvdId = dvdId;
    }
}
