package com.google.firebase.sessions;

import android.util.Log;
import ed.q;
import kotlin.C4885d0;
import kotlin.L0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Vc.d(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends SuspendLambda implements q<kotlinx.coroutines.flow.f<? super androidx.datastore.preferences.core.a>, Throwable, kotlin.coroutines.e<? super L0>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SessionDatastoreImpl$firebaseSessionDataFlow$1(kotlin.coroutines.e<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> eVar) {
        super(3, eVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 == 0) {
            C4885d0.n(obj);
            kotlinx.coroutines.flow.f fVar = (kotlinx.coroutines.flow.f) this.L$0;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.L$1);
            androidx.datastore.preferences.core.a aVarB = androidx.datastore.preferences.core.b.b();
            this.L$0 = null;
            this.label = 1;
            if (fVar.emit(aVarB, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4885d0.n(obj);
        }
        return L0.f217464a;
    }

    @Override // ed.q
    @Nullable
    public final Object invoke(@NotNull kotlinx.coroutines.flow.f<? super androidx.datastore.preferences.core.a> fVar, @NotNull Throwable th, @Nullable kotlin.coroutines.e<? super L0> eVar) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(eVar);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = fVar;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(L0.f217464a);
    }
}
