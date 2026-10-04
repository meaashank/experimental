package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzgrs extends zzgst {
    private final IBinder zza;

    @Nullable
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;

    @Nullable
    private final String zzf;

    public /* synthetic */ zzgrs(IBinder iBinder, String str, int i10, float f10, int i11, int i12, int i13, String str2, int i14, String str3, String str4, String str5, byte[] bArr) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = f10;
        this.zze = i14;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgst) {
            zzgst zzgstVar = (zzgst) obj;
            if (this.zza.equals(zzgstVar.zza()) && ((str = this.zzb) != null ? str.equals(zzgstVar.zzb()) : zzgstVar.zzb() == null) && this.zzc == zzgstVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzgstVar.zzd())) {
                zzgstVar.zze();
                zzgstVar.zzf();
                zzgstVar.zzg();
                zzgstVar.zzh();
                if (this.zze == zzgstVar.zzi()) {
                    zzgstVar.zzj();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzgstVar.zzk()) : zzgstVar.zzk() == null) {
                        zzgstVar.zzl();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i10 = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * (-429739981)) ^ i10) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i10 = this.zzc;
        int length3 = String.valueOf(i10).length();
        float f10 = this.zzd;
        int length4 = String.valueOf(f10).length();
        int i11 = this.zze;
        int length5 = String.valueOf(i11).length();
        String str2 = this.zzf;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 74 + length5 + 33 + String.valueOf(str2).length() + 30);
        androidx.room.F.a(sb2, "OverlayDisplayShowRequest{windowToken=", string, ", appId=", str);
        sb2.append(", layoutGravity=");
        sb2.append(i10);
        sb2.append(", layoutVerticalMargin=");
        sb2.append(f10);
        sb2.append(", displayMode=0, triggerMode=0, theme=0, sessionToken=null, windowWidthPx=");
        sb2.append(i11);
        sb2.append(", deeplinkUrl=null, adFieldEnifd=");
        sb2.append(str2);
        sb2.append(", thirdPartyAuthCallerId=null}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final IBinder zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final int zzf() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final int zzg() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    @Nullable
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    public final int zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    @Nullable
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    @Nullable
    public final String zzk() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgst
    @Nullable
    public final String zzl() {
        return null;
    }
}
