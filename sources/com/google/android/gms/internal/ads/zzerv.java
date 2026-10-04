package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzerv extends zzcwk {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzerv(zzerz zzerzVar, View view, zzclm zzclmVar, zzcyj zzcyjVar, zzfle zzfleVar) {
        super(view, null, zzcyjVar, zzfleVar);
        Objects.requireNonNull(zzerzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final zzdfb zze(Set set) {
        return new zzdfb(Collections.EMPTY_SET);
    }
}
