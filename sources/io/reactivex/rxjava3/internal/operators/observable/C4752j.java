package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.observers.BlockingObserver;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4752j {
    public C4752j() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(zc.T<? extends T> o10) {
        io.reactivex.rxjava3.internal.util.d dVar = new io.reactivex.rxjava3.internal.util.d(1);
        Bc.g<Object> gVar = Functions.f207355d;
        LambdaObserver lambdaObserver = new LambdaObserver(gVar, dVar, dVar, gVar);
        o10.a(lambdaObserver);
        io.reactivex.rxjava3.internal.util.c.a(dVar, lambdaObserver);
        Throwable th = dVar.f211941a;
        if (th != null) {
            throw ExceptionHelper.i(th);
        }
    }

    public static <T> void b(zc.T<? extends T> o10, final Bc.g<? super T> onNext, final Bc.g<? super Throwable> onError, final Bc.a onComplete) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        c(o10, new LambdaObserver(onNext, onError, onComplete, Functions.f207355d));
    }

    public static <T> void c(zc.T<? extends T> o10, zc.V<? super T> observer) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        observer.onSubscribe(blockingObserver);
        o10.a(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e10) {
                    blockingObserver.dispose();
                    observer.onError(e10);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || objPoll == BlockingObserver.f207579b || NotificationLite.acceptFull(objPoll, observer)) {
                return;
            }
        }
    }
}
