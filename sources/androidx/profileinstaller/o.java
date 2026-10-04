package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;
import e.InterfaceC4345t;
import e.T;
import e.g0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f116226a = "/data/misc/profiles/ref/";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f116227b = "/data/misc/profiles/cur/0/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f116228c = "primary.prof";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f116229d = "profileInstalled";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f116232g = "ProfileVerifier";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.concurrent.futures.d<c> f116230e = androidx.concurrent.futures.d.i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f116231f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public static c f116233h = null;

    @T(33)
    public static class a {
        @InterfaceC4345t
        public static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f116234e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f116235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f116236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f116237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f116238d;

        public b(int i10, int i11, long j10, long j11) {
            this.f116235a = i10;
            this.f116236b = i11;
            this.f116237c = j10;
            this.f116238d = j11;
        }

        public static b a(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public void b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f116235a);
                dataOutputStream.writeInt(this.f116236b);
                dataOutputStream.writeLong(this.f116237c);
                dataOutputStream.writeLong(this.f116238d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f116236b == bVar.f116236b && this.f116237c == bVar.f116237c && this.f116235a == bVar.f116235a && this.f116238d == bVar.f116238d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f116236b), Long.valueOf(this.f116237c), Integer.valueOf(this.f116235a), Long.valueOf(this.f116238d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f116239d = 16;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f116240e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f116241f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f116242g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f116243h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f116244i = 65536;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f116245j = 131072;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f116246k = 196608;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f116247l = 262144;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f116248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f116249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f116250c;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public @interface a {
        }

        public c(int i10, boolean z10, boolean z11) {
            this.f116248a = i10;
            this.f116250c = z11;
            this.f116249b = z10;
        }

        public int a() {
            return this.f116248a;
        }

        public boolean b() {
            return this.f116250c;
        }

        public boolean c() {
            return this.f116249b;
        }
    }

    @NonNull
    public static ListenableFuture<c> a() {
        return f116230e;
    }

    public static long b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c c(int i10, boolean z10, boolean z11) {
        c cVar = new c(i10, z10, z11);
        f116233h = cVar;
        f116230e.set(cVar);
        return f116233h;
    }

    @NonNull
    @g0
    public static c d(@NonNull Context context) {
        return e(context, false);
    }

    @NonNull
    @g0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static c e(@NonNull Context context, boolean z10) {
        b bVarA;
        int i10;
        c cVar;
        if (!z10 && (cVar = f116233h) != null) {
            return cVar;
        }
        synchronized (f116231f) {
            if (!z10) {
                try {
                    c cVar2 = f116233h;
                    if (cVar2 != null) {
                        return cVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            int i12 = 0;
            if (i11 >= 28 && i11 != 30) {
                File file = new File(new File(f116226a, context.getPackageName()), "primary.prof");
                long length = file.length();
                boolean z11 = file.exists() && length > 0;
                File file2 = new File(new File(f116227b, context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z12 = file2.exists() && length2 > 0;
                try {
                    long jB = b(context);
                    File file3 = new File(context.getFilesDir(), f116229d);
                    if (file3.exists()) {
                        try {
                            bVarA = b.a(file3);
                        } catch (IOException unused) {
                            return c(131072, z11, z12);
                        }
                    } else {
                        bVarA = null;
                    }
                    if (bVarA != null && bVarA.f116237c == jB && (i10 = bVarA.f116236b) != 2) {
                        i12 = i10;
                    } else if (z11) {
                        i12 = 1;
                    } else if (z12) {
                        i12 = 2;
                    }
                    if (z10 && z12 && i12 != 1) {
                        i12 = 2;
                    }
                    if (bVarA != null && bVarA.f116236b == 2 && i12 == 1 && length < bVarA.f116238d) {
                        i12 = 3;
                    }
                    int i13 = i12;
                    b bVar = new b(1, i13, jB, length2);
                    if (bVarA == null || !bVarA.equals(bVar)) {
                        try {
                            bVar.b(file3);
                        } catch (IOException unused2) {
                            i13 = c.f116246k;
                        }
                    }
                    return c(i13, z11, z12);
                } catch (PackageManager.NameNotFoundException unused3) {
                    return c(65536, z11, z12);
                }
            }
            return c(262144, false, false);
        }
    }
}
