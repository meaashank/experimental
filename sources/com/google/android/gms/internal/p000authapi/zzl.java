package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class zzl extends zzh {
    private final /* synthetic */ zzi zzap;

    public zzl(zzi zziVar) {
        this.zzap = zziVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzh, com.google.android.gms.internal.p000authapi.zzv
    public final void zzc(Status status, Credential credential) {
        this.zzap.setResult(new zzg(status, credential));
    }

    @Override // com.google.android.gms.internal.p000authapi.zzh, com.google.android.gms.internal.p000authapi.zzv
    public final void zzd(Status status) {
        this.zzap.setResult(zzg.zzc(status));
    }
}
