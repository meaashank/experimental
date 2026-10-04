package c7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class D extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f131239f;

    public D(String str, int i10) {
        super(str);
        this.f131239f = i10;
    }

    @Override // c7.m
    public boolean b(Object obj, Method method, Object... objArr) {
        t8.b.a(method, t8.b.g(objArr, this.f131239f), "String from index " + this.f131239f);
        return true;
    }
}
