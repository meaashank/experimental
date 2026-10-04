package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.accounts.Account;
import android.content.SyncInfo;
import com.prism.gaia.naked.metadata.android.content.SyncInfoCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class SyncInfoCompat2 {

    public static class Util {
        private static final Account REDACTED_ACCOUNT;

        static {
            if (SyncInfoCAG.f165604G.REDACTED_ACCOUNT() != null) {
                REDACTED_ACCOUNT = SyncInfoCAG.f165604G.REDACTED_ACCOUNT().get();
            } else {
                REDACTED_ACCOUNT = new Account("*****", "*****");
            }
        }

        public static SyncInfo createAccountRedacted(SyncInfo syncInfo) {
            return ctor(getAuthorityId(syncInfo), REDACTED_ACCOUNT, syncInfo.authority, syncInfo.startTime);
        }

        public static SyncInfo ctor(int i10, Account account, String str, long j10) {
            return SyncInfoCAG.f165604G.ctor().newInstance(Integer.valueOf(i10), account, str, Long.valueOf(j10));
        }

        public static int getAuthorityId(SyncInfo syncInfo) {
            return SyncInfoCAG.f165604G.authorityId().get(syncInfo);
        }

        public static SyncInfo ctor(SyncInfo syncInfo) {
            int authorityId = getAuthorityId(syncInfo);
            Account account = syncInfo.account;
            return ctor(authorityId, new Account(account.name, account.type), syncInfo.authority, syncInfo.startTime);
        }
    }
}
