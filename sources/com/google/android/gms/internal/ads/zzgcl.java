package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.C5103o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgcl {
    @NotNull
    public static final zzgcj zza(@NotNull final ExecutorService executorService) {
        kotlin.jvm.internal.G.p(executorService, "executorService");
        return new zzgcj() { // from class: com.google.android.gms.internal.ads.zzgck
            @Override // com.google.android.gms.internal.ads.zzgcj
            public final kotlinx.coroutines.L zza() {
                return kotlinx.coroutines.M.a(new C5103o0(executorService));
            }
        };
    }
}
