package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbil;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdor implements zzddp, zzdlb {
    private final zzceo zza;
    private final Context zzb;
    private final zzcer zzc;

    @Nullable
    private final View zzd;
    private String zze;
    private final zzbil.zza.EnumC0488zza zzf;
    private final zzfld zzg;

    public zzdor(zzceo zzceoVar, Context context, zzcer zzcerVar, @Nullable View view, zzbil.zza.EnumC0488zza enumC0488zza, zzfld zzfldVar) {
        this.zza = zzceoVar;
        this.zzb = context;
        this.zzc = zzcerVar;
        this.zzd = view;
        this.zzf = enumC0488zza;
        this.zzg = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    @ParametersAreNonnullByDefault
    public final void zzd(zzcch zzcchVar, String str, String str2) {
        zzcer zzcerVar = this.zzc;
        Context context = this.zzb;
        if (zzcerVar.zzb(context) && this.zzg.zzaG) {
            try {
                zzcerVar.zzp(context, zzcerVar.zzk(context), this.zza.zzb(), zzcchVar.zza(), zzcchVar.zzb());
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdt() {
        if (this.zzg.zzaG) {
            View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzh(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzh() {
        zzbil.zza.EnumC0488zza enumC0488zza = this.zzf;
        if (enumC0488zza != zzbil.zza.EnumC0488zza.APP_OPEN && this.zzg.zzaG) {
            String strZzg = this.zzc.zzg(this.zzb);
            this.zze = strZzg;
            this.zze = String.valueOf(strZzg).concat(enumC0488zza == zzbil.zza.EnumC0488zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }
}
