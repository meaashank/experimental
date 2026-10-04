package com.google.android.gms.internal.ads;

import androidx.compose.foundation.layout.C1713x0;
import com.google.android.gms.internal.ads.zzhbr;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhbs<V> extends zzhea implements ListenableFuture<V> {
    private static final zza zzbt;
    static final Object zze = new Object();
    static final zzhdg zzf = new zzhdg(zzhbr.class);
    static final boolean zzg;
    volatile zzhbr.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        public /* synthetic */ zza(byte[] bArr) {
        }

        public abstract void zza(zze zzeVar, Thread thread);

        public abstract void zzb(zze zzeVar, zze zzeVar2);

        public abstract boolean zzc(zzhbs zzhbsVar, zze zzeVar, zze zzeVar2);

        public abstract boolean zzd(zzhbs zzhbsVar, zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2);

        public abstract zze zze(zzhbs zzhbsVar, zze zzeVar);

        public abstract zzhbr.zzd zzf(zzhbs zzhbsVar, zzhbr.zzd zzdVar);

        public abstract boolean zzg(zzhbs zzhbsVar, Object obj, Object obj2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzhbs<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzhbs.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzhbs<?>, zzhbr.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzhbs.class, zzhbr.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzhbs<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzhbs.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzc(zzhbs zzhbsVar, zze zzeVar, zze zzeVar2) {
            return androidx.concurrent.futures.c.a(zzc, zzhbsVar, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzd(zzhbs zzhbsVar, zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2) {
            return androidx.concurrent.futures.c.a(zzd, zzhbsVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final zze zze(zzhbs zzhbsVar, zze zzeVar) {
            return zzc.getAndSet(zzhbsVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final zzhbr.zzd zzf(zzhbs zzhbsVar, zzhbr.zzd zzdVar) {
            return zzd.getAndSet(zzhbsVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzg(zzhbs zzhbsVar, Object obj, Object obj2) {
            return androidx.concurrent.futures.c.a(zze, zzhbsVar, obj, obj2);
        }

        public /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzc(zzhbs zzhbsVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzhbsVar) {
                try {
                    if (zzhbsVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzhbsVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzd(zzhbs zzhbsVar, zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2) {
            synchronized (zzhbsVar) {
                try {
                    if (zzhbsVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzhbsVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final zze zze(zzhbs zzhbsVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzhbsVar) {
                try {
                    zzeVar2 = zzhbsVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzhbsVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final zzhbr.zzd zzf(zzhbs zzhbsVar, zzhbr.zzd zzdVar) {
            zzhbr.zzd zzdVar2;
            synchronized (zzhbsVar) {
                try {
                    zzdVar2 = zzhbsVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzhbsVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzg(zzhbs zzhbsVar, Object obj, Object obj2) {
            synchronized (zzhbsVar) {
                try {
                    if (zzhbsVar.valueField != obj) {
                        return false;
                    }
                    zzhbsVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafeZzi;
            try {
                try {
                    try {
                        unsafeZzi = Unsafe.getUnsafe();
                    } catch (SecurityException unused) {
                        unsafeZzi = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, zzhbt.zza);
                    }
                } catch (Exception unused2) {
                    unsafeZzi = zzi();
                    Unsafe unsafe = unsafeZzi;
                }
                try {
                    zzc = unsafeZzi.objectFieldOffset(zzhbs.class.getDeclaredField("waitersField"));
                    zzb = unsafeZzi.objectFieldOffset(zzhbs.class.getDeclaredField("listenersField"));
                    zzd = unsafeZzi.objectFieldOffset(zzhbs.class.getDeclaredField("valueField"));
                    zze = unsafeZzi.objectFieldOffset(zze.class.getDeclaredField("thread"));
                    zzf = unsafeZzi.objectFieldOffset(zze.class.getDeclaredField("next"));
                    zza = unsafeZzi;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Exception e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11);
            }
        }

        private zzd() {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe zzi() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzc(zzhbs zzhbsVar, zze zzeVar, zze zzeVar2) {
            return Z0.a(zza, zzhbsVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzd(zzhbs zzhbsVar, zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2) {
            return Z0.a(zza, zzhbsVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final zze zze(zzhbs zzhbsVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzhbsVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzhbsVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final zzhbr.zzd zzf(zzhbs zzhbsVar, zzhbr.zzd zzdVar) {
            zzhbr.zzd zzdVar2;
            do {
                zzdVar2 = zzhbsVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzhbsVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhbs.zza
        public final boolean zzg(zzhbs zzhbsVar, Object obj, Object obj2) {
            return Z0.a(zza, zzhbsVar, zzd, obj, obj2);
        }

        public /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z10) {
        }

        public zze() {
            zzhbs.zzv(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        zzg = z10;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e10) {
                try {
                    zzcVar = new zzb(bArr);
                    th = null;
                    th2 = e10;
                } catch (Error | Exception e11) {
                    th = e11;
                    th2 = e10;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th = null;
        th2 = null;
        zzbt = zzcVar;
        if (th != null) {
            zzhdg zzhdgVar = zzf;
            Logger loggerZza = zzhdgVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzhdgVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbt.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static boolean zzr(zzhbs zzhbsVar, Object obj, Object obj2) {
        return zzbt.zzg(zzhbsVar, obj, obj2);
    }

    public static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbt.zza(zzeVar, thread);
    }

    public final boolean zzp(zzhbr.zzd zzdVar, zzhbr.zzd zzdVar2) {
        return zzbt.zzd(this, zzdVar, zzdVar2);
    }

    public final zzhbr.zzd zzq(zzhbr.zzd zzdVar) {
        return zzbt.zzf(this, zzdVar);
    }

    public final void zzs() {
        for (zze zzeVarZze = zzbt.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final Object zzt(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzhbr.zzh(obj)) {
            return zzhbr.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbt;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzhbr.zzh(obj2)) {
                                return zzhbr.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzhbr.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzhbr.zzh(obj4)) {
                return zzhbr.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 8 + String.valueOf(lowerCase2).length());
        C1713x0.a(sb2, "Waited ", j10, C4.q.f17581a);
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j11 = -nanos;
            long jConvert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                C1713x0.a(sb3, strConcat, jConvert, C4.q.f17581a);
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z10) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(C4.q.f17581a);
            }
            if (z10) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb4.append(strConcat);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(androidx.compose.animation.core.E0.a(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
    }

    public final Object zzu() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzhbr.zzh(obj2)) {
            return zzhbr.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbt;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzhbr.zzh(obj)));
                    return zzhbr.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzhbr.zzg(obj3);
    }
}
