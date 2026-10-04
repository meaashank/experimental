package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import io.reactivex.internal.subscribers.BoundedSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4622h {
    public C4622h() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(Publisher<? extends T> publisher) {
        io.reactivex.internal.util.d dVar = new io.reactivex.internal.util.d(1);
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(Functions.f202950d, dVar, dVar, Functions.f202958l);
        publisher.subscribe(lambdaSubscriber);
        io.reactivex.internal.util.c.a(dVar, lambdaSubscriber);
        Throwable th = dVar.f207192a;
        if (th != null) {
            throw ExceptionHelper.e(th);
        }
    }

    public static <T> void b(Publisher<? extends T> publisher, InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2, InterfaceC5265a interfaceC5265a) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onNext is null");
        io.reactivex.internal.functions.a.g(interfaceC5271g2, "onError is null");
        io.reactivex.internal.functions.a.g(interfaceC5265a, "onComplete is null");
        d(publisher, new LambdaSubscriber(interfaceC5271g, interfaceC5271g2, interfaceC5265a, Functions.f202958l));
    }

    public static <T> void c(Publisher<? extends T> publisher, InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2, InterfaceC5265a interfaceC5265a, int i10) {
        io.reactivex.internal.functions.a.g(interfaceC5271g, "onNext is null");
        io.reactivex.internal.functions.a.g(interfaceC5271g2, "onError is null");
        io.reactivex.internal.functions.a.g(interfaceC5265a, "onComplete is null");
        io.reactivex.internal.functions.a.h(i10, "number > 0 required");
        d(publisher, new BoundedSubscriber(interfaceC5271g, interfaceC5271g2, interfaceC5265a, new Functions.l(i10), i10));
    }

    public static <T> void d(Publisher<? extends T> publisher, Subscriber<? super T> subscriber) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber = new BlockingSubscriber(linkedBlockingQueue);
        publisher.subscribe(blockingSubscriber);
        while (!blockingSubscriber.d()) {
            try {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (blockingSubscriber.d()) {
                        return;
                    }
                    io.reactivex.internal.util.c.b();
                    objPoll = linkedBlockingQueue.take();
                }
                if (blockingSubscriber.d() || objPoll == BlockingSubscriber.f207119b || NotificationLite.acceptFull(objPoll, subscriber)) {
                    return;
                }
            } catch (InterruptedException e10) {
                blockingSubscriber.cancel();
                subscriber.onError(e10);
                return;
            }
        }
    }
}
