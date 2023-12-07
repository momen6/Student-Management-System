package com.momen.studentSystem.service;

import com.momen.studentSystem.dto.GenericResponse;
import com.momen.studentSystem.dto.TeacherDto;

public interface TeacherService {

    GenericResponse<?> getAllTeachers();
    GenericResponse<?> getTeacherById(Long id);
    GenericResponse<?> addTeacher(TeacherDto teacherDto);
    GenericResponse<?> updateTeacher(TeacherDto teacherDto);
    GenericResponse<?> deleteTeacher(Long id);
}
