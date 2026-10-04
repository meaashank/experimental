package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzguh {
    public static Object zza(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static zzgug zzb(Object obj) {
        return new zzgug(obj.getClass().getSimpleName(), null);
    }
}
