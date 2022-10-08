package az.rateit.backend.repository;

import az.rateit.backend.model.User;
import az.rateit.backend.model.UserResponse;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User getUserById(Long id){
        return User.builder()
                        .id(id)
                        .userName("mguluzada")
                        .name("Mushvig")
                        .surname("Guluzada").build();
    }
}
