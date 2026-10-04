package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdyz implements zzdgv, zzdfd, zzdds, zzdej, com.google.android.gms.ads.internal.client.zza, zzdjg {
    private final zzbif zza;
    private boolean zzb = false;

    public zzdyz(zzbif zzbifVar, @Nullable zzfiy zzfiyVar) {
        this.zza = zzbifVar;
        zzbifVar.zzc(2);
        if (zzfiyVar != null) {
            zzbifVar.zzc(com.prism.fusionadsdkbase.a.f162366c);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.zzb) {
            this.zza.zzc(8);
        } else {
            this.zza.zzc(7);
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        switch (zzeVar.zza) {
            case 1:
                this.zza.zzc(101);
                break;
            case 2:
                this.zza.zzc(102);
                break;
            case 3:
                this.zza.zzc(5);
                break;
            case 4:
                this.zza.zzc(103);
                break;
            case 5:
                this.zza.zzc(104);
                break;
            case 6:
                this.zza.zzc(105);
                break;
            case 7:
                this.zza.zzc(106);
                break;
            default:
                this.zza.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(final zzflo zzfloVar) {
        this.zza.zzb(new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyy
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzbil.zza.zzb zzbVarZzcc = zzaVar.zzY().zzcc();
                zzbil.zzi.zza zzaVarZzcc = zzaVar.zzY().zzp().zzcc();
                zzaVarZzcc.zzd(zzfloVar.zzb.zzb.zzb);
                zzbVarZzcc.zzr(zzaVarZzcc);
                zzaVar.zzaa(zzbVarZzcc);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zzdr() {
        this.zza.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        this.zza.zzc(3);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzj(final zzbil.zzb zzbVar) {
        zzbie zzbieVar = new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyv
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbif zzbifVar = this.zza;
        zzbifVar.zzb(zzbieVar);
        zzbifVar.zzc(com.prism.fusionadsdkbase.a.f162368e);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzk(final zzbil.zzb zzbVar) {
        zzbie zzbieVar = new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbif zzbifVar = this.zza;
        zzbifVar.zzb(zzbieVar);
        zzbifVar.zzc(com.prism.fusionadsdkbase.a.f162367d);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzl(final zzbil.zzb zzbVar) {
        zzbie zzbieVar = new zzbie() { // from class: com.google.android.gms.internal.ads.zzdyx
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                zzaVar.zzar(zzbVar);
            }
        };
        zzbif zzbifVar = this.zza;
        zzbifVar.zzb(zzbieVar);
        zzbifVar.zzc(com.prism.fusionadsdkbase.a.f162369f);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzm(boolean z10) {
        this.zza.zzc(true != z10 ? com.prism.fusionadsdkbase.a.f162371h : com.prism.fusionadsdkbase.a.f162370g);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzn(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : com.prism.fusionadsdkbase.a.f162372i);
    }

    @Override // com.google.android.gms.internal.ads.zzdjg
    public final void zzo() {
        this.zza.zzc(1109);
    }
}
