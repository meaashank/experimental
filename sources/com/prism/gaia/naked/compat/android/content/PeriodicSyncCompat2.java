package com.prism.gaia.naked.compat.android.content;

import W6.c;
import android.accounts.Account;
import android.content.PeriodicSync;
import android.os.Bundle;
import com.prism.commons.utils.P;
import com.prism.gaia.naked.metadata.android.content.PeriodicSyncCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class PeriodicSyncCompat2 {

    public static class Util {
        public static PeriodicSync ctor(Account account, String str, Bundle bundle, long j10, long j11) {
            PeriodicSync periodicSync = new PeriodicSync(account, str, bundle, j10);
            if (PeriodicSyncCAG.f165602C.flexTime() != null) {
                PeriodicSyncCAG.f165602C.flexTime().set(periodicSync, j11);
            }
            return periodicSync;
        }

        public static boolean flexTimeEquals(PeriodicSync periodicSync, PeriodicSync periodicSync2) {
            return PeriodicSyncCAG.f165602C.flexTime() == null || PeriodicSyncCAG.f165602C.flexTime().get(periodicSync) == PeriodicSyncCAG.f165602C.flexTime().get(periodicSync2);
        }

        public static long getFlexTime(PeriodicSync periodicSync) {
            if (PeriodicSyncCAG.f165602C.flexTime() != null) {
                return PeriodicSyncCAG.f165602C.flexTime().get(periodicSync);
            }
            return 0L;
        }

        public static boolean syncExtrasEquals(Bundle bundle, Bundle bundle2) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            if (bundle.isEmpty()) {
                return true;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str) || !P.a(bundle.get(str), bundle2.get(str))) {
                    return false;
                }
            }
            return true;
        }

        public static PeriodicSync ctor(PeriodicSync periodicSync) {
            PeriodicSync periodicSync2 = new PeriodicSync(periodicSync.account, periodicSync.authority, periodicSync.extras, periodicSync.period);
            if (PeriodicSyncCAG.f165602C.flexTime() != null) {
                PeriodicSyncCAG.f165602C.flexTime().set(periodicSync2, PeriodicSyncCAG.f165602C.flexTime().get(periodicSync));
            }
            return periodicSync2;
        }
    }
}
