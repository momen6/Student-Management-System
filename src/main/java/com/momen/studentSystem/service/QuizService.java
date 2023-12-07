package com.momen.studentSystem.service;

import com.momen.studentSystem.dto.GenericResponse;
import com.momen.studentSystem.dto.QuizDto;

public interface QuizService {

    GenericResponse<?> getAllQuizzes();

    GenericResponse<?> getQuizById(Long id);

    GenericResponse<?> addQuiz(QuizDto quizDto);

    GenericResponse<?> updateQuiz(QuizDto quizDto);

    GenericResponse<?> deleteQuiz(Long id);
}
