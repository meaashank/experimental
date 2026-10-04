package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnf extends zzhfj {
    private final zzhot zza;

    public zzhnf(zzhot zzhotVar) {
        this.zza = zzhotVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnf)) {
            return false;
        }
        zzhot zzhotVar = ((zzhnf) obj).zza;
        zzhot zzhotVar2 = this.zza;
        return zzhotVar2.zzc().zzk() == zzhotVar.zzc().zzk() && zzhotVar2.zzc().zza().equals(zzhotVar.zzc().zza()) && zzhotVar2.zzc().zzb().equals(zzhotVar.zzc().zzb());
    }

    public final int hashCode() {
        zzhot zzhotVar = this.zza;
        return Objects.hash(zzhotVar.zzc(), zzhotVar.zzf());
    }

    public final String toString() {
        zzhot zzhotVar = this.zza;
        String strZza = zzhotVar.zzc().zza();
        int iZzk = zzhotVar.zzc().zzk() - 2;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZza, iZzk != 1 ? iZzk != 2 ? iZzk != 3 ? iZzk != 4 ? com.prism.lib_google_billing.q.f194113a : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zza.zzc().zzk() != 5;
    }

    public final zzhot zzb() {
        return this.zza;
    }
}
