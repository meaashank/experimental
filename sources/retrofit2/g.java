package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.d;

/* JADX INFO: loaded from: classes8.dex */
@IgnoreJRERequirement
public final class g extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d.a f237650a = new g();

    @IgnoreJRERequirement
    public static final class a<R> implements d<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f237651a;

        /* JADX INFO: renamed from: retrofit2.g$a$a, reason: collision with other inner class name */
        public class C0874a extends CompletableFuture<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f237652a;

            public C0874a(c cVar) {
                this.f237652a = cVar;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                if (z10) {
                    this.f237652a.cancel();
                }
                return super.cancel(z10);
            }
        }

        public class b implements e<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CompletableFuture f237654a;

            public b(CompletableFuture completableFuture) {
                this.f237654a = completableFuture;
            }

            @Override // retrofit2.e
            public void a(c<R> cVar, Throwable th) {
                this.f237654a.completeExceptionally(th);
            }

            @Override // retrofit2.e
            public void b(c<R> cVar, y<R> yVar) {
                if (yVar.f237741a.G1()) {
                    this.f237654a.complete(yVar.f237742b);
                } else {
                    this.f237654a.completeExceptionally(new HttpException(yVar));
                }
            }
        }

        public a(Type type) {
            this.f237651a = type;
        }

        @Override // retrofit2.d
        public Type a() {
            return this.f237651a;
        }

        @Override // retrofit2.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(c<R> cVar) {
            C0874a c0874a = new C0874a(cVar);
            cVar.o(new b(c0874a));
            return c0874a;
        }
    }

    @IgnoreJRERequirement
    public static final class b<R> implements d<R, CompletableFuture<y<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f237656a;

        public class a extends CompletableFuture<y<R>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f237657a;

            public a(c cVar) {
                this.f237657a = cVar;
            }

            @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                if (z10) {
                    this.f237657a.cancel();
                }
                return super.cancel(z10);
            }
        }

        /* JADX INFO: renamed from: retrofit2.g$b$b, reason: collision with other inner class name */
        public class C0875b implements e<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ CompletableFuture f237659a;

            public C0875b(CompletableFuture completableFuture) {
                this.f237659a = completableFuture;
            }

            @Override // retrofit2.e
            public void a(c<R> cVar, Throwable th) {
                this.f237659a.completeExceptionally(th);
            }

            @Override // retrofit2.e
            public void b(c<R> cVar, y<R> yVar) {
                this.f237659a.complete(yVar);
            }
        }

        public b(Type type) {
            this.f237656a = type;
        }

        @Override // retrofit2.d
        public Type a() {
            return this.f237656a;
        }

        @Override // retrofit2.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<y<R>> b(c<R> cVar) {
            a aVar = new a(cVar);
            cVar.o(new C0875b(aVar));
            return aVar;
        }
    }

    @Override // retrofit2.d.a
    @Nullable
    public d<?, ?> a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (A.i(type) != f.a()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeH = A.h(0, (ParameterizedType) type);
        if (A.i(typeH) != y.class) {
            return new a(typeH);
        }
        if (typeH instanceof ParameterizedType) {
            return new b(A.h(0, (ParameterizedType) typeH));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
