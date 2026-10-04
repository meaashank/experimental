package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgkb extends zzgka {
    private final Map zza;
    private final zzgff zzb;

    public zzgkb(zzaya zzayaVar, zzgiw zzgiwVar, zzgff zzgffVar, Map map, zzgrh zzgrhVar) {
        super("FRbH3YSkWLoeHfFsbLmVPzOa63aS7qRNcxlL25CUBAPaDEl/9m5xoZHvOSUnXb3F", "n3MzKzWgNLpU97/XE2w+GCw7DhFJXqnLmao7nSZ1jSU=", zzayaVar, zzgiwVar, zzgrhVar.zza(122));
        this.zza = map;
        this.zzb = zzgffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Long[] lArr = new Long[9];
        Arrays.fill((Object[]) lArr, (Object) (-1L));
        Map map = this.zza;
        lArr[0] = (Long) zzguh.zza((Long) map.get("tcq"), -1L);
        lArr[1] = (Long) zzguh.zza((Long) map.get("tpq"), -1L);
        lArr[2] = (Long) zzguh.zza((Long) map.get("tcv"), -1L);
        lArr[3] = (Long) zzguh.zza((Long) map.get("tpv"), -1L);
        lArr[4] = (Long) zzguh.zza((Long) map.get("tchv"), -1L);
        lArr[5] = (Long) zzguh.zza((Long) map.get("tphv"), -1L);
        lArr[6] = (Long) zzguh.zza((Long) map.get("tcc"), -1L);
        lArr[7] = (Long) zzguh.zza((Long) map.get("tpc"), -1L);
        lArr[8] = (Long) zzguh.zza((Long) map.get("tst"), -1L);
        for (int i10 = 0; i10 < 9; i10++) {
            if (lArr[i10] == null) {
                lArr[i10] = -1L;
            }
        }
        Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(this.zzb.ordinal()));
        lArr2.getClass();
        synchronized (zzayaVar) {
            zzayaVar.zzac(lArr2[0].longValue());
            zzayaVar.zzs(lArr2[1].longValue());
            zzayaVar.zzn(lArr2[2].longValue());
            zzayaVar.zzk(lArr2[3].longValue());
            zzayaVar.zzY(lArr2[4].longValue());
            zzayaVar.zzZ(lArr2[5].longValue());
            zzayaVar.zzF(lArr2[6].longValue());
            zzayaVar.zzG(lArr2[7].longValue());
        }
    }
}
