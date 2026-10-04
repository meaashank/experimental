package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzhca extends zzhce {
    private static final zzhdg zza = new zzhdg(zzhca.class);
    private zzgxi zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzhca(zzgxi zzgxiVar, boolean z10, boolean z11) {
        super(zzgxiVar.size());
        this.zzb = zzgxiVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i10, ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, listenableFuture);
            }
            zzz(null);
        } catch (Throwable th) {
            zzz(null);
            throw th;
        }
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i10, ListenableFuture listenableFuture) {
        try {
            zzw(i10, zzhdz.zza(listenableFuture));
        } catch (ExecutionException e10) {
            zzE(e10.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgxi zzgxiVar) {
        int iZzC = zzC();
        int i10 = 0;
        zzguk.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgxiVar != null) {
                zzhaa it = zzgxiVar.iterator();
                while (it.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) it.next();
                    if (!listenableFuture.isCancelled()) {
                        zzG(i10, listenableFuture);
                    }
                    i10++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public void zzA(int i10) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzc() {
        zzgxi zzgxiVar = this.zzb;
        zzA(1);
        if ((zzgxiVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzhaa it = zzgxiVar.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final String zzd() {
        zzgxi zzgxiVar = this.zzb;
        return zzgxiVar != null ? "futures=".concat(zzgxiVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzhaa it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i11 = i10 + 1;
                if (listenableFuture.isDone()) {
                    zzy(i10, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhbz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i10, listenableFuture);
                        }
                    }, zzhcn.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        zzgxi zzgxiVar = this.zzb;
        final zzgxi zzgxiVar2 = true != this.zzd ? null : zzgxiVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzhby
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgxiVar2);
            }
        };
        zzhaa it2 = zzgxiVar.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                zzz(zzgxiVar2);
            } else {
                listenableFuture2.addListener(runnable, zzhcn.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhce
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    public abstract void zzw(int i10, Object obj);

    public abstract void zzx();
}
