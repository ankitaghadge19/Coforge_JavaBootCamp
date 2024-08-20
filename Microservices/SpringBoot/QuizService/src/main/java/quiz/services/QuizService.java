package quiz.services;

import quiz.entities.Quiz;

import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> getAll();

    Quiz getById(Long id);
}
