package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.d;
import retrofit2.C5554b;
import retrofit2.d;
import retrofit2.h;

/* JADX INFO: loaded from: classes8.dex */
public final class Retrofit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Method, z<?>> f237632a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f237633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpUrl f237634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<h.a> f237635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<d.a> f237636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Executor f237637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f237638g;

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f237639a = r.g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object[] f237640b = new Object[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Class f237641c;

        public a(Class cls) {
            this.f237641c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f237639a.i(method)) {
                return this.f237639a.h(method, this.f237641c, obj, objArr);
            }
            z<?> zVarI = Retrofit.this.i(method);
            if (objArr == null) {
                objArr = this.f237640b;
            }
            return zVarI.a(objArr);
        }
    }

    public Retrofit(d.a aVar, HttpUrl httpUrl, List<h.a> list, List<d.a> list2, @Nullable Executor executor, boolean z10) {
        this.f237633b = aVar;
        this.f237634c = httpUrl;
        this.f237635d = list;
        this.f237636e = list2;
        this.f237637f = executor;
        this.f237638g = z10;
    }

    public HttpUrl a() {
        return this.f237634c;
    }

    public d<?, ?> b(Type type, Annotation[] annotationArr) {
        return k(null, type, annotationArr);
    }

    public List<d.a> c() {
        return this.f237636e;
    }

    public d.a d() {
        return this.f237633b;
    }

    @Nullable
    public Executor e() {
        return this.f237637f;
    }

    public List<h.a> f() {
        return this.f237635d;
    }

    public <T> T g(Class<T> cls) {
        A.v(cls);
        if (this.f237638g) {
            h(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public final void h(Class<?> cls) {
        r rVarG = r.g();
        for (Method method : cls.getDeclaredMethods()) {
            if (!rVarG.i(method)) {
                i(method);
            }
        }
    }

    public z<?> i(Method method) {
        z<?> zVarB;
        z<?> zVar = this.f237632a.get(method);
        if (zVar != null) {
            return zVar;
        }
        synchronized (this.f237632a) {
            try {
                zVarB = this.f237632a.get(method);
                if (zVarB == null) {
                    zVarB = z.b(this, method);
                    this.f237632a.put(method, zVarB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVarB;
    }

    public Builder j() {
        return new Builder(this);
    }

    public d<?, ?> k(@Nullable d.a aVar, Type type, Annotation[] annotationArr) {
        A.b(type, "returnType == null");
        A.b(annotationArr, "annotations == null");
        int iIndexOf = this.f237636e.indexOf(aVar) + 1;
        int size = this.f237636e.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            d<?, ?> dVarA = this.f237636e.get(i10).a(type, annotationArr, this);
            if (dVarA != null) {
                return dVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f237636e.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f237636e.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f237636e.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, okhttp3.t> l(@Nullable h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        A.b(type, "type == null");
        A.b(annotationArr, "parameterAnnotations == null");
        A.b(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f237635d.indexOf(aVar) + 1;
        int size = this.f237635d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<T, okhttp3.t> hVar = (h<T, okhttp3.t>) this.f237635d.get(i10).c(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f237635d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f237635d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f237635d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<okhttp3.u, T> m(@Nullable h.a aVar, Type type, Annotation[] annotationArr) {
        A.b(type, "type == null");
        A.b(annotationArr, "annotations == null");
        int iIndexOf = this.f237635d.indexOf(aVar) + 1;
        int size = this.f237635d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h<okhttp3.u, T> hVar = (h<okhttp3.u, T>) this.f237635d.get(i10).d(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f237635d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f237635d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f237635d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> h<T, okhttp3.t> n(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return l(null, type, annotationArr, annotationArr2);
    }

    public <T> h<okhttp3.u, T> o(Type type, Annotation[] annotationArr) {
        return m(null, type, annotationArr);
    }

    public <T> h<T, String> p(Type type, Annotation[] annotationArr) {
        A.b(type, "type == null");
        A.b(annotationArr, "annotations == null");
        int size = this.f237635d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f237635d.get(i10).getClass();
        }
        return C5554b.d.f237647a;
    }

    public static final class Builder {

        @Nullable
        private HttpUrl baseUrl;
        private final List<d.a> callAdapterFactories;

        @Nullable
        private d.a callFactory;

        @Nullable
        private Executor callbackExecutor;
        private final List<h.a> converterFactories;
        private final r platform;
        private boolean validateEagerly;

        public Builder(r rVar) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            this.platform = rVar;
        }

        public Builder addCallAdapterFactory(d.a aVar) {
            List<d.a> list = this.callAdapterFactories;
            A.b(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public Builder addConverterFactory(h.a aVar) {
            List<h.a> list = this.converterFactories;
            A.b(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public Builder baseUrl(String str) {
            A.b(str, "baseUrl == null");
            return baseUrl(HttpUrl.f225211k.h(str));
        }

        public Retrofit build() {
            if (this.baseUrl == null) {
                throw new IllegalStateException("Base URL required.");
            }
            d.a okHttpClient = this.callFactory;
            if (okHttpClient == null) {
                okHttpClient = new OkHttpClient();
            }
            d.a aVar = okHttpClient;
            Executor executorC = this.callbackExecutor;
            if (executorC == null) {
                executorC = this.platform.c();
            }
            Executor executor = executorC;
            ArrayList arrayList = new ArrayList(this.callAdapterFactories);
            arrayList.addAll(this.platform.a(executor));
            ArrayList arrayList2 = new ArrayList(this.platform.e() + this.converterFactories.size() + 1);
            arrayList2.add(new C5554b());
            arrayList2.addAll(this.converterFactories);
            arrayList2.addAll(this.platform.d());
            return new Retrofit(aVar, this.baseUrl, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.validateEagerly);
        }

        public List<d.a> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public Builder callFactory(d.a aVar) {
            A.b(aVar, "factory == null");
            this.callFactory = aVar;
            return this;
        }

        public Builder callbackExecutor(Executor executor) {
            A.b(executor, "executor == null");
            this.callbackExecutor = executor;
            return this;
        }

        public Builder client(OkHttpClient okHttpClient) {
            A.b(okHttpClient, "client == null");
            return callFactory(okHttpClient);
        }

        public List<h.a> converterFactories() {
            return this.converterFactories;
        }

        public Builder validateEagerly(boolean z10) {
            this.validateEagerly = z10;
            return this;
        }

        public Builder baseUrl(HttpUrl httpUrl) {
            A.b(httpUrl, "baseUrl == null");
            if ("".equals(httpUrl.f225229f.get(r0.size() - 1))) {
                this.baseUrl = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public Builder() {
            this(r.g());
        }

        public Builder(Retrofit retrofit) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            r rVarG = r.g();
            this.platform = rVarG;
            this.callFactory = retrofit.f237633b;
            this.baseUrl = retrofit.f237634c;
            int size = retrofit.f237635d.size() - rVarG.e();
            for (int i10 = 1; i10 < size; i10++) {
                this.converterFactories.add(retrofit.f237635d.get(i10));
            }
            int size2 = retrofit.f237636e.size() - this.platform.b();
            for (int i11 = 0; i11 < size2; i11++) {
                this.callAdapterFactories.add(retrofit.f237636e.get(i11));
            }
            this.callbackExecutor = retrofit.f237637f;
            this.validateEagerly = retrofit.f237638g;
        }
    }
}
