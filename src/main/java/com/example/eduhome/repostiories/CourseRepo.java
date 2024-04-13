package com.example.eduhome.repostiories;

import com.example.eduhome.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepo extends JpaRepository<Course, Long> {
    List<Course> findTop3ByOrderByIdAsc(); // for retrieving 3 courses` data (JPA naming method)
    // Second method for creating retrieving 3 courses` data (Custom query method)
    //@Query("SELECT c FROM Course c ORDER BY c.id asc limit 3")
    //List<Course> find3();
}
