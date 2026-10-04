package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.C1520a;
import com.android.launcher3.IconCache;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdon implements zzdfd, com.google.android.gms.ads.internal.overlay.zzr, zzdej {

    @Nullable
    @e.f0
    zzeml zza;
    private final Context zzb;

    @Nullable
    private final zzclm zzc;
    private final zzfld zzd;
    private final VersionInfoParcel zze;
    private final zzemj zzf;

    public zzdon(Context context, @Nullable zzclm zzclmVar, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzemj zzemjVar) {
        this.zzb = context;
        this.zzc = zzclmVar;
        this.zzd = zzfldVar;
        this.zze = versionInfoParcel;
        this.zzf = zzemjVar;
    }

    private final boolean zzl() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgt)).booleanValue() && this.zzf.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        zzclm zzclmVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzclmVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgw)).booleanValue()) {
                zzclmVar.zze("onSdkImpression", new C1520a());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzclm zzclmVar;
        zzemi zzemiVar;
        zzemh zzemhVar;
        zzfld zzfldVar = this.zzd;
        if (!zzfldVar.zzT || (zzclmVar = this.zzc) == null) {
            return;
        }
        if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            int i10 = versionInfoParcel.buddyApkVersion;
            int i11 = versionInfoParcel.clientJarVersion;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
            sb2.append(i10);
            sb2.append(IconCache.EMPTY_CLASS_NAME);
            sb2.append(i11);
            String string = sb2.toString();
            zzflz zzflzVar = zzfldVar.zzV;
            String strZza = zzflzVar.zza();
            if (zzflzVar.zzc() == 1) {
                zzemhVar = zzemh.VIDEO;
                zzemiVar = zzemi.DEFINED_BY_JAVASCRIPT;
            } else {
                zzemiVar = zzfldVar.zzY == 2 ? zzemi.UNSPECIFIED : zzemi.BEGIN_TO_RENDER;
                zzemhVar = zzemh.HTML_DISPLAY;
            }
            zzeml zzemlVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzclmVar.zzD(), "", Z3.f.f79411h, strZza, zzemiVar, zzemhVar, zzfldVar.zzal);
            this.zza = zzemlVarZzc;
            if (zzemlVarZzc != null) {
                zzfvm zzfvmVarZza = zzemlVarZzc.zza();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgs)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfvmVarZza, zzclmVar.zzD());
                    Iterator it = zzclmVar.zzF().iterator();
                    while (it.hasNext()) {
                        com.google.android.gms.ads.internal.zzt.zzu().zzg(zzfvmVarZza, (View) it.next());
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzu().zzh(zzfvmVarZza, zzclmVar.zzE());
                }
                zzclmVar.zzak(this.zza);
                com.google.android.gms.ads.internal.zzt.zzu().zze(zzfvmVarZza);
                zzclmVar.zze("onSdkLoaded", new C1520a());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzclm zzclmVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgw)).booleanValue() || (zzclmVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzclmVar.zze("onSdkImpression", new C1520a());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
