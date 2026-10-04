package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgjx extends zzgka {
    private static final Long zza = -1L;
    private final zzgff zzb;
    private final Context zzc;
    private final Map zzd;

    public zzgjx(zzaya zzayaVar, zzgiw zzgiwVar, zzgff zzgffVar, Context context, Map map, zzgrh zzgrhVar) {
        super("VfejF6jLqZSis5lDsrO62jUDAXJqP6cPz4mgjtZND5tZ2P5VWHtedQvP3pauMLAi", "2mDHoFGLT7ybGaRwjjkTGPAVzRPlkIteOrAkiSTAkLw=", zzayaVar, zzgiwVar, zzgrhVar.zza(121));
        this.zzb = zzgffVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        zzgff zzgffVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzgffVar.ordinal()), this.zzc, zzguh.zza(this.zzd.get("up"), Boolean.TRUE));
        objArr.getClass();
        synchronized (zzayaVar) {
            try {
                if (zzgffVar == zzgff.QUERY) {
                    Object obj = objArr[0];
                    Long l10 = zza;
                    zzayaVar.zzq(((Long) zzguh.zza(obj, l10)).longValue());
                    zzayaVar.zzr(((Long) zzguh.zza(objArr[1], l10)).longValue());
                }
                zzayaVar.zzg(((Long) objArr[2]).longValue());
                zzayaVar.zzQ(((Long) objArr[3]).longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
