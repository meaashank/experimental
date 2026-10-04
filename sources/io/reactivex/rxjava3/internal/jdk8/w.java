package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class w<T> extends E<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f207570d;

    public w(boolean hasDefault, T defaultItem) {
        this.f207569c = hasDefault;
        this.f207570d = defaultItem;
    }

    @Override // zc.V
    public void onComplete() {
        if (isDone()) {
            return;
        }
        a();
        if (this.f207569c) {
            complete(this.f207570d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        complete(t10);
    }
}
