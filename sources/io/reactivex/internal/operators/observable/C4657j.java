package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.BlockingObserver;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4657j {
    public C4657j() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(hc.E<? extends T> e10) {
        io.reactivex.internal.util.d dVar = new io.reactivex.internal.util.d(1);
        InterfaceC5271g<Object> interfaceC5271g = Functions.f202950d;
        LambdaObserver lambdaObserver = new LambdaObserver(interfaceC5271g, dVar, dVar, interfaceC5271g);
        e10.a(lambdaObserver);
        io.reactivex.internal.util.c.a(dVar, lambdaObserver);
        Throwable th = dVar.f207192a;
        if (th != null) {
            throw ExceptionHelper.e(th);
        }
    }

    public static <T> void b(hc.E<? extends T> e10, hc.G<? super T> g10) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        g10.onSubscribe(blockingObserver);
        e10.a(blockingObserver);
        while (!blockingObserver.isDisposed()) {
            Object objPoll = linkedBlockingQueue.poll();
            if (objPoll == null) {
                try {
                    objPoll = linkedBlockingQueue.take();
                } catch (InterruptedException e11) {
                    blockingObserver.dispose();
                    g10.onError(e11);
                    return;
                }
            }
            if (blockingObserver.isDisposed() || e10 == BlockingObserver.f202990b || NotificationLite.acceptFull(objPoll, g10)) {
                return;
            }
        }
    }

    public static <T> void c(hc.E<? extends T> e10, InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2, InterfaceC5265a interfaceC5265a) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onNext is null");
        io.reactivex.internal.functions.a.g(interfaceC5271g2, "onError is null");
        io.reactivex.internal.functions.a.g(interfaceC5265a, "onComplete is null");
        b(e10, new LambdaObserver(interfaceC5271g, interfaceC5271g2, interfaceC5265a, Functions.f202950d));
    }
}
