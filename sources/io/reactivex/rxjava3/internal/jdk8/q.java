package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class q<T> extends r<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f207550d;

    public q(boolean hasDefault, T defaultItem) {
        this.f207549c = hasDefault;
        this.f207550d = defaultItem;
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.r
    public void a(Subscription s10) {
        s10.request(2L);
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
        } else if (this.f207549c) {
            complete(this.f207550d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f207552b == null) {
            this.f207552b = t10;
        } else {
            this.f207552b = null;
            completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }
}
