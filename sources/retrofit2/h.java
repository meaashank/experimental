package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface h<F, T> {

    public static abstract class a {
        public static Type a(int i10, ParameterizedType parameterizedType) {
            return A.h(i10, parameterizedType);
        }

        public static Class<?> b(Type type) {
            return A.i(type);
        }

        @Nullable
        public h<?, okhttp3.t> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
            return null;
        }

        @Nullable
        public h<okhttp3.u, ?> d(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }

        @Nullable
        public h<?, String> e(Type type, Annotation[] annotationArr, Retrofit retrofit) {
            return null;
        }
    }

    @Nullable
    T a(F f10) throws IOException;
}
