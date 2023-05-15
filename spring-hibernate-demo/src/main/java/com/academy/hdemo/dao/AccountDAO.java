package com.academy.hdemo.dao;

import java.util.List;

import com.academy.hdemo.dto.Account;

public interface AccountDAO {

    void save(Account account);

    Account findByAccountId(long id);

    void delete(Account account);

    void update(Account account);

    List<Account> accountList();

    //////////////////////////////////////////////

    void updateAccount(Account account);
    String transaction(long senderID, long receiverID, int tAmount);

}
