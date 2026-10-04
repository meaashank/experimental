package com.google.android.gms.measurement.internal;

import androidx.collection.C1535h0;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes4.dex */
final class zzho extends C1535h0<String, com.google.android.gms.internal.measurement.zzb> {
    private final /* synthetic */ zzhl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzho(zzhl zzhlVar, int i10) {
        super(20);
        this.zza = zzhlVar;
    }

    @Override // androidx.collection.C1535h0
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzb create(String str) {
        String str2 = str;
        Preconditions.checkNotEmpty(str2);
        return zzhl.zza(this.zza, str2);
    }
}
