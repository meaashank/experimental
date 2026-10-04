package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdqr {
    private int zza;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzea zzb;

    @Nullable
    private zzbmo zzc;

    @Nullable
    private View zzd;

    @Nullable
    private List zze;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzew zzg;

    @Nullable
    private Bundle zzh;

    @Nullable
    private zzclm zzi;

    @Nullable
    private zzclm zzj;

    @Nullable
    private zzclm zzk;

    @Nullable
    private zzeml zzl;

    @Nullable
    private ListenableFuture zzm;

    @Nullable
    private zzcgo zzn;

    @Nullable
    private View zzo;

    @Nullable
    private View zzp;

    @Nullable
    private IObjectWrapper zzq;
    private double zzr;

    @Nullable
    private zzbmv zzs;

    @Nullable
    private zzbmv zzt;

    @Nullable
    private String zzu;
    private float zzx;

    @Nullable
    private String zzy;
    private final androidx.collection.U0 zzv = new androidx.collection.U0();
    private final androidx.collection.U0 zzw = new androidx.collection.U0();
    private List zzf = Collections.EMPTY_LIST;

    @Nullable
    public static zzdqr zzaf(zzbwj zzbwjVar) {
        try {
            return zzak(zzam(zzbwjVar.zzn(), zzbwjVar), zzbwjVar.zzo(), (View) zzal(zzbwjVar.zzp()), zzbwjVar.zze(), zzbwjVar.zzf(), zzbwjVar.zzg(), zzbwjVar.zzs(), zzbwjVar.zzi(), (View) zzal(zzbwjVar.zzq()), zzbwjVar.zzr(), zzbwjVar.zzl(), zzbwjVar.zzm(), zzbwjVar.zzk(), zzbwjVar.zzh(), zzbwjVar.zzj(), zzbwjVar.zzz());
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    @Nullable
    public static zzdqr zzag(zzbwg zzbwgVar) {
        try {
            zzdqq zzdqqVarZzam = zzam(zzbwgVar.zzs(), null);
            zzbmo zzbmoVarZzt = zzbwgVar.zzt();
            View view = (View) zzal(zzbwgVar.zzr());
            String strZze = zzbwgVar.zze();
            List listZzf = zzbwgVar.zzf();
            String strZzg = zzbwgVar.zzg();
            Bundle bundleZzp = zzbwgVar.zzp();
            String strZzi = zzbwgVar.zzi();
            View view2 = (View) zzal(zzbwgVar.zzu());
            IObjectWrapper iObjectWrapperZzv = zzbwgVar.zzv();
            String strZzj = zzbwgVar.zzj();
            zzbmv zzbmvVarZzh = zzbwgVar.zzh();
            zzdqr zzdqrVar = new zzdqr();
            zzdqrVar.zza = 1;
            zzdqrVar.zzb = zzdqqVarZzam;
            zzdqrVar.zzc = zzbmoVarZzt;
            zzdqrVar.zzd = view;
            zzdqrVar.zzs("headline", strZze);
            zzdqrVar.zze = listZzf;
            zzdqrVar.zzs("body", strZzg);
            zzdqrVar.zzh = bundleZzp;
            zzdqrVar.zzs("call_to_action", strZzi);
            zzdqrVar.zzo = view2;
            zzdqrVar.zzq = iObjectWrapperZzv;
            zzdqrVar.zzs("advertiser", strZzj);
            zzdqrVar.zzt = zzbmvVarZzh;
            return zzdqrVar;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e10);
            return null;
        }
    }

    @Nullable
    public static zzdqr zzah(zzbwf zzbwfVar) {
        zzdqr zzdqrVar;
        try {
            zzdqq zzdqqVarZzam = zzam(zzbwfVar.zzt(), null);
            zzbmo zzbmoVarZzv = zzbwfVar.zzv();
            View view = (View) zzal(zzbwfVar.zzu());
            String strZze = zzbwfVar.zze();
            List listZzf = zzbwfVar.zzf();
            String strZzg = zzbwfVar.zzg();
            Bundle bundleZzr = zzbwfVar.zzr();
            String strZzi = zzbwfVar.zzi();
            View view2 = (View) zzal(zzbwfVar.zzw());
            IObjectWrapper iObjectWrapperZzx = zzbwfVar.zzx();
            String strZzk = zzbwfVar.zzk();
            String strZzl = zzbwfVar.zzl();
            double dZzj = zzbwfVar.zzj();
            zzbmv zzbmvVarZzh = zzbwfVar.zzh();
            zzdqrVar = null;
            try {
                zzdqr zzdqrVar2 = new zzdqr();
                zzdqrVar2.zza = 2;
                zzdqrVar2.zzb = zzdqqVarZzam;
                zzdqrVar2.zzc = zzbmoVarZzv;
                zzdqrVar2.zzd = view;
                zzdqrVar2.zzs("headline", strZze);
                zzdqrVar2.zze = listZzf;
                zzdqrVar2.zzs("body", strZzg);
                zzdqrVar2.zzh = bundleZzr;
                zzdqrVar2.zzs("call_to_action", strZzi);
                zzdqrVar2.zzo = view2;
                zzdqrVar2.zzq = iObjectWrapperZzx;
                zzdqrVar2.zzs("store", strZzk);
                zzdqrVar2.zzs("price", strZzl);
                zzdqrVar2.zzr = dZzj;
                zzdqrVar2.zzs = zzbmvVarZzh;
                return zzdqrVar2;
            } catch (RemoteException e10) {
                e = e10;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
                return zzdqrVar;
            }
        } catch (RemoteException e11) {
            e = e11;
            zzdqrVar = null;
        }
    }

    @Nullable
    public static zzdqr zzai(zzbwf zzbwfVar) {
        try {
            return zzak(zzam(zzbwfVar.zzt(), null), zzbwfVar.zzv(), (View) zzal(zzbwfVar.zzu()), zzbwfVar.zze(), zzbwfVar.zzf(), zzbwfVar.zzg(), zzbwfVar.zzr(), zzbwfVar.zzi(), (View) zzal(zzbwfVar.zzw()), zzbwfVar.zzx(), zzbwfVar.zzk(), zzbwfVar.zzl(), zzbwfVar.zzj(), zzbwfVar.zzh(), null, 0.0f);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e10);
            return null;
        }
    }

    @Nullable
    public static zzdqr zzaj(zzbwg zzbwgVar) {
        try {
            return zzak(zzam(zzbwgVar.zzs(), null), zzbwgVar.zzt(), (View) zzal(zzbwgVar.zzr()), zzbwgVar.zze(), zzbwgVar.zzf(), zzbwgVar.zzg(), zzbwgVar.zzp(), zzbwgVar.zzi(), (View) zzal(zzbwgVar.zzu()), zzbwgVar.zzv(), null, null, -1.0d, zzbwgVar.zzh(), zzbwgVar.zzj(), 0.0f);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e10);
            return null;
        }
    }

    private static zzdqr zzak(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbmo zzbmoVar, @Nullable View view, String str, List list, String str2, Bundle bundle, String str3, @Nullable View view2, IObjectWrapper iObjectWrapper, @Nullable String str4, @Nullable String str5, double d10, zzbmv zzbmvVar, @Nullable String str6, float f10) {
        zzdqr zzdqrVar = new zzdqr();
        zzdqrVar.zza = 6;
        zzdqrVar.zzb = zzeaVar;
        zzdqrVar.zzc = zzbmoVar;
        zzdqrVar.zzd = view;
        zzdqrVar.zzs("headline", str);
        zzdqrVar.zze = list;
        zzdqrVar.zzs("body", str2);
        zzdqrVar.zzh = bundle;
        zzdqrVar.zzs("call_to_action", str3);
        zzdqrVar.zzo = view2;
        zzdqrVar.zzq = iObjectWrapper;
        zzdqrVar.zzs("store", str4);
        zzdqrVar.zzs("price", str5);
        zzdqrVar.zzr = d10;
        zzdqrVar.zzs = zzbmvVar;
        zzdqrVar.zzs("advertiser", str6);
        zzdqrVar.zzu(f10);
        return zzdqrVar;
    }

    @Nullable
    private static Object zzal(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    private static zzdqq zzam(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar, @Nullable zzbwj zzbwjVar) {
        if (zzeaVar == null) {
            return null;
        }
        return new zzdqq(zzeaVar, zzbwjVar);
    }

    @Nullable
    public final synchronized View zzA() {
        return this.zzd;
    }

    @Nullable
    public final synchronized String zzB() {
        return zzw("headline");
    }

    @Nullable
    public final synchronized List zzC() {
        return this.zze;
    }

    @Nullable
    public final zzbmv zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbmu.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzew zzF() {
        return this.zzg;
    }

    @Nullable
    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    @Nullable
    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    @Nullable
    public final synchronized View zzJ() {
        return this.zzo;
    }

    @Nullable
    public final synchronized View zzK() {
        return this.zzp;
    }

    @Nullable
    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    @Nullable
    public final synchronized String zzM() {
        return zzw("store");
    }

    @Nullable
    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    @Nullable
    public final synchronized zzbmv zzP() {
        return this.zzs;
    }

    @Nullable
    public final synchronized String zzQ() {
        return zzw("advertiser");
    }

    @Nullable
    public final synchronized zzbmv zzR() {
        return this.zzt;
    }

    @Nullable
    public final synchronized String zzS() {
        return this.zzu;
    }

    @Nullable
    public final synchronized zzclm zzT() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzclm zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    @Nullable
    public final synchronized zzclm zzW() {
        return this.zzk;
    }

    @Nullable
    public final synchronized ListenableFuture zzX() {
        return this.zzm;
    }

    @Nullable
    public final synchronized zzcgo zzY() {
        return this.zzn;
    }

    @Nullable
    public final synchronized zzeml zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i10) {
        this.zza = i10;
    }

    @Nullable
    public final synchronized androidx.collection.U0 zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    @Nullable
    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized androidx.collection.U0 zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        try {
            zzclm zzclmVar = this.zzi;
            if (zzclmVar != null) {
                zzclmVar.destroy();
                this.zzi = null;
            }
            zzclm zzclmVar2 = this.zzj;
            if (zzclmVar2 != null) {
                zzclmVar2.destroy();
                this.zzj = null;
            }
            zzclm zzclmVar3 = this.zzk;
            if (zzclmVar3 != null) {
                zzclmVar3.destroy();
                this.zzk = null;
            }
            ListenableFuture listenableFuture = this.zzm;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
                this.zzm = null;
            }
            zzcgo zzcgoVar = this.zzn;
            if (zzcgoVar != null) {
                zzcgoVar.cancel(false);
                this.zzn = null;
            }
            this.zzl = null;
            this.zzv.clear();
            this.zzw.clear();
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzh = null;
            this.zzo = null;
            this.zzp = null;
            this.zzq = null;
            this.zzs = null;
            this.zzt = null;
            this.zzu = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzb = zzeaVar;
    }

    public final synchronized void zzc(zzbmo zzbmoVar) {
        this.zzc = zzbmoVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(@Nullable com.google.android.gms.ads.internal.client.zzew zzewVar) {
        this.zzg = zzewVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d10) {
        this.zzr = d10;
    }

    public final synchronized void zzj(zzbmv zzbmvVar) {
        this.zzs = zzbmvVar;
    }

    public final synchronized void zzk(zzbmv zzbmvVar) {
        this.zzt = zzbmvVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzclm zzclmVar) {
        this.zzi = zzclmVar;
    }

    public final synchronized void zzn(zzclm zzclmVar) {
        this.zzj = zzclmVar;
    }

    public final synchronized void zzo(zzclm zzclmVar) {
        this.zzk = zzclmVar;
    }

    public final synchronized void zzp(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzq(zzeml zzemlVar) {
        this.zzl = zzemlVar;
    }

    public final synchronized void zzr(zzcgo zzcgoVar) {
        this.zzn = zzcgoVar;
    }

    public final synchronized void zzs(String str, @Nullable String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzbmg zzbmgVar) {
        if (zzbmgVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbmgVar);
        }
    }

    public final synchronized void zzu(float f10) {
        this.zzx = f10;
    }

    public final synchronized void zzv(@Nullable String str) {
        this.zzy = str;
    }

    @Nullable
    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzy() {
        return this.zzb;
    }

    @Nullable
    public final synchronized zzbmo zzz() {
        return this.zzc;
    }
}
