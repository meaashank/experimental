package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbsg implements zzatl {
    private volatile zzbrt zza;
    private final Context zzb;

    public zzbsg(Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatl
    @Nullable
    public final zzato zza(zzats zzatsVar) throws zzaub {
        Parcelable.Creator<zzbru> creator = zzbru.CREATOR;
        Map mapZzm = zzatsVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            strArr2[i10] = (String) entry.getValue();
            i10++;
        }
        zzbru zzbruVar = new zzbru(zzatsVar.zzh(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcgo zzcgoVar = new zzcgo();
            this.zza = new zzbrt(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbse(this, zzcgoVar), new zzbsf(this, zzcgoVar));
            this.zza.checkAvailabilityAndConnect();
            zzbsc zzbscVar = new zzbsc(this, zzbruVar);
            zzhdi zzhdiVar = zzcgj.zza;
            ListenableFuture listenableFutureZzi = zzhcy.zzi(zzhcy.zzj(zzcgoVar, zzbscVar, zzhdiVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfA)).intValue(), TimeUnit.MILLISECONDS, zzcgj.zzd);
            listenableFutureZzi.addListener(new zzbsd(this), zzhdiVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureZzi.get();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            zzbrw zzbrwVar = (zzbrw) new zzcbt(parcelFileDescriptor).zza(zzbrw.CREATOR);
            if (zzbrwVar == null) {
                return null;
            }
            if (zzbrwVar.zza) {
                throw new zzaub(zzbrwVar.zzb);
            }
            String[] strArr3 = zzbrwVar.zze;
            String[] strArr4 = zzbrwVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < strArr3.length; i11++) {
                map.put(strArr3[i11], strArr4[i11]);
            }
            return new zzato(zzbrwVar.zzc, zzbrwVar.zzd, map, zzbrwVar.zzg, zzbrwVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime3);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            return null;
        } catch (Throwable th) {
            long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb4.append("Http assets remote cache took ");
            sb4.append(jElapsedRealtime4);
            sb4.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
            throw th;
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final /* synthetic */ zzbrt zzc() {
        return this.zza;
    }
}
