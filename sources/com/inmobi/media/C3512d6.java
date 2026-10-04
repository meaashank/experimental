package com.inmobi.media;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3512d6 implements GoogleApiClient.ConnectionCallbacks {
    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        kotlin.jvm.internal.G.o(C3526e6.f152848e, "access$getTAG$p(...)");
        C3526e6.f152849f = true;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        C3526e6.f152849f = false;
        kotlin.jvm.internal.G.o(C3526e6.f152848e, "access$getTAG$p(...)");
    }
}
