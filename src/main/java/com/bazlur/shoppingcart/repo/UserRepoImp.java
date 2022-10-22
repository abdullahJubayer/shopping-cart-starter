package com.bazlur.shoppingcart.repo;

import com.bazlur.shoppingcart.domain.User;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class UserRepoImp implements UserRepo{
    private static final Set<User> users=new CopyOnWriteArraySet<>();

    @Override
    public void save(User user) {
        users.add(user);
    }
}
