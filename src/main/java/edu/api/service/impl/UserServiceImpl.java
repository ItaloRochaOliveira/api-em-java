package edu.api.service.impl;

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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
