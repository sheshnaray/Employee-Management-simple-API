package com.Management.Controller;

import com.Management.Modal.AccountHolder;
import com.Management.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accountDetails")
public class AccountController {
    @Autowired
    AccountService accountService;
    @PostMapping("/SAVE")
    public ResponseEntity<AccountHolder> Saving_Detail(@RequestBody AccountHolder accountHolder){
        return ResponseEntity.ok(accountService.Save_Details(accountHolder));
    }
    @GetMapping("/GETTING")
    public ResponseEntity<AccountHolder> GET_AccountHOLDER(@RequestParam int id){
        return ResponseEntity.of(accountService.get_BY_account_number(id));
    }
    @PutMapping("/ UPDATE")
    public ResponseEntity<AccountHolder> Update_Detail(@RequestBody AccountHolder accountHolder , @RequestParam int id){
        return ResponseEntity.ok(accountService.update_detail(accountHolder,id));
    }
    public String delete(@PathVariable int id){
        accountService.remove_account(id);
        return "your account is delete successfully";




    }
}
