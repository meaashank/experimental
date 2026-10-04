package c7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class B extends n {
    public B(String str) {
        super(str);
    }

    @Override // c7.m
    public boolean b(Object obj, Method method, Object... objArr) {
        String strQ;
        if (objArr == null || (strQ = m.q()) == null) {
            return true;
        }
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (strQ.equals(objArr[i10])) {
                objArr[i10] = m.w();
                return true;
            }
        }
        return true;
    }
}
