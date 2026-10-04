package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbr;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhce extends zzhbr.zzf {
    private static final zzhcb zzbr;
    private static final zzhdg zzbs = new zzhdg(zzhce.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzhcb zzhcdVar;
        byte[] bArr = null;
        try {
            zzhcdVar = new zzhcc(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzhcdVar = new zzhcd(bArr);
        }
        zzbr = zzhcdVar;
        if (th != null) {
            zzbs.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzhce(int i10) {
        this.remainingField = i10;
    }

    public final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbr.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final int zzC() {
        return zzbr.zzb(this);
    }

    public abstract void zzf(Set set);
}
