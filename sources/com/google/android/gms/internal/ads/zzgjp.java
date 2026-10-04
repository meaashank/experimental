package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgjp extends zzgka {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzgjp(zzaya zzayaVar, zzgiw zzgiwVar, zzgrh zzgrhVar) {
        super("50+sX4d44jerXZ0t37Z07Ss5Y2LVKA0u1WWlTsyrM+njWBpcjf8xU2ZOd5yoshWp", "IaakTOOFGOw3T0IOJ/LBUMRFnsvXDEiR+LxXdy42JcU=", zzayaVar, zzgiwVar, zzgrhVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l10 = (Long) method.invoke("", null);
                        if (l10 == null) {
                            throw null;
                        }
                        zza = l10;
                    }
                } finally {
                }
            }
        }
        synchronized (zzayaVar) {
            try {
                if (zza != null) {
                    zzayaVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}
