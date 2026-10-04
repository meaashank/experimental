package m6;

import android.os.Build;

/* JADX INFO: renamed from: m6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5202a implements InterfaceC5203b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5202a f221107a = new C5202a();

    public static C5202a f() {
        return f221107a;
    }

    @Override // m6.InterfaceC5203b
    public String a() {
        return Build.DEVICE;
    }

    @Override // m6.InterfaceC5203b
    public String b() {
        return Build.BRAND;
    }

    @Override // m6.InterfaceC5203b
    public String c() {
        return Build.MANUFACTURER;
    }

    public int d() {
        return Build.VERSION.SDK_INT;
    }

    public String e() {
        return Build.VERSION.RELEASE;
    }
}
