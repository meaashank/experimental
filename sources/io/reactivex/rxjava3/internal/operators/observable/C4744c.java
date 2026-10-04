package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4744c<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.T<T> f210962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f210963b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.c$a */
    public static final class a<T> extends io.reactivex.rxjava3.observers.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Object f210964b;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.c$a$a, reason: collision with other inner class name */
        public final class C0783a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f210965a;

            public C0783a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f210965a = a.this.f210964b;
                return !NotificationLite.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f210965a == null) {
                        this.f210965a = a.this.f210964b;
                    }
                    if (NotificationLite.isComplete(this.f210965a)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.f210965a)) {
                        throw ExceptionHelper.i(NotificationLite.getError(this.f210965a));
                    }
                    T t10 = (T) NotificationLite.getValue(this.f210965a);
                    this.f210965a = null;
                    return t10;
                } catch (Throwable th) {
                    this.f210965a = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public a(T value) {
            this.f210964b = NotificationLite.next(value);
        }

        public a<T>.C0783a c() {
            return new C0783a();
        }

        @Override // zc.V
        public void onComplete() {
            this.f210964b = NotificationLite.complete();
        }

        @Override // zc.V
        public void onError(Throwable e10) {
            this.f210964b = NotificationLite.error(e10);
        }

        @Override // zc.V
        public void onNext(T args) {
            this.f210964b = NotificationLite.next(args);
        }
    }

    public C4744c(zc.T<T> source, T initialValue) {
        this.f210962a = source;
        this.f210963b = initialValue;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f210963b);
        this.f210962a.a(aVar);
        return new a.C0783a();
    }
}
