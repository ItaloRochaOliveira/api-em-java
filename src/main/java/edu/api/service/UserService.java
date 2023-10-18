package edu.api.service;

import edu.api.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
