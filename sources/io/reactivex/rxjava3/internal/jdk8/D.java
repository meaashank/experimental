package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class D<T> extends E<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f207399d;

    public D(boolean hasDefault, T defaultItem) {
        this.f207398c = hasDefault;
        this.f207399d = defaultItem;
    }

    @Override // zc.V
    public void onComplete() {
        if (isDone()) {
            return;
        }
        T t10 = this.f207401b;
        a();
        if (t10 != null) {
            complete(t10);
        } else if (this.f207398c) {
            complete(this.f207399d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        if (this.f207401b == null) {
            this.f207401b = t10;
        } else {
            this.f207401b = null;
            completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }
}
