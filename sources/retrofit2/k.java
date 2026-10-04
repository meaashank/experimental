package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import okhttp3.Response;
import okhttp3.d;

/* JADX INFO: loaded from: classes8.dex */
public final class k<ResponseT, ReturnT> extends z<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestFactory f237675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f237676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<ResponseT, ReturnT> f237677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h<okhttp3.u, ResponseT> f237678d;

    public k(RequestFactory requestFactory, d.a aVar, d<ResponseT, ReturnT> dVar, h<okhttp3.u, ResponseT> hVar) {
        this.f237675a = requestFactory;
        this.f237676b = aVar;
        this.f237677c = dVar;
        this.f237678d = hVar;
    }

    public static <ResponseT, ReturnT> d<ResponseT, ReturnT> c(Retrofit retrofit, Method method) {
        Type genericReturnType = method.getGenericReturnType();
        try {
            return (d<ResponseT, ReturnT>) retrofit.k(null, genericReturnType, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw A.o(method, e10, "Unable to create call adapter for %s", genericReturnType);
        }
    }

    public static <ResponseT> h<okhttp3.u, ResponseT> d(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.m(null, type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw A.o(method, e10, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> k<ResponseT, ReturnT> e(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        d dVarC = c(retrofit, method);
        Type typeA = dVarC.a();
        if (typeA == y.class || typeA == Response.class) {
            throw A.o(method, null, "'" + A.i(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (requestFactory.f237624c.equals("HEAD") && !Void.class.equals(typeA)) {
            throw A.o(method, null, "HEAD method must use Void as response type.", new Object[0]);
        }
        return new k<>(requestFactory, retrofit.f237633b, dVarC, d(retrofit, method, typeA));
    }

    @Override // retrofit2.z
    public ReturnT a(Object[] objArr) {
        return this.f237677c.b(new m(this.f237675a, objArr, this.f237676b, this.f237678d));
    }
}
