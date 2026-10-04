package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class c0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super Throwable, ? extends hc.E<? extends T>> f206227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f206228c;

    public static final class a<T> implements hc.G<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super Throwable, ? extends hc.E<? extends T>> f206230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f206231c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SequentialDisposable f206232d = new SequentialDisposable();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f206233e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f206234f;

        public a(hc.G<? super T> g10, nc.o<? super Throwable, ? extends hc.E<? extends T>> oVar, boolean z10) {
            this.f206229a = g10;
            this.f206230b = oVar;
            this.f206231c = z10;
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f206234f) {
                return;
            }
            this.f206234f = true;
            this.f206233e = true;
            this.f206229a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f206233e) {
                if (this.f206234f) {
                    C5666a.Y(th);
                    return;
                } else {
                    this.f206229a.onError(th);
                    return;
                }
            }
            this.f206233e = true;
            if (this.f206231c && !(th instanceof Exception)) {
                this.f206229a.onError(th);
                return;
            }
            try {
                hc.E<? extends T> eApply = this.f206230b.apply(th);
                if (eApply != null) {
                    eApply.a(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                this.f206229a.onError(nullPointerException);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f206229a.onError(new CompositeException(th, th2));
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206234f) {
                return;
            }
            this.f206229a.onNext(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            SequentialDisposable sequentialDisposable = this.f206232d;
            sequentialDisposable.getClass();
            DisposableHelper.replace(sequentialDisposable, bVar);
        }
    }

    public c0(hc.E<T> e10, nc.o<? super Throwable, ? extends hc.E<? extends T>> oVar, boolean z10) {
        super(e10);
        this.f206227b = oVar;
        this.f206228c = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        a aVar = new a(g10, this.f206227b, this.f206228c);
        g10.onSubscribe(aVar.f206232d);
        this.f206214a.a(aVar);
    }
}
