package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzun {
    public final int zza;

    @Nullable
    public final zzxo zzb;
    private final CopyOnWriteArrayList zzc;

    private zzun(CopyOnWriteArrayList copyOnWriteArrayList, int i10, @Nullable zzxo zzxoVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxoVar;
    }

    @CheckResult
    public final zzun zza(int i10, @Nullable zzxo zzxoVar) {
        return new zzun(this.zzc, 0, zzxoVar);
    }

    public final void zzb(Handler handler, zzuo zzuoVar) {
        this.zzc.add(new zzum(handler, zzuoVar));
    }

    public final void zzc(zzuo zzuoVar) {
        CopyOnWriteArrayList<zzum> copyOnWriteArrayList = this.zzc;
        for (zzum zzumVar : copyOnWriteArrayList) {
            if (zzumVar.zza == zzuoVar) {
                copyOnWriteArrayList.remove(zzumVar);
            }
        }
    }

    public zzun() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
