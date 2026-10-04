package wb;

import com.tencent.qcloud.core.http.v;

/* JADX INFO: renamed from: wb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5773b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f240212e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f240213f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f240214g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f240215h = 2000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static C5773b f240216i = new C5773b(1000, 2000, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static C5773b f240217j = new C5773b(0, 0, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f240218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f240219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f240220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f240221d = v.f194354a;

    /* JADX INFO: renamed from: wb.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f240222a = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f240223b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f240224c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f240225d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[][] f240226e = {new int[]{0, 1, 2, 2, 2}, new int[]{0, 1, 2, 3, 3}, new int[]{0, 1, 2, 3, 4}};

        public int a(int i10, int i11) {
            int iB = b(i10, 2, 0);
            return this.f240226e[iB][b(i11, 4, 0)] + 1;
        }

        public final int b(int i10, int i11, int i12) {
            return i10 > i11 ? i11 : i10 < i12 ? i12 : i10;
        }
    }

    public C5773b(int i10, int i11, int i12) {
        this.f240218a = i10;
        this.f240219b = i11;
        this.f240220c = i12;
    }

    public long a(int i10) {
        if (i10 < 1) {
            return 0L;
        }
        return Math.min(this.f240219b, this.f240218a * ((int) Math.pow(2.0d, i10 - 1)));
    }

    public v b() {
        return this.f240221d;
    }

    public void d(v vVar) {
        this.f240221d = vVar;
    }

    public boolean e(int i10, long j10, int i11) {
        return i10 < this.f240220c + i11;
    }

    public void c(boolean z10, Exception exc) {
    }
}
