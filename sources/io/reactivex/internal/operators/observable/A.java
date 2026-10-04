package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class A<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super T> f205279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f205280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5265a f205281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC5265a f205282e;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC5271g<? super T> f205284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC5271g<? super Throwable> f205285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC5265a f205286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC5265a f205287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.disposables.b f205288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f205289g;

        public a(hc.G<? super T> g10, InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2, InterfaceC5265a interfaceC5265a, InterfaceC5265a interfaceC5265a2) {
            this.f205283a = g10;
            this.f205284b = interfaceC5271g;
            this.f205285c = interfaceC5271g2;
            this.f205286d = interfaceC5265a;
            this.f205287e = interfaceC5265a2;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205288f.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205288f.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            if (this.f205289g) {
                return;
            }
            try {
                this.f205286d.run();
                this.f205289g = true;
                this.f205283a.onComplete();
                try {
                    this.f205287e.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    C5666a.Y(th);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                onError(th2);
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (this.f205289g) {
                C5666a.Y(th);
                return;
            }
            this.f205289g = true;
            try {
                this.f205285c.accept(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                th = new CompositeException(th, th2);
            }
            this.f205283a.onError(th);
            try {
                this.f205287e.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                C5666a.Y(th3);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f205289g) {
                return;
            }
            try {
                this.f205284b.accept(t10);
                this.f205283a.onNext(t10);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f205288f.dispose();
                onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205288f, bVar)) {
                this.f205288f = bVar;
                this.f205283a.onSubscribe(this);
            }
        }
    }

    public A(hc.E<T> e10, InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2, InterfaceC5265a interfaceC5265a, InterfaceC5265a interfaceC5265a2) {
        super(e10);
        this.f205279b = interfaceC5271g;
        this.f205280c = interfaceC5271g2;
        this.f205281d = interfaceC5265a;
        this.f205282e = interfaceC5265a2;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f205279b, this.f205280c, this.f205281d, this.f205282e));
    }
}
