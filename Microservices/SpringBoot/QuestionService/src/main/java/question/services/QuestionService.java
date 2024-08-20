package question.services;

import question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> get();

    Question getById(Long id);

    List<Question> getQuestionsByQuizId(Long quizId);
}
