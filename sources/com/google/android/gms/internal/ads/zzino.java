package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzino {
    public static zzino zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzinj(cls.getSimpleName()) : new zzinl(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
