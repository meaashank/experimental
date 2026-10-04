package s6;

import android.content.Context;
import android.content.pm.PackageManager;
import c6.C2947b;
import com.prism.commons.utils.C3841e;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;

/* JADX INFO: renamed from: s6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5577b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f238564f = l0.b(C5577b.class.getSimpleName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C5577b[] f238565g = {new C5577b("android.permission.READ_EXTERNAL_STORAGE", C2947b.m.f129602e2, true), new C5577b("android.permission.WRITE_EXTERNAL_STORAGE", C2947b.m.f129606f2, true)};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5577b[] f238566h = {new C5577b("android.permission.READ_MEDIA_IMAGES", 0, true), new C5577b("android.permission.READ_MEDIA_VIDEO", 0, true), new C5577b("android.permission.READ_MEDIA_AUDIO", 0, true)};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile boolean f238567i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f238568j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f238569k = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f238571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f238572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f238573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f238574e;

    public C5577b(String str, int i10, boolean z10) {
        this.f238570a = str;
        this.f238571b = i10;
        this.f238572c = "";
        this.f238573d = z10;
    }

    public static C5577b[] b(Context context) {
        return (!C3841e.D() || context.getApplicationInfo().targetSdkVersion < 33) ? f238565g : f238566h;
    }

    public static boolean e() {
        return f238567i;
    }

    public static void g(boolean z10) {
        f238567i = z10;
        I.b(f238564f, "forceShowPermRationale changed to: %b", Boolean.valueOf(f238567i));
    }

    public String a(Context context) {
        int i10 = this.f238571b;
        return i10 == 0 ? this.f238572c : context.getString(i10);
    }

    public String c() {
        return this.f238570a;
    }

    public CharSequence d(Context context) {
        if (this.f238574e == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                this.f238574e = packageManager.getPermissionInfo(this.f238570a, 128).loadLabel(packageManager);
            } catch (PackageManager.NameNotFoundException e10) {
                I.h(f238564f, "getReadablePermissionName error ", e10);
                this.f238574e = "ReadPermissionNameError";
            }
        }
        return this.f238574e;
    }

    public boolean f() {
        return this.f238573d;
    }

    public C5577b(String str, String str2, boolean z10) {
        this.f238570a = str;
        this.f238571b = 0;
        this.f238572c = str2;
        this.f238573d = z10;
    }
}
