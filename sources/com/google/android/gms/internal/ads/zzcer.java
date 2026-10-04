package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.C1598m0;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzcer {
    private zzeaj zze;
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();

    @Nullable
    private String zzd = null;

    @e.f0
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zzf = new AtomicInteger(-1);
    private final AtomicReference zzg = new AtomicReference(null);
    private final AtomicReference zzh = new AtomicReference(null);
    private final ConcurrentMap zzi = new ConcurrentHashMap(9);
    private final Object zzj = new Object();

    public static final Bundle zzr(@Nullable Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    @e.f0
    public static final boolean zzs(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbc)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbd)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbe)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void zzt(Context context, String str, String str2, @Nullable Bundle bundle) {
        if (zzb(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                String strValueOf = String.valueOf(str2);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid event ID: ".concat(strValueOf), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                ConcurrentMap concurrentMap = this.zzi;
                Method declaredMethod = (Method) concurrentMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        zzx("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzg.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzx("logEventInternal", true);
                }
            }
        }
    }

    @Nullable
    private final Method zzu(Context context, String str) {
        ConcurrentMap concurrentMap = this.zzi;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzx(str, false);
            return null;
        }
    }

    private final void zzv(Context context, String str, String str2) {
        if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            ConcurrentMap concurrentMap = this.zzi;
            Method declaredMethod = (Method) concurrentMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    zzx(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), str);
                StringBuilder sb2 = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb2.append("Invoke Firebase method ");
                sb2.append(str2);
                sb2.append(", Ad Unit Id: ");
                sb2.append(str);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            } catch (Exception unused2) {
                zzx(str2, false);
            }
        }
    }

    @Nullable
    private final Object zzw(String str, Context context) {
        AtomicReference atomicReference = this.zzg;
        if (!zzy(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzu(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            zzx(str, true);
            return null;
        }
    }

    private final void zzx(String str, boolean z10) {
        AtomicBoolean atomicBoolean = this.zza;
        if (atomicBoolean.get()) {
            return;
        }
        String strA = androidx.compose.animation.core.E0.a(new StringBuilder(str.length() + 30), "Invoke Firebase method ", str, " error.");
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strA);
        if (z10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
        if (this.zze != null) {
            if (this.zzh.get() == null && this.zzg.get() == null) {
                return;
            }
            zzeai zzeaiVarZza = this.zze.zza();
            zzeaiVarZza.zzc("action", "ga_log_event_error");
            zzeaiVarZza.zzc("method_name", str);
            zzeaiVarZza.zzd();
        }
    }

    private final boolean zzy(Context context, String str, AtomicReference atomicReference, boolean z10) {
        if (atomicReference.get() == null) {
            try {
                C1598m0.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzx("getInstance", z10);
                return false;
            }
        }
        return true;
    }

    public final void zza(zzeaj zzeajVar) {
        this.zze = zzeajVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(android.content.Context r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbix r0 = com.google.android.gms.internal.ads.zzbjg.zzaU
            com.google.android.gms.internal.ads.zzbje r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L63
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.zza
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L63
        L1c:
            com.google.android.gms.internal.ads.zzbix r0 = com.google.android.gms.internal.ads.zzbjg.zzbf
            com.google.android.gms.internal.ads.zzbje r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r2.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.zzf
            int r3 = r0.get()
            r4 = -1
            if (r3 != r4) goto L5c
            com.google.android.gms.ads.internal.client.zzay.zza()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r3 = com.google.android.gms.ads.internal.util.client.zzf.zzz(r6, r3)
            if (r3 != 0) goto L59
            com.google.android.gms.ads.internal.client.zzay.zza()
            boolean r6 = com.google.android.gms.ads.internal.util.client.zzf.zzA(r6)
            if (r6 == 0) goto L59
            int r6 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r6 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.ads.internal.util.client.zzo.zzi(r6)
            r0.set(r1)
            goto L5c
        L59:
            r0.set(r2)
        L5c:
            int r6 = r0.get()
            if (r6 != r2) goto L63
            return r2
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcer.zzb(android.content.Context):boolean");
    }

    public final void zzc(Context context, com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        zzces.zzb(context).zza().zzc(zzfrVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbh)).booleanValue() && zzb(context) && zzs(context)) {
            synchronized (this.zzj) {
            }
        }
    }

    public final void zzd(Context context, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbh)).booleanValue() && zzb(context) && zzs(context)) {
            synchronized (this.zzj) {
            }
        }
    }

    public final void zze(Context context, String str) {
        if (zzb(context)) {
            zzv(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzf(Context context, String str) {
        if (zzb(context)) {
            zzv(context, str, "endAdUnitExposure");
        }
    }

    public final String zzg(Context context) {
        if (zzb(context)) {
            AtomicReference atomicReference = this.zzg;
            if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) zzu(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str == null) {
                        str = (String) zzu(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    zzx("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    @Deprecated
    public final void zzh(Context context, String str) {
        if (zzb(context) && (context instanceof Activity) && zzy(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzh, false)) {
            ConcurrentMap concurrentMap = this.zzi;
            Method declaredMethod = (Method) concurrentMap.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    zzx("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzh.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzx("setCurrentScreen", false);
            }
        }
    }

    @Nullable
    public final String zzi(Context context) {
        if (!zzb(context)) {
            return null;
        }
        synchronized (this.zzc) {
            try {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                String str2 = (String) zzw("getGmpAppId", context);
                this.zzd = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final String zzj(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!zzb(context)) {
            return null;
        }
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzba)).longValue();
        if (jLongValue < 0) {
            return (String) zzw("getAppInstanceId", context);
        }
        AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzgbo.zza().zzb(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbb)).intValue(), new zzcep(this), 2);
            } else {
                zzbix zzbixVar = zzbjg.zzbb;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzcep(this));
            }
            C1598m0.a(atomicReference, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzceq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzq(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    @Nullable
    public final String zzk(Context context) {
        Object objZzw;
        if (zzb(context) && (objZzw = zzw("generateEventId", context)) != null) {
            return objZzw.toString();
        }
        return null;
    }

    public final void zzl(Context context, @Nullable String str, @Nullable Map map) {
        zzt(context, "_ac", str, zzr(map));
    }

    public final void zzm(Context context, @Nullable String str, @Nullable Map map) {
        zzt(context, "_ai", str, zzr(map));
    }

    public final void zzn(Context context, String str) {
        zzt(context, "_aq", str, null);
    }

    public final void zzo(Context context, String str) {
        zzt(context, "_aa", str, null);
    }

    public final void zzp(Context context, @Nullable String str, String str2, String str3, int i10) {
        if (zzb(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            zzt(context, "_ar", str, bundle);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i10).length());
            sb2.append("Log a Firebase reward video event, reward type: ");
            sb2.append(str3);
            sb2.append(", reward value: ");
            sb2.append(i10);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
    }

    public final /* synthetic */ String zzq(Context context) {
        return (String) zzw("getAppInstanceId", context);
    }
}
