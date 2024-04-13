package com.example.eduhome.repostiories;

import com.example.eduhome.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepo extends JpaRepository<Blog, Long> {
    List<Blog> findTop3ByOrderByIdAsc();
}
