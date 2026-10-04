package com.prism.gaia.helper.compat;

import android.os.Parcelable;
import com.prism.gaia.naked.compat.com.android.internal.infra.AndroidFutureCompat2;
import com.prism.gaia.naked.metadata.android.content.pm.ParceledListSliceCAG;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class f {
    public static Object a(List list) {
        if (ParceledListSliceCAG.CJ18.ctor() != null) {
            return ParceledListSliceCAG.CJ18.ctor().newInstance(list);
        }
        Parcelable parcelableNewInstance = ParceledListSliceCAG.f165669C.ctor().newInstance();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParceledListSliceCAG.f165669C.append().call(parcelableNewInstance, it.next());
        }
        ParceledListSliceCAG.f165669C.setLastSlice().call(parcelableNewInstance, Boolean.TRUE);
        return parcelableNewInstance;
    }

    public static List b(Object obj) {
        return ParceledListSliceCAG.f165669C.getList().call(obj, new Object[0]);
    }

    public static boolean c(Method method) {
        return method != null && method.getReturnType() == ParceledListSliceCAG.f165669C.ORG_CLASS();
    }

    public static Object d(Method method, List<?> list) {
        if (method != null) {
            Class returnType = method.getReturnType();
            if (returnType == ParceledListSliceCAG.f165669C.ORG_CLASS()) {
                return a(list);
            }
            if (AndroidFutureCompat2.Util.isAndroidFuture(returnType)) {
                return AndroidFutureCompat2.Util.completedFuture(a(list));
            }
            if (!returnType.isInstance(list)) {
                try {
                    return returnType.getConstructor(List.class).newInstance(list);
                } catch (Throwable unused) {
                    method.getName();
                    return list;
                }
            }
        }
        return list;
    }
}
