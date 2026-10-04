package androidx.palette.graphics;

import G0.C1162y;
import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.palette.graphics.Palette;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f115405g = "ColorCutQuantizer";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f115406h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f115407i = -3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f115408j = -2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f115409k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f115410l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f115411m = 31;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Comparator<b> f115412n = new C0315a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f115413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f115414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Palette.d> f115415c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Palette.b[] f115417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f115418f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TimingLogger f115416d = null;

    /* JADX INFO: renamed from: androidx.palette.graphics.a$a, reason: collision with other inner class name */
    public static class C0315a implements Comparator<b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f115419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f115420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f115421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f115422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f115423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f115424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f115425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f115426h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f115427i;

        public b(int i10, int i11) {
            this.f115419a = i10;
            this.f115420b = i11;
            c();
        }

        public final boolean a() {
            return e() > 1;
        }

        public final int b() {
            int iF = f();
            a aVar = a.this;
            int[] iArr = aVar.f115413a;
            int[] iArr2 = aVar.f115414b;
            a.e(iArr, iF, this.f115419a, this.f115420b);
            Arrays.sort(iArr, this.f115419a, this.f115420b + 1);
            a.e(iArr, iF, this.f115419a, this.f115420b);
            int i10 = this.f115421c / 2;
            int i11 = this.f115419a;
            int i12 = 0;
            while (true) {
                int i13 = this.f115420b;
                if (i11 > i13) {
                    return this.f115419a;
                }
                i12 += iArr2[iArr[i11]];
                if (i12 >= i10) {
                    return Math.min(i13 - 1, i11);
                }
                i11++;
            }
        }

        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f115413a;
            int[] iArr2 = aVar.f115414b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f115419a; i17 <= this.f115420b; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int iK = a.k(i18);
                int iJ = a.j(i18);
                int i19 = i18 & 31;
                if (iK > i11) {
                    i11 = iK;
                }
                if (iK < i10) {
                    i10 = iK;
                }
                if (iJ > i12) {
                    i12 = iJ;
                }
                if (iJ < i15) {
                    i15 = iJ;
                }
                if (i19 > i13) {
                    i13 = i19;
                }
                if (i19 < i16) {
                    i16 = i19;
                }
            }
            this.f115422d = i10;
            this.f115423e = i11;
            this.f115424f = i15;
            this.f115425g = i12;
            this.f115426h = i16;
            this.f115427i = i13;
            this.f115421c = i14;
        }

        public final Palette.d d() {
            a aVar = a.this;
            int[] iArr = aVar.f115413a;
            int[] iArr2 = aVar.f115414b;
            int iK = 0;
            int i10 = 0;
            int iJ = 0;
            int i11 = 0;
            for (int i12 = this.f115419a; i12 <= this.f115420b; i12++) {
                int i13 = iArr[i12];
                int i14 = iArr2[i13];
                i10 += i14;
                iK += a.k(i13) * i14;
                iJ += a.j(i13) * i14;
                i11 += i14 * (i13 & 31);
            }
            float f10 = i10;
            return new Palette.d(a.b(Math.round(iK / f10), Math.round(iJ / f10), Math.round(i11 / f10)), i10);
        }

        public final int e() {
            return (this.f115420b + 1) - this.f115419a;
        }

        public final int f() {
            int i10 = this.f115423e - this.f115422d;
            int i11 = this.f115425g - this.f115424f;
            int i12 = this.f115427i - this.f115426h;
            if (i10 < i11 || i10 < i12) {
                return (i11 < i10 || i11 < i12) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.f115427i - this.f115426h) + 1) * ((this.f115425g - this.f115424f) + 1) * ((this.f115423e - this.f115422d) + 1);
        }

        public final b h() {
            if (!a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iB = b();
            b bVar = a.this.new b(iB + 1, this.f115420b);
            this.f115420b = iB;
            c();
            return bVar;
        }
    }

    public a(int[] iArr, int i10, Palette.b[] bVarArr) {
        this.f115417e = bVarArr;
        int[] iArr2 = new int[32768];
        this.f115414b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int iG = g(iArr[i11]);
            iArr[i11] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0 && l(i13)) {
                iArr2[i13] = 0;
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f115413a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                iArr3[i14] = i15;
                i14++;
            }
        }
        if (i12 > i10) {
            this.f115415c = h(i10);
            return;
        }
        this.f115415c = new ArrayList();
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = iArr3[i16];
            this.f115415c.add(new Palette.d(a(i17), iArr2[i17]));
        }
    }

    public static int a(int i10) {
        return b(k(i10), j(i10), i10 & 31);
    }

    public static int b(int i10, int i11, int i12) {
        return Color.rgb(f(i10, 5, 8), f(i11, 5, 8), f(i12, 5, 8));
    }

    public static void e(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = (i13 & 31) | (j(i13) << 10) | (k(i13) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = k(i14) | ((i14 & 31) << 10) | (j(i14) << 5);
            i11++;
        }
    }

    public static int f(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    public static int g(int i10) {
        return f(Color.blue(i10), 8, 5) | (f(Color.red(i10), 8, 5) << 10) | (f(Color.green(i10), 8, 5) << 5);
    }

    public static int i(int i10) {
        return i10 & 31;
    }

    public static int j(int i10) {
        return (i10 >> 5) & 31;
    }

    public static int k(int i10) {
        return (i10 >> 10) & 31;
    }

    public final List<Palette.d> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<b> it = collection.iterator();
        while (it.hasNext()) {
            Palette.d dVarD = it.next().d();
            if (!m(dVarD.f115369d, dVarD.c())) {
                arrayList.add(dVarD);
            }
        }
        return arrayList;
    }

    public List<Palette.d> d() {
        return this.f115415c;
    }

    public final List<Palette.d> h(int i10) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i10, f115412n);
        priorityQueue.offer(new b(0, this.f115413a.length - 1));
        o(priorityQueue, i10);
        return c(priorityQueue);
    }

    public final boolean l(int i10) {
        int iA = a(i10);
        C1162y.q(iA, this.f115418f);
        return m(iA, this.f115418f);
    }

    public final boolean m(int i10, float[] fArr) {
        Palette.b[] bVarArr = this.f115417e;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!this.f115417e[i11].a(i10, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(Palette.d dVar) {
        return m(dVar.f115369d, dVar.c());
    }

    public final void o(PriorityQueue<b> priorityQueue, int i10) {
        b bVarPoll;
        while (priorityQueue.size() < i10 && (bVarPoll = priorityQueue.poll()) != null && bVarPoll.a()) {
            priorityQueue.offer(bVarPoll.h());
            priorityQueue.offer(bVarPoll);
        }
    }
}
