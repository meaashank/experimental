package com.prism.gaia.naked.compat.android.app;

import W6.c;
import android.content.Context;
import android.content.ContextWrapper;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.naked.metadata.android.app.ContextImplCAG;
import v8.C5705o;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class ContextImplCompat2 {

    public static class Util {
        private static String TAG = "asdf-".concat(Util.class.getSimpleName());

        public static Context getContextImpl(Context context) {
            int i10 = 0;
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                i10++;
                if (i10 >= 10) {
                    C5705o.c().e(new RuntimeException("fixContext over due to too deep Context on "), context.getPackageName(), GaiaContext.j().Q(), "FIX_CONTEXT", null);
                    GaiaContext.f164212y.getClass();
                    break;
                }
            }
            return baseContext;
        }

        public static Object getLoadedApk(Context context) {
            return ContextImplCAG.f165289G.mPackageInfo().get(getContextImpl(context));
        }

        public static Context getOuterContext(Context context) {
            return ContextImplCAG.f165289G.mOuterContext().get(getContextImpl(context));
        }
    }
}
