package com.invoice.Service;

import com.invoice.Entity.Operator;

public interface IOperatorLoginService {
    Operator queryOperator(String loginName) throws Exception;

    boolean verifyPassword(Operator operator) throws Exception;
}
