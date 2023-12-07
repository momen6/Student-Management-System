package com.momen.studentSystem.dto;

import com.momen.studentSystem.model.Quiz;
import com.momen.studentSystem.model.Student;
import com.momen.studentSystem.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {
    private Long courseId;
    private String courseName;
//    private List<Student> students;
//    private List<Teacher> teachers;
//    private List<Quiz> quizzes;

}
