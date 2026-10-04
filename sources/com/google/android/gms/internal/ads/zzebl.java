package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1713x0;

/* JADX INFO: loaded from: classes4.dex */
final class zzebl extends zzebp {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzebl(long j10, int i10, byte[] bArr) {
        this.zza = j10;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebp) {
            zzebp zzebpVar = (zzebp) obj;
            if (this.zza == zzebpVar.zza() && this.zzb == zzebpVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.zza;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j10 = this.zza;
        int length = String.valueOf(j10).length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 34 + String.valueOf(i10).length() + 1);
        C1713x0.a(sb2, "OnDeviceStorageKey{id=", j10, ", eventType=");
        return android.support.v4.media.d.a(sb2, i10, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebp
    public final int zzb() {
        return this.zzb;
    }
}
