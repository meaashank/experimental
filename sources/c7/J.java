package c7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class J<T> extends n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f131247g = "asdf-".concat(J.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public T f131248f;

    public J(String str, T t10) {
        super(str);
        this.f131248f = t10;
    }

    @Override // c7.m
    public Object c(Object obj, Method method, Object... objArr) throws Throwable {
        return this.f131248f;
    }
}
