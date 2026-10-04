package com.prism.gaia.client.hook.providers;

import B0.C0922f;
import C4.q;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.i;
import androidx.core.app.NotificationCompat;
import c7.C2959k;
import com.mbridge.msdk.MBridgeConstans;
import com.prism.commons.utils.C3841e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v8.C5707q;

/* JADX INFO: loaded from: classes6.dex */
public class e extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f164288j = "asdf-".concat(e.class.getSimpleName());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f164289k = "_track_generation";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f164290l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f164291m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map<String, String> f164292n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f164293o = "com.app.hider.master.promax.{";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Pattern f164294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Pattern f164295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Set<String> f164296r;

    static {
        HashMap map = new HashMap();
        f164292n = map;
        map.put("user_setup_complete", "1");
        map.put("install_non_market_apps", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        f164294p = Pattern.compile("[0-9a-fA-F]+");
        f164295q = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/]+");
        HashSet hashSet = new HashSet();
        f164296r = hashSet;
        hashSet.add("iflytek.deviceid.key");
    }

    public e(Object obj, String str) {
        super(obj, str);
    }

    public static int u(String str) {
        if (str.startsWith("GET_")) {
            return 0;
        }
        return str.startsWith("PUT_") ? 1 : -1;
    }

    public static boolean w(String str) {
        return str.endsWith("secure");
    }

    public final String A(String str, String[] strArr) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace(q.f17581a, "");
        if ((strReplace.startsWith("name=?") || strReplace.equals("name=?")) && strArr != null && strArr.length > 0) {
            return strArr[0];
        }
        Matcher matcher = Pattern.compile("name=['\"]([^'\"]+)['\"]").matcher(strReplace);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public final String B(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return C3841e.p() ? bundle.getString("value") : bundle.getString(str);
    }

    public final Bundle C(String str, String str2) {
        return D(str, str2, null);
    }

    public final Bundle D(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!C3841e.p()) {
            bundle.putString(str, str2);
            return bundle;
        }
        bundle.putString("name", str);
        bundle.putString("value", str2);
        return bundle;
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public Bundle b(C2959k c2959k, String str, String str2, Bundle bundle) throws InvocationTargetException {
        Object[] objArr = c2959k.f131262c;
        if (u(str) == 0) {
            String str3 = f164292n.get(str2);
            if (str3 != null) {
                return D(str2, str3, null);
            }
            if ("android_id".equals(str2)) {
                C5707q.c().d();
                return D("android_id", C5707q.f239892c.d(), null);
            }
            if ("bluetooth_address".equals(str2)) {
                return D("bluetooth_address", !C3841e.s() ? C5707q.c().e() : null, null);
            }
        }
        int i10 = ProviderProxyHandler.i(NotificationCompat.CATEGORY_CALL);
        boolean z10 = str2 != null && x(str2);
        if (z10) {
            c2959k.d(i10 + 1, r(str2));
        }
        try {
            Bundle bundle2 = (Bundle) c2959k.a();
            return z10 ? D(str2, B(bundle2, str2), bundle2) : bundle2;
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof SecurityException) {
                return null;
            }
            throw e10;
        }
    }

    @Override // com.prism.gaia.client.hook.providers.a, com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public void n(Method method, Object... objArr) {
        super.n(method, objArr);
    }

    @Override // com.prism.gaia.client.hook.providers.ProviderProxyHandler
    public Cursor o(C2959k c2959k, Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws InvocationTargetException {
        uri.toString();
        Arrays.toString(strArr);
        Arrays.toString(strArr2);
        Cursor cursor = (Cursor) c2959k.a();
        try {
            return t(cursor, str, strArr2);
        } catch (Throwable unused) {
            return cursor;
        }
    }

    public final String q(String str) {
        return !str.startsWith(f164293o) ? str : C0922f.a(str, 1, 29);
    }

    public final String r(String str) {
        return i.a(f164293o, str, "}");
    }

    public final String s(String str) {
        String str2 = f164292n.get(str);
        if (str2 != null) {
            return str2;
        }
        if ("android_id".equals(str)) {
            return C5707q.c().d();
        }
        if (!"bluetooth_address".equals(str) || C3841e.s()) {
            return null;
        }
        return C5707q.c().e();
    }

    public final Cursor t(Cursor cursor, String str, String[] strArr) {
        if (cursor == null) {
            return null;
        }
        int columnIndex = cursor.getColumnIndex("value");
        if (columnIndex >= 0) {
            int columnIndex2 = cursor.getColumnIndex("name");
            String strA = A(str, strArr);
            if (columnIndex2 >= 0 || y(strA)) {
                String[] columnNames = cursor.getColumnNames();
                MatrixCursor matrixCursor = new MatrixCursor(columnNames, cursor.getCount());
                int position = cursor.getPosition();
                cursor.moveToPosition(-1);
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    Object[] objArr = new Object[columnNames.length];
                    for (int i10 = 0; i10 < columnNames.length; i10++) {
                        int type = cursor.getType(i10);
                        if (type == 0) {
                            objArr[i10] = null;
                        } else if (type == 1) {
                            objArr[i10] = Long.valueOf(cursor.getLong(i10));
                        } else if (type == 2) {
                            objArr[i10] = Double.valueOf(cursor.getDouble(i10));
                        } else if (type != 4) {
                            objArr[i10] = cursor.getString(i10);
                        } else {
                            objArr[i10] = cursor.getBlob(i10);
                        }
                    }
                    String string = columnIndex2 >= 0 ? cursor.getString(columnIndex2) : strA;
                    if (y(string)) {
                        objArr[columnIndex] = s(string);
                        z10 = true;
                    }
                    matrixCursor.addRow(objArr);
                }
                if (z10) {
                    try {
                        cursor.close();
                    } catch (Throwable unused) {
                    }
                    return matrixCursor;
                }
                cursor.moveToPosition(position);
                return cursor;
            }
        }
        return cursor;
    }

    public final boolean v(String str) {
        return str.length() >= 16 && f164295q.matcher(str).matches();
    }

    public final boolean x(String str) {
        return z(str) || v(str);
    }

    public final boolean y(String str) {
        if (str != null) {
            return f164292n.containsKey(str) || "android_id".equals(str) || "bluetooth_address".equals(str);
        }
        return false;
    }

    public final boolean z(String str) {
        if (str.startsWith("com.tencent.") || str.startsWith("__MTA_DEVICE_") || f164296r.contains(str)) {
            return true;
        }
        return str.length() >= 24 && f164294p.matcher(str).matches();
    }
}
