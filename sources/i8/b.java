package i8;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.m;
import java.lang.reflect.Method;
import v8.C5707q;

/* JADX INFO: loaded from: classes6.dex */
public class b extends AbstractC2950b<IInterface> {

    public class a extends m {
        public a() {
        }

        @Override // c7.m
        public String A() {
            return "getUniqueDeviceId";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().f();
        }
    }

    public b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new a());
    }
}
