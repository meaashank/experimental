package com.google.android.gms.internal.ads;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.C5092j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgtp {
    @NotNull
    public static final kotlinx.coroutines.S zza(@NotNull kotlinx.coroutines.L l10, @NotNull zzgtm coroutineSequence, @NotNull ed.p block) {
        kotlin.jvm.internal.G.p(l10, "<this>");
        kotlin.jvm.internal.G.p(coroutineSequence, "coroutineSequence");
        kotlin.jvm.internal.G.p(block, "block");
        return C5092j.b(l10, null, CoroutineStart.UNDISPATCHED, new zzgto(coroutineSequence, block, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zzd(kotlinx.coroutines.sync.a aVar, kotlin.coroutines.e eVar) {
        Object objH = aVar.h(null, eVar);
        return objH == CoroutineSingletons.COROUTINE_SUSPENDED ? objH : kotlin.L0.f217464a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zze(kotlinx.coroutines.sync.a aVar, kotlin.coroutines.e eVar) {
        Object objJ = IntrinsicsKt__IntrinsicsJvmKt.j(zzgtn.zza, aVar, eVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objJ != coroutineSingletons) {
            IntrinsicsKt__IntrinsicsJvmKt.e(eVar).resumeWith(kotlin.L0.f217464a);
        }
        Vc.f.c(eVar);
        return coroutineSingletons;
    }
}
