package U9;

import com.prism.gaia.remote.ApkInfo;

/* JADX INFO: loaded from: classes6.dex */
public class E extends F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f73907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f73908e;

    public E(ApkInfo apkInfo, int i10) {
        super(apkInfo.pkgName, i10);
        this.f73907d = apkInfo.apkPath;
        this.f73908e = apkInfo.splitApk;
    }

    public static E d(F f10) {
        return new E(f10);
    }

    public ApkInfo c() {
        return new ApkInfo(a(), this.f73907d, this.f73908e);
    }

    public E(F f10) {
        super(f10.a(), f10.b());
        this.f73907d = null;
        this.f73908e = false;
    }
}
