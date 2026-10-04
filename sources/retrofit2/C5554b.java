package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.L0;
import retrofit2.h;

/* JADX INFO: renamed from: retrofit2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C5554b extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f237643a = true;

    /* JADX INFO: renamed from: retrofit2.b$a */
    public static final class a implements h<okhttp3.u, okhttp3.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f237644a = new a();

        @Override // retrofit2.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public okhttp3.u a(okhttp3.u uVar) throws IOException {
            try {
                return A.a(uVar);
            } finally {
                uVar.close();
            }
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$b, reason: collision with other inner class name */
    public static final class C0873b implements h<okhttp3.t, okhttp3.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0873b f237645a = new C0873b();

        @Override // retrofit2.h
        public okhttp3.t a(okhttp3.t tVar) throws IOException {
            return tVar;
        }

        public okhttp3.t b(okhttp3.t tVar) {
            return tVar;
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$c */
    public static final class c implements h<okhttp3.u, okhttp3.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f237646a = new c();

        @Override // retrofit2.h
        public okhttp3.u a(okhttp3.u uVar) throws IOException {
            return uVar;
        }

        public okhttp3.u b(okhttp3.u uVar) {
            return uVar;
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$d */
    public static final class d implements h<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f237647a = new d();

        @Override // retrofit2.h
        public String a(Object obj) throws IOException {
            return obj.toString();
        }

        public String b(Object obj) {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$e */
    public static final class e implements h<okhttp3.u, L0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f237648a = new e();

        @Override // retrofit2.h
        public L0 a(okhttp3.u uVar) throws IOException {
            uVar.close();
            return L0.f217464a;
        }

        public L0 b(okhttp3.u uVar) {
            uVar.close();
            return L0.f217464a;
        }
    }

    /* JADX INFO: renamed from: retrofit2.b$f */
    public static final class f implements h<okhttp3.u, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f237649a = new f();

        @Override // retrofit2.h
        public Void a(okhttp3.u uVar) throws IOException {
            uVar.close();
            return null;
        }

        public Void b(okhttp3.u uVar) {
            uVar.close();
            return null;
        }
    }

    @Override // retrofit2.h.a
    @Nullable
    public h<?, okhttp3.t> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (okhttp3.t.class.isAssignableFrom(A.i(type))) {
            return C0873b.f237645a;
        }
        return null;
    }

    @Override // retrofit2.h.a
    @Nullable
    public h<okhttp3.u, ?> d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == okhttp3.u.class) {
            return A.m(annotationArr, Rd.w.class) ? c.f237646a : a.f237644a;
        }
        if (type == Void.class) {
            return f.f237649a;
        }
        if (!this.f237643a || type != L0.class) {
            return null;
        }
        try {
            return e.f237648a;
        } catch (NoClassDefFoundError unused) {
            this.f237643a = false;
            return null;
        }
    }
}
