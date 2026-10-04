package io.reactivex.rxjava3.internal.util;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.F;
import zc.InterfaceC5888e;
import zc.InterfaceC5907y;
import zc.V;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public enum EmptyComponent implements InterfaceC5907y<Object>, V<Object>, F<Object>, a0<Object>, InterfaceC5888e, Subscription, io.reactivex.rxjava3.disposables.d {
    INSTANCE;

    public static <T> V<T> asObserver() {
        return INSTANCE;
    }

    public static <T> Subscriber<T> asSubscriber() {
        return INSTANCE;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        Ic.a.Y(t10);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(Object t10) {
    }

    @Override // zc.V
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        d10.dispose();
    }

    @Override // zc.F, zc.a0
    public void onSuccess(Object value) {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        s10.cancel();
    }
}
