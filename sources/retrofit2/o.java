package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.h;

/* JADX INFO: loaded from: classes8.dex */
@IgnoreJRERequirement
public final class o extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h.a f237696a = new o();

    @IgnoreJRERequirement
    public static final class a<T> implements h<okhttp3.u, Optional<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h<okhttp3.u, T> f237697a;

        public a(h<okhttp3.u, T> hVar) {
            this.f237697a = hVar;
        }

        @Override // retrofit2.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional<T> a(okhttp3.u uVar) throws IOException {
            return Optional.ofNullable(this.f237697a.a(uVar));
        }
    }

    @Override // retrofit2.h.a
    @Nullable
    public h<okhttp3.u, ?> d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (A.i(type) != n.a()) {
            return null;
        }
        return new a(retrofit.o(A.h(0, (ParameterizedType) type), annotationArr));
    }
}
