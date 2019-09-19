package com.invoice.Service.Imp;

import com.invoice.Entity.Operator;
import com.invoice.Helper.Exception.CommonException;
import com.invoice.Mapper.OperatorMapper;
import com.invoice.Service.IOperatorManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorManageServiceImp implements IOperatorManageService {

    @Autowired
    private OperatorMapper operatorMapper;

    @Override
    public void addOperator(Operator operator) throws CommonException {
        int ret = operatorMapper.insert(operator);
        if (ret != 1) {
            throw new CommonException("insert.error");
        }
    }

    @Override
    public void deleteOperator(Integer id) throws CommonException {
        int ret = operatorMapper.delete(id);
        if (ret == 0) {
            throw new CommonException("delete.error");
        }
    }

    @Override
    public void updateOperator(Operator operator) throws CommonException {
        int ret = operatorMapper.update(operator);
        if (ret != 1) {
            throw new CommonException("update.error");
        }
    }

    @Override
    public Operator getOperatorById(Integer id) {
        return operatorMapper.selectById(id);
    }

    @Override
    public Operator getOperator(Operator operator) {
        return operatorMapper.select(operator);
    }

    @Override
    public List<Operator> getAllOperator() {
        return operatorMapper.selectAllOperator();
    }

    @Override
    public void updateOperatorLoginPassword(String password, String loginName) throws CommonException {
        int ret = operatorMapper.updateOperatorLoginPassword(password, loginName);
        if (ret != 1) {
            throw new CommonException("update.error");
        }
    }

    @Override
    public Operator getOperatorByLoginName(String loginName) {
        return operatorMapper.getOperatorByLoginName(loginName);
    }

}
