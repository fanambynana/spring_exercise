package com.spring_exercise.model.Enum;

public class GetAccountName {
    public static AccountName getEnum(String stringEnum) {
        switch (stringEnum) {
            case "current_account" -> {
                return AccountName.CURRENT_ACCOUNT;
            }
            case "savings_account" -> {
                return AccountName.SAVINGS_ACCOUNT;
            }
            default -> {
                return null;
            }
        }
    }
}
