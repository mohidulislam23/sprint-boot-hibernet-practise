package com.academy.hdemo.controller;

import com.academy.hdemo.dto.Account;
import com.academy.hdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController()
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

//    @GetMapping("/details")
//    public String detail(@RequestBody Map<String,String> something) {
////        return accountService.findById(accountId);
//
//        return something.get("accountId");
//    }
    @GetMapping("/details")
    public String detail(@RequestBody Map<String,String> something) {
        return something.get("accountId");
    }


    @GetMapping("/detail/{id}")
    public Account detail(@PathVariable int id) {
        return accountService.findById(id);
    }

    @PostMapping("/new")
    public void newAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    @PutMapping
    void updateAccount(@RequestBody Account account) {
        accountService.update(account);
    }

    @DeleteMapping("/delete")
    void delete(@RequestBody Account account) {
        accountService.deleteAccount(account);
    }

    @GetMapping("/getall")
    public List allAccount() {
        return accountService.getAllAccounts();
    }


    @PostMapping("/lenden")

    public String lenden(
            @RequestParam long senderID,
            @RequestParam long receiverID,
            @RequestParam int tAmount
    ) {
        return accountService.lenden(senderID,receiverID,tAmount);
//        // Retrieve sender and receiver account details from the database
//        Account senderAccount = accountService.findById(senderID); //getAccountByID(senderID);
//        Account receiverAccount = accountService.findById(receiverID);//getAccountByID(receiverID);
//
//        if (senderAccount == null || receiverAccount == null) {
//            return "Invalid sender or receiver account ID";
//        }
//
//        if (senderAccount.getBalance() < tAmount) {
//            return "Insufficient balance in sender account";
//        }
//
//        senderAccount.setBalance(senderAccount.getBalance() - tAmount);
//        receiverAccount.setBalance(receiverAccount.getBalance() + tAmount);
//
//        accountService.updateAccount(senderAccount);
//        accountService.updateAccount(receiverAccount);
//
//        return "Transaction successful";
    }


}
