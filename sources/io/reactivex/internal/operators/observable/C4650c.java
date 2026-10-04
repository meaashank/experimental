package io.reactivex.internal.operators.observable;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4650c<T> implements Iterable<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.E<T> f206222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f206223b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.c$a */
    public static final class a<T> extends io.reactivex.observers.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Object f206224b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.c$a$a, reason: collision with other inner class name */
        public final class C0765a implements Iterator<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f206225a;

            public C0765a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                this.f206225a = a.this.f206224b;
                return !NotificationLite.isComplete(r0);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f206225a == null) {
                        this.f206225a = a.this.f206224b;
                    }
                    if (NotificationLite.isComplete(this.f206225a)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.f206225a)) {
                        throw ExceptionHelper.e(NotificationLite.getError(this.f206225a));
                    }
                    T t10 = (T) NotificationLite.getValue(this.f206225a);
                    this.f206225a = null;
                    return t10;
                } catch (Throwable th) {
                    this.f206225a = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public a(T t10) {
            this.f206224b = NotificationLite.next(t10);
        }

        public a<T>.C0765a c() {
            return new C0765a();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206224b = NotificationLite.complete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206224b = NotificationLite.error(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f206224b = NotificationLite.next(t10);
        }
    }

    public C4650c(hc.E<T> e10, T t10) {
        this.f206222a = e10;
        this.f206223b = t10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f206223b);
        this.f206222a.a(aVar);
        return new a.C0765a();
    }
}
