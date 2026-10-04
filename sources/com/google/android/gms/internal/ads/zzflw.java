package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zzflw {

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzfw zza;

    @Nullable
    public final zzbst zzb;

    @Nullable
    public final zzeua zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;

    @Nullable
    public final zzbmk zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcl zzo;
    public final zzflk zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;

    @Nullable
    public final JSONArray zzw;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcp zzx;

    public /* synthetic */ zzflw(zzflv zzflvVar, byte[] bArr) {
        this.zzf = zzflvVar.zzF();
        this.zzg = zzflvVar.zzG();
        this.zzx = zzflvVar.zzac();
        this.zze = zzflvVar.zzE().zzC;
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE2 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE3 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE4 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE5 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE6 = zzflvVar.zzE();
        com.google.android.gms.ads.internal.client.zzm zzmVarZzE7 = zzflvVar.zzE();
        int i10 = zzflvVar.zzE().zza;
        long j10 = zzmVarZzE7.zzb;
        Bundle bundle = zzmVarZzE6.zzc;
        int i11 = zzmVarZzE5.zzd;
        List list = zzmVarZzE4.zze;
        boolean z10 = zzmVarZzE3.zzf;
        int i12 = zzmVarZzE2.zzg;
        boolean z11 = true;
        if (!zzmVarZzE.zzh && !zzflvVar.zzI()) {
            z11 = false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(i10, j10, bundle, i11, list, z10, i12, z11, zzflvVar.zzE().zzi, zzflvVar.zzE().zzj, zzflvVar.zzE().zzk, zzflvVar.zzE().zzl, zzflvVar.zzE().zzm, zzflvVar.zzE().zzn, zzflvVar.zzE().zzo, zzflvVar.zzE().zzp, zzflvVar.zzE().zzq, zzflvVar.zzE().zzr, zzflvVar.zzE().zzs, zzflvVar.zzE().zzt, zzflvVar.zzE().zzu, zzflvVar.zzE().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzflvVar.zzE().zzw), zzflvVar.zzE().zzx, zzflvVar.zzE().zzy, zzflvVar.zzE().zzz, zzflvVar.zzE().zzA, zzflvVar.zzE().zzB);
        this.zzd = zzmVar;
        this.zza = zzflvVar.zzH() != null ? zzflvVar.zzH() : zzflvVar.zzL() != null ? zzflvVar.zzL().zzf : null;
        this.zzh = zzflvVar.zzJ();
        this.zzi = zzflvVar.zzK();
        this.zzj = zzflvVar.zzJ() == null ? null : zzflvVar.zzL() == null ? new zzbmk(new NativeAdOptions.Builder().build()) : zzflvVar.zzL();
        this.zzk = zzflvVar.zzM();
        this.zzl = zzflvVar.zzQ();
        this.zzm = zzflvVar.zzN();
        this.zzn = zzflvVar.zzO();
        this.zzo = zzflvVar.zzP();
        this.zzb = zzflvVar.zzR();
        this.zzp = new zzflk(zzflvVar.zzS(), null);
        this.zzq = zzflvVar.zzT();
        this.zzr = zzflvVar.zzU();
        this.zzc = zzflvVar.zzV();
        this.zzs = zzflvVar.zzW();
        this.zzt = zzflvVar.zzX();
        this.zzu = zzmVar.zzA != 0 ? new AtomicLong(zzmVar.zzA) : zzflvVar.zzY();
        this.zzv = zzflvVar.zzZ();
        this.zzw = zzflvVar.zzaa();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzem));
    }
}
