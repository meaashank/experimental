package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.prism.hider.vault.calculator.C4261m;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzi implements zzj<Boolean> {
    private final /* synthetic */ String zzt;

    public zzi(String str) {
        this.zzt = str;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ Boolean zzb(IBinder iBinder) throws GoogleAuthException, RemoteException, IOException {
        Bundle bundle = (Bundle) zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzt));
        String string = bundle.getString(C4261m.f168559e);
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzayVarZzc = zzay.zzc(string);
        if (zzay.SUCCESS.equals(zzayVarZzc)) {
            return Boolean.TRUE;
        }
        if (!zzay.zza(zzayVarZzc)) {
            throw new GoogleAuthException(string);
        }
        Logger logger = zzd.zzn;
        String strValueOf = String.valueOf(zzayVarZzc);
        logger.w("GoogleAuthUtil", c.a(strValueOf.length() + 31, "isUserRecoverableError status: ", strValueOf));
        throw new UserRecoverableAuthException(string, intent);
    }
}
