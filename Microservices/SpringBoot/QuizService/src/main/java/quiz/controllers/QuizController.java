package quiz.controllers;

import org.springframework.web.bind.annotation.*;
import quiz.entities.Quiz;
import quiz.services.QuizService;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // Create Quiz
    @PostMapping("/add")
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    // Get All Quizes
    @GetMapping("/getAll")
    public List<Quiz> get(){
        return quizService.getAll();
    }

    // Get Quiz By Id
    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id){
        return quizService.getById(id);
    }

}
