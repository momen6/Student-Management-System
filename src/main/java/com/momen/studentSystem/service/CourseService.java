package com.momen.studentSystem.service;

import com.momen.studentSystem.dto.CourseDto;
import com.momen.studentSystem.dto.GenericResponse;

public interface CourseService {

    GenericResponse<?> getAllCourses();

    GenericResponse<?> getCourseById(Long id);

    GenericResponse<?> addCourse(CourseDto courseDto);

    GenericResponse<?> updateCourse(CourseDto courseDto);

    GenericResponse<?> deleteCourse(Long id);
}
