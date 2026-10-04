package m7;

import android.os.IInterface;
import c7.AbstractC2950b;
import c7.InterfaceC2949a;
import c7.n;
import c7.x;
import java.lang.reflect.Method;
import o7.C5333b;

/* JADX INFO: renamed from: m7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2949a(c.class)
public class C5205b extends AbstractC2950b<IInterface> {

    /* JADX INFO: renamed from: m7.b$a */
    public class a extends n {
        public a(String str) {
            super(str);
        }

        @Override // c7.m
        public boolean b(Object obj, Method method, Object... objArr) {
            if (objArr == null) {
                return true;
            }
            for (Object obj2 : objArr) {
                if (obj2 != null && "android.app.assist.AssistStructure".equals(obj2.getClass().getName())) {
                    C5333b.a(obj2);
                    return true;
                }
            }
            return true;
        }
    }

    public C5205b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        n nVar = new n("moveTaskToFront");
        nVar.u0(new x());
        f(nVar);
        f(new a("reportAssistContextExtras"));
    }
}
