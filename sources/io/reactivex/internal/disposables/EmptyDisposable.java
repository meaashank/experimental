package io.reactivex.internal.disposables;

import hc.G;
import hc.InterfaceC4524d;
import hc.L;
import hc.t;
import lc.f;
import pc.j;

/* JADX INFO: loaded from: classes7.dex */
public enum EmptyDisposable implements j<Object> {
    INSTANCE,
    NEVER;

    public static void complete(G<?> g10) {
        g10.onSubscribe(INSTANCE);
        g10.onComplete();
    }

    public static void error(Throwable th, G<?> g10) {
        g10.onSubscribe(INSTANCE);
        g10.onError(th);
    }

    @Override // pc.o
    public void clear() {
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // pc.o
    public boolean isEmpty() {
        return true;
    }

    @Override // pc.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // pc.o
    @f
    public Object poll() throws Exception {
        return null;
    }

    @Override // pc.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // pc.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(t<?> tVar) {
        tVar.onSubscribe(INSTANCE);
        tVar.onComplete();
    }

    public static void error(Throwable th, InterfaceC4524d interfaceC4524d) {
        interfaceC4524d.onSubscribe(INSTANCE);
        interfaceC4524d.onError(th);
    }

    public static void complete(InterfaceC4524d interfaceC4524d) {
        interfaceC4524d.onSubscribe(INSTANCE);
        interfaceC4524d.onComplete();
    }

    public static void error(Throwable th, L<?> l10) {
        l10.onSubscribe(INSTANCE);
        l10.onError(th);
    }

    public static void error(Throwable th, t<?> tVar) {
        tVar.onSubscribe(INSTANCE);
        tVar.onError(th);
    }
}
