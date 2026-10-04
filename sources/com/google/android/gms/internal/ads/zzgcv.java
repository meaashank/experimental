package com.google.android.gms.internal.ads;

import kotlin.C4885d0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
final class zzgcv extends SuspendLambda implements ed.p {
    int zza;
    final /* synthetic */ zzgdh zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcv(zzgdh zzgdhVar, String str, kotlin.coroutines.e eVar) {
        super(2, eVar);
        this.zzb = zzgdhVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.e create(Object obj, kotlin.coroutines.e eVar) {
        return new zzgcv(this.zzb, this.zzc, eVar);
    }

    @Override // ed.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgcv) create((kotlinx.coroutines.L) obj, (kotlin.coroutines.e) obj2)).invokeSuspend(kotlin.L0.f217464a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.zza;
        C4885d0.n(obj);
        if (i10 == 0) {
            zzgdh zzgdhVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            if (zzgdhVar.zzt(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return kotlin.L0.f217464a;
    }
}
