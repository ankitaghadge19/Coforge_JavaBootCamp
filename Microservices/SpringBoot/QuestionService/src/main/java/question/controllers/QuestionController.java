package question.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import question.entities.Question;
import question.services.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // Create Question
    @PostMapping("/add")
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    // Get All Questions
    @GetMapping("/getAll")
    public List<Question> getAll(){
        return questionService.get();
    }

    // Get Question By QuestionId
    @GetMapping("/ByQueId/{queId}")
    public Question getById(@PathVariable long queId) {
        return questionService.getById(queId);
    }

    // Get All Questions Of Particular Quiz
    @GetMapping("/ByQuizId/{quizId}")
    public List<Question> getQuestionsByQuizId(@PathVariable long quizId){
        return questionService.getQuestionsByQuizId(quizId);
    }
}
