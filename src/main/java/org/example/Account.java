package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private int accountId; // 계좌번호 PK
    private String accountNo; // 실제 계좌번호
    private String accountType; // 계좌 여부(입출금/적금)

    public int getAccountId() {
        return accountId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccountType() {
        return accountType;
    }
}
