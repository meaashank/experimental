package k8;

import android.annotation.TargetApi;
import android.os.IInterface;
import c7.AbstractC2950b;
import c7.G;
import c7.m;
import c7.x;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
@TargetApi(22)
public class b extends AbstractC2950b<IInterface> {

    public static class a extends m {
        public a() {
        }

        @Override // c7.m
        public String A() {
            return "getAppStandbyBucket";
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            Object obj2;
            Object obj3;
            if (objArr.length > 1 && (obj3 = objArr[0]) != null && (obj3 instanceof String)) {
                objArr[0] = m.w();
            }
            if (objArr.length > 2 && (obj2 = objArr[1]) != null && (obj2 instanceof String)) {
                objArr[1] = m.w();
            }
            return method.invoke(obj, objArr);
        }

        public a(c cVar) {
        }
    }

    public b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new G("queryUsageStats"));
        f(new G("queryConfigurations"));
        f(new G("queryEvents"));
        f(new a());
        g(new x());
    }
}
