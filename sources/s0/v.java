package s0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f238196m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f238197n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f238198o = 10;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f238199p = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f238200a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f238201b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f238202c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f238203d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f238204e = new float[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f238205f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f238206g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f238207h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f238208i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f238209j = new int[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f238210k = new boolean[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f238211l = 0;

    public void a(int i10, float f10) {
        int i11 = this.f238205f;
        int[] iArr = this.f238203d;
        if (i11 >= iArr.length) {
            this.f238203d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f238204e;
            this.f238204e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f238203d;
        int i12 = this.f238205f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f238204e;
        this.f238205f = i12 + 1;
        fArr2[i12] = f10;
    }

    public void b(int i10, int i11) {
        int i12 = this.f238202c;
        int[] iArr = this.f238200a;
        if (i12 >= iArr.length) {
            this.f238200a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f238201b;
            this.f238201b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f238200a;
        int i13 = this.f238202c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f238201b;
        this.f238202c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void c(int i10, String str) {
        int i11 = this.f238208i;
        int[] iArr = this.f238206g;
        if (i11 >= iArr.length) {
            this.f238206g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f238207h;
            this.f238207h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f238206g;
        int i12 = this.f238208i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f238207h;
        this.f238208i = i12 + 1;
        strArr2[i12] = str;
    }

    public void d(int i10, boolean z10) {
        int i11 = this.f238211l;
        int[] iArr = this.f238209j;
        if (i11 >= iArr.length) {
            this.f238209j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f238210k;
            this.f238210k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f238209j;
        int i12 = this.f238211l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f238210k;
        this.f238211l = i12 + 1;
        zArr2[i12] = z10;
    }

    public void e(int i10, String str) {
        if (str != null) {
            c(i10, str);
        }
    }

    public void f(v vVar) {
        for (int i10 = 0; i10 < this.f238202c; i10++) {
            vVar.b(this.f238200a[i10], this.f238201b[i10]);
        }
        for (int i11 = 0; i11 < this.f238205f; i11++) {
            vVar.a(this.f238203d[i11], this.f238204e[i11]);
        }
        for (int i12 = 0; i12 < this.f238208i; i12++) {
            vVar.c(this.f238206g[i12], this.f238207h[i12]);
        }
        for (int i13 = 0; i13 < this.f238211l; i13++) {
            vVar.d(this.f238209j[i13], this.f238210k[i13]);
        }
    }

    public void g(x xVar) {
        for (int i10 = 0; i10 < this.f238202c; i10++) {
            xVar.a(this.f238200a[i10], this.f238201b[i10]);
        }
        for (int i11 = 0; i11 < this.f238205f; i11++) {
            xVar.b(this.f238203d[i11], this.f238204e[i11]);
        }
        for (int i12 = 0; i12 < this.f238208i; i12++) {
            xVar.d(this.f238206g[i12], this.f238207h[i12]);
        }
        for (int i13 = 0; i13 < this.f238211l; i13++) {
            xVar.c(this.f238209j[i13], this.f238210k[i13]);
        }
    }

    public void h() {
        this.f238211l = 0;
        this.f238208i = 0;
        this.f238205f = 0;
        this.f238202c = 0;
    }

    public int i(int i10) {
        for (int i11 = 0; i11 < this.f238202c; i11++) {
            if (this.f238200a[i11] == i10) {
                return this.f238201b[i11];
            }
        }
        return -1;
    }
}
