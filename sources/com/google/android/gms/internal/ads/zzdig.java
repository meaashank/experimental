package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdig implements AppEventListener, OnAdMetadataChangedListener, zzddp, com.google.android.gms.ads.internal.client.zza, zzdgg, zzdej, zzdfo, com.google.android.gms.ads.internal.overlay.zzr, zzdef, zzdlw {
    private final zzdhf zza = new zzdhf(this, null);

    @Nullable
    private zzeua zzb;

    @Nullable
    private zzeue zzc;

    @Nullable
    private zzfhc zzd;

    @Nullable
    private zzfkh zze;

    private static void zzs(Object obj, zzdif zzdifVar) {
        if (obj != null) {
            zzdifVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzs(this.zzb, zzdhk.zza);
        zzs(this.zzc, zzdhx.zza);
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdid.zza);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdif() { // from class: com.google.android.gms.internal.ads.zzdgx
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
                ((zzeua) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzd(final zzcch zzcchVar, final String str, final String str2) {
        zzs(this.zzb, new zzdif(zzcchVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzdhe
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdif() { // from class: com.google.android.gms.internal.ads.zzdgw
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
                ((zzfkh) obj).zzd(zzcchVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdK() {
        zzs(this.zzb, zzdhh.zza);
        zzs(this.zze, zzdhz.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdT() {
        zzs(this.zzb, zzdhl.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
        zzs(this.zzd, zzdhr.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdW(final int i10) {
        zzs(this.zzd, new zzdif() { // from class: com.google.android.gms.internal.ads.zzdhd
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhc) obj).zzdW(i10);
            }
        });
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
        zzs(this.zzb, zzdhn.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzds() {
        zzs(this.zzb, zzdhg.zza);
        zzs(this.zze, zzdhy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdt() {
        zzs(this.zzb, zzdho.zza);
        zzs(this.zze, zzdie.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdu() {
        zzs(this.zzb, zzdhm.zza);
        zzs(this.zzc, zzdhw.zza);
        zzs(this.zze, zzdic.zza);
        zzs(this.zzd, zzdhv.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzs(this.zzd, zzdhs.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        zzs(this.zzd, zzdht.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        zzs(this.zzd, zzdhu.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
        zzs(this.zzb, zzdhi.zza);
        zzs(this.zze, zzdia.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
        zzs(this.zzb, zzdhj.zza);
        zzs(this.zze, zzdib.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        zzs(this.zzd, zzdhq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzj(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(this.zze, new zzdif() { // from class: com.google.android.gms.internal.ads.zzdhb
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
                ((zzfkh) obj).zzj(zzeVar);
            }
        });
        zzs(this.zzb, new zzdif() { // from class: com.google.android.gms.internal.ads.zzdhc
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
                ((zzeua) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final void zzl() {
        zzs(this.zzd, zzdhp.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final void zzm(final com.google.android.gms.ads.internal.client.zzt zztVar) {
        zzs(this.zzb, new zzdif() { // from class: com.google.android.gms.internal.ads.zzdgy
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
                ((zzeua) obj).zzm(zztVar);
            }
        });
        zzs(this.zze, new zzdif() { // from class: com.google.android.gms.internal.ads.zzdgz
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
                ((zzfkh) obj).zzm(zztVar);
            }
        });
        zzs(this.zzd, new zzdif() { // from class: com.google.android.gms.internal.ads.zzdha
            @Override // com.google.android.gms.internal.ads.zzdif
            public final /* synthetic */ void zza(Object obj) {
                ((zzfhc) obj).zzm(zztVar);
            }
        });
    }

    public final zzdhf zzn() {
        return this.zza;
    }

    public final /* synthetic */ void zzo(zzeua zzeuaVar) {
        this.zzb = zzeuaVar;
    }

    public final /* synthetic */ void zzp(zzeue zzeueVar) {
        this.zzc = zzeueVar;
    }

    public final /* synthetic */ void zzq(zzfhc zzfhcVar) {
        this.zzd = zzfhcVar;
    }

    public final /* synthetic */ void zzr(zzfkh zzfkhVar) {
        this.zze = zzfkhVar;
    }
}
