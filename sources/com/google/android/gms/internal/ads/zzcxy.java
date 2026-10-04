package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.C1520a;
import com.android.launcher3.IconCache;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxy implements zzdfd, zzdej {
    private final Context zza;

    @Nullable
    private final zzclm zzb;
    private final zzfld zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private zzeml zze;
    private boolean zzf;
    private final zzemj zzg;

    public zzcxy(Context context, @Nullable zzclm zzclmVar, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzemj zzemjVar) {
        this.zza = context;
        this.zzb = zzclmVar;
        this.zzc = zzfldVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzemjVar;
    }

    private final synchronized void zza() {
        zzclm zzclmVar;
        zzemi zzemiVar;
        zzemh zzemhVar;
        try {
            zzfld zzfldVar = this.zzc;
            if (zzfldVar.zzT && (zzclmVar = this.zzb) != null) {
                if (com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
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
                        int i12 = zzfldVar.zze;
                        zzemh zzemhVar2 = zzemh.HTML_DISPLAY;
                        zzemiVar = i12 == 1 ? zzemi.ONE_PIXEL : zzemi.BEGIN_TO_RENDER;
                        zzemhVar = zzemhVar2;
                    }
                    zzeml zzemlVarZzc = com.google.android.gms.ads.internal.zzt.zzu().zzc(string, zzclmVar.zzD(), "", Z3.f.f79411h, strZza, zzemiVar, zzemhVar, zzfldVar.zzal);
                    this.zze = zzemlVarZzc;
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
                        zzclmVar.zzak(this.zze);
                        com.google.android.gms.ads.internal.zzt.zzu().zze(zzfvmVarZza);
                        this.zzf = true;
                        zzclmVar.zze("onSdkLoaded", new C1520a());
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgt)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zzdr() {
        zzclm zzclmVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzclmVar = this.zzb) == null) {
            return;
        }
        zzclmVar.zze("onSdkImpression", new C1520a());
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
