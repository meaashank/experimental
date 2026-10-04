package com.prism.gaia.client.hook.providers;

import android.content.AttributionSource;
import c7.o;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.compat.android.content.AttributionSourceCompat2;
import java.lang.reflect.Method;
import v8.C5714x;

/* JADX INFO: loaded from: classes6.dex */
public class a extends ProviderProxyHandler {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f164255i = "asdf-".concat(a.class.getSimpleName());

    public a(Object obj, String str) {
        super(obj, str);
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public boolean d() {
        return true;
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public void n(Method method, Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        if (C3841e.z() && o.a(objArr[0])) {
            AttributionSource attributionSourceA = b7.b.a(objArr[0]);
            if (C5714x.j().Q(attributionSourceA.getPackageName())) {
                objArr[0] = AttributionSourceCompat2.Util.withPackageName(attributionSourceA, GaiaContext.j().v());
            }
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            if (C5714x.j().Q((String) obj)) {
                objArr[0] = GaiaContext.j().v();
            }
        }
    }
}
