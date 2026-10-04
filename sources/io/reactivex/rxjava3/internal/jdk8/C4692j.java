package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.jdk8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4692j<T> extends r<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f207542d;

    public C4692j(boolean hasDefault, T defaultItem) {
        this.f207541c = hasDefault;
        this.f207542d = defaultItem;
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.r
    public void a(Subscription s10) {
        s10.request(1L);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (isDone()) {
            return;
        }
        c();
        if (this.f207541c) {
            complete(this.f207542d);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        complete(t10);
    }
}
