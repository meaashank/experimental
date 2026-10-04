package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public static final class FutureGarbageCollectedException extends Throwable {
        public FutureGarbageCollectedException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f105776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<T> f105777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d<Void> f105778c = d.i();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f105779d;

        public void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            d<Void> dVar = this.f105778c;
            if (dVar != null) {
                dVar.addListener(runnable, executor);
            }
        }

        public void b() {
            this.f105776a = null;
            this.f105777b = null;
            this.f105778c.set(null);
        }

        public boolean c(T t10) {
            this.f105779d = true;
            c<T> cVar = this.f105777b;
            boolean z10 = cVar != null && cVar.f105781b.set(t10);
            if (z10) {
                e();
            }
            return z10;
        }

        public boolean d() {
            this.f105779d = true;
            c<T> cVar = this.f105777b;
            boolean z10 = cVar != null && cVar.f105781b.cancel(true);
            if (z10) {
                e();
            }
            return z10;
        }

        public final void e() {
            this.f105776a = null;
            this.f105777b = null;
            this.f105778c = null;
        }

        public boolean f(@NonNull Throwable th) {
            this.f105779d = true;
            c<T> cVar = this.f105777b;
            boolean z10 = cVar != null && cVar.f105781b.setException(th);
            if (z10) {
                e();
            }
            return z10;
        }

        public void finalize() {
            d<Void> dVar;
            c<T> cVar = this.f105777b;
            if (cVar != null && !cVar.f105781b.isDone()) {
                cVar.c(new FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f105776a));
            }
            if (this.f105779d || (dVar = this.f105778c) == null) {
                return;
            }
            dVar.set(null);
        }
    }

    public interface b<T> {
        @Nullable
        Object attachCompleter(@NonNull a<T> aVar) throws Exception;
    }

    public static final class c<T> implements ListenableFuture<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a<T>> f105780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractResolvableFuture<T> f105781b = new a();

        public class a extends AbstractResolvableFuture<T> {
            public a() {
            }

            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            public String pendingToString() {
                a<T> aVar = c.this.f105780a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f105776a + "]";
            }
        }

        public c(a<T> aVar) {
            this.f105780a = new WeakReference<>(aVar);
        }

        public boolean a(boolean z10) {
            return this.f105781b.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.f105781b.addListener(runnable, executor);
        }

        public boolean b(T t10) {
            return this.f105781b.set(t10);
        }

        public boolean c(Throwable th) {
            return this.f105781b.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f105780a.get();
            boolean zCancel = this.f105781b.cancel(z10);
            if (zCancel && aVar != null) {
                aVar.b();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f105781b.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f105781b.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f105781b.isDone();
        }

        public String toString() {
            return this.f105781b.toString();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f105781b.get(j10, timeUnit);
        }
    }

    @NonNull
    public static <T> ListenableFuture<T> a(@NonNull b<T> bVar) {
        a<T> aVar = new a<>();
        c<T> cVar = new c<>(aVar);
        aVar.f105777b = cVar;
        aVar.f105776a = bVar.getClass();
        try {
            Object objAttachCompleter = bVar.attachCompleter(aVar);
            if (objAttachCompleter == null) {
                return cVar;
            }
            aVar.f105776a = objAttachCompleter;
            return cVar;
        } catch (Exception e10) {
            cVar.c(e10);
            return cVar;
        }
    }
}
