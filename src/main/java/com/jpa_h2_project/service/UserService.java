    package com.jpa_h2_project.service;

    import com.jpa_h2_project.entity.User;
    import com.jpa_h2_project.repository.UserRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class UserService {
        @Autowired
        private UserRepository userRepository;
        public User createUser(final User user) {
            return userRepository.save(user);
        }

         public List<User> getAllUsers() {
            return userRepository.findAll();
        }
    }
