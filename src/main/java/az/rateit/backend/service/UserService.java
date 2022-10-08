package az.rateit.backend.service;

import az.rateit.backend.model.UserResponse;
import az.rateit.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserResponse getUser(Long id){
        var user = userRepository.getUserById(id);
        if (user.getId() == 0){
            throw new RuntimeException("Id can not be null");
        }
        return UserResponse.builder()
                .userName(user.getUserName())
                .name(user.getName())
                .build();
    }
}
