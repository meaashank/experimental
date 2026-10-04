package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.g0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f116184A = 14;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f116185B = 15;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f116186C = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f116187a = "ProfileInstaller";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f116188b = "/data/misc/profiles/cur/0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f116189c = "primary.prof";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f116190d = "dexopt/baseline.prof";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f116191e = "dexopt/baseline.profm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f116192f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f116193g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final d f116194h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f116195i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f116196j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f116197k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f116198l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f116199m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f116200n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f116201o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f116202p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f116203q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f116204r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f116205s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f116206t = 7;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f116207u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f116208v = 9;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f116209w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f116210x = 11;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f116211y = 12;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f116212z = 13;

    public class a implements d {
        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @Nullable Object obj) {
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @Nullable Object obj) {
        }
    }

    public class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f116213a = "ProfileInstaller";

        @Override // androidx.profileinstaller.i.d
        public void a(int i10, @Nullable Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.i.d
        public void b(int i10, @Nullable Object obj) {
            Log.d("ProfileInstaller", i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface c {
    }

    public interface d {
        void a(int i10, @Nullable Object obj);

        void b(int i10, @Nullable Object obj);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface e {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean c(@NonNull File file) {
        return new File(file, f116192f).delete();
    }

    @g0
    public static void d(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        c(context.getFilesDir());
        h(executor, dVar, 11, null);
    }

    public static void e(@NonNull Executor executor, @NonNull final d dVar, final int i10, @Nullable final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.h
            @Override // java.lang.Runnable
            public final void run() {
                dVar.b(i10, obj);
            }
        });
    }

    @g0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean f(PackageInfo packageInfo, File file, d dVar) {
        File file2 = new File(file, f116192f);
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j10 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = j10 == packageInfo.lastUpdateTime;
                if (z10) {
                    dVar.a(2, null);
                }
                return z10;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void g(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f116192f)));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void h(@NonNull Executor executor, @NonNull final d dVar, final int i10, @Nullable final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.g
            @Override // java.lang.Runnable
            public final void run() {
                dVar.a(i10, obj);
            }
        });
    }

    public static boolean i(@NonNull AssetManager assetManager, @NonNull String str, @NonNull PackageInfo packageInfo, @NonNull File file, @NonNull String str2, @NonNull Executor executor, @NonNull d dVar) {
        androidx.profileinstaller.d dVar2 = new androidx.profileinstaller.d(assetManager, executor, dVar, str2, f116190d, f116191e, new File(new File(f116188b, str), "primary.prof"));
        if (!dVar2.e()) {
            return false;
        }
        boolean zM = dVar2.h().l().m();
        if (zM) {
            g(packageInfo, file);
        }
        return zM;
    }

    @g0
    public static void j(@NonNull Context context) {
        l(context, new androidx.privacysandbox.ads.adservices.adid.h(), f116193g, false);
    }

    @g0
    public static void k(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        l(context, executor, dVar, false);
    }

    @g0
    public static void l(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && f(packageInfo, filesDir, dVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                o.e(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (i(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z10) {
                z11 = true;
            }
            o.e(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            dVar.a(7, e10);
            o.e(context, false);
        }
    }

    @g0
    public static void m(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        try {
            g(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            h(executor, dVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            h(executor, dVar, 7, e10);
        }
    }
}
