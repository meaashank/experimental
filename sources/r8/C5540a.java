package r8;

import android.view.WindowManager;
import c7.m;
import c7.n;
import com.prism.commons.utils.C3838b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: r8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5540a extends n {
    public C5540a(String str) {
        super(str);
    }

    @Override // c7.m
    public Object c(Object obj, Method method, Object... objArr) throws Throwable {
        WindowManager.LayoutParams layoutParams;
        int iJ = C3838b.j(objArr, WindowManager.LayoutParams.class);
        if (iJ != -1 && (layoutParams = (WindowManager.LayoutParams) objArr[iJ]) != null) {
            layoutParams.packageName = m.w();
        }
        return method.invoke(obj, objArr);
    }
}
