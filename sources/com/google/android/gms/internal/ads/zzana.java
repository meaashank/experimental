package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzana implements zzaho {
    public final int zza;
    public final zzhbf zzb;

    public zzana(int i10, @Nullable int[] iArr) {
        this.zza = i10;
        this.zzb = iArr != null ? zzhbf.zzf(iArr) : zzhbf.zza();
    }

    public final String toString() {
        zzhbf zzhbfVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzhbfVar.zzh());
        for (int i10 = 0; i10 < zzhbfVar.zzh(); i10++) {
            arrayList.add(zzfm.zzA(zzhbfVar.zzi(i10)));
        }
        String strZzA = zzfm.zzA(this.zza);
        String string = arrayList.toString();
        StringBuilder sbA = com.google.android.gms.auth.a.a(com.bytedance.sdk.component.utils.a.a(string, strZzA.length() + 37, 1), "UnsupportedBrands{major=", strZzA, ", compatible=", string);
        sbA.append("}");
        return sbA.toString();
    }
}
