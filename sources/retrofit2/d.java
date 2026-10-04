package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface d<R, T> {

    public static abstract class a {
        public static Type b(int i10, ParameterizedType parameterizedType) {
            return A.h(i10, parameterizedType);
        }

        public static Class<?> c(Type type) {
            return A.i(type);
        }

        @Nullable
        public abstract d<?, ?> a(Type type, Annotation[] annotationArr, Retrofit retrofit);
    }

    Type a();

    T b(c<R> cVar);
}
