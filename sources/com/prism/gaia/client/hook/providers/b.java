package com.prism.gaia.client.hook.providers;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import c7.C2959k;
import com.prism.commons.utils.C3838b;
import com.prism.gaia.download.j;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
public class b extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f164258l = "notificationpackage";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f164259m = "is_public_api";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f164260n = "otheruid";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f164261o = "cookiedata";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f164262p = "notificationclass";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f164263q = "http_header_";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f164264r = "hint";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f164265s = "destination";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f164266t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f164267u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f164268v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f164269w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f164270x = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f164271y = 5;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f164272z = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f164273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f164257k = "asdf-".concat(b.class.getSimpleName());

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f164256A = {"otheruid", "notificationclass"};

    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Cursor f164274a;

        public a(Cursor cursor) {
            this.f164274a = cursor;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(this.f164274a, objArr);
            } finally {
                String unused = b.this.f164273j;
                method.getName();
            }
        }
    }

    public b(Object obj, String str) {
        super(obj, str);
        this.f164273j = "asdf-".concat("Cursor") + "Proxy";
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public Uri k(C2959k c2959k, Uri uri, ContentValues contentValues) throws InvocationTargetException {
        contentValues.get("notificationpackage");
        return (Uri) c2959k.a();
    }

    @Override // com.prism.gaia.client.hook.providers.c, com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public void n(Method method, Object... objArr) {
        super.n(method, objArr);
        if (!j.b.f164732b.equals(g())) {
            throw new IllegalStateException("Illegal authority: " + g() + " in GaiaDownloadProviderProxyHandler");
        }
        int iJ = objArr != null ? C3838b.j(objArr, Uri.class) : -1;
        if (iJ > -1) {
            objArr[iJ] = r((Uri) objArr[iJ]);
        } else {
            if (objArr == null || objArr.length <= 1) {
                return;
            }
            Object obj = objArr[1];
        }
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public Cursor o(C2959k c2959k, Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws InvocationTargetException {
        Cursor cursor = (Cursor) c2959k.a();
        if (cursor != null) {
            return (Cursor) Proxy.newProxyInstance(Cursor.class.getClassLoader(), new Class[]{Cursor.class}, new a(cursor));
        }
        return null;
    }

    public final Uri r(Uri uri) {
        if ("downloads".equals(uri.getAuthority())) {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.authority(j.b.f164732b);
            return builderBuildUpon.build();
        }
        throw new SecurityException("Uri:" + uri + " is not match authority:downloads");
    }
}
