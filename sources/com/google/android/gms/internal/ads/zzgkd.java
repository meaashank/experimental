package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgkd extends zzgka {
    private final Map zza;
    private final zzgiw zzb;
    private final DisplayMetrics zzc;

    public zzgkd(zzaya zzayaVar, zzgiw zzgiwVar, Map map, DisplayMetrics displayMetrics, zzgrh zzgrhVar) {
        super("yEN9KgeW2ShR+kJNMVm4gRcjBaCiP+NkfaG+4w0YdiFdjOQUuGzxN01qjMkIt53T", "+ZwABUDFslQ7udw7VsU5AeCjEmTqogfLUUw0gHzd544=", zzayaVar, zzgiwVar, zzgrhVar.zza(123));
        this.zzb = zzgiwVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    public final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr;
        Map map = this.zza;
        Object obj = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr2 = (Object[]) method.invoke("", obj, displayMetrics);
        objArr2.getClass();
        zzayw zzaywVarZza = zzayx.zza();
        Object obj2 = objArr2[0];
        if (obj2 != null && objArr2[1] != null) {
            zzaywVarZza.zza(((Long) obj2).longValue());
            zzaywVarZza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj3 = objArr2[2];
        if (obj3 != null) {
            zzaywVarZza.zzh(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[3];
        if (obj4 != null) {
            zzaywVarZza.zzf(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[4];
        if (obj5 != null) {
            zzaywVarZza.zzc(((Long) obj5).longValue());
        }
        Object obj6 = objArr2[5];
        if (obj6 != null) {
            zzaywVarZza.zzs(((Long) obj6).longValue() != 0 ? 2 : 1);
        }
        Object obj7 = objArr2[6];
        if (obj7 != null) {
            zzaywVarZza.zzj(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[7];
        if (obj8 != null) {
            zzaywVarZza.zzi(((Long) obj8).longValue());
        }
        Object obj9 = objArr2[8];
        if (obj9 != null) {
            zzaywVarZza.zzt(((Long) obj9).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzayaVar) {
            try {
                Method methodZzc = this.zzb.zzc("ha9rMPg9+yg7CQJd8hulZYYnWyvcb9rIbXzM+WEcFYbGtaIOAjDJnYEoauGRuKjN", "nl2mD60ZrulhoIB3vhnGQRCpmcQlp+xDYCmCtO11lLQ=");
                if (methodZzc == null || (objArr = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics)) == null) {
                    throw null;
                }
                Object obj10 = objArr[0];
                if (obj10 != null) {
                    zzayaVar.zzh(((Long) obj10).longValue());
                }
                Object obj11 = objArr[1];
                if (obj11 != null) {
                    zzayaVar.zzi(((Long) obj11).longValue());
                }
                Object obj12 = objArr[2];
                if (obj12 != null) {
                    zzayaVar.zzj(((Long) obj12).longValue());
                }
                Object obj13 = objArr[3];
                if (obj13 != null) {
                    zzayaVar.zzv(((Long) obj13).longValue());
                }
                Object obj14 = objArr[4];
                if (obj14 != null) {
                    zzayaVar.zzw(((Long) obj14).longValue());
                }
                zzghq zzghqVar = (zzghq) map.get("oe");
                if (zzghqVar != null) {
                    long j10 = zzghqVar.zza;
                    if (j10 > 0) {
                        zzayaVar.zzz(j10);
                    }
                    long j11 = zzghqVar.zzb;
                    if (j11 > 0) {
                        zzayaVar.zzy(j11);
                    }
                    long j12 = zzghqVar.zzc;
                    if (j12 > 0) {
                        zzayaVar.zzx(j12);
                    }
                    long j13 = zzghqVar.zzd;
                    if (j13 > 0) {
                        zzayaVar.zzA(j13);
                    }
                }
                zzghq zzghqVar2 = (zzghq) map.get("oe");
                if (zzghqVar2 != null && zzghqVar2.zza != 0 && zzc(displayMetrics)) {
                    double d10 = zzghqVar2.zze;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    zzaywVarZza.zzl(zzb(d10, displayMetrics));
                    zzaywVarZza.zzm(zzb(zzghqVar2.zzh - zzghqVar2.zzf, displayMetrics));
                    zzaywVarZza.zzn(zzb(zzghqVar2.zzi - zzghqVar2.zzg, displayMetrics));
                    zzaywVarZza.zzq(zzb(zzghqVar2.zzf, displayMetrics));
                    zzaywVarZza.zzr(zzb(zzghqVar2.zzg, displayMetrics));
                    if (((MotionEvent) map.get("nv")) != null) {
                        long jZzb = zzb(((zzghqVar2.zzf - zzghqVar2.zzh) + r5.getRawX()) - r5.getX(), displayMetrics);
                        if (jZzb != 0) {
                            zzaywVarZza.zzo(jZzb);
                        }
                        long jZzb2 = zzb(((zzghqVar2.zzg - zzghqVar2.zzi) + r5.getRawY()) - r5.getY(), displayMetrics);
                        if (jZzb2 != 0) {
                            zzaywVarZza.zzp(jZzb2);
                        }
                    }
                }
                zzayaVar.zzJ(zzaywVarZza);
                zzghr[] zzghrVarArr = (zzghr[]) map.get("ro");
                if (zzghrVarArr != null && zzc(displayMetrics)) {
                    for (int i10 = 0; i10 <= zzghrVarArr.length - 2; i10++) {
                        zzghr zzghrVar = zzghrVarArr[i10];
                        zzayw zzaywVarZza2 = zzayx.zza();
                        double d11 = zzghrVar.zza;
                        if (displayMetrics == null) {
                            throw null;
                        }
                        zzaywVarZza2.zza(zzb(d11, displayMetrics));
                        zzaywVarZza2.zzb(zzb(zzghrVar.zzb, displayMetrics));
                        zzayaVar.zzK((zzayx) zzaywVarZza2.zzbu());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
