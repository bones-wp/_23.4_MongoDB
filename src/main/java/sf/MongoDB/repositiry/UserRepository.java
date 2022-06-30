package sf.MongoDB.repositiry;

import org.springframework.data.mongodb.repository.MongoRepository;
import sf.MongoDB.Entety.User;

import java.util.List;

public interface UserRepository extends MongoRepository <User, String> {
    public User findByFirstName(String firstName);
    public List<User> findByEmail(String email);

}
