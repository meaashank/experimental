package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejg extends zzcbh {
    private final Context zza;
    private final zzhdi zzb;
    private final zzejo zzc;
    private final zzcsi zzd;
    private final ArrayDeque zze;
    private final zzfrj zzf;
    private final zzcny zzg;
    private final zzccd zzh;

    public zzejg(Context context, zzhdi zzhdiVar, zzccd zzccdVar, zzcsi zzcsiVar, zzejo zzejoVar, ArrayDeque arrayDeque, zzejl zzejlVar, zzfrj zzfrjVar, zzcny zzcnyVar) {
        zzbjg.zza(context);
        this.zza = context;
        this.zzb = zzhdiVar;
        this.zzh = zzccdVar;
        this.zzc = zzejoVar;
        this.zzd = zzcsiVar;
        this.zze = arrayDeque;
        this.zzf = zzfrjVar;
        this.zzg = zzcnyVar;
    }

    private static ListenableFuture zzl(final zzcbv zzcbvVar, zzfqi zzfqiVar, final zzfek zzfekVar) {
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzeiu
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfekVar.zzc().zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcbvVar.zzm);
            }
        };
        return zzfqiVar.zza(zzfqc.GMS_SIGNALS, zzhcy.zza(zzcbvVar.zza)).zzc(zzhcgVar).zzb(zzeiv.zza).zzi();
    }

    private static ListenableFuture zzm(ListenableFuture listenableFuture, zzfqi zzfqiVar, zzbva zzbvaVar, zzfrg zzfrgVar, zzfqw zzfqwVar) {
        zzbuq zzbuqVarZza = zzbvaVar.zza("AFMA_getAdDictionary", zzbux.zza, zzeja.zza);
        zzfrf.zzb(listenableFuture, zzfqwVar);
        zzfpp zzfppVarZzi = zzfqiVar.zza(zzfqc.BUILD_URL, listenableFuture).zzc(zzbuqVarZza).zzi();
        zzfrf.zzf(zzfppVarZzi, zzfrgVar, zzfqwVar);
        return zzfppVarZzi;
    }

    private final void zzn(ListenableFuture listenableFuture, zzcbm zzcbmVar, zzcbv zzcbvVar) {
        zzhcy.zzr(zzhcy.zzj(listenableFuture, new zzhcg(this) { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcy.zza(zzfmx.zza((InputStream) obj));
            }
        }, zzcgj.zza), new zzeir(this, zzcbvVar, zzcbmVar), zzcgj.zzh);
    }

    private final synchronized void zzo() {
        int iIntValue = ((Long) zzblo.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzp(zzejb zzejbVar) {
        zzo();
        this.zze.addLast(zzejbVar);
    }

    @Nullable
    private final synchronized zzejb zzq(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzejb zzejbVar = (zzejb) it.next();
            if (zzejbVar.zzc.equals(str)) {
                it.remove();
                return zzejbVar;
            }
        }
        return null;
    }

    public final ListenableFuture zza(final zzcbv zzcbvVar, int i10) {
        zzejb zzejbVarZzq;
        zzfpp zzfppVarZzi;
        zzbur zzburVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbva zzbvaVarZza = zzburVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfek zzfekVarZzy = this.zzd.zzy(zzcbvVar, i10);
        zzbuq zzbuqVarZza = zzbvaVarZza.zza("google.afma.response.normalize", zzejd.zzd, zzbux.zzb);
        if (((Boolean) zzblo.zza.zze()).booleanValue()) {
            zzejbVarZzq = zzq(zzcbvVar.zzh);
            if (zzejbVarZzq == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcbvVar.zzj;
            zzejbVarZzq = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzejb zzejbVar = zzejbVarZzq;
        zzfqw zzfqwVarA = zzejbVar == null ? R0.a(context, 9) : zzejbVar.zzd;
        zzfrg zzfrgVarZzf = zzfekVarZzy.zzf();
        zzfrgVarZzf.zzb(zzcbvVar.zza.getStringArrayList("ad_types"));
        zzejn zzejnVar = new zzejn(zzcbvVar.zzg, zzfrgVarZzf, zzfqwVarA, this.zzg);
        zzejk zzejkVar = new zzejk(context, zzcbvVar.zzb.afmaVersion, this.zzh, i10, null);
        zzfqi zzfqiVarZze = zzfekVarZzy.zze();
        zzfqw zzfqwVarA2 = R0.a(context, 11);
        if (zzejbVar == null) {
            final ListenableFuture listenableFutureZzl = zzl(zzcbvVar, zzfqiVarZze, zzfekVarZzy);
            final ListenableFuture listenableFutureZzm = zzm(listenableFutureZzl, zzfqiVarZze, zzbvaVarZza, zzfrgVarZzf, zzfqwVarA);
            zzfqw zzfqwVarA3 = R0.a(context, 10);
            final zzfpp zzfppVarZzi2 = zzfqiVarZze.zzb(zzfqc.HTTP, listenableFutureZzm, listenableFutureZzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeiz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzcbx zzcbxVar = (zzcbx) listenableFutureZzm.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzcbvVar.zzm) != null) {
                        bundle.putLong(zzdzs.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzcbxVar.zzj());
                        bundle.putLong(zzdzs.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzcbxVar.zzk());
                    }
                    return new zzejm((JSONObject) listenableFutureZzl.get(), zzcbxVar);
                }
            }).zzb(zzejnVar).zzb(zzfrf.zzc(zzfqwVarA3)).zzb(zzejkVar).zzi();
            zzfrf.zzd(zzfppVarZzi2, zzfrgVarZzf, zzfqwVarA3);
            zzfrf.zzb(zzfppVarZzi2, zzfqwVarA2);
            zzfppVarZzi = zzfqiVarZze.zzb(zzfqc.PRE_PROCESS, listenableFutureZzl, listenableFutureZzm, zzfppVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeis
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzcbvVar.zzm) != null) {
                        bundle.putLong(zzdzs.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzejd((zzejj) zzfppVarZzi2.get(), (JSONObject) listenableFutureZzl.get(), (zzcbx) listenableFutureZzm.get());
                }
            }).zzc(zzbuqVarZza).zzi();
        } else {
            zzejm zzejmVar = new zzejm(zzejbVar.zzb, zzejbVar.zza);
            zzfqw zzfqwVarA4 = R0.a(context, 10);
            final zzfpp zzfppVarZzi3 = zzfqiVarZze.zza(zzfqc.HTTP, zzhcy.zza(zzejmVar)).zzb(zzejnVar).zzb(zzfrf.zzc(zzfqwVarA4)).zzb(zzejkVar).zzi();
            zzfrf.zzd(zzfppVarZzi3, zzfrgVarZzf, zzfqwVarA4);
            final ListenableFuture listenableFutureZza = zzhcy.zza(zzejbVar);
            zzfrf.zzb(zzfppVarZzi3, zzfqwVarA2);
            zzfppVarZzi = zzfqiVarZze.zzb(zzfqc.PRE_PROCESS, zzfppVarZzi3, listenableFutureZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeit
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzejj zzejjVar = (zzejj) zzfppVarZzi3.get();
                    ListenableFuture listenableFuture = listenableFutureZza;
                    return new zzejd(zzejjVar, ((zzejb) listenableFuture.get()).zzb, ((zzejb) listenableFuture.get()).zza);
                }
            }).zzc(zzbuqVarZza).zzi();
        }
        zzfrf.zzd(zzfppVarZzi, zzfrgVarZzf, zzfqwVarA2);
        return zzfppVarZzi;
    }

    public final ListenableFuture zzb(final zzcbv zzcbvVar, int i10) {
        if (!((Boolean) zzblo.zza.zze()).booleanValue()) {
            return zzhcy.zzc(new Exception("Split request is disabled."));
        }
        zzfns zzfnsVar = zzcbvVar.zzi;
        if (zzfnsVar == null) {
            return zzhcy.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfnsVar.zzc == 0 || zzfnsVar.zzd == 0) {
            return zzhcy.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbva zzbvaVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfek zzfekVarZzy = this.zzd.zzy(zzcbvVar, i10);
        zzfqi zzfqiVarZze = zzfekVarZzy.zze();
        final ListenableFuture listenableFutureZzl = zzl(zzcbvVar, zzfqiVarZze, zzfekVarZzy);
        zzfrg zzfrgVarZzf = zzfekVarZzy.zzf();
        final zzfqw zzfqwVarA = R0.a(context, 9);
        final ListenableFuture listenableFutureZzm = zzm(listenableFutureZzl, zzfqiVarZze, zzbvaVarZza, zzfrgVarZzf, zzfqwVarA);
        return zzfqiVarZze.zzb(zzfqc.GET_URL_AND_CACHE_KEY, listenableFutureZzl, listenableFutureZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(listenableFutureZzm, listenableFutureZzl, zzcbvVar, zzfqwVarA);
            }
        }).zzi();
    }

    public final ListenableFuture zzc(String str) {
        if (((Boolean) zzblo.zza.zze()).booleanValue()) {
            return zzq(str) == null ? zzhcy.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzhcy.zza(new zzeiq(this));
        }
        return zzhcy.zzc(new Exception("Split request is disabled."));
    }

    public final ListenableFuture zzd(final zzcbv zzcbvVar, int i10) {
        zzbur zzburVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbva zzbvaVarZza = zzburVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzblu.zza.zze()).booleanValue()) {
            return zzhcy.zzc(new Exception("Signal collection disabled."));
        }
        zzfek zzfekVarZzy = this.zzd.zzy(zzcbvVar, i10);
        final zzfdl zzfdlVarZzd = zzfekVarZzy.zzd();
        zzbuq zzbuqVarZza = zzbvaVarZza.zza("google.afma.request.getSignals", zzbux.zza, zzbux.zzb);
        zzfqw zzfqwVarA = R0.a(context, 22);
        zzfqi zzfqiVarZze = zzfekVarZzy.zze();
        zzfqc zzfqcVar = zzfqc.GET_SIGNALS;
        Bundle bundle = zzcbvVar.zza;
        zzfpp zzfppVarZzi = zzfqiVarZze.zza(zzfqcVar, zzhcy.zza(bundle)).zzb(zzfrf.zzc(zzfqwVarA)).zzc(new zzhcg() { // from class: com.google.android.gms.internal.ads.zzeix
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) throws JSONException {
                return zzfdlVarZzd.zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcbvVar.zzm);
            }
        }).zzj(zzfqc.JS_SIGNALS).zzc(zzbuqVarZza).zzi();
        zzfrg zzfrgVarZzf = zzfekVarZzy.zzf();
        zzfrgVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzfrgVarZzf.zzd(bundle.getBundle("extras"));
        zzfrf.zze(zzfppVarZzi, zzfrgVarZzf, zzfqwVarA);
        if (((Boolean) zzblh.zzj.zze()).booleanValue()) {
            final zzejo zzejoVar = this.zzc;
            Objects.requireNonNull(zzejoVar);
            zzfppVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeje
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzejoVar.zza();
                }
            }, this.zzb);
        }
        return zzfppVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zze(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzcbvVar.zzm) != null) {
            bundle.putLong(zzdzs.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZza = zza(zzcbvVar, Binder.getCallingUid());
        zzn(listenableFutureZza, zzcbmVar, zzcbvVar);
        if (((Boolean) zzblh.zzi.zze()).booleanValue()) {
            final zzejo zzejoVar = this.zzc;
            Objects.requireNonNull(zzejoVar);
            listenableFutureZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzejoVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzf(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzcbvVar.zzm) != null) {
            bundle.putLong(zzdzs.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzn(zzd(zzcbvVar, Binder.getCallingUid()), zzcbmVar, zzcbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzg(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        zzn(zzb(zzcbvVar, Binder.getCallingUid()), zzcbmVar, zzcbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzh(String str, zzcbm zzcbmVar) {
        zzn(zzc(str), zzcbmVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpR)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpS);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzf = zzguz.zza(zzgty.zzd(',')).zzf(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzf) {
                Context context = this.zza;
                zzejk zzejkVar = new zzejk(context, str, this.zzh, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                try {
                    zzejj zzejjVarZzb = zzejkVar.zza(new zzeji(str3, 30000, map, new byte[0], "", false));
                    if (zzejjVarZzb.zza != 200) {
                        int i10 = zzejjVarZzb.zza;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
                        sb2.append("Unexpected preconnect response: ");
                        sb2.append(i10);
                        throw new RemoteException(sb2.toString());
                    }
                } catch (Exception e10) {
                    throw new RemoteException(e10.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzj(zzcbe zzcbeVar, zzcbn zzcbnVar) {
        if (((Boolean) zzblw.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzcbeVar.zza;
            zzhcy.zzr(zzhcy.zza(null), new zzeip(this, zzcbnVar, zzcbeVar), zzcgj.zzh);
        } else {
            try {
                zzcbnVar.zze("", zzcbeVar);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ InputStream zzk(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzcbv zzcbvVar, zzfqw zzfqwVar) {
        String strZzi = ((zzcbx) listenableFuture.get()).zzi();
        zzp(new zzejb((zzcbx) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzcbvVar.zzh, strZzi, zzfqwVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}
