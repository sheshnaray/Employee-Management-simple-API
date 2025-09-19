package com.Management.Service;

import com.Management.Modal.AccountHolder;
import com.Management.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository account_repository;

    public AccountHolder Save_Details(AccountHolder account){
        try {
            return account_repository.save(account);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public Optional<AccountHolder> get_BY_account_number(int id){
        try {
            return account_repository.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
   public AccountHolder update_detail(AccountHolder accountHolder ,int id){
        AccountHolder account = account_repository.getReferenceById(id);
        account.setAccount_Amount(accountHolder.getAccount_Amount());
        return account;

   }
   public void remove_account(int id){
        account_repository.delete(account_repository.getReferenceById(id));
   }

}
