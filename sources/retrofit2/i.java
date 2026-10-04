package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.d;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d.a f237661a = new i();

    public class a implements d<Object, c<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f237662a;

        public a(Type type) {
            this.f237662a = type;
        }

        @Override // retrofit2.d
        public Type a() {
            return this.f237662a;
        }

        @Override // retrofit2.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c<Object> b(c<Object> cVar) {
            return cVar;
        }
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
