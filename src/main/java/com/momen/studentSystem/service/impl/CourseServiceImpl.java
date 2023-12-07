package com.momen.studentSystem.service.impl;

import com.momen.studentSystem.dto.CourseDto;
import com.momen.studentSystem.dto.GenericResponse;
import com.momen.studentSystem.exception.NotFoundException;
import com.momen.studentSystem.model.Course;
import com.momen.studentSystem.service.CourseService;
import com.momen.studentSystem.util.ModelMapperUtil;
import com.momen.studentSystem.util.enums.ErrorMessage;
import com.momen.studentSystem.util.enums.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public GenericResponse<?> getAllCourses() {
        try {
            List<Course> courses = this.hibernateTemplate.loadAll(Course.class);
            return GenericResponse.builder()
                    .data(courses.stream().map(course -> ModelMapperUtil.MAPPER().map(course, CourseDto.class)).collect(Collectors.toList()))
                    .responseMessage(ResponseMessage.SUCCESS)
                    .responseCode(ResponseMessage.SUCCESS.getCode())
                    .build();
        } catch (Exception e) {
            return handleException(e);
        }
    }

    @Override
    public GenericResponse<?> getCourseById(Long id) {
        try {
            Course course = this.hibernateTemplate.get(Course.class, id);
            if (course == null)
                throw new NotFoundException("No Courses Found with this ID");
            return GenericResponse.builder()
                    .data(ModelMapperUtil.MAPPER().map(course, CourseDto.class))
                    .responseMessage(ResponseMessage.SUCCESS)
                    .responseCode(ResponseMessage.SUCCESS.getCode())
                    .build();

        } catch (Exception e) {
            return handleException(e);
        }
    }

    @Override
    @Transactional
    public GenericResponse<?> addCourse(CourseDto courseDto) {
        try {
            Course course = ModelMapperUtil.MAPPER().map(courseDto, Course.class);
            this.hibernateTemplate.save(course);
            return GenericResponse.builder()
                    .data(courseDto)
                    .responseMessage(ResponseMessage.SUCCESS)
                    .responseCode(ResponseMessage.SUCCESS.getCode())
                    .build();
        } catch (Exception e) {
            return handleException(e);
        }
    }

    @Override
    @Transactional
    public GenericResponse<?> updateCourse(CourseDto courseDto) {
        try {
            Course course = ModelMapperUtil.MAPPER().map(courseDto, Course.class);
            this.hibernateTemplate.update(course);
            return GenericResponse.builder()
                    .data(course)
                    .responseMessage(ResponseMessage.SUCCESS)
                    .responseCode(ResponseMessage.SUCCESS.getCode())
                    .build();
        } catch (Exception e) {
            return handleException(e);
        }
    }

    @Override
    @Transactional
    public GenericResponse<?> deleteCourse(Long id) {
        try {
            Course course = this.hibernateTemplate.get(Course.class, id);
            if (course == null)
                throw new NotFoundException("No Courses Found with this ID");
            else {
                this.hibernateTemplate.delete(course);
                return GenericResponse.builder()
                        .data(null)
                        .responseMessage(ResponseMessage.SUCCESS)
                        .responseCode(ResponseMessage.SUCCESS.getCode())
                        .build();
            }

        } catch (Exception e) {
            return handleException(e);
        }
    }

    private <T> GenericResponse<T> handleException(Exception e) {
        return GenericResponse.<T>builder()
                .data(null)
                .responseMessage(ResponseMessage.FAIL)
                .responseCode(ResponseMessage.FAIL.getCode())
                .errorMessage(ErrorMessage.INVALID_CREDENTIALS.getMessage())
                .build();
    }
}
