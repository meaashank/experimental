package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzhcm extends zzhca {
    private zzhcl zza;

    public zzhcm(zzgxi zzgxiVar, boolean z10, Executor executor, Callable callable) {
        super(zzgxiVar, z10, false);
        this.zza = new zzhck(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzA(int i10) {
        super.zzA(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }

    public final /* synthetic */ void zzD(zzhcl zzhclVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzi() {
        zzhcl zzhclVar = this.zza;
        if (zzhclVar != null) {
            zzhclVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzw(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhca
    public final void zzx() {
        zzhcl zzhclVar = this.zza;
        if (zzhclVar != null) {
            zzhclVar.zze();
        }
    }
}
