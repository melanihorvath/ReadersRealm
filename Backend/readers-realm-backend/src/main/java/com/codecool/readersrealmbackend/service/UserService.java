package com.codecool.readersrealmbackend.service;

import com.codecool.readersrealmbackend.model.Book;
import com.codecool.readersrealmbackend.model.User;
import com.codecool.readersrealmbackend.model.dto.UserDTO;
import com.codecool.readersrealmbackend.model.dto.newDTO.NewUserDTO;
import com.codecool.readersrealmbackend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO getUserById(Long userId){
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()){
            throw new IllegalArgumentException("Invalid user ID.");
        }
        User user = optionalUser.get();
        return transformUserToDTO(user);
    }

    private UserDTO transformUserToDTO(User user){
        UserDTO userDTO = new UserDTO(user.getId(),
                user.getUserName(),
                user.getName(),
                user.getGender(),
                user.getEmailAddress(),
                user.getPassword(),
                user.getBirthDate(),
                user.getRegistrationDate());
        return userDTO;
    }

    public UserDTO findByUsername(String username){
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if(optionalUser.isEmpty()){
            throw new IllegalArgumentException("Invalid username.");
        }
        User user = optionalUser.get();
        return transformUserToDTO(user);
    }
    public String removeUser(Long userId){
        userRepository.deleteById(userId);
        return "User has been deleted successfully";

    }

    public String addUser(NewUserDTO newUserDTO){
        User user = new User();
        user.setUserName(newUserDTO.userName());
        user.setName(newUserDTO.name());
        user.setGender(newUserDTO.gender());
        user.setEmailAddress(newUserDTO.emailAddress());
        user.setPassword(newUserDTO.password());
        user.setBirthDate(newUserDTO.birthDate());
        user.setRegistrationDate(newUserDTO.registrationDate());

        userRepository.save(user);
        return "User created successfully";
    }
    public Set<Book> getFavoriteBooksForUser(Long userId){
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()){
            throw new IllegalArgumentException("Invalid user ID.");
        }
        User user = optionalUser.get();
        return user.getFavoriteBooks();
    }
    public Set<Book> getToBeRead(Long userId){
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()){
            throw new IllegalArgumentException("Invalid user ID.");
        }
        User user = optionalUser.get();
        return user.getToBeRead();
    }

    public Set<Book> getCurrentlyReadingBooksForUser(Long userId){
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty()){
            throw new IllegalArgumentException("Invalid user ID.");
        }
        User user = optionalUser.get();
        return user.getCurrentlyReading();
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
