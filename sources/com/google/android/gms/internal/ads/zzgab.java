package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.prism.hider.negativescreen.MinusOneScreenSearchContainerView;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgab {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzgac zzc;
    private final zzfyi zzd;
    private final zzfyd zze;
    private final boolean zzf;

    @Nullable
    private zzfzq zzg;
    private final Object zzh = new Object();

    public zzgab(@NonNull Context context, @NonNull zzgac zzgacVar, @NonNull zzfyi zzfyiVar, @NonNull zzfyd zzfydVar, boolean z10) {
        this.zzb = context;
        this.zzc = zzgacVar;
        this.zzd = zzfyiVar;
        this.zze = zzfydVar;
        this.zzf = z10;
    }

    private final synchronized Class zzd(@NonNull zzfzr zzfzrVar) throws zzgaa {
        try {
            if (zzfzrVar.zza() == null) {
                throw new zzgaa(4010, "mc");
            }
            String strZza = zzfzrVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfzrVar.zzb())) {
                    throw new zzgaa(MinusOneScreenSearchContainerView.a.f167774a, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzfzrVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfzrVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    throw new zzgaa(2008, e);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    throw new zzgaa(2008, e);
                } catch (SecurityException e12) {
                    e = e12;
                    throw new zzgaa(2008, e);
                }
            } catch (GeneralSecurityException e13) {
                throw new zzgaa(MinusOneScreenSearchContainerView.a.f167774a, e13);
            }
        } finally {
        }
    }

    public final boolean zza(@NonNull zzfzr zzfzrVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfzq zzfzqVar = new zzfzq(zzd(zzfzrVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfzrVar.zzd(), null, new Bundle(), 2), zzfzrVar, this.zzc, this.zzd, this.zzf);
                if (!zzfzqVar.zzf()) {
                    throw new zzgaa(4000, "init failed");
                }
                int iZzh = zzfzqVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb2.append("ci: ");
                    sb2.append(iZzh);
                    throw new zzgaa(4001, sb2.toString());
                }
                synchronized (this.zzh) {
                    zzfzq zzfzqVar2 = this.zzg;
                    if (zzfzqVar2 != null) {
                        try {
                            zzfzqVar2.zzg();
                        } catch (zzgaa e10) {
                            this.zzd.zzc(e10.zza(), -1L, e10);
                        }
                        this.zzg = zzfzqVar;
                    } else {
                        this.zzg = zzfzqVar;
                    }
                }
                this.zzd.zzb(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new zzgaa(2004, e11);
            }
        } catch (zzgaa e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }

    @Nullable
    public final zzfyl zzb() {
        zzfzq zzfzqVar;
        synchronized (this.zzh) {
            zzfzqVar = this.zzg;
        }
        return zzfzqVar;
    }

    @Nullable
    public final zzfzr zzc() {
        synchronized (this.zzh) {
            try {
                zzfzq zzfzqVar = this.zzg;
                if (zzfzqVar == null) {
                    return null;
                }
                return zzfzqVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
