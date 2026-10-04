package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class A<T> extends E<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f207394d;

    public A(boolean hasDefault, T defaultItem) {
        this.f207393c = hasDefault;
        this.f207394d = defaultItem;
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
        } else if (this.f207393c) {
            complete(this.f207394d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        this.f207401b = t10;
    }
}
