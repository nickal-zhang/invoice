package com.invoice.Service.Imp;

import com.invoice.Entity.Operator;
import com.invoice.Mapper.OperatorMapper;
import com.invoice.Service.IOperatorLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperatorLoginServiceImp implements IOperatorLoginService {

    @Autowired
    private OperatorMapper operatorMapper;

    @Override
    public Operator queryOperator(String loginName) throws Exception {
        Operator operator = operatorMapper.getOperatorByLoginName(loginName);
        if (operator == null) {
            throw new Exception();
        }
        return operator;
    }

    @Override
    public boolean verifyPassword(Operator operator) throws Exception {
        Operator o = this.queryOperator(operator.getLoginName());
        if (o.getPassword().equals(operator.getPassword())) {
            return true;
        }
        return false;
    }
}
