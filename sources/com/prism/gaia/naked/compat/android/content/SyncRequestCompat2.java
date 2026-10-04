package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.accounts.Account;
import android.content.SyncRequest;
import android.os.Bundle;
import com.prism.gaia.naked.metadata.android.content.SyncRequestCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class SyncRequestCompat2 {

    public static class Util {
        public static Account getAccount(SyncRequest syncRequest) {
            return SyncRequestCAG.f165605G.mAccountToSync().get(syncRequest);
        }

        public static Bundle getBundle(SyncRequest syncRequest) {
            return SyncRequestCAG.f165605G.mExtras().get(syncRequest);
        }

        public static String getProvider(SyncRequest syncRequest) {
            return SyncRequestCAG.f165605G.mAuthority().get(syncRequest);
        }

        public static long getSyncFlexTime(SyncRequest syncRequest) {
            return SyncRequestCAG.f165605G.mSyncFlexTimeSecs().get(syncRequest);
        }

        public static long getSyncRunTime(SyncRequest syncRequest) {
            return SyncRequestCAG.f165605G.mSyncRunTimeSecs().get(syncRequest);
        }

        public static boolean hasAuthority(SyncRequest syncRequest) {
            return SyncRequestCAG.f165605G.mIsAuthority().get(syncRequest);
        }

        public static boolean isPeriodic(SyncRequest syncRequest) {
            return SyncRequestCAG.f165605G.mIsPeriodic().get(syncRequest);
        }
    }
}
