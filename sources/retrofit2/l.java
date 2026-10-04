package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f237679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<?> f237680b;

    public l(Method method, List<?> list) {
        this.f237679a = method;
        this.f237680b = Collections.unmodifiableList(list);
    }

    public static l c(Method method, List<?> list) {
        A.b(method, "method == null");
        A.b(list, "arguments == null");
        return new l(method, new ArrayList(list));
    }

    public List<?> a() {
        return this.f237680b;
    }

    public Method b() {
        return this.f237679a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f237679a.getDeclaringClass().getName(), this.f237679a.getName(), this.f237680b);
    }
}
