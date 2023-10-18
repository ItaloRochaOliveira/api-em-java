package edu.api.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import edu.api.model.User;
import edu.api.repository.UserRepository;
import edu.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    //Ao colocar final e depois implementar, o Spring entende que é preciso injetar o UserRepository quando instanciar o UserServiceImpl.
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User ID already exist.");
        };
        return userRepository.save(userToCreate);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    
}
