package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes4.dex */
final class zzgur extends zzgux {
    final /* synthetic */ zzgtz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgur(zzguz zzguzVar, CharSequence charSequence, zzgtz zzgtzVar) {
        super(zzguzVar, charSequence);
        this.zza = zzgtzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzc(int i10) {
        Matcher matcher = ((zzguc) this.zza).zza;
        if (matcher.find(i10)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgux
    public final int zzd(int i10) {
        return ((zzguc) this.zza).zza.end();
    }
}
