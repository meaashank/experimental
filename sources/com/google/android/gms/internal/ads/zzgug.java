package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgug {
    private final String zza;
    private final zzguf zzb;
    private zzguf zzc;

    public /* synthetic */ zzgug(String str, byte[] bArr) {
        zzguf zzgufVar = new zzguf();
        this.zzb = zzgufVar;
        this.zzc = zzgufVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzguf zzgufVar = this.zzb.zzb;
        String str = "";
        while (zzgufVar != null) {
            Object obj = zzgufVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzgufVar = zzgufVar.zzb;
            str = U6.j.f68738d;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzgug zza(Object obj) {
        zzguf zzgufVar = new zzguf();
        this.zzc.zzb = zzgufVar;
        this.zzc = zzgufVar;
        zzgufVar.zza = obj;
        return this;
    }
}
