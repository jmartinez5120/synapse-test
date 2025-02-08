package com.americanexpress.synapse.local.synapsedatajpa.service;

import com.americanexpress.synapse.local.synapsedatajpa.entity.UserEntity;
import com.americanexpress.synapse.local.synapsedatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void findUser() {
        List<UserEntity> entities = userRepository.findAll();
        entities.forEach(System.out::println);

        UserEntity userEntity = new UserEntity();
        userEntity.setName("FIDO");
        userRepository.save(userEntity);
    }
}
