package c7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class F extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f131244f;

    public F(String str, int i10) {
        super(str);
        this.f131244f = i10;
    }

    @Override // c7.m
    public boolean b(Object obj, Method method, Object... objArr) {
        if (objArr == null) {
            return true;
        }
        int length = this.f131244f;
        if (length < 0) {
            length += objArr.length;
        }
        if (length < 0 || length >= objArr.length) {
            return true;
        }
        Object obj2 = objArr[length];
        if (!(obj2 instanceof String)) {
            return true;
        }
        t8.b.a(method, (String) obj2, "String at index " + this.f131244f);
        objArr[length] = m.w();
        return true;
    }
}
