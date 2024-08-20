package question.services.impl;

import org.springframework.stereotype.Service;
import question.entities.Question;
import question.repositories.QuestionRepository;
import question.services.QuestionService;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getById(Long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found!"));
    }

    @Override
    public List<Question> getQuestionsByQuizId(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
