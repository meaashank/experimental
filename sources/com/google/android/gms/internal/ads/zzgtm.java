package com.google.android.gms.internal.ads;

import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgtm {

    @NotNull
    private final kotlinx.coroutines.sync.a zza = MutexKt.b(false, 1, null);

    @NotNull
    public final kotlinx.coroutines.sync.a zza() {
        return this.zza;
    }
}
