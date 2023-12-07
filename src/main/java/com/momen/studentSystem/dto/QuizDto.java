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
public class QuizDto {

    private Long quizId;
    private String quizName;
    private Course course;
}
