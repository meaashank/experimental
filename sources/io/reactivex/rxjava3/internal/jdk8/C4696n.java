package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.jdk8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4696n<T> extends r<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f207544d;

    public C4696n(boolean hasDefault, T defaultItem) {
        this.f207543c = hasDefault;
        this.f207544d = defaultItem;
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.r
    public void a(Subscription s10) {
        s10.request(Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (isDone()) {
            return;
        }
        T t10 = this.f207552b;
        c();
        if (t10 != null) {
            complete(t10);
        } else if (this.f207543c) {
            complete(this.f207544d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f207552b = t10;
    }
}
