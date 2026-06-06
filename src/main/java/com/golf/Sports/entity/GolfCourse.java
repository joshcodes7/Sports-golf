package com.golf.Sports.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "golf_course")
public class GolfCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseid;
    private String location;
    private int holes;
    private int parScore;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHoles() {
        return holes;
    }

    public void setHoles(int holes) {
        this.holes = holes;
    }

    public int getParScore() {
        return parScore;
    }

    public void setParScore(int parScore) {
        this.parScore = parScore;
    }
}
