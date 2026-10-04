package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes4.dex */
final class zzpn extends zzpp {
    private int zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzpn(byte[] bArr, int i10, int i11, boolean z10, zzpo zzpoVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i10) throws zzqu {
        int i11 = this.zzd;
        this.zzd = 0;
        int i12 = this.zzb + this.zzc;
        this.zzb = i12;
        if (i12 <= 0) {
            this.zzc = 0;
            return i11;
        }
        this.zzc = i12;
        this.zzb = 0;
        return i11;
    }
}
