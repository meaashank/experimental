package y7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.m;
import java.lang.reflect.Method;
import v8.C5707q;

/* JADX INFO: renamed from: y7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5841b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: y7.b$a */
    public static class a extends m {
        public a() {
        }

        @Override // c7.m
        public String A() {
            return "getSerial";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().k();
        }

        public a(c cVar) {
        }
    }

    /* JADX INFO: renamed from: y7.b$b, reason: collision with other inner class name */
    public static class C0910b extends m {
        public C0910b() {
        }

        @Override // c7.m
        public String A() {
            return "getSerialForPackage";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            return C5707q.c().k();
        }

        public C0910b(c cVar) {
        }
    }

    public C5841b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new a());
        f(new C0910b());
    }
}
