package com.momen.studentSystem.service;

import com.momen.studentSystem.dto.GenericResponse;
import com.momen.studentSystem.dto.StudentDto;
import com.momen.studentSystem.model.Student;

public interface StudentService {

    GenericResponse<?> getAllStudents();

    GenericResponse<?> getStudentById(Long id);

    GenericResponse<?> addStudent(StudentDto studentDto);

    GenericResponse<?> updateStudent(Student student);

    GenericResponse<?> deleteStudentById(Long id);
}
