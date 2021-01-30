package ua.pobut.storage.service;

import ua.pobut.storage.domain.User;
import ua.pobut.storage.repository.UserRepository;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User save(User user) {

        return userRepository.save(user);

    }
}
