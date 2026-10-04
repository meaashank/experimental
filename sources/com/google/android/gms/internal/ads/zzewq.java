package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewq implements zzfdg {

    @Nullable
    @e.f0
    final ArrayList zza;

    public zzewq(@Nullable ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfml.zzg((Bundle) obj, "android_permissions", this.zza);
    }
}
