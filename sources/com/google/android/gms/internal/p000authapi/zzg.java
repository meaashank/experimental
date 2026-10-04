package com.google.android.gms.internal.p000authapi;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg implements CredentialRequestResult {
    private final Status mStatus;

    @Nullable
    private final Credential zzam;

    public zzg(Status status, @Nullable Credential credential) {
        this.mStatus = status;
        this.zzam = credential;
    }

    public static zzg zzc(Status status) {
        return new zzg(status, null);
    }

    @Override // com.google.android.gms.auth.api.credentials.CredentialRequestResult
    @Nullable
    public final Credential getCredential() {
        return this.zzam;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.mStatus;
    }
}
