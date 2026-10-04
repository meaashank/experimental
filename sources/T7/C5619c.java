package t7;

import android.net.ConnectivityManager;
import c7.m;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: t7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5619c {

    /* JADX INFO: renamed from: t7.c$a */
    public static class a extends m {
        @Override // c7.m
        public String A() {
            return "getActiveNetworkInfoForUid";
        }

        @Override // c7.m
        public boolean P() {
            return m.Q();
        }

        @Override // c7.m
        public Object c(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) m.v().getSystemService(C5617a.f239212e);
                if (connectivityManager != null) {
                    return connectivityManager.getActiveNetworkInfo();
                }
            } catch (Throwable unused) {
            }
            return method.invoke(obj, objArr);
        }
    }
}
