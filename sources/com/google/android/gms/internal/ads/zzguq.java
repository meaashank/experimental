package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
final class zzguq extends zzgux {
    final /* synthetic */ zzgty zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzguq(zzguz zzguzVar, CharSequence charSequence, zzgty zzgtyVar) {
        super(zzguzVar, charSequence);
        this.zza = zzgtyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzc(int i10) {
        CharSequence charSequence = ((zzgux) this).zzb;
        int length = charSequence.length();
        zzguk.zzn(i10, length, FirebaseAnalytics.Param.INDEX);
        while (i10 < length) {
            if (this.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzd(int i10) {
        return i10 + 1;
    }
}
