package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzaid implements zzahz {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaid(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzaid zzb(zzeu zzeuVar) {
        int iZzC = zzeuVar.zzC();
        zzeuVar.zzk(8);
        int iZzC2 = zzeuVar.zzC();
        int iZzC3 = zzeuVar.zzC();
        zzeuVar.zzk(4);
        int iZzC4 = zzeuVar.zzC();
        zzeuVar.zzk(12);
        return new zzaid(iZzC, iZzC2, iZzC3, iZzC4);
    }

    @Override // com.google.android.gms.internal.ads.zzahz
    public final int zza() {
        return 1751742049;
    }
}
