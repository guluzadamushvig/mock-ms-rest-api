package az.rateit.backend.controller;

import az.rateit.backend.model.UserResponse;
import az.rateit.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/users")
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable Long id, @RequestParam String name){
        return userService.getUser(id);
    }
}
