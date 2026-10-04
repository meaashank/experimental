package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuc extends zzifm implements zzigx {
    private static final zzhuc zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zzify zzb = zzifm.zzbM();

    static {
        zzhuc zzhucVar = new zzhuc();
        zzc = zzhucVar;
        zzifm.zzbu(zzhuc.class, zzhucVar);
    }

    private zzhuc() {
    }

    public static zzhuc zze(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzhuc) zzifm.zzbV(zzc, bArr, zziewVar);
    }

    public static zzhuc zzg(InputStream inputStream, zziew zziewVar) throws IOException {
        return (zzhuc) zzifm.zzbX(zzc, inputStream, zziewVar);
    }

    public static zzhtz zzh() {
        return (zzhtz) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhub zzd(int i10) {
        return (zzhub) this.zzb.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        zzihe zzifhVar;
        int iOrdinal = zziflVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzifm.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhub.class});
        }
        if (iOrdinal == 3) {
            return new zzhuc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhtz(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar != null) {
            return zziheVar;
        }
        synchronized (zzhuc.class) {
            try {
                zzifhVar = zzd;
                if (zzifhVar == null) {
                    zzifhVar = new zzifh(zzc);
                    zzd = zzifhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzifhVar;
    }

    public final /* synthetic */ void zzi(int i10) {
        this.zza = i10;
    }

    public final /* synthetic */ void zzj(zzhub zzhubVar) {
        zzhubVar.getClass();
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            this.zzb = zzifm.zzbN(zzifyVar);
        }
        this.zzb.add(zzhubVar);
    }
}
