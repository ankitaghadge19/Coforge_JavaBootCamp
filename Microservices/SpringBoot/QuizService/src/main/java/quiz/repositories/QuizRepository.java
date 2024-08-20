package quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import quiz.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
