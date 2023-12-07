package com.momen.studentSystem.dto;

import com.momen.studentSystem.model.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeacherDto {
    private Long teacherId;
    private String teacherName;
    private String age;
    private String email;

    private Course course;
}
