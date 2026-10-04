package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgka implements zzgjz {
    private final String zza;
    private final String zzb;
    private final zzgiw zzc;
    private final zzaya zzd;
    private final zzgrf zze;

    public zzgka(String str, String str2, zzaya zzayaVar, zzgiw zzgiwVar, zzgrf zzgrfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzayaVar;
        this.zzc = zzgiwVar;
        this.zze = zzgrfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        try {
            this.zze.zza();
            Method methodZzc = this.zzc.zzc(this.zza, this.zzb);
            if (methodZzc != null) {
                zza(methodZzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (Throwable th) {
            try {
                this.zze.zzb(th);
                throw th;
            } catch (Throwable th2) {
                this.zze.zzc();
                throw th2;
            }
        }
    }

    public abstract void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException;
}
