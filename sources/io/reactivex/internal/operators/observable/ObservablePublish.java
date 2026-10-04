package io.reactivex.internal.operators.observable;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5271g;
import sc.AbstractC5591a;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservablePublish<T> extends AbstractC5591a<T> implements pc.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.E<T> f205747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<a<T>> f205748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc.E<T> f205749c;

    public static final class InnerDisposable<T> extends AtomicReference<Object> implements io.reactivex.disposables.b {
        private static final long serialVersionUID = -1100270633763673112L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205750a;

        public InnerDisposable(hc.G<? super T> g10) {
            this.f205750a = g10;
        }

        public void a(a<T> aVar) {
            if (compareAndSet(null, aVar)) {
                return;
            }
            aVar.b(this);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((a) andSet).b(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == this;
        }
    }

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InnerDisposable[] f205751e = new InnerDisposable[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final InnerDisposable[] f205752f = new InnerDisposable[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<a<T>> f205753a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f205756d = new AtomicReference<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<InnerDisposable<T>[]> f205754b = new AtomicReference<>(f205751e);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f205755c = new AtomicBoolean();

        public a(AtomicReference<a<T>> atomicReference) {
            this.f205753a = atomicReference;
        }

        public boolean a(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f205754b.get();
                if (innerDisposableArr == f205752f) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!C1598m0.a(this.f205754b, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        public void b(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f205754b.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerDisposableArr[i10].equals(innerDisposable)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = f205751e;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr3, i10, (length - i10) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!C1598m0.a(this.f205754b, innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            AtomicReference<InnerDisposable<T>[]> atomicReference = this.f205754b;
            InnerDisposable<T>[] innerDisposableArr = f205752f;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                C1598m0.a(this.f205753a, this, null);
                DisposableHelper.dispose(this.f205756d);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205754b.get() == f205752f;
        }

        @Override // hc.G
        public void onComplete() {
            C1598m0.a(this.f205753a, this, null);
            for (InnerDisposable<T> innerDisposable : this.f205754b.getAndSet(f205752f)) {
                innerDisposable.f205750a.onComplete();
            }
        }

        @Override // hc.G
        public void onError(Throwable th) {
            C1598m0.a(this.f205753a, this, null);
            InnerDisposable<T>[] andSet = this.f205754b.getAndSet(f205752f);
            if (andSet.length == 0) {
                C5666a.Y(th);
                return;
            }
            for (InnerDisposable<T> innerDisposable : andSet) {
                innerDisposable.f205750a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            for (InnerDisposable<T> innerDisposable : this.f205754b.get()) {
                innerDisposable.f205750a.onNext(t10);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f205756d, bVar);
        }
    }

    public static final class b<T> implements hc.E<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference<a<T>> f205757a;

        public b(AtomicReference<a<T>> atomicReference) {
            this.f205757a = atomicReference;
        }

        @Override // hc.E
        public void a(hc.G<? super T> g10) {
            InnerDisposable innerDisposable = new InnerDisposable(g10);
            g10.onSubscribe(innerDisposable);
            while (true) {
                a<T> aVar = this.f205757a.get();
                if (aVar == null || aVar.isDisposed()) {
                    a<T> aVar2 = new a<>(this.f205757a);
                    if (C1598m0.a(this.f205757a, aVar, aVar2)) {
                        aVar = aVar2;
                    } else {
                        continue;
                    }
                }
                if (aVar.a(innerDisposable)) {
                    innerDisposable.a(aVar);
                    return;
                }
            }
        }
    }

    public ObservablePublish(hc.E<T> e10, hc.E<T> e11, AtomicReference<a<T>> atomicReference) {
        this.f205749c = e10;
        this.f205747a = e11;
        this.f205748b = atomicReference;
    }

    public static <T> AbstractC5591a<T> n8(hc.E<T> e10) {
        AtomicReference atomicReference = new AtomicReference();
        return C5666a.U(new ObservablePublish(new b(atomicReference), e10, atomicReference));
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f205749c.a(g10);
    }

    @Override // sc.AbstractC5591a
    public void g8(InterfaceC5271g<? super io.reactivex.disposables.b> interfaceC5271g) {
        a<T> aVar;
        while (true) {
            aVar = this.f205748b.get();
            if (aVar != null && !aVar.isDisposed()) {
                break;
            }
            a<T> aVar2 = new a<>(this.f205748b);
            if (C1598m0.a(this.f205748b, aVar, aVar2)) {
                aVar = aVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!aVar.f205755c.get() && aVar.f205755c.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            interfaceC5271g.accept(aVar);
            if (z10) {
                this.f205747a.a(aVar);
            }
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            throw ExceptionHelper.e(th);
        }
    }

    @Override // pc.g
    public hc.E<T> source() {
        return this.f205747a;
    }
}
