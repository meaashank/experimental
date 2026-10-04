package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Objects;
import v.C5668b;

/* JADX INFO: loaded from: classes4.dex */
final class zzbkc extends C5668b {
    final /* synthetic */ zzbkf zza;

    public zzbkc(zzbkf zzbkfVar) {
        Objects.requireNonNull(zzbkfVar);
        this.zza = zzbkfVar;
    }

    @Override // v.C5668b
    public final void onNavigationEvent(int i10, @Nullable Bundle bundle) {
        this.zza.zzc(i10);
    }
}
