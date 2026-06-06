package com.golf.Sports.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tee_time")
public class TeeTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teeId;
    private Long playerId;
    private Long courseId;
    private LocalTime teeTime;
    private String status;

    public Long getTeeId() {
        return teeId;
    }

    public void setTeeId(Long teeId) {
        this.teeId = teeId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public LocalTime getTeeTime() {
        return teeTime;
    }

    public void setTeeTime(LocalTime teeTime) {
        this.teeTime = teeTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
