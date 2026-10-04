package m1;

import Q0.g;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f221080a = "DocumentFile";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f221081b = 512;

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(p(context, uri, "mime_type", null));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strP = p(context, uri, "mime_type", null);
        int iO = (int) o(context, uri, "flags", 0);
        if (TextUtils.isEmpty(strP)) {
            return false;
        }
        if ((iO & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strP) || (iO & 8) == 0) {
            return (TextUtils.isEmpty(strP) || (iO & 2) == 0) ? false : true;
        }
        return true;
    }

    public static void c(@Nullable AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                g.a(autoCloseable);
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
                boolean z10 = cursorQuery.getCount() > 0;
                c(cursorQuery);
                return z10;
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
                c(cursorQuery);
                return false;
            }
        } catch (Throwable th) {
            c(cursorQuery);
            throw th;
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, "flags", 0L);
    }

    @Nullable
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", null);
    }

    @Nullable
    public static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", null);
    }

    @Nullable
    public static String h(Context context, Uri uri) {
        String strG = g(context, uri);
        if ("vnd.android.document/directory".equals(strG)) {
            return null;
        }
        return strG;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String strG = g(context, uri);
        return ("vnd.android.document/directory".equals(strG) || TextUtils.isEmpty(strG)) ? false : true;
    }

    public static boolean k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (e(context, uri) & 512) != 0;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0L);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0L);
    }

    public static int n(Context context, Uri uri, String str, int i10) {
        return (int) o(context, uri, str, i10);
    }

    public static long o(Context context, Uri uri, String str, long j10) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    c(cursorQuery);
                    return j10;
                }
                long j11 = cursorQuery.getLong(0);
                c(cursorQuery);
                return j11;
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
                c(cursorQuery);
                return j10;
            }
        } catch (Throwable th) {
            c(cursorQuery);
            throw th;
        }
        c(cursorQuery);
        throw th;
    }

    @Nullable
    public static String p(Context context, Uri uri, String str, @Nullable String str2) {
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uri, new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                    c(cursorQuery);
                    return str2;
                }
                String string = cursorQuery.getString(0);
                c(cursorQuery);
                return string;
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
                c(cursorQuery);
                return str2;
            }
        } catch (Throwable th) {
            c(cursorQuery);
            throw th;
        }
        c(cursorQuery);
        throw th;
    }
}
