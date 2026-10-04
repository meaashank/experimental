package c7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class I extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f131246f;

    public I(String str, Object obj) {
        super(str);
        this.f131246f = obj;
    }

    @Override // c7.m
    public Object c(Object obj, Method method, Object... objArr) throws Throwable {
        return this.f131246f;
    }

    public Object w0() {
        return this.f131246f;
    }
}
