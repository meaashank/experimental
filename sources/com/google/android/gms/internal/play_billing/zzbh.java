package com.google.android.gms.internal.play_billing;

import U6.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbh {
    private final String zza;
    private final zzbg zzb;
    private zzbg zzc;

    public /* synthetic */ zzbh(String str, zzbi zzbiVar) {
        zzbg zzbgVar = new zzbg();
        this.zzb = zzbgVar;
        this.zzc = zzbgVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzbg zzbgVar = this.zzb.zzb;
        String str = "";
        while (zzbgVar != null) {
            Object obj = zzbgVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzbgVar = zzbgVar.zzb;
            str = j.f68738d;
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzbh zza(Object obj) {
        zzbg zzbgVar = new zzbg();
        this.zzc.zzb = zzbgVar;
        this.zzc = zzbgVar;
        zzbgVar.zza = obj;
        return this;
    }
}
