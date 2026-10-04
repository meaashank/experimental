package com.google.android.gms.internal.ads;

import kotlin.C4885d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
final class zzgcq extends SuspendLambda implements ed.p {
    public zzgcq(kotlin.coroutines.e eVar) {
        super(2, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e create(Object obj, kotlin.coroutines.e eVar) {
        return new zzgcq(eVar);
    }

    @Override // ed.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgcq) create((zzgca) obj, (kotlin.coroutines.e) obj2)).invokeSuspend(kotlin.L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C4885d0.n(obj);
        zzgca zzgcaVarZzd = zzgca.zzd();
        kotlin.jvm.internal.G.o(zzgcaVarZzd, "getDefaultInstance(...)");
        return zzgcaVarZzd;
    }
}
