package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgal extends zzgar {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzgal(String str, boolean z10, int i10, zzgaj zzgajVar, int i11, byte[] bArr) {
        this.zzb = str;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgar) {
            zzgar zzgarVar = (zzgar) obj;
            if (this.zzb.equals(zzgarVar.zza())) {
                zzgarVar.zzb();
                int i10 = this.zzc;
                int iZzd = zzgarVar.zzd();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iZzd) {
                    zzgarVar.zzc();
                    int i11 = this.zzd;
                    int iZze = zzgarVar.zze();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i10 = this.zzc;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.zzd != 0) {
            return (i11 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.zzc;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + com.bytedance.sdk.component.utils.a.a(str, com.google.android.gms.ads.internal.util.e.a(str3, 73), 52) + 1);
        androidx.room.F.a(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str);
        return androidx.compose.animation.core.E0.a(sb2, ", multipleProductIdGroupsResolver=null, filePurpose=", str2, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgaj zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zze() {
        return this.zzd;
    }
}
