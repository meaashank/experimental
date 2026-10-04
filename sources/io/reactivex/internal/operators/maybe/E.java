package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class E<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super io.reactivex.disposables.b> f204750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5271g<? super T> f204751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f204752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC5265a f204753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC5265a f204754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC5265a f204755g;

    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final E<T> f204757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f204758c;

        public a(hc.t<? super T> tVar, E<T> e10) {
            this.f204756a = tVar;
            this.f204757b = e10;
        }

        public void a() {
            try {
                this.f204757b.f204754f.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                C5666a.Y(th);
            }
        }

        public void b(Throwable th) {
            try {
                this.f204757b.f204752d.accept(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.f204758c = DisposableHelper.DISPOSED;
            this.f204756a.onError(th);
            a();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            try {
                this.f204757b.f204755g.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                C5666a.Y(th);
            }
            this.f204758c.dispose();
            this.f204758c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f204758c.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            io.reactivex.disposables.b bVar = this.f204758c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            try {
                this.f204757b.f204753e.run();
                this.f204758c = disposableHelper;
                this.f204756a.onComplete();
                a();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                b(th);
            }
        }

        @Override // hc.t
        public void onError(Throwable th) {
            if (this.f204758c == DisposableHelper.DISPOSED) {
                C5666a.Y(th);
            } else {
                b(th);
            }
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204758c, bVar)) {
                try {
                    this.f204757b.f204750b.accept(bVar);
                    this.f204758c = bVar;
                    this.f204756a.onSubscribe(this);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    bVar.dispose();
                    this.f204758c = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th, this.f204756a);
                }
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            io.reactivex.disposables.b bVar = this.f204758c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            try {
                this.f204757b.f204751c.accept(t10);
                this.f204758c = disposableHelper;
                this.f204756a.onSuccess(t10);
                a();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                b(th);
            }
        }
    }

    public E(hc.w<T> wVar, InterfaceC5271g<? super io.reactivex.disposables.b> interfaceC5271g, InterfaceC5271g<? super T> interfaceC5271g2, InterfaceC5271g<? super Throwable> interfaceC5271g3, InterfaceC5265a interfaceC5265a, InterfaceC5265a interfaceC5265a2, InterfaceC5265a interfaceC5265a3) {
        super(wVar);
        this.f204750b = interfaceC5271g;
        this.f204751c = interfaceC5271g2;
        this.f204752d = interfaceC5271g3;
        this.f204753e = interfaceC5265a;
        this.f204754f = interfaceC5265a2;
        this.f204755g = interfaceC5265a3;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar, this));
    }
}
