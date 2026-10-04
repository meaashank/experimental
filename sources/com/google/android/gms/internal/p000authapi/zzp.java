package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes4.dex */
final class zzp extends zzh {
    private BaseImplementation.ResultHolder<Status> zzaq;

    public zzp(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zzaq = resultHolder;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzh, com.google.android.gms.internal.p000authapi.zzv
    public final void zzd(Status status) {
        this.zzaq.setResult(status);
    }
}
