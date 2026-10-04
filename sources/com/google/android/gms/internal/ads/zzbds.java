package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbds {
    private final zzbcg zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzbds(zzbcg zzbcgVar, String str, String str2, Class... clsArr) {
        this.zza = zzbcgVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzbcgVar.zzd().submit(new zzbdr(this));
    }

    private final String zzc(byte[] bArr, String str) throws UnsupportedEncodingException, zzbbk {
        return new String(this.zza.zzf().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final /* synthetic */ void zzb() {
        try {
            zzbcg zzbcgVar = this.zza;
            Class<?> clsLoadClass = zzbcgVar.zze().loadClass(zzc(zzbcgVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzbcgVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzbbk | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.zzf.countDown();
            throw th;
        }
        this.zzf.countDown();
    }
}
