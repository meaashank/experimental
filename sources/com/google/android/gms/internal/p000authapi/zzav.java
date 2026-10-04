package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
final class zzav extends zzad {
    private final /* synthetic */ TaskCompletionSource zzbq;

    public zzav(zzao zzaoVar, TaskCompletionSource taskCompletionSource) {
        this.zzbq = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zzaa
    public final void zzc(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        TaskUtil.setResultOrApiException(status, beginSignInResult, this.zzbq);
    }
}
