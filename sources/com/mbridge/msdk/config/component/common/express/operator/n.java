package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f154287b = Arrays.asList(com.mbridge.msdk.config.component.common.util.c.c("841"), com.mbridge.msdk.config.component.common.util.c.c("842"), com.mbridge.msdk.config.component.common.util.c.c("843"), com.mbridge.msdk.config.component.common.util.c.c("844"), com.mbridge.msdk.config.component.common.util.c.c("845"), com.mbridge.msdk.config.component.common.util.c.c("846"), com.mbridge.msdk.config.component.common.util.c.c("847"), com.mbridge.msdk.config.component.common.util.c.c("848"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f154288a;

    public n(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f154288a = cVar;
    }

    private Object a(double d10) {
        return (Double.isNaN(d10) || Double.isInfinite(d10)) ? Double.valueOf(d10) : d10 == Math.floor(d10) ? Integer.valueOf((int) d10) : Double.valueOf(b(d10));
    }

    private double b(double d10) {
        return new BigDecimal(d10).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c A[Catch: Exception -> 0x0099, TryCatch #1 {Exception -> 0x0099, blocks: (B:43:0x0080, B:45:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b5, B:55:0x00c1, B:57:0x00ce, B:59:0x00da, B:61:0x00e8, B:64:0x00f6, B:65:0x0103, B:67:0x0108, B:69:0x0114, B:71:0x0121, B:74:0x012f, B:75:0x013c, B:77:0x0141, B:81:0x0151, B:83:0x0166, B:85:0x016b), top: B:91:0x0080 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(java.lang.String r11, java.lang.Object r12, java.util.List<java.lang.Object> r13) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.n.b(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (a(str)) {
            return b(str, obj, list);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("841")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("842")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("843")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("844")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("845")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("846")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("847")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("848"));
    }
}
