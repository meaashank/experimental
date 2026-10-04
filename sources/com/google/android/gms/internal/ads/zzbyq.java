package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbyq implements View.OnClickListener {
    final /* synthetic */ zzbys zza;

    public zzbyq(zzbys zzbysVar) {
        Objects.requireNonNull(zzbysVar);
        this.zza = zzbysVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
