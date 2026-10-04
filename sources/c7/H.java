package c7;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class H extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f131245f;

    public H(String str, int i10) {
        super(str);
        this.f131245f = i10;
    }

    @Override // c7.m
    public boolean b(Object obj, Method method, Object... objArr) {
        int iIntValue = ((Integer) objArr[this.f131245f]).intValue();
        if (iIntValue != m.L() && iIntValue != m.K()) {
            return true;
        }
        objArr[this.f131245f] = Integer.valueOf(m.F());
        return true;
    }
}
