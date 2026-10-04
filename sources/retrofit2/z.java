package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes8.dex */
public abstract class z<T> {
    public static <T> z<T> b(Retrofit retrofit, Method method) {
        RequestFactory requestFactoryB = RequestFactory.b(retrofit, method);
        Type genericReturnType = method.getGenericReturnType();
        if (A.k(genericReturnType)) {
            throw A.o(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return k.e(retrofit, method, requestFactoryB);
        }
        throw A.o(method, null, "Service methods cannot return void.", new Object[0]);
    }

    public abstract T a(Object[] objArr);
}
