package com.prism.gaia.client.hook.providers;

import android.content.AttributionSource;
import c7.o;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.content.AttributionSourceCompat2;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class c extends ProviderProxyHandler {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f164276i = "asdf-".concat(c.class.getSimpleName());

    public c(Object obj, String str) {
        super(obj, str);
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public void n(Method method, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        String strV = GaiaContext.j().v();
        String strR = GaiaContext.f164212y.r();
        if (strV == null || strR == null || strV.equals(strR)) {
            return;
        }
        if (C3841e.z() && o.a(objArr[0])) {
            AttributionSource attributionSourceA = b7.b.a(objArr[0]);
            if (strV.equals(attributionSourceA.getPackageName())) {
                objArr[0] = AttributionSourceCompat2.Util.withPackageName(attributionSourceA, strR);
                method.getName();
                return;
            }
            return;
        }
        Object obj = objArr[0];
        if ((obj instanceof String) && strV.equals(obj)) {
            objArr[0] = strR;
            method.getName();
        }
    }
}
