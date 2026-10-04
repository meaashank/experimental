package h3;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f202401f = "ThumbStreamOpener";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C4487a f202402g = new C4487a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4487a f202403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f202404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f202405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContentResolver f202406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<ImageHeaderParser> f202407e;

    public e(List<ImageHeaderParser> list, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this(list, f202402g, dVar, bVar, contentResolver);
    }

    public int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.f202406d.openInputStream(uri);
                int iB = com.bumptech.glide.load.a.b(this.f202407e, inputStreamOpenInputStream, this.f202405c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return iB;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException e10) {
            if (Log.isLoggable(f202401f, 3)) {
                Log.d(f202401f, "Failed to open uri: " + uri, e10);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x001d: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:30), block:B:11:0x001d */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(@androidx.annotation.NonNull android.net.Uri r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            java.lang.String r1 = "Failed to query for thumbnail for Uri: "
            r2 = 0
            h3.d r3 = r6.f202404b     // Catch: java.lang.Throwable -> L27 java.lang.SecurityException -> L29
            android.database.Cursor r3 = r3.a(r7)     // Catch: java.lang.Throwable -> L27 java.lang.SecurityException -> L29
            if (r3 == 0) goto L21
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L1c java.lang.SecurityException -> L1f
            if (r4 == 0) goto L21
            r4 = 0
            java.lang.String r7 = r3.getString(r4)     // Catch: java.lang.Throwable -> L1c java.lang.SecurityException -> L1f
            r3.close()
            return r7
        L1c:
            r7 = move-exception
            r2 = r3
            goto L47
        L1f:
            r4 = move-exception
            goto L2b
        L21:
            if (r3 == 0) goto L46
            r3.close()
            return r2
        L27:
            r7 = move-exception
            goto L47
        L29:
            r4 = move-exception
            r3 = r2
        L2b:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r5.append(r7)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L1c
            android.util.Log.d(r0, r7, r4)     // Catch: java.lang.Throwable -> L1c
        L41:
            if (r3 == 0) goto L46
            r3.close()
        L46:
            return r2
        L47:
            if (r2 == 0) goto L4c
            r2.close()
        L4c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.e.b(android.net.Uri):java.lang.String");
    }

    public final boolean c(File file) {
        return this.f202403a.a(file) && 0 < this.f202403a.c(file);
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f202403a.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f202406d.openInputStream(uriFromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
        }
    }

    public e(List<ImageHeaderParser> list, C4487a c4487a, d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, ContentResolver contentResolver) {
        this.f202403a = c4487a;
        this.f202404b = dVar;
        this.f202405c = bVar;
        this.f202406d = contentResolver;
        this.f202407e = list;
    }
}
