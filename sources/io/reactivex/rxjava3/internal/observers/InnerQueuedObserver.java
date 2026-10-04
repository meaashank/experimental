package io.reactivex.rxjava3.internal.observers;

import Dc.l;
import Dc.q;
import Ec.k;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.n;
import java.util.concurrent.atomic.AtomicReference;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<d> implements V<T>, d {
    private static final long serialVersionUID = -5417183359794346637L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f207597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f207598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q<T> f207599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f207600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f207601e;

    public InnerQueuedObserver(k<T> parent, int prefetch) {
        this.f207597a = parent;
        this.f207598b = prefetch;
    }

    public boolean d() {
        return this.f207600d;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public q<T> g() {
        return this.f207599c;
    }

    public void h() {
        this.f207600d = true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // zc.V
    public void onComplete() {
        this.f207597a.f(this);
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        this.f207597a.g(this, t10);
    }

    @Override // zc.V
    public void onNext(T t10) {
        if (this.f207601e == 0) {
            this.f207597a.e(this, t10);
        } else {
            this.f207597a.d();
        }
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        if (DisposableHelper.setOnce(this, d10)) {
            if (d10 instanceof l) {
                l lVar = (l) d10;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f207601e = iRequestFusion;
                    this.f207599c = lVar;
                    this.f207600d = true;
                    this.f207597a.f(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f207601e = iRequestFusion;
                    this.f207599c = lVar;
                    return;
                }
            }
            this.f207599c = n.c(-this.f207598b);
        }
    }
}
