package la;

import com.prism.gaia.os.GaiaUserHandle;
import com.prism.gaia.remote.ApkInfo;
import com.prism.gaia.remote.GuestAppInfo;
import com.prism.gaia.remote.GuestAppSizeG;
import com.prism.gaia.remote.RunningProcessInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: la.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5169I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GuestAppInfo f220997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f220998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f220999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GuestAppSizeG f221000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f221001e = new ArrayList(0);

    public C5169I(GuestAppInfo guestAppInfo, int i10, int i11) {
        this.f220997a = guestAppInfo;
        this.f220998b = i10;
        this.f220999c = i11;
    }

    public ApkInfo a() {
        return this.f220997a.getApkInfo();
    }

    public int b() {
        return this.f220998b + 1;
    }

    public int c() {
        return this.f220997a.enabledStateOf(this.f220998b);
    }

    public boolean d() {
        return this.f220997a.hiddenOf(this.f220998b);
    }

    public boolean e() {
        return !this.f221001e.isEmpty();
    }

    public boolean f() {
        int iC = c();
        return d() || iC == 2 || iC == 3 || iC == 4;
    }

    public String g() {
        return this.f220997a.packageName + '~' + this.f220998b;
    }

    public String h() {
        String name = a().getName();
        return name == null ? this.f220997a.packageName : name;
    }

    public boolean i(RunningProcessInfo runningProcessInfo) {
        return this.f220997a.packageName.equals(runningProcessInfo.packageName) && GaiaUserHandle.getVuserId(runningProcessInfo.vuid) == this.f220998b;
    }

    public String j() {
        return this.f220997a.packageName;
    }

    public int k() {
        return GaiaUserHandle.getVuid(this.f220998b, this.f220997a.appId);
    }
}
