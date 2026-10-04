package s0;

import androidx.constraintlayout.core.motion.CustomAttribute;
import java.io.PrintStream;
import java.util.Arrays;
import p0.C5378b;

/* JADX INFO: loaded from: classes.dex */
public class j {

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f238078d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f238079a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CustomAttribute[] f238080b = new CustomAttribute[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f238081c;

        public a() {
            b();
        }

        public void a(int i10, CustomAttribute customAttribute) {
            if (this.f238080b[i10] != null) {
                e(i10);
            }
            this.f238080b[i10] = customAttribute;
            int[] iArr = this.f238079a;
            int i11 = this.f238081c;
            this.f238081c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f238079a, 999);
            Arrays.fill(this.f238080b, (Object) null);
            this.f238081c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f238079a, this.f238081c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f238081c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : U6.j.f68738d);
                sb2.append(g(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f238079a[i10];
        }

        public void e(int i10) {
            this.f238080b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f238081c;
                if (i11 >= i13) {
                    this.f238081c = i13 - 1;
                    return;
                }
                int[] iArr = this.f238079a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f238081c;
        }

        public CustomAttribute g(int i10) {
            return this.f238080b[this.f238079a[i10]];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f238082d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f238083a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C5378b[] f238084b = new C5378b[101];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f238085c;

        public b() {
            b();
        }

        public void a(int i10, C5378b c5378b) {
            if (this.f238084b[i10] != null) {
                e(i10);
            }
            this.f238084b[i10] = c5378b;
            int[] iArr = this.f238083a;
            int i11 = this.f238085c;
            this.f238085c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f238083a, 999);
            Arrays.fill(this.f238084b, (Object) null);
            this.f238085c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f238083a, this.f238085c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f238085c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : U6.j.f68738d);
                sb2.append(g(i10));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f238083a[i10];
        }

        public void e(int i10) {
            this.f238084b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f238085c;
                if (i11 >= i13) {
                    this.f238085c = i13 - 1;
                    return;
                }
                int[] iArr = this.f238083a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f238085c;
        }

        public C5378b g(int i10) {
            return this.f238084b[this.f238083a[i10]];
        }
    }

    public static class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f238086d = 999;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f238087a = new int[101];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[][] f238088b = new float[101][];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f238089c;

        public c() {
            b();
        }

        public void a(int i10, float[] fArr) {
            if (this.f238088b[i10] != null) {
                e(i10);
            }
            this.f238088b[i10] = fArr;
            int[] iArr = this.f238087a;
            int i11 = this.f238089c;
            this.f238089c = i11 + 1;
            iArr[i11] = i10;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.f238087a, 999);
            Arrays.fill(this.f238088b, (Object) null);
            this.f238089c = 0;
        }

        public void c() {
            System.out.println("V: " + Arrays.toString(Arrays.copyOf(this.f238087a, this.f238089c)));
            System.out.print("K: [");
            int i10 = 0;
            while (i10 < this.f238089c) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "" : U6.j.f68738d);
                sb2.append(Arrays.toString(g(i10)));
                printStream.print(sb2.toString());
                i10++;
            }
            System.out.println("]");
        }

        public int d(int i10) {
            return this.f238087a[i10];
        }

        public void e(int i10) {
            this.f238088b[i10] = null;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = this.f238089c;
                if (i11 >= i13) {
                    this.f238089c = i13 - 1;
                    return;
                }
                int[] iArr = this.f238087a;
                if (i10 == iArr[i11]) {
                    iArr[i11] = 999;
                    i12++;
                }
                if (i11 != i12) {
                    iArr[i11] = iArr[i12];
                }
                i12++;
                i11++;
            }
        }

        public int f() {
            return this.f238089c;
        }

        public float[] g(int i10) {
            return this.f238088b[this.f238087a[i10]];
        }
    }
}
