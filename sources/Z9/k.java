package Z9;

import B0.C0923g;
import U6.b;
import U9.D;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import androidx.constraintlayout.motion.widget.s;
import androidx.multidex.MultiDexExtractor;
import ba.o;
import com.app.hider.master.promax.R;
import com.prism.hider.ui.I;
import com.prism.hider.vault.commons.B;
import g6.C4455a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f84425a = "ApkImportFlow";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f84426b = {".apkm", ".xapk", ".apks", ".apk"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Handler f84427c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile File f84428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f84429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f84430f;

    public interface a {
        void a(boolean z10);
    }

    public static /* synthetic */ void a(boolean z10, Context context, String str, String str2) {
        if (z10) {
            Toast.makeText(context, context.getString(R.string.hider_apk_import_done, str), 1).show();
        } else {
            Log.w(f84425a, s.a("import of ", str, " (", str2, ") failed"));
        }
    }

    public static /* synthetic */ void d(boolean[] zArr, I i10, Context context, File file, String str, DialogInterface dialogInterface, int i11) {
        zArr[0] = true;
        i10.dismiss();
        Toast.makeText(context, R.string.hider_apk_import_importing, 0).show();
        p(context, file, str);
    }

    public static /* synthetic */ void e(final Context context, final String str, final String str2, int i10, final boolean z10) {
        l.a();
        f84430f = false;
        f84427c.post(new Runnable() { // from class: Z9.e
            @Override // java.lang.Runnable
            public final void run() {
                k.a(z10, context, str, str2);
            }
        });
    }

    public static /* synthetic */ void f(Activity activity, Context context, Uri uri, String str, final a aVar) {
        final boolean z10;
        try {
            f84428d = m(activity, context, uri, str);
            f84429e = str;
            z10 = true;
        } catch (Throwable th) {
            Log.w(f84425a, "cannot take " + uri + ": " + th.getClass().getName() + ": " + th.getMessage());
            l();
            z10 = false;
        }
        f84427c.post(new Runnable() { // from class: Z9.i
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a(z10);
            }
        });
    }

    public static /* synthetic */ void h(boolean[] zArr, DialogInterface dialogInterface) {
        if (zArr[0]) {
            return;
        }
        l.a();
        f84430f = false;
    }

    public static void k(final Context context, Activity activity, final File file, final String str, Drawable drawable) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            l.a();
            f84430f = false;
            return;
        }
        final I i10 = new I(activity);
        i10.x(drawable, str);
        final boolean[] zArr = {false};
        i10.f168290k = new DialogInterface.OnClickListener() { // from class: Z9.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                k.d(zArr, i10, context, file, str, dialogInterface, i11);
            }
        };
        i10.f168291l = new DialogInterface.OnClickListener() { // from class: Z9.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                i10.dismiss();
            }
        };
        i10.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: Z9.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                k.h(zArr, dialogInterface);
            }
        });
        i10.show();
    }

    public static void l() {
        File file = f84428d;
        f84428d = null;
        f84429e = null;
        if (file != null) {
            n(file.getParentFile());
        }
    }

    public static File m(Context context, Context context2, Uri uri, String str) throws IOException {
        File file = new File(context2.getCacheDir(), "apk_import");
        n(file);
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(C0923g.a("mkdir failed: ", file));
        }
        File file2 = new File(file, "incoming" + u(str));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getContentResolver().openInputStream(uri));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 <= 0) {
                        bufferedOutputStream.close();
                        bufferedInputStream.close();
                        return file2;
                    }
                    bufferedOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void n(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                n(file2);
            }
        }
        file.delete();
    }

    public static String o(Context context, Uri uri) {
        Uri uri2;
        int columnIndex;
        if (b.h.f68653a.equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        try {
            uri2 = uri;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) >= 0) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            return string;
                        }
                    } finally {
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                Log.w(f84425a, "cannot read display name of " + uri2 + ": " + th.getMessage());
                return uri2.getLastPathSegment();
            }
        } catch (Throwable th2) {
            th = th2;
            uri2 = uri;
        }
        return uri2.getLastPathSegment();
    }

    public static void p(final Context context, File file, final String str) {
        o oVarB;
        try {
            oVarB = D.g().b();
        } catch (Throwable th) {
            Log.w(f84425a, "no guest apps model: " + th.getMessage());
            oVarB = null;
        }
        if (oVarB != null) {
            oVarB.J(file, new o.b() { // from class: Z9.a
                @Override // ba.o.b
                public final void a(String str2, int i10, boolean z10) {
                    k.e(context, str, str2, i10, z10);
                }
            });
            return;
        }
        l.a();
        f84430f = false;
        Toast.makeText(context, R.string.hider_apk_import_failed, 1).show();
    }

    public static boolean q(Activity activity) {
        try {
            if (com.prism.hider.variant.b.b().e(activity)) {
                return !B.h().e(activity);
            }
            return false;
        } catch (Throwable th) {
            Log.w(f84425a, "cannot read vault state, treating as locked: " + th.getMessage());
            return true;
        }
    }

    public static void r(final Context context, final Activity activity, File file) {
        final Context context2;
        Throwable th;
        final File fileG;
        PackageInfo packageInfoS;
        String string;
        try {
            fileG = l.g(file.getAbsolutePath());
            packageInfoS = s(context, fileG);
        } catch (Throwable th2) {
            th = th2;
            context2 = context;
        }
        try {
        } catch (Throwable th3) {
            th = th3;
            th = th;
        }
        try {
            if (packageInfoS == null || packageInfoS.applicationInfo == null) {
                throw new IOException("not an android package: " + file.getName());
            }
            PackageManager packageManager = context.getPackageManager();
            CharSequence charSequenceLoadLabel = packageInfoS.applicationInfo.loadLabel(packageManager);
            final Drawable drawableLoadIcon = packageInfoS.applicationInfo.loadIcon(packageManager);
            if (TextUtils.isEmpty(charSequenceLoadLabel)) {
                try {
                    string = packageInfoS.packageName;
                } catch (Throwable th4) {
                    th = th4;
                    context2 = context;
                    Log.w(f84425a, "cannot read " + file + ": " + th.getClass().getName() + ": " + th.getMessage());
                    l.a();
                    f84430f = false;
                    f84427c.post(new Runnable() { // from class: Z9.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toast.makeText(context2, R.string.hider_apk_import_failed, 1).show();
                        }
                    });
                }
            } else {
                string = charSequenceLoadLabel.toString();
            }
            final String str = string;
            f84427c.post(new Runnable() { // from class: Z9.f
                @Override // java.lang.Runnable
                public final void run() {
                    k.k(context, activity, fileG, str, drawableLoadIcon);
                }
            });
            return;
            Log.w(f84425a, "cannot read " + file + ": " + th.getClass().getName() + ": " + th.getMessage());
            l.a();
            f84430f = false;
            f84427c.post(new Runnable() { // from class: Z9.g
                @Override // java.lang.Runnable
                public final void run() {
                    Toast.makeText(context2, R.string.hider_apk_import_failed, 1).show();
                }
            });
            return;
        } finally {
            n(file.getParentFile());
        }
        th = th;
    }

    public static PackageInfo s(Context context, File file) {
        ApplicationInfo applicationInfo;
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0);
        if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null) {
            applicationInfo.sourceDir = file.getAbsolutePath();
            applicationInfo.publicSourceDir = file.getAbsolutePath();
        }
        return packageArchiveInfo;
    }

    public static void t(final Activity activity) {
        final File file = f84428d;
        if (file == null || f84430f || activity == null || activity.isFinishing() || q(activity)) {
            return;
        }
        f84430f = true;
        f84428d = null;
        Toast.makeText(activity.getApplicationContext(), R.string.hider_apk_import_reading, 0).show();
        final Context applicationContext = activity.getApplicationContext();
        C4455a.b().a().execute(new Runnable() { // from class: Z9.h
            @Override // java.lang.Runnable
            public final void run() {
                k.r(applicationContext, activity, file);
            }
        });
    }

    public static String u(String str) {
        if (str == null) {
            return MultiDexExtractor.f114845k;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        for (String str2 : f84426b) {
            if (lowerCase.endsWith(str2)) {
                return str2;
            }
        }
        return MultiDexExtractor.f114845k;
    }

    public static void v(final Activity activity, final Uri uri, final a aVar) {
        final Context applicationContext = activity.getApplicationContext();
        final String strO = o(activity, uri);
        C4455a.b().a().execute(new Runnable() { // from class: Z9.j
            @Override // java.lang.Runnable
            public final void run() {
                k.f(activity, applicationContext, uri, strO, aVar);
            }
        });
    }
}
