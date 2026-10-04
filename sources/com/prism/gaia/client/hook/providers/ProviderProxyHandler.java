package com.prism.gaia.client.hook.providers;

import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.core.app.NotificationCompat;
import c7.C2959k;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.prism.commons.utils.C3841e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ProviderProxyHandler implements InvocationHandler {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f164248d = "android:query-arg-sql-selection";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f164249e = "android:query-arg-sql-selection-args";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f164250f = "android:query-arg-sql-sort-order";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f164251g = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f164253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f164254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f164247c = "asdf-".concat(ProviderProxyHandler.class.getSimpleName());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap<String, AtomicInteger> f164252h = new ConcurrentHashMap<>();

    public enum MethodType {
        NULL,
        UN_CARE,
        CALL,
        INSERT,
        BULK_INSERT,
        DELETE,
        UPDATE,
        QUERY,
        OPEN_FILE,
        OPEN_ASSERT_FILE,
        OPEN_TYPED_ASSERT_FILE,
        CANONICALIZE,
        CANONICALIZE_ASYNC,
        UNCANONICALIZE,
        APPLY_BATCH,
        REFRESH,
        CHECK_URI_PERMISSION
    }

    public ProviderProxyHandler(Object obj, String str) {
        this.f164253a = obj;
        this.f164254b = str;
    }

    public static int c(String str) {
        AtomicInteger atomicIntegerPutIfAbsent;
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = f164252h;
        AtomicInteger atomicInteger = concurrentHashMap.get(str);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(str, (atomicInteger = new AtomicInteger()))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent;
        }
        return atomicInteger.incrementAndGet();
    }

    public static Object f(Method method) {
        Class<?> returnType = method.getReturnType();
        if (returnType == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (returnType == Integer.TYPE) {
            return 0;
        }
        return returnType == Long.TYPE ? 0L : null;
    }

    public static int h(MethodType methodType) {
        switch (methodType.ordinal()) {
            case 2:
                if (C3841e.z()) {
                    return 2;
                }
                if (C3841e.x()) {
                    return 3;
                }
                return C3841e.w() ? 2 : 1;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return (!C3841e.z() && C3841e.x()) ? 2 : 1;
            default:
                return 0;
        }
    }

    public static int i(String str) {
        return h(j(str));
    }

    public static MethodType j(String str) {
        return str == null ? MethodType.NULL : NotificationCompat.CATEGORY_CALL.equals(str) ? MethodType.CALL : "insert".equals(str) ? MethodType.INSERT : "bulkInsert".equals(str) ? MethodType.BULK_INSERT : "delete".equals(str) ? MethodType.DELETE : "update".equals(str) ? MethodType.UPDATE : "query".equals(str) ? MethodType.QUERY : "openFile".equals(str) ? MethodType.OPEN_FILE : "openAssertFile".equals(str) ? MethodType.OPEN_ASSERT_FILE : "openTypedAssertFile".equals(str) ? MethodType.OPEN_TYPED_ASSERT_FILE : "canonicalize".equals(str) ? MethodType.CANONICALIZE : "canonicalizeAsync".equals(str) ? MethodType.CANONICALIZE_ASYNC : "uncanonicalize".equals(str) ? MethodType.UNCANONICALIZE : "applyBatch".equals(str) ? MethodType.APPLY_BATCH : ToolBar.REFRESH.equals(str) ? MethodType.REFRESH : "checkUriPermission".equals(str) ? MethodType.CHECK_URI_PERMISSION : MethodType.UN_CARE;
    }

    public int a(C2959k c2959k, Uri uri, ContentValues[] contentValuesArr) throws InvocationTargetException {
        return ((Integer) c2959k.a()).intValue();
    }

    public Bundle b(C2959k c2959k, String str, String str2, Bundle bundle) throws InvocationTargetException {
        return (Bundle) c2959k.a();
    }

    public boolean d() {
        return false;
    }

    public int e(C2959k c2959k, Uri uri, String str, String[] strArr) throws InvocationTargetException {
        return ((Integer) c2959k.a()).intValue();
    }

    public String g() {
        return this.f164254b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022e A[Catch: all -> 0x0233, TRY_LEAVE, TryCatch #11 {all -> 0x0233, blocks: (B:110:0x022a, B:112:0x022e), top: B:168:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023b A[Catch: all -> 0x02af, TryCatch #9 {all -> 0x02af, blocks: (B:116:0x0237, B:118:0x023b, B:120:0x0241), top: B:164:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.prism.gaia.client.hook.providers.ProviderProxyHandler, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.prism.gaia.client.hook.providers.ProviderProxyHandler] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(java.lang.Object r23, java.lang.reflect.Method r24, java.lang.Object... r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.client.hook.providers.ProviderProxyHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public Uri k(C2959k c2959k, Uri uri, ContentValues contentValues) throws InvocationTargetException {
        return (Uri) c2959k.a();
    }

    public AssetFileDescriptor l(C2959k c2959k, Uri uri, String str) throws InvocationTargetException {
        return (AssetFileDescriptor) c2959k.a();
    }

    public ParcelFileDescriptor m(C2959k c2959k, Uri uri, String str) throws InvocationTargetException {
        return (ParcelFileDescriptor) c2959k.a();
    }

    public void n(Method method, Object... objArr) {
    }

    public Cursor o(C2959k c2959k, Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws InvocationTargetException {
        return (Cursor) c2959k.a();
    }

    public int p(C2959k c2959k, Uri uri, ContentValues contentValues, String str, String[] strArr) throws InvocationTargetException {
        return ((Integer) c2959k.a()).intValue();
    }
}
