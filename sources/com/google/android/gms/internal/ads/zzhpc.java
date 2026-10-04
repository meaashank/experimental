package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpc extends RuntimeException {
    public zzhpc(String str) {
        super(str);
    }

    public static Object zza(zzhpb zzhpbVar) {
        try {
            return zzhpbVar.zza();
        } catch (Exception e10) {
            throw new zzhpc(e10);
        }
    }

    public zzhpc(String str, Throwable th) {
        super(str, th);
    }

    public zzhpc(Throwable th) {
        super(th);
    }
}
