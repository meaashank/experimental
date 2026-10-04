package F9;

import U6.j;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D8.b<String> f39850a = new D8.b<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D8.b<String> f39851b = new D8.b<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D8.b<String> f39852c = new D8.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D8.b<String> f39853d = new D8.b<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public D8.b<String> f39854e = new D8.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D8.b<String> f39855f = new D8.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public D8.b<String> f39856g = new D8.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public D8.b<String> f39857h = new D8.b<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public D8.b<String> f39858i = new D8.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public D8.b<String> f39859j = new D8.b<>();

    public String toString() {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a("DeviceInfo(");
        j.F(sbA, "serial", this.f39850a);
        j.F(sbA, "serialSafe", this.f39851b);
        j.F(sbA, "androidId", this.f39852c);
        j.F(sbA, "wifiMac", this.f39853d);
        j.F(sbA, "blueToothMac", this.f39854e);
        j.F(sbA, "deviceId", this.f39855f);
        j.F(sbA, "imei", this.f39856g);
        j.F(sbA, "meid", this.f39857h);
        j.F(sbA, "iccid", this.f39858i);
        j.F(sbA, "imsi", this.f39859j);
        j.G(sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
