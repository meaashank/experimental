package io.reactivex.rxjava3.internal.disposables;

import Dc.l;
import yc.f;
import zc.F;
import zc.InterfaceC5888e;
import zc.V;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public enum EmptyDisposable implements l<Object> {
    INSTANCE,
    NEVER;

    public static void complete(V<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e10, V<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e10);
    }

    @Override // Dc.q
    public void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return true;
    }

    @Override // Dc.q
    public boolean offer(Object value) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dc.q
    @f
    public Object poll() {
        return null;
    }

    @Override // Dc.m
    public int requestFusion(int mode) {
        return mode & 2;
    }

    @Override // Dc.q
    public boolean offer(Object v12, Object v22) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(F<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e10, InterfaceC5888e observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e10);
    }

    public static void complete(InterfaceC5888e observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void error(Throwable e10, a0<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e10);
    }

    public static void error(Throwable e10, F<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(e10);
    }
}
