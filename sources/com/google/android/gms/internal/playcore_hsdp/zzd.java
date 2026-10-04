package com.google.android.gms.internal.playcore_hsdp;

import android.os.Process;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.collection.M0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzd {
    private final String zza = M0.a("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PhoneskyVerificationUtils");

    public zzd(String str) {
    }

    public final int zza(String str, @Nullable Object... objArr) {
        if (!Log.isLoggable("PlayCore", 5)) {
            return 0;
        }
        return Log.w("PlayCore", this.zza + " : " + str);
    }
}
