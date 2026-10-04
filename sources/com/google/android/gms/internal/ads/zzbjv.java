package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbjv {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbjv(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbjs zzf() {
        return new zzbjs(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(@Nullable zzbjv zzbjvVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbjs zzbjsVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbjs(j10, strArr[0], zzbjsVar));
        }
        return true;
    }

    public final zzbju zzc() {
        zzbju zzbjuVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                List<zzbjs> list = this.zza;
                for (zzbjs zzbjsVar : list) {
                    long jZza = zzbjsVar.zza();
                    String strZzb = zzbjsVar.zzb();
                    zzbjs zzbjsVarZzc = zzbjsVar.zzc();
                    if (zzbjsVarZzc != null && jZza > 0) {
                        long jZza2 = jZza - zzbjsVarZzc.zza();
                        sb2.append(strZzb);
                        sb2.append('.');
                        sb2.append(jZza2);
                        sb2.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbjsVarZzc.zza()))) {
                                StringBuilder sb3 = (StringBuilder) map.get(Long.valueOf(zzbjsVarZzc.zza()));
                                sb3.append(SignatureVisitor.EXTENDS);
                                sb3.append(strZzb);
                            } else {
                                map.put(Long.valueOf(zzbjsVarZzc.zza()), new StringBuilder(strZzb));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb2.append((String) null);
                } else if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
                StringBuilder sb4 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb4.append((CharSequence) entry.getValue());
                        sb4.append('.');
                        sb4.append((((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()) + com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                        sb4.append(',');
                    }
                    if (sb4.length() > 0) {
                        sb4.setLength(sb4.length() - 1);
                    }
                    string = sb4.toString();
                }
                zzbjuVar = new zzbju(sb2.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbjuVar;
    }

    public final void zzd(String str, String str2) {
        zzbjl zzbjlVarZza;
        if (TextUtils.isEmpty(str2) || (zzbjlVarZza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbjr zzbjrVarZzd = zzbjlVarZza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzbjrVarZzd.zza((String) map.get(str), str2));
        }
    }

    @e.f0
    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
