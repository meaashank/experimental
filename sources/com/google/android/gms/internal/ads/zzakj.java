package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.fragment.app.C2564b;

/* JADX INFO: loaded from: classes4.dex */
public final class zzakj implements zzao {
    public final String zza;
    public final String zzb;

    public zzakj(String str, String str2) {
        this.zza = zzgts.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakj.class == obj.getClass()) {
            zzakj zzakjVar = (zzakj) obj;
            if (this.zza.equals(zzakjVar.zza) && this.zzb.equals(zzakjVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return C2564b.a(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    @Override // com.google.android.gms.internal.ads.zzao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzam r4) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakj.zza(com.google.android.gms.internal.ads.zzam):void");
    }
}
