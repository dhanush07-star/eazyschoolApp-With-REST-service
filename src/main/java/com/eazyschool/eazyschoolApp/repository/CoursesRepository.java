package com.eazyschool.eazyschoolApp.repository;

import com.eazyschool.eazyschoolApp.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Integer> {

}