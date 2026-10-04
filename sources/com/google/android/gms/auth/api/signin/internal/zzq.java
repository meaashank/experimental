package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq {

    @Nullable
    private static zzq zzcq;

    @VisibleForTesting
    private Storage zzcr;

    @Nullable
    @VisibleForTesting
    private GoogleSignInAccount zzcs;

    @Nullable
    @VisibleForTesting
    private GoogleSignInOptions zzct;

    private zzq(Context context) {
        Storage storage = Storage.getInstance(context);
        this.zzcr = storage;
        this.zzcs = storage.getSavedDefaultGoogleSignInAccount();
        this.zzct = this.zzcr.getSavedDefaultGoogleSignInOptions();
    }

    public static synchronized zzq zzd(@NonNull Context context) {
        return zze(context.getApplicationContext());
    }

    private static synchronized zzq zze(Context context) {
        zzq zzqVar = zzcq;
        if (zzqVar != null) {
            return zzqVar;
        }
        zzq zzqVar2 = new zzq(context);
        zzcq = zzqVar2;
        return zzqVar2;
    }

    public final synchronized void clear() {
        this.zzcr.clear();
        this.zzcs = null;
        this.zzct = null;
    }

    public final synchronized void zzc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.zzcr.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.zzcs = googleSignInAccount;
        this.zzct = googleSignInOptions;
    }

    @Nullable
    public final synchronized GoogleSignInAccount zzr() {
        return this.zzcs;
    }

    @Nullable
    public final synchronized GoogleSignInOptions zzs() {
        return this.zzct;
    }
}
