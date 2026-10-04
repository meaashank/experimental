package com.prism.gaia.client.hook.providers;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import c7.C2959k;
import com.prism.commons.utils.C3841e;
import com.prism.gaia.client.GaiaContext;
import com.prism.gaia.client.hook.providers.ProviderProxyHandler;
import e7.C4369a;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class d extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f164278k = "notificationpackage";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f164279l = "hint";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f164280m = "is_public_api";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f164281n = "otheruid";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f164282o = "cookiedata";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f164283p = "notificationclass";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f164284q = "http_header_";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f164286s = "_id";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f164287t = "android:query-arg-sql-selection";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f164277j = "asdf-".concat(d.class.getSimpleName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f164285r = {"otheruid", "notificationclass"};

    public d(Object obj, String str) {
        super(obj, str);
    }

    public static void q(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return;
            }
            C4369a.g(Long.parseLong(lastPathSegment));
        } catch (Throwable unused) {
            uri.toString();
        }
    }

    public static Cursor r(Cursor cursor, List<Integer> list) {
        String[] columnNames = cursor.getColumnNames();
        MatrixCursor matrixCursor = new MatrixCursor(columnNames, list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (cursor.moveToPosition(it.next().intValue())) {
                MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
                for (int i10 = 0; i10 < columnNames.length; i10++) {
                    int type = cursor.getType(i10);
                    if (type == 0) {
                        rowBuilderNewRow.add(null);
                    } else if (type == 1) {
                        rowBuilderNewRow.add(Long.valueOf(cursor.getLong(i10)));
                    } else if (type == 2) {
                        rowBuilderNewRow.add(Double.valueOf(cursor.getDouble(i10)));
                    } else if (type != 4) {
                        rowBuilderNewRow.add(cursor.getString(i10));
                    } else {
                        rowBuilderNewRow.add(cursor.getBlob(i10));
                    }
                }
            }
        }
        cursor.close();
        return matrixCursor;
    }

    public static Cursor s(Uri uri, String str, Cursor cursor) {
        int columnIndex;
        long jH = C4369a.h();
        if (cursor == null || jH == -1 || (columnIndex = cursor.getColumnIndex("_id")) < 0) {
            return cursor;
        }
        Set<Long> setC = C4369a.c();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; cursor.moveToPosition(i11); i11++) {
            long j10 = cursor.getLong(columnIndex);
            hashSet.add(Long.valueOf(j10));
            if (j10 <= jH || setC.contains(Long.valueOf(j10))) {
                arrayList.add(Integer.valueOf(i11));
            } else {
                i10++;
            }
        }
        if (str == null && !u(uri)) {
            C4369a.e(hashSet);
        }
        if (i10 == 0) {
            cursor.moveToPosition(-1);
            return cursor;
        }
        GaiaContext.f164212y.getClass();
        return r(cursor, arrayList);
    }

    public static Uri t(Uri uri) {
        return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(Paths.get(uri.getPath(), new String[0]).normalize().toString()).build();
    }

    public static boolean u(Uri uri) {
        return v(uri) != null;
    }

    public static Long v(Uri uri) {
        String lastPathSegment;
        if (uri == null) {
            lastPathSegment = null;
        } else {
            try {
                lastPathSegment = uri.getLastPathSegment();
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (lastPathSegment == null) {
            return null;
        }
        return Long.valueOf(lastPathSegment);
    }

    public static String w(String str, long j10, Set<Long> set) {
        StringBuilder sb2 = new StringBuilder("(_id <= ");
        sb2.append(j10);
        if (!set.isEmpty()) {
            sb2.append(" OR _id IN (");
            boolean z10 = true;
            for (Long l10 : set) {
                if (!z10) {
                    sb2.append(',');
                }
                sb2.append(l10.longValue());
                z10 = false;
            }
            sb2.append(')');
        }
        sb2.append(')');
        if (str == null || str.trim().isEmpty()) {
            return sb2.toString();
        }
        return "(" + str + ") AND " + ((Object) sb2);
    }

    public static void x(C2959k c2959k, int i10, String str) {
        if (!C3841e.x()) {
            c2959k.d(i10, str);
            return;
        }
        Bundle bundle = (Bundle) c2959k.c(i10);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        bundle2.putString("android:query-arg-sql-selection", str);
        c2959k.d(i10, bundle2);
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public int e(C2959k c2959k, Uri uri, String str, String[] strArr) throws InvocationTargetException {
        long jH = C4369a.h();
        if (jH == -1) {
            return super.e(c2959k, uri, str, strArr);
        }
        try {
            Set<Long> setC = C4369a.c();
            Long lV = v(uri);
            if (lV == null) {
                x(c2959k, ProviderProxyHandler.h(ProviderProxyHandler.MethodType.DELETE) + 1, w(str, jH, setC));
                return ((Integer) c2959k.a()).intValue();
            }
            if (lV.longValue() <= jH || setC.contains(lV)) {
                return super.e(c2959k, uri, str, strArr);
            }
            GaiaContext.f164212y.getClass();
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public Uri k(C2959k c2959k, Uri uri, ContentValues contentValues) throws InvocationTargetException {
        if (contentValues.containsKey("notificationpackage")) {
            contentValues.put("notificationpackage", GaiaContext.j().v());
        }
        if (contentValues.containsKey("hint")) {
            try {
                contentValues.put("hint", t(Uri.parse(contentValues.getAsString("hint"))).toString());
            } catch (Throwable unused) {
            }
        }
        if (contentValues.containsKey("cookiedata")) {
            String asString = contentValues.getAsString("cookiedata");
            contentValues.remove("cookiedata");
            int i10 = 0;
            while (true) {
                if (!contentValues.containsKey("http_header_" + i10)) {
                    break;
                }
                i10++;
            }
            contentValues.put(android.support.v4.media.c.a("http_header_", i10), "Cookie: " + asString);
        }
        if (!contentValues.containsKey("is_public_api")) {
            contentValues.put("is_public_api", Boolean.TRUE);
        }
        for (String str : f164285r) {
            if (contentValues.containsKey(str)) {
                contentValues.remove(str);
            }
        }
        Uri uri2 = (Uri) c2959k.a();
        q(uri2);
        return uri2;
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public Cursor o(C2959k c2959k, Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws InvocationTargetException {
        Cursor cursor = (Cursor) c2959k.a();
        try {
            return s(uri, str, cursor);
        } catch (Throwable unused) {
            return cursor;
        }
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public int p(C2959k c2959k, Uri uri, ContentValues contentValues, String str, String[] strArr) throws InvocationTargetException {
        long jH = C4369a.h();
        if (jH == -1) {
            return super.p(c2959k, uri, contentValues, str, strArr);
        }
        try {
            Set<Long> setC = C4369a.c();
            Long lV = v(uri);
            if (lV == null) {
                x(c2959k, ProviderProxyHandler.h(ProviderProxyHandler.MethodType.UPDATE) + 2, w(str, jH, setC));
                return ((Integer) c2959k.a()).intValue();
            }
            if (lV.longValue() <= jH || setC.contains(lV)) {
                return super.p(c2959k, uri, contentValues, str, strArr);
            }
            GaiaContext.f164212y.getClass();
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
