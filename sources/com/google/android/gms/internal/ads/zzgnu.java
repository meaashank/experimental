package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgnu implements zzgni {
    private final Context zza;
    private final ExecutorService zzb;
    private final zzgfh zzc;
    private final String zzd;
    private final String zze;
    private final zzgrh zzf;
    private final zzgnw zzg;
    private final int zzh;

    public zzgnu(Context context, ExecutorService executorService, zzgei zzgeiVar, zzgfh zzgfhVar, zzgrh zzgrhVar, zzgnw zzgnwVar) {
        this.zza = context;
        this.zzb = executorService;
        this.zzc = zzgfhVar;
        this.zzf = zzgrhVar;
        this.zzg = zzgnwVar;
        this.zzd = zzgeiVar.zzd();
        this.zzh = zzbel.zzb(zzgeh.zza(zzgeiVar.zzM()));
        this.zze = zzgeiVar.zzk().zzc();
    }

    private static zzggr zze(int i10) {
        zzggq zzggqVarZzd = zzggr.zzd();
        zzggqVarZzd.zzd(i10);
        return (zzggr) zzggqVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    public final ListenableFuture zza() {
        int i10;
        zzbdz zzbdzVarZza = zzbea.zza();
        byte[] bArrZza = zzavo.zza();
        zziei zzieiVar = zziei.zza;
        zzbdzVarZza.zza(zziei.zzt(bArrZza, 0, bArrZza.length));
        zzbdzVarZza.zzb(Build.VERSION.SDK_INT);
        zzbdzVarZza.zzc(Build.MODEL);
        Context context = this.zza;
        zzbdzVarZza.zzd(context.getPackageName());
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i10 = -1;
        }
        zzgfh zzgfhVar = this.zzc;
        zzgrh zzgrhVar = this.zzf;
        zzbdzVarZza.zze(i10);
        zzbdzVarZza.zzf(this.zzd);
        zzbdzVarZza.zzg(3);
        zzbdzVarZza.zzh(this.zzh);
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk(zzhcq.zzw(zzgfhVar.zza(Uri.parse(this.zze).buildUpon().appendQueryParameter("aspq", zzgfd.zza(((zzbea) zzbdzVarZza.zzbu()).zzaN(), true)).build().toString())), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgnt
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzb((zzgfg) obj);
            }
        }, this.zzb), UnknownHostException.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzgnr
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((UnknownHostException) obj);
            }
        }, zzhdp.zza()), SocketException.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzgns
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((SocketException) obj);
            }
        }, zzhdp.zza());
        zzgrhVar.zze(20002, zzhcqVar);
        return zzhcqVar;
    }

    public final /* synthetic */ zzggr zzb(zzgfg zzgfgVar) {
        if (zzgfgVar.zza() != 200) {
            this.zzf.zzc(20003, new String(zzavo.zza(), StandardCharsets.UTF_8));
            return zze(7);
        }
        try {
            String strZzb = zzgfgVar.zzb();
            if (TextUtils.isEmpty(strZzb)) {
                this.zzf.zzb(20004);
                return zze(8);
            }
            zzbec zzbecVarZzc = zzbec.zzc(zzgfd.zzb(strZzb, true), zziew.zzc());
            if (zzbecVarZzc.zza().zzc() && zzbecVarZzc.zza().zza()) {
                if (!this.zzg.zza(zzbecVarZzc)) {
                    this.zzf.zzb(20006);
                    return zze(12);
                }
                zzggq zzggqVarZzd = zzggr.zzd();
                zzggs zzggsVarZzg = zzggt.zzg();
                zzggsVarZzg.zzb(zzbecVarZzc.zza().zzb());
                zzggsVarZzg.zzd(zzbecVarZzc.zzb());
                zzggqVarZzd.zza((zzggt) zzggsVarZzg.zzbu());
                zzggqVarZzd.zzb(zzbecVarZzc.zza().zzd());
                zzggqVarZzd.zzd(2);
                return (zzggr) zzggqVarZzd.zzbu();
            }
            this.zzf.zzb(20004);
            return zze(8);
        } catch (Throwable th) {
            this.zzf.zzd(20005, th);
            return zze(6);
        }
    }

    public final /* synthetic */ zzggr zzc(UnknownHostException unknownHostException) {
        this.zzf.zzb(20007);
        return zze(13);
    }

    public final /* synthetic */ zzggr zzd(SocketException socketException) {
        this.zzf.zzb(20008);
        return zze(13);
    }
}
