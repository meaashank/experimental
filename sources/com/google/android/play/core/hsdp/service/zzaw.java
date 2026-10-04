package com.google.android.play.core.hsdp.service;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzaw implements View.OnClickListener {
    final /* synthetic */ zzax zza;

    public zzaw(zzax zzaxVar) {
        Objects.requireNonNull(zzaxVar);
        this.zza = zzaxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb();
    }
}
