package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzesk implements zzdom {
    final /* synthetic */ zzfld zza;

    public zzesk(zzesn zzesnVar, zzfld zzfldVar) {
        this.zza = zzfldVar;
        Objects.requireNonNull(zzesnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final void zza(boolean z10, Context context, @Nullable zzdec zzdecVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    @Nullable
    public final zzfld zzb() {
        return this.zza;
    }
}
