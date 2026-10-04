package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevu implements zzfdg {
    public final com.google.android.gms.ads.internal.client.zzr zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;
    public final int zzi;
    public final boolean zzj;

    @Nullable
    public final G0.D zzk;

    @Nullable
    public final zzevr zzl;

    public zzevu(com.google.android.gms.ads.internal.client.zzr zzrVar, @Nullable String str, boolean z10, String str2, float f10, int i10, int i11, @Nullable String str3, int i12, boolean z11, @Nullable G0.D d10, @Nullable zzevr zzevrVar) {
        Preconditions.checkNotNull(zzrVar, "the adSize must not be null");
        this.zza = zzrVar;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = i12;
        this.zzj = z11;
        this.zzk = d10;
        this.zzl = zzevrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zza;
        Bundle bundle = (Bundle) obj;
        int i10 = zzrVar.zze;
        zzfml.zzb(bundle, "smart_w", "full", i10 == -1);
        int i11 = zzrVar.zzb;
        zzfml.zzb(bundle, "smart_h", kotlinx.coroutines.N.f218775c, i11 == -2);
        zzfml.zzd(bundle, "ene", true, zzrVar.zzj);
        zzfml.zzb(bundle, "rafmt", "102", zzrVar.zzm);
        zzfml.zzb(bundle, "rafmt", "108", zzrVar.zzp);
        zzfml.zzb(bundle, "rafmt", "103", zzrVar.zzn);
        zzfml.zzb(bundle, "rafmt", "105", zzrVar.zzo);
        zzfml.zzd(bundle, "inline_adaptive_slot", true, this.zzj);
        zzfml.zzd(bundle, "interscroller_slot", true, zzrVar.zzo);
        zzfml.zze(bundle, "format", this.zzb);
        zzfml.zzb(bundle, "fluid", InMobiNetworkValues.HEIGHT, this.zzc);
        zzfml.zzb(bundle, "sz", this.zzd, !TextUtils.isEmpty(r6));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, this.zzg);
        String str = this.zzh;
        zzfml.zzb(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        int i12 = this.zzi;
        if (i12 != -1) {
            bundle.putInt("u_mso", i12);
        }
        G0.D d10 = this.zzk;
        if (d10 != null) {
            bundle.putInt("sam_t", d10.f40032b);
            bundle.putInt("sam_b", d10.f40034d);
            bundle.putInt("sam_l", d10.f40031a);
            bundle.putInt("sam_r", d10.f40033c);
        }
        zzevr zzevrVar = this.zzl;
        if (zzevrVar != null) {
            bundle.putInt("rc_tl", zzevrVar.zza);
            bundle.putInt("rc_tr", zzevrVar.zzb);
            bundle.putInt("rc_bl", zzevrVar.zzc);
            bundle.putInt("rc_br", zzevrVar.zzd);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(InMobiNetworkValues.HEIGHT, i11);
            bundle2.putInt(InMobiNetworkValues.WIDTH, i10);
            bundle2.putBoolean("is_fluid_height", zzrVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.zzi);
                bundle3.putInt(InMobiNetworkValues.HEIGHT, zzrVar2.zzb);
                bundle3.putInt(InMobiNetworkValues.WIDTH, zzrVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
