package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;
import retrofit2.d;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f237664a;

    public class a implements d<Object, c<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f237665a;

        public a(Type type) {
            this.f237665a = type;
        }

        @Override // retrofit2.d
        public Type a() {
            return this.f237665a;
        }

        @Override // retrofit2.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c<Object> b(c<Object> cVar) {
            return new b(j.this.f237664a, cVar);
        }
    }

    public static final class b<T> implements c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f237667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c<T> f237668b;

        public class a implements e<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f237669a;

            /* JADX INFO: renamed from: retrofit2.j$b$a$a, reason: collision with other inner class name */
            public class RunnableC0876a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ y f237671a;

                public RunnableC0876a(y yVar) {
                    this.f237671a = yVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f237668b.P()) {
                        a aVar = a.this;
                        aVar.f237669a.a(b.this, new IOException("Canceled"));
                    } else {
                        a aVar2 = a.this;
                        aVar2.f237669a.b(b.this, this.f237671a);
                    }
                }
            }

            /* JADX INFO: renamed from: retrofit2.j$b$a$b, reason: collision with other inner class name */
            public class RunnableC0877b implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Throwable f237673a;

                public RunnableC0877b(Throwable th) {
                    this.f237673a = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.f237669a.a(b.this, this.f237673a);
                }
            }

            public a(e eVar) {
                this.f237669a = eVar;
            }

            @Override // retrofit2.e
            public void a(c<T> cVar, Throwable th) {
                b.this.f237667a.execute(new RunnableC0877b(th));
            }

            @Override // retrofit2.e
            public void b(c<T> cVar, y<T> yVar) {
                b.this.f237667a.execute(new RunnableC0876a(yVar));
            }
        }

        public b(Executor executor, c<T> cVar) {
            this.f237667a = executor;
            this.f237668b = cVar;
        }

        @Override // retrofit2.c
        public boolean P() {
            return this.f237668b.P();
        }

        @Override // retrofit2.c
        public boolean U() {
            return this.f237668b.U();
        }

        @Override // retrofit2.c
        public void cancel() {
            this.f237668b.cancel();
        }

        @Override // retrofit2.c
        public y<T> execute() throws IOException {
            return this.f237668b.execute();
        }

        @Override // retrofit2.c
        public void o(e<T> eVar) {
            A.b(eVar, "callback == null");
            this.f237668b.o(new a(eVar));
        }

        @Override // retrofit2.c
        public Request request() {
            return this.f237668b.request();
        }

        @Override // retrofit2.c
        public c<T> clone() {
            return new b(this.f237667a, this.f237668b.clone());
        }
    }

    public j(Executor executor) {
        this.f237664a = executor;
    }

    @Override // retrofit2.d.a
    @Nullable
    public d<?, ?> a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (A.i(type) != c.class) {
            return null;
        }
        return new a(A.f(type));
    }
}
