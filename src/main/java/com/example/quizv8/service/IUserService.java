package com.example.quizv8.service;

import com.example.quizv8.model.QuizUser;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    public void updateUser(long id, QuizUser user);
    public boolean deleteUser(long id);
    public List<QuizUser> getAllUser();
    public Optional<QuizUser> getUser(long id);
    public void saveUser(QuizUser user);
}
