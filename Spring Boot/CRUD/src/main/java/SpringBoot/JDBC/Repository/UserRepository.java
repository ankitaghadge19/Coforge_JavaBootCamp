package SpringBoot.JDBC.Repository;

import SpringBoot.JDBC.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>{
}
