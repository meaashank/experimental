package io.reactivex.internal.observers;

import hc.G;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.n;
import java.util.concurrent.atomic.AtomicReference;
import pc.o;
import qc.j;

/* JADX INFO: loaded from: classes7.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<b> implements G<T>, b {
    private static final long serialVersionUID = -5417183359794346637L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<T> f203008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f203009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o<T> f203010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f203011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f203012e;

    public InnerQueuedObserver(j<T> jVar, int i10) {
        this.f203008a = jVar;
        this.f203009b = i10;
    }

    public int d() {
        return this.f203012e;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public boolean g() {
        return this.f203011d;
    }

    public o<T> h() {
        return this.f203010c;
    }

    public void i() {
        this.f203011d = true;
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // hc.G
    public void onComplete() {
        this.f203008a.b(this);
    }

    @Override // hc.G
    public void onError(Throwable th) {
        this.f203008a.a(this, th);
    }

    @Override // hc.G
    public void onNext(T t10) {
        if (this.f203012e == 0) {
            this.f203008a.c(this, t10);
        } else {
            this.f203008a.d();
        }
    }

    @Override // hc.G
    public void onSubscribe(b bVar) {
        if (DisposableHelper.setOnce(this, bVar)) {
            if (bVar instanceof pc.j) {
                pc.j jVar = (pc.j) bVar;
                int iRequestFusion = jVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f203012e = iRequestFusion;
                    this.f203010c = jVar;
                    this.f203011d = true;
                    this.f203008a.b(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f203012e = iRequestFusion;
                    this.f203010c = jVar;
                    return;
                }
            }
            this.f203010c = n.c(-this.f203009b);
        }
    }
}
