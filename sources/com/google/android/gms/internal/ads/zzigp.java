package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzigp {
    private final zzigo zza;

    private zzigp(zziin zziinVar, Object obj, zziin zziinVar2, Object obj2) {
        this.zza = new zzigo(zziinVar, "", zziinVar2, obj2);
    }

    public static zzigp zza(zziin zziinVar, Object obj, zziin zziinVar2, Object obj2) {
        return new zzigp(zziinVar, "", zziinVar2, obj2);
    }

    public static void zzb(zzier zzierVar, zzigo zzigoVar, Object obj, Object obj2) throws IOException {
        zzifb.zzf(zzierVar, zzigoVar.zza, 1, obj);
        zzifb.zzf(zzierVar, zzigoVar.zzc, 2, obj2);
    }

    public static int zzc(zzigo zzigoVar, Object obj, Object obj2) {
        return zzifb.zzh(zzigoVar.zza, 1, obj) + zzifb.zzh(zzigoVar.zzc, 2, obj2);
    }

    public final int zzd(int i10, Object obj, Object obj2) {
        zzigo zzigoVar = this.zza;
        int iZzF = zzier.zzF(i10 << 3);
        int iZzc = zzc(zzigoVar, obj, obj2);
        return C3294f1.a(iZzc, iZzc, iZzF);
    }

    public final zzigo zze() {
        return this.zza;
    }
}
