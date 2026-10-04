package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbax {

    @e.f0
    protected volatile Boolean zzb;
    private final zzbcg zzc;
    private static final ConditionVariable zzd = new ConditionVariable();

    @e.f0
    protected static volatile zzgae zza = null;
    private static volatile Random zze = null;

    public zzbax(zzbcg zzbcgVar) {
        this.zzc = zzbcgVar;
        zzbcgVar.zzd().execute(new zzbaw(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzbax.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzaxg zzaxgVarZza = zzaxk.zza();
            zzaxgVarZza.zza(this.zzc.zza.getPackageName());
            zzaxgVarZza.zzb(j10);
            if (str != null) {
                zzaxgVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzaxgVarZza.zzc(stringWriter.toString());
                zzaxgVarZza.zzd(exc.getClass().getName());
            }
            zzgad zzgadVarZza = zza.zza(((zzaxk) zzaxgVarZza.zzbu()).zzaN());
            zzgadVarZza.zzc(i10);
            if (i11 != -1) {
                zzgadVarZza.zzb(i11);
            }
            zzgadVarZza.zza();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ zzbcg zzb() {
        return this.zzc;
    }
}
