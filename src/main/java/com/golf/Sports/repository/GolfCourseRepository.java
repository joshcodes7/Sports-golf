package com.golf.Sports.repository;

import com.golf.Sports.entity.GolfCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GolfCourseRepository extends JpaRepository<GolfCourse, Long> {
}
