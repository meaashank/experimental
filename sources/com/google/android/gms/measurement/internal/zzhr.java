package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzhr implements com.google.android.gms.internal.measurement.zzv {
    private final /* synthetic */ zzhl zza;

    public zzhr(zzhl zzhlVar) {
        this.zza = zzhlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void zza(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z10, boolean z11) {
        int i10 = zzht.zza[zzsVar.ordinal()];
        zzgq zzgqVarZzo = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? this.zza.zzj().zzo() : this.zza.zzj().zzp() : z10 ? this.zza.zzj().zzw() : !z11 ? this.zza.zzj().zzv() : this.zza.zzj().zzu() : z10 ? this.zza.zzj().zzn() : !z11 ? this.zza.zzj().zzm() : this.zza.zzj().zzg() : this.zza.zzj().zzc();
        int size = list.size();
        if (size == 1) {
            zzgqVarZzo.zza(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzgqVarZzo.zza(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzgqVarZzo.zza(str);
        } else {
            zzgqVarZzo.zza(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
