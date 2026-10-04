package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes4.dex */
final class zzae extends zzz {
    private final zzah zza;

    public zzae(zzah zzahVar, int i10) {
        super(zzahVar.size(), i10);
        this.zza = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
