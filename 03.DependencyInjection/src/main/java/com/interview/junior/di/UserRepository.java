package com.interview.junior.di;

import java.util.List;

public interface UserRepository {

    void save(User user);

    List<User> findAll();
}
