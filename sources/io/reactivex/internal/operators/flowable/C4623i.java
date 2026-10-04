package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4623i {
    public static void a(AtomicThrowable atomicThrowable, AtomicThrowable atomicThrowable2, Subscriber subscriber) {
        atomicThrowable.getClass();
        subscriber.onError(ExceptionHelper.c(atomicThrowable2));
    }
}
