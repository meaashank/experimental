package a7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static g f84793j = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f84795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f84796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f84798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f84800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f84801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f84802i;

    public g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1451a(5, 1.0d, 5.0d, 112.0d, false, true, true));
        arrayList.add(new C1451a(13, 13.5d, 23.0d, 53.0d, true, true, true));
        arrayList.add(new C1451a(14, 19.1d, 6.0d, 247.0d, true, true, true));
        arrayList.add(new C1451a(15, 31.0d, 58.0d, 45.0d, true, true, true));
        arrayList.add(new C1451a(18, 0.0d, 52.0d, 309.0d, false, true, true));
        arrayList.add(new C1451a(20, 30.1d, 54.0d, 105.0d, true, true, true));
        arrayList.add(new C1451a(21, 33.2d, 56.0d, 251.0d, true, true, true));
        arrayList.add(new C1451a(22, 0.0d, 14.0d, 299.0d, false, true, true));
        arrayList.add(new C1451a(24, 25.9d, 57.0d, 157.0d, true, true, true));
        arrayList.add(new C1451a(27, 18.0d, 3.0d, 309.0d, true, true, true));
        arrayList.add(new C1451a(28, 18.2d, 3.0d, 42.0d, true, true, true));
        arrayList.add(new C1451a(41, 28.8d, 0.0d, 0.0d, false, false, false));
        arrayList.add(new C1451a(50, 29.2d, 0.0d, 0.0d, false, true, true));
        arrayList.add(new C1451a(67, 14.4d, 2.0d, 92.0d, false, false, false));
        arrayList.add(new C1451a(68, 21.2d, 45.0d, 60.0d, false, false, false));
        arrayList.add(new C1451a(69, 17.5d, 50.0d, 330.0d, false, true, true));
        arrayList.add(new C1451a(70, 22.4d, 7.0d, 291.0d, false, false, false));
        arrayList.add(new C1451a(77, 23.8d, 10.0d, 23.0d, true, true, true));
        arrayList.add(new C1451a(78, 18.0d, 47.0d, 70.0d, true, true, true));
        arrayList.add(new C1451a(79, 22.8d, 41.0d, 142.0d, true, true, true));
        arrayList.add(new C1451a(83, 0.2d, 9.0d, 212.0d, false, false, false));
        arrayList.add(new C1451a(84, 16.7d, 30.0d, 264.0d, true, true, true));
        arrayList.add(new C1451a(85, 12.1d, 20.0d, 317.0d, true, true, true));
        this.f84802i = arrayList.size();
        this.f84800g = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f84800g[i10] = ((C1451a) arrayList.get(i10)).c();
        }
        this.f84798e = new float[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.f84798e[i11] = (float) ((C1451a) arrayList.get(i11)).d();
        }
        this.f84796c = new float[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f84796c[i12] = (float) ((C1451a) arrayList.get(i12)).b();
        }
        this.f84795b = new float[arrayList.size()];
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f84795b[i13] = (float) ((C1451a) arrayList.get(i13)).a();
        }
        this.f84797d = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if (((C1451a) arrayList.get(i14)).f()) {
                this.f84797d |= 1 << (((C1451a) arrayList.get(i14)).c() - 1);
            }
        }
        this.f84794a = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            if (((C1451a) arrayList.get(i15)).e()) {
                this.f84794a |= 1 << (((C1451a) arrayList.get(i15)).c() - 1);
            }
        }
        this.f84799f = 0;
        for (int i16 = 0; arrayList.size() > i16; i16++) {
            if (((C1451a) arrayList.get(i16)).g()) {
                this.f84799f |= 1 << (((C1451a) arrayList.get(i16)).c() - 1);
            }
        }
        this.f84801h = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            C1451a c1451a = (C1451a) arrayList.get(i17);
            this.f84801h[i17] = (c1451a.c() << 7) | (c1451a.f() ? 1 : 0) | ((c1451a.e() ? 1 : 0) << 1) | ((c1451a.g() ? 1 : 0) << 2) | 8;
        }
    }

    public static g a() {
        return f84793j;
    }

    public int b() {
        return this.f84794a;
    }

    public float[] c() {
        return this.f84795b;
    }

    public float[] d() {
        return this.f84796c;
    }

    public int e() {
        return this.f84797d;
    }

    public int[] f() {
        return this.f84801h;
    }

    public int[] g() {
        return this.f84800g;
    }

    public float[] h() {
        return this.f84798e;
    }

    public int i() {
        return this.f84802i;
    }

    public int j() {
        return this.f84799f;
    }
}
