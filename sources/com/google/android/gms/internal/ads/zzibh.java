package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzibh {
    public static final zzibh zza = new zzibh(new zzibi());
    public static final zzibh zzb = new zzibh(new zzibm());
    public static final zzibh zzc = new zzibh(new zzibo());
    public static final zzibh zzd = new zzibh(new zzibn());
    public static final zzibh zze;
    public static final zzibh zzf;
    private final zzibg zzg;

    static {
        new zzibh(new zzibj());
        zze = new zzibh(new zzibl());
        zzf = new zzibh(new zzibk());
    }

    public zzibh(zzibp zzibpVar) {
        this.zzg = !zzhly.zza() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzibd(zzibpVar, null) : new zzibe(zzibpVar, null) : new zzibf(zzibpVar, null);
    }

    public static List zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zzb(String str) throws GeneralSecurityException {
        return this.zzg.zza(str);
    }
}
