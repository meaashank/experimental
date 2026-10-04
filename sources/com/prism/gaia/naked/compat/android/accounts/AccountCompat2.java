package com.prism.gaia.naked.compat.android.accounts;

import android.accounts.Account;
import com.prism.gaia.naked.metadata.android.accounts.AccountCAG;

/* JADX INFO: loaded from: classes6.dex */
public class AccountCompat2 {

    public static class Util {
        public static Account ctor(String str, String str2, String str3) {
            Account account = new Account(str, str2);
            setAccessId(account, str3);
            return account;
        }

        public static String getAccessId(Account account) {
            if (AccountCAG.f165233C.accessId() != null) {
                return AccountCAG.f165233C.accessId().get(account);
            }
            return null;
        }

        public static void setAccessId(Account account, String str) {
            if (str == null || AccountCAG.f165233C.accessId() == null) {
                return;
            }
            AccountCAG.f165233C.accessId().set(account, str);
        }
    }
}
