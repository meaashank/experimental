package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.subscribers.BlockingSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BoundedSubscriber;
import io.reactivex.rxjava3.internal.subscribers.LambdaSubscriber;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4707h {
    public C4707h() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void a(Publisher<? extends T> source) {
        io.reactivex.rxjava3.internal.util.d dVar = new io.reactivex.rxjava3.internal.util.d(1);
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(Functions.f207355d, dVar, dVar, Functions.f207362k);
        source.subscribe(lambdaSubscriber);
        io.reactivex.rxjava3.internal.util.c.a(dVar, lambdaSubscriber);
        Throwable th = dVar.f211941a;
        if (th != null) {
            throw ExceptionHelper.i(th);
        }
    }

    public static <T> void b(Publisher<? extends T> o10, final Bc.g<? super T> onNext, final Bc.g<? super Throwable> onError, final Bc.a onComplete) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        d(o10, new LambdaSubscriber(onNext, onError, onComplete, Functions.f207362k));
    }

    public static <T> void c(Publisher<? extends T> o10, final Bc.g<? super T> onNext, final Bc.g<? super Throwable> onError, final Bc.a onComplete, int bufferSize) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        io.reactivex.rxjava3.internal.functions.a.b(bufferSize, "number > 0 required");
        d(o10, new BoundedSubscriber(onNext, onError, onComplete, new Functions.l(bufferSize), bufferSize));
    }

    public static <T> void d(Publisher<? extends T> source, Subscriber<? super T> subscriber) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber = new BlockingSubscriber(linkedBlockingQueue);
        source.subscribe(blockingSubscriber);
        while (!blockingSubscriber.d()) {
            try {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    if (blockingSubscriber.d()) {
                        return;
                    }
                    io.reactivex.rxjava3.internal.util.c.b();
                    objPoll = linkedBlockingQueue.take();
                }
                if (blockingSubscriber.d() || objPoll == BlockingSubscriber.f211867b || NotificationLite.acceptFull(objPoll, subscriber)) {
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
