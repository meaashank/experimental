package com.mbridge.msdk.config.component.common.express.operator;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f154301a;

    public t(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f154301a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String str2;
        if (obj != null && !(obj instanceof String)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (obj == null) {
            obj = "";
        }
        try {
        } catch (Exception e10) {
            q0.b("UrlOperator", e10.getMessage());
        }
        Uri uri = !TextUtils.isEmpty(obj.toString()) ? Uri.parse(obj.toString()) : null;
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("822"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(c(uri, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("823"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(uri, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("824"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(uri, list));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("884"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getHost());
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("885"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getScheme());
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("825"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(uri == null ? null : uri.getQuery());
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("826"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(b(uri));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("827"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(uri));
            }
            if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("828"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
            }
            if (uri == null) {
                str2 = null;
            } else {
                str2 = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str2);
        } catch (Exception e11) {
            q0.b("UrlOperator", e11.getMessage(), e11);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Object c(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && list.size() == 2) {
            String strValueOf = String.valueOf(list.get(0));
            String strValueOf2 = String.valueOf(list.get(1));
            if (!TextUtils.isEmpty(strValueOf) && !TextUtils.isEmpty(strValueOf2)) {
                Map<String, String> mapA = a(uri);
                mapA.put(strValueOf, strValueOf2);
                builderBuildUpon.clearQuery();
                for (Map.Entry<String, String> entry : mapA.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return builderBuildUpon.build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private Object a(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String strValueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(strValueOf)) {
                return builderBuildUpon.authority(strValueOf).build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    private Map<String, String> a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap map = new HashMap();
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            for (String str : query.split("&")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("822")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("823")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("824")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("884")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("885")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("825")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("826")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("827")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("828"));
    }

    private Object b(Uri uri, List<Object> list) {
        if (uri == null) {
            return null;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (list != null && !list.isEmpty()) {
            String strValueOf = String.valueOf(list.get(0));
            if (!TextUtils.isEmpty(strValueOf)) {
                Map<String, String> mapA = a(uri);
                mapA.remove(strValueOf.trim());
                builderBuildUpon.clearQuery();
                for (Map.Entry<String, String> entry : mapA.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                return builderBuildUpon.build().toString();
            }
        }
        return builderBuildUpon.build().toString();
    }

    private Object b(Uri uri) {
        if (uri == null) {
            return null;
        }
        String query = uri.getQuery();
        if (!TextUtils.isEmpty(query)) {
            String[] strArrSplit = query.split("&");
            if (strArrSplit.length > 0) {
                return Arrays.asList(strArrSplit);
            }
        }
        return null;
    }
}
