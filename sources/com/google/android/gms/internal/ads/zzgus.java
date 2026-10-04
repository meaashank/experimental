package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgus extends zzgux {
    public zzgus(zzguz zzguzVar, CharSequence charSequence, int i10) {
        super(zzguzVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzc(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzgux) this).zzb.length()) {
            return i11;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzd(int i10) {
        return i10;
    }
}
