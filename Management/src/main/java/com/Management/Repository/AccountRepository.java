package com.Management.Repository;

import com.Management.Modal.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository  extends JpaRepository<AccountHolder , Integer> {

}
