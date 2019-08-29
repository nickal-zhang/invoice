package com.invoice.Service;

import com.invoice.Entity.User;
import com.invoice.Helper.ExceptionType.UserException;

public interface IUserLoginService {
    User queryUser(String username) throws UserException;

    boolean verifyPassword(User user) throws UserException;
}
