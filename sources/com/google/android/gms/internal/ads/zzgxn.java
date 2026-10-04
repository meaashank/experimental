package com.google.android.gms.internal.ads;

import androidx.fragment.app.C2564b;

/* JADX INFO: loaded from: classes4.dex */
final class zzgxn {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzgxn(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb2 = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        androidx.room.F.a(sb2, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(C2564b.a(sb2, " and ", strValueOf3, "=", strValueOf4));
    }
}
