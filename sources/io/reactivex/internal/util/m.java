package io.reactivex.internal.util;

import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public interface m<T, U> {
    Throwable a();

    int b(int i10);

    boolean c();

    boolean cancelled();

    boolean d();

    long e(long j10);

    boolean f(Subscriber<? super U> subscriber, T t10);

    long g();
}
