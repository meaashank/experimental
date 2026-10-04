package Y7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.I;
import c7.n;
import c7.x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AbstractC2950b<IInterface> {

    public class a extends n {
        public a(String str) {
            super(str);
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                b.s(b.this, e10);
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: Y7.b$b, reason: collision with other inner class name */
    public class C0153b extends n {
        public C0153b(String str) {
            super(str);
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e10) {
                b.s(b.this, e10);
                return 0;
            }
        }
    }

    public b(IInterface iInterface) {
        super(iInterface);
    }

    public static /* bridge */ /* synthetic */ Object s(b bVar, InvocationTargetException invocationTargetException) throws Throwable {
        bVar.t(invocationTargetException);
        return 0;
    }

    @Override // c7.AbstractC2950b
    public void r() {
        g(new x());
        f(new a("acquireWakeLock"));
        f(new C0153b("acquireWakeLockWithUid"));
        f(new I("updateWakeLockWorkSource", 0));
    }

    public final Object t(InvocationTargetException invocationTargetException) throws Throwable {
        if (invocationTargetException.getCause() instanceof SecurityException) {
            return 0;
        }
        throw invocationTargetException.getCause();
    }
}
