package quiz.services.impl;

import org.springframework.stereotype.Service;
import quiz.entities.Quiz;
import quiz.repositories.QuizRepository;
import quiz.services.QuestionClient;
import quiz.services.QuizService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepository quizRepository, QuestionClient questionClient) {
        this.quizRepository = quizRepository;
        this.questionClient = questionClient;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAll() {
        List<Quiz> quizzes = quizRepository.findAll();

        List<Quiz> QuizzesWithQs = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionsByQuizId(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());

        return QuizzesWithQs;
    }

    @Override
    public Quiz getById(Long id) {
        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found!"));

        quiz.setQuestions(questionClient.getQuestionsByQuizId(quiz.getId()));
        return quiz;
    }
}
