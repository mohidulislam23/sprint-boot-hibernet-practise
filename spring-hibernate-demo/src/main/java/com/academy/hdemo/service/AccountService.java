package com.academy.hdemo.service;


import com.academy.hdemo.dao.AccountDAO;
import com.academy.hdemo.dto.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    @Qualifier("AccountDAOImp2")
    AccountDAO accountDAO;

    public Account findById(long id) {
        return accountDAO.findByAccountId(id);
    }

    public void saveAccount(Account account) {
        accountDAO.save(account);
    }

    public void update(Account account) {
        accountDAO.update(account);
    }

    public void deleteAccount(Account account) {
        accountDAO.delete(account);

    }

    public List getAllAccounts() {
        return accountDAO.accountList();
    }

    public String lenden(long senderID, long receiverID, int tAmount) {
        return accountDAO.transaction(senderID,receiverID,tAmount);
    }


//    public void updateAccount(Account receiverAccount) {
//        accountDAO.save(receiverAccount);
//    }
}
