package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1713x0;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzajl implements zzao {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        zzt zztVar = new zzt();
        zztVar.zzo("application/id3");
        zztVar.zzQ();
        zzt zztVar2 = new zzt();
        zztVar2.zzo("application/x-scte35");
        zztVar2.zzQ();
    }

    public zzajl(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajl.class == obj.getClass()) {
            zzajl zzajlVar = (zzajl) obj;
            if (this.zzc == zzajlVar.zzc && this.zzd == zzajlVar.zzd && Objects.equals(this.zza, zzajlVar.zza) && Objects.equals(this.zzb, zzajlVar.zzb) && Arrays.equals(this.zze, zzajlVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zza.hashCode() + 527;
        int iHashCode2 = this.zzb.hashCode() + (iHashCode * 31);
        long j10 = this.zzc;
        long j11 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) j11)) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        long j10 = this.zzd;
        int length = String.valueOf(j10).length();
        long j11 = this.zzc;
        int length2 = String.valueOf(j11).length();
        String str = this.zza;
        int length3 = str.length() + 18 + length + 13 + length2;
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + length3 + 8);
        androidx.concurrent.futures.b.a(sb2, "EMSG: scheme=", str, ", id=");
        sb2.append(j10);
        C1713x0.a(sb2, ", durationMs=", j11, ", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public /* synthetic */ void zza(zzam zzamVar) {
        E.a(this, zzamVar);
    }
}
