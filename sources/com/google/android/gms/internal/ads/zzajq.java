package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajq extends zzajz {
    public final byte[] zza;

    public zzajq(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajq.class == obj.getClass()) {
            zzajq zzajqVar = (zzajq) obj;
            if (this.zzf.equals(zzajqVar.zzf) && Arrays.equals(this.zza, zzajqVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }
}
