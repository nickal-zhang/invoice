package com.invoice.Service;

import com.invoice.Entity.User;

public interface IUserLoginService {
    User queryUser(String username);

    boolean verifyPassword(User user);
}
