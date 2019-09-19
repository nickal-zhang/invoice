package com.invoice.Service;

import com.invoice.Entity.Operator;
import com.invoice.Helper.Exception.CommonException;

import java.util.List;

public interface IOperatorManageService {

    void addOperator(Operator operator) throws  CommonException;

    void deleteOperator(Integer id) throws CommonException;

    void updateOperator(Operator operator) throws CommonException;

    Operator getOperatorById(Integer id);

    Operator getOperator(Operator operator);

    Operator getOperatorByLoginName(String loginName);

    List<Operator> getAllOperator();

    void updateOperatorLoginPassword(String password, String loginName) throws CommonException;

}
