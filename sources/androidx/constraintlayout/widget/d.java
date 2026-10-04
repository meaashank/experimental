package androidx.constraintlayout.widget;

import U6.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.C2377c;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.u;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.g;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.ads.AdError;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.prism.lib_google_billing.q;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.C5563e;
import s0.x;
import u0.C5634b;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f107828A = 1;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final int f107829A0 = 29;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public static final int f107830A1 = 81;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f107831B = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final int f107832B0 = 30;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public static final int f107833B1 = 82;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f107834C = 1;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final int f107835C0 = 31;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public static final int f107836C1 = 83;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f107837D = 0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final int f107838D0 = 32;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public static final int f107839D1 = 84;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f107840E = 4;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final int f107841E0 = 33;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public static final int f107842E1 = 85;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f107843F = 8;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final int f107844F0 = 34;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public static final int f107845F1 = 86;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f107846G = 1;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final int f107847G0 = 35;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public static final int f107848G1 = 87;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f107849H = 2;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final int f107850H0 = 36;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public static final int f107851H1 = 88;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f107852I = 3;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final int f107853I0 = 37;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public static final int f107854I1 = 89;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f107855J = 4;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final int f107856J0 = 38;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public static final int f107857J1 = 90;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f107858K = 5;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final int f107859K0 = 39;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public static final int f107860K1 = 91;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f107861L = 6;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final int f107862L0 = 40;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public static final int f107863L1 = 92;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f107864M = 7;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final int f107865M0 = 41;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public static final int f107866M1 = 93;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f107867N = 8;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static final int f107868N0 = 42;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public static final int f107869N1 = 94;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f107870O = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final int f107871O0 = 43;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public static final int f107872O1 = 95;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f107873P = 1;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public static final int f107874P0 = 44;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public static final int f107875P1 = 96;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f107876Q = 0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public static final int f107877Q0 = 45;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public static final int f107878Q1 = 97;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f107879R = 1;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public static final int f107880R0 = 46;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public static final int f107881R1 = 98;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f107882S = 2;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static final int f107883S0 = 47;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public static final int f107884S1 = 99;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final boolean f107885T = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public static final int f107886T0 = 48;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public static final String f107887T1 = "weight";

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final int f107889U0 = 49;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public static final String f107890U1 = "ratio";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f107891V = 1;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public static final int f107892V0 = 50;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public static final String f107893V1 = "parent";

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public static final int f107895W0 = 51;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final int f107897X0 = 52;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f107898Y = 1;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final int f107899Y0 = 53;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final int f107900Z = 2;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static final int f107901Z0 = 54;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f107902a0 = 3;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f107903a1 = 55;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f107904b0 = 4;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f107905b1 = 56;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f107906c0 = 5;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f107907c1 = 57;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f107908d0 = 6;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f107909d1 = 58;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f107910e0 = 7;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f107911e1 = 59;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f107912f0 = 8;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final int f107913f1 = 60;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f107914g0 = 9;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f107915g1 = 61;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f107916h = "ConstraintSet";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f107917h0 = 10;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f107918h1 = 62;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f107919i = "XML parser error must be within a Constraint ";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f107920i0 = 11;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f107921i1 = 63;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f107922j = -1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f107923j0 = 12;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final int f107924j1 = 64;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f107925k = -2;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f107926k0 = 13;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int f107927k1 = 65;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f107928l = -3;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f107929l0 = 14;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final int f107930l1 = 66;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f107931m = -4;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f107932m0 = 15;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final int f107933m1 = 67;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f107934n = 0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f107935n0 = 16;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final int f107936n1 = 68;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f107937o = 1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f107938o0 = 17;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final int f107939o1 = 69;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f107940p = 2;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f107941p0 = 18;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f107942p1 = 70;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f107943q = 3;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f107944q0 = 19;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final int f107945q1 = 71;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f107946r = 4;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f107947r0 = 20;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final int f107948r1 = 72;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f107949s = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f107950s0 = 21;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final int f107951s1 = 73;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f107952t = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f107953t0 = 22;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final int f107954t1 = 74;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f107955u = -2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f107956u0 = 23;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final int f107957u1 = 75;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f107958v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f107959v0 = 24;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final int f107960v1 = 76;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f107961w = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f107962w0 = 25;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final int f107963w1 = 77;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f107964x = 2;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f107965x0 = 26;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f107966x1 = 78;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f107967y = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f107968y0 = 27;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f107969y1 = 79;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f107970z = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f107971z0 = 28;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final int f107972z1 = 80;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f107973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f107974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f107975c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f107976d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f107977e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f107978f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap<Integer, a> f107979g = new HashMap<>();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int[] f107888U = {0, 4, 8};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static SparseIntArray f107894W = new SparseIntArray();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static SparseIntArray f107896X = new SparseIntArray();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f107981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0274d f107982c = new C0274d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f107983d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f107984e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f107985f = new e();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f107986g = new HashMap<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0273a f107987h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        public static class C0273a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final int f107988m = 4;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final int f107989n = 10;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f107990o = 10;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static final int f107991p = 5;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int[] f107992a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int[] f107993b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f107994c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int[] f107995d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float[] f107996e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f107997f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int[] f107998g = new int[5];

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public String[] f107999h = new String[5];

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f108000i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int[] f108001j = new int[4];

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean[] f108002k = new boolean[4];

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f108003l = 0;

            public void a(int type, float value) {
                int i10 = this.f107997f;
                int[] iArr = this.f107995d;
                if (i10 >= iArr.length) {
                    this.f107995d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f107996e;
                    this.f107996e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f107995d;
                int i11 = this.f107997f;
                iArr2[i11] = type;
                float[] fArr2 = this.f107996e;
                this.f107997f = i11 + 1;
                fArr2[i11] = value;
            }

            public void b(int type, int value) {
                int i10 = this.f107994c;
                int[] iArr = this.f107992a;
                if (i10 >= iArr.length) {
                    this.f107992a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f107993b;
                    this.f107993b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f107992a;
                int i11 = this.f107994c;
                iArr3[i11] = type;
                int[] iArr4 = this.f107993b;
                this.f107994c = i11 + 1;
                iArr4[i11] = value;
            }

            public void c(int type, String value) {
                int i10 = this.f108000i;
                int[] iArr = this.f107998g;
                if (i10 >= iArr.length) {
                    this.f107998g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f107999h;
                    this.f107999h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f107998g;
                int i11 = this.f108000i;
                iArr2[i11] = type;
                String[] strArr2 = this.f107999h;
                this.f108000i = i11 + 1;
                strArr2[i11] = value;
            }

            public void d(int type, boolean value) {
                int i10 = this.f108003l;
                int[] iArr = this.f108001j;
                if (i10 >= iArr.length) {
                    this.f108001j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f108002k;
                    this.f108002k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f108001j;
                int i11 = this.f108003l;
                iArr2[i11] = type;
                boolean[] zArr2 = this.f108002k;
                this.f108003l = i11 + 1;
                zArr2[i11] = value;
            }

            public void e(a c10) {
                for (int i10 = 0; i10 < this.f107994c; i10++) {
                    d.S0(c10, this.f107992a[i10], this.f107993b[i10]);
                }
                for (int i11 = 0; i11 < this.f107997f; i11++) {
                    d.R0(c10, this.f107995d[i11], this.f107996e[i11]);
                }
                for (int i12 = 0; i12 < this.f108000i; i12++) {
                    d.T0(c10, this.f107998g[i12], this.f107999h[i12]);
                }
                for (int i13 = 0; i13 < this.f108003l; i13++) {
                    d.U0(c10, this.f108001j[i13], this.f108002k[i13]);
                }
            }

            @SuppressLint({"LogConditional"})
            public void f(String tag) {
                Log.v(tag, "int");
                for (int i10 = 0; i10 < this.f107994c; i10++) {
                    Log.v(tag, this.f107992a[i10] + " = " + this.f107993b[i10]);
                }
                Log.v(tag, x.b.f238262c);
                for (int i11 = 0; i11 < this.f107997f; i11++) {
                    Log.v(tag, this.f107995d[i11] + " = " + this.f107996e[i11]);
                }
                Log.v(tag, "strings");
                for (int i12 = 0; i12 < this.f108000i; i12++) {
                    Log.v(tag, this.f107998g[i12] + " = " + this.f107999h[i12]);
                }
                Log.v(tag, x.b.f238265f);
                for (int i13 = 0; i13 < this.f108003l; i13++) {
                    Log.v(tag, this.f108001j[i13] + " = " + this.f108002k[i13]);
                }
            }
        }

        public void h(a c10) {
            C0273a c0273a = this.f107987h;
            if (c0273a != null) {
                c0273a.e(c10);
            }
        }

        public void i(ConstraintLayout.LayoutParams param) {
            b bVar = this.f107984e;
            param.f107657e = bVar.f108119j;
            param.f107659f = bVar.f108121k;
            param.f107661g = bVar.f108123l;
            param.f107663h = bVar.f108125m;
            param.f107665i = bVar.f108127n;
            param.f107667j = bVar.f108129o;
            param.f107669k = bVar.f108131p;
            param.f107671l = bVar.f108133q;
            param.f107673m = bVar.f108135r;
            param.f107675n = bVar.f108136s;
            param.f107677o = bVar.f108137t;
            param.f107685s = bVar.f108138u;
            param.f107687t = bVar.f108139v;
            param.f107689u = bVar.f108140w;
            param.f107691v = bVar.f108141x;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = bVar.f108082H;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = bVar.f108083I;
            ((ViewGroup.MarginLayoutParams) param).topMargin = bVar.f108084J;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = bVar.f108085K;
            param.f107623A = bVar.f108094T;
            param.f107624B = bVar.f108093S;
            param.f107695x = bVar.f108090P;
            param.f107697z = bVar.f108092R;
            param.f107629G = bVar.f108142y;
            param.f107630H = bVar.f108143z;
            param.f107679p = bVar.f108076B;
            param.f107681q = bVar.f108077C;
            param.f107683r = bVar.f108078D;
            param.f107631I = bVar.f108075A;
            param.f107646X = bVar.f108079E;
            param.f107647Y = bVar.f108080F;
            param.f107635M = bVar.f108096V;
            param.f107634L = bVar.f108097W;
            param.f107637O = bVar.f108099Y;
            param.f107636N = bVar.f108098X;
            param.f107650a0 = bVar.f108128n0;
            param.f107652b0 = bVar.f108130o0;
            param.f107638P = bVar.f108100Z;
            param.f107639Q = bVar.f108102a0;
            param.f107642T = bVar.f108104b0;
            param.f107643U = bVar.f108106c0;
            param.f107640R = bVar.f108108d0;
            param.f107641S = bVar.f108110e0;
            param.f107644V = bVar.f108112f0;
            param.f107645W = bVar.f108114g0;
            param.f107648Z = bVar.f108081G;
            param.f107653c = bVar.f108115h;
            param.f107649a = bVar.f108111f;
            param.f107651b = bVar.f108113g;
            ((ViewGroup.MarginLayoutParams) param).width = bVar.f108107d;
            ((ViewGroup.MarginLayoutParams) param).height = bVar.f108109e;
            String str = bVar.f108126m0;
            if (str != null) {
                param.f107654c0 = str;
            }
            param.f107656d0 = bVar.f108134q0;
            param.setMarginStart(bVar.f108087M);
            param.setMarginEnd(this.f107984e.f108086L);
            param.e();
        }

        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f107984e.a(this.f107984e);
            aVar.f107983d.a(this.f107983d);
            aVar.f107982c.a(this.f107982c);
            aVar.f107985f.a(this.f107985f);
            aVar.f107980a = this.f107980a;
            aVar.f107987h = this.f107987h;
            return aVar;
        }

        public final void k(int viewId, ConstraintLayout.LayoutParams param) {
            this.f107980a = viewId;
            b bVar = this.f107984e;
            bVar.f108119j = param.f107657e;
            bVar.f108121k = param.f107659f;
            bVar.f108123l = param.f107661g;
            bVar.f108125m = param.f107663h;
            bVar.f108127n = param.f107665i;
            bVar.f108129o = param.f107667j;
            bVar.f108131p = param.f107669k;
            bVar.f108133q = param.f107671l;
            bVar.f108135r = param.f107673m;
            bVar.f108136s = param.f107675n;
            bVar.f108137t = param.f107677o;
            bVar.f108138u = param.f107685s;
            bVar.f108139v = param.f107687t;
            bVar.f108140w = param.f107689u;
            bVar.f108141x = param.f107691v;
            bVar.f108142y = param.f107629G;
            bVar.f108143z = param.f107630H;
            bVar.f108075A = param.f107631I;
            bVar.f108076B = param.f107679p;
            bVar.f108077C = param.f107681q;
            bVar.f108078D = param.f107683r;
            bVar.f108079E = param.f107646X;
            bVar.f108080F = param.f107647Y;
            bVar.f108081G = param.f107648Z;
            bVar.f108115h = param.f107653c;
            bVar.f108111f = param.f107649a;
            bVar.f108113g = param.f107651b;
            bVar.f108107d = ((ViewGroup.MarginLayoutParams) param).width;
            bVar.f108109e = ((ViewGroup.MarginLayoutParams) param).height;
            bVar.f108082H = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            bVar.f108083I = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            bVar.f108084J = ((ViewGroup.MarginLayoutParams) param).topMargin;
            bVar.f108085K = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            bVar.f108088N = param.f107626D;
            bVar.f108096V = param.f107635M;
            bVar.f108097W = param.f107634L;
            bVar.f108099Y = param.f107637O;
            bVar.f108098X = param.f107636N;
            bVar.f108128n0 = param.f107650a0;
            bVar.f108130o0 = param.f107652b0;
            bVar.f108100Z = param.f107638P;
            bVar.f108102a0 = param.f107639Q;
            bVar.f108104b0 = param.f107642T;
            bVar.f108106c0 = param.f107643U;
            bVar.f108108d0 = param.f107640R;
            bVar.f108110e0 = param.f107641S;
            bVar.f108112f0 = param.f107644V;
            bVar.f108114g0 = param.f107645W;
            bVar.f108126m0 = param.f107654c0;
            bVar.f108090P = param.f107695x;
            bVar.f108092R = param.f107697z;
            bVar.f108089O = param.f107693w;
            bVar.f108091Q = param.f107696y;
            bVar.f108094T = param.f107623A;
            bVar.f108093S = param.f107624B;
            bVar.f108095U = param.f107625C;
            bVar.f108134q0 = param.f107656d0;
            bVar.f108086L = param.getMarginEnd();
            this.f107984e.f108087M = param.getMarginStart();
        }

        public final void l(int viewId, Constraints.LayoutParams param) {
            k(viewId, param);
            this.f107982c.f108175d = param.f107770V0;
            e eVar = this.f107985f;
            eVar.f108191b = param.f107773Y0;
            eVar.f108192c = param.f107774Z0;
            eVar.f108193d = param.f107775a1;
            eVar.f108194e = param.f107776b1;
            eVar.f108195f = param.f107777c1;
            eVar.f108196g = param.f107778d1;
            eVar.f108197h = param.f107779e1;
            eVar.f108199j = param.f107780f1;
            eVar.f108200k = param.f107781g1;
            eVar.f108201l = param.f107782h1;
            eVar.f108203n = param.f107772X0;
            eVar.f108202m = param.f107771W0;
        }

        public final void m(ConstraintHelper helper, int viewId, Constraints.LayoutParams param) {
            l(viewId, param);
            if (helper instanceof Barrier) {
                b bVar = this.f107984e;
                bVar.f108120j0 = 1;
                Barrier barrier = (Barrier) helper;
                bVar.f108116h0 = barrier.R();
                this.f107984e.f108122k0 = barrier.x();
                this.f107984e.f108118i0 = barrier.Q();
            }
        }

        public final ConstraintAttribute n(String attributeName, ConstraintAttribute.AttributeType attributeType) {
            if (!this.f107986g.containsKey(attributeName)) {
                ConstraintAttribute constraintAttribute = new ConstraintAttribute(attributeName, attributeType);
                this.f107986g.put(attributeName, constraintAttribute);
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = this.f107986g.get(attributeName);
            if (constraintAttribute2.j() == attributeType) {
                return constraintAttribute2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute2.j().name());
        }

        public void o(String tag) {
            C0273a c0273a = this.f107987h;
            if (c0273a != null) {
                c0273a.f(tag);
            } else {
                Log.v(tag, "DELTA IS NULL");
            }
        }

        public final void p(String attributeName, int value) {
            n(attributeName, ConstraintAttribute.AttributeType.COLOR_TYPE).s(value);
        }

        public final void q(String attributeName, float value) {
            n(attributeName, ConstraintAttribute.AttributeType.FLOAT_TYPE).t(value);
        }

        public final void r(String attributeName, int value) {
            n(attributeName, ConstraintAttribute.AttributeType.INT_TYPE).u(value);
        }

        public final void s(String attributeName, String value) {
            n(attributeName, ConstraintAttribute.AttributeType.STRING_TYPE).v(value);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: A0, reason: collision with root package name */
        public static final int f108004A0 = 7;

        /* JADX INFO: renamed from: A1, reason: collision with root package name */
        public static final int f108005A1 = 82;

        /* JADX INFO: renamed from: B0, reason: collision with root package name */
        public static final int f108006B0 = 8;

        /* JADX INFO: renamed from: B1, reason: collision with root package name */
        public static final int f108007B1 = 83;

        /* JADX INFO: renamed from: C0, reason: collision with root package name */
        public static final int f108008C0 = 9;

        /* JADX INFO: renamed from: C1, reason: collision with root package name */
        public static final int f108009C1 = 84;

        /* JADX INFO: renamed from: D0, reason: collision with root package name */
        public static final int f108010D0 = 10;

        /* JADX INFO: renamed from: D1, reason: collision with root package name */
        public static final int f108011D1 = 85;

        /* JADX INFO: renamed from: E0, reason: collision with root package name */
        public static final int f108012E0 = 11;

        /* JADX INFO: renamed from: E1, reason: collision with root package name */
        public static final int f108013E1 = 86;

        /* JADX INFO: renamed from: F0, reason: collision with root package name */
        public static final int f108014F0 = 12;

        /* JADX INFO: renamed from: F1, reason: collision with root package name */
        public static final int f108015F1 = 87;

        /* JADX INFO: renamed from: G0, reason: collision with root package name */
        public static final int f108016G0 = 13;

        /* JADX INFO: renamed from: G1, reason: collision with root package name */
        public static final int f108017G1 = 88;

        /* JADX INFO: renamed from: H0, reason: collision with root package name */
        public static final int f108018H0 = 14;

        /* JADX INFO: renamed from: H1, reason: collision with root package name */
        public static final int f108019H1 = 89;

        /* JADX INFO: renamed from: I0, reason: collision with root package name */
        public static final int f108020I0 = 15;

        /* JADX INFO: renamed from: I1, reason: collision with root package name */
        public static final int f108021I1 = 90;

        /* JADX INFO: renamed from: J0, reason: collision with root package name */
        public static final int f108022J0 = 16;

        /* JADX INFO: renamed from: J1, reason: collision with root package name */
        public static final int f108023J1 = 91;

        /* JADX INFO: renamed from: K0, reason: collision with root package name */
        public static final int f108024K0 = 17;

        /* JADX INFO: renamed from: L0, reason: collision with root package name */
        public static final int f108025L0 = 18;

        /* JADX INFO: renamed from: M0, reason: collision with root package name */
        public static final int f108026M0 = 19;

        /* JADX INFO: renamed from: N0, reason: collision with root package name */
        public static final int f108027N0 = 20;

        /* JADX INFO: renamed from: O0, reason: collision with root package name */
        public static final int f108028O0 = 21;

        /* JADX INFO: renamed from: P0, reason: collision with root package name */
        public static final int f108029P0 = 22;

        /* JADX INFO: renamed from: Q0, reason: collision with root package name */
        public static final int f108030Q0 = 23;

        /* JADX INFO: renamed from: R0, reason: collision with root package name */
        public static final int f108031R0 = 24;

        /* JADX INFO: renamed from: S0, reason: collision with root package name */
        public static final int f108032S0 = 25;

        /* JADX INFO: renamed from: T0, reason: collision with root package name */
        public static final int f108033T0 = 26;

        /* JADX INFO: renamed from: U0, reason: collision with root package name */
        public static final int f108034U0 = 27;

        /* JADX INFO: renamed from: V0, reason: collision with root package name */
        public static final int f108035V0 = 28;

        /* JADX INFO: renamed from: W0, reason: collision with root package name */
        public static final int f108036W0 = 29;

        /* JADX INFO: renamed from: X0, reason: collision with root package name */
        public static final int f108037X0 = 30;

        /* JADX INFO: renamed from: Y0, reason: collision with root package name */
        public static final int f108038Y0 = 31;

        /* JADX INFO: renamed from: Z0, reason: collision with root package name */
        public static final int f108039Z0 = 32;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public static final int f108040a1 = 33;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public static final int f108041b1 = 34;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public static final int f108042c1 = 35;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public static final int f108043d1 = 36;

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        public static final int f108044e1 = 37;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        public static final int f108045f1 = 38;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        public static final int f108046g1 = 39;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public static final int f108047h1 = 40;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public static final int f108048i1 = 41;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        public static final int f108049j1 = 42;

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        public static final int f108050k1 = 61;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        public static final int f108051l1 = 62;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        public static final int f108052m1 = 63;

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        public static final int f108053n1 = 69;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        public static final int f108054o1 = 70;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public static final int f108055p1 = 71;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        public static final int f108056q1 = 72;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f108057r0 = -1;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        public static final int f108058r1 = 73;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int f108059s0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: s1, reason: collision with root package name */
        public static final int f108060s1 = 74;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static SparseIntArray f108061t0 = null;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        public static final int f108062t1 = 75;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final int f108063u0 = 1;

        /* JADX INFO: renamed from: u1, reason: collision with root package name */
        public static final int f108064u1 = 76;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public static final int f108065v0 = 2;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        public static final int f108066v1 = 77;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final int f108067w0 = 3;

        /* JADX INFO: renamed from: w1, reason: collision with root package name */
        public static final int f108068w1 = 78;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final int f108069x0 = 4;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public static final int f108070x1 = 79;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f108071y0 = 5;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public static final int f108072y1 = 80;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final int f108073z0 = 6;

        /* JADX INFO: renamed from: z1, reason: collision with root package name */
        public static final int f108074z1 = 81;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f108107d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f108109e;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int[] f108122k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public String f108124l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public String f108126m0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108101a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f108103b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f108105c = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f108111f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f108113g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f108115h = -1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f108117i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f108119j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f108121k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f108123l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f108125m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f108127n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f108129o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f108131p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f108133q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f108135r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f108136s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f108137t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f108138u = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f108139v = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f108140w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f108141x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f108142y = 0.5f;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f108143z = 0.5f;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public String f108075A = null;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f108076B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f108077C = 0;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public float f108078D = 0.0f;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f108079E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f108080F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f108081G = -1;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f108082H = 0;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f108083I = 0;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f108084J = 0;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f108085K = 0;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f108086L = 0;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f108087M = 0;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f108088N = 0;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f108089O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f108090P = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f108091Q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f108092R = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f108093S = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f108094T = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f108095U = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public float f108096V = -1.0f;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public float f108097W = -1.0f;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f108098X = 0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f108099Y = 0;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f108100Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f108102a0 = 0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f108104b0 = 0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f108106c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f108108d0 = 0;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f108110e0 = 0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public float f108112f0 = 1.0f;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public float f108114g0 = 1.0f;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f108116h0 = -1;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f108118i0 = 0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f108120j0 = -1;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public boolean f108128n0 = false;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f108130o0 = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f108132p0 = true;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f108134q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f108061t0 = sparseIntArray;
            sparseIntArray.append(g.m.th, 24);
            f108061t0.append(g.m.uh, 25);
            f108061t0.append(g.m.wh, 28);
            f108061t0.append(g.m.xh, 29);
            f108061t0.append(g.m.Ch, 35);
            f108061t0.append(g.m.Bh, 34);
            f108061t0.append(g.m.ah, 4);
            f108061t0.append(g.m.Zg, 3);
            f108061t0.append(g.m.Vg, 1);
            f108061t0.append(g.m.Lh, 6);
            f108061t0.append(g.m.Mh, 7);
            f108061t0.append(g.m.hh, 17);
            f108061t0.append(g.m.ih, 18);
            f108061t0.append(g.m.jh, 19);
            f108061t0.append(g.m.Rg, 90);
            f108061t0.append(g.m.Cg, 26);
            f108061t0.append(g.m.yh, 31);
            f108061t0.append(g.m.zh, 32);
            f108061t0.append(g.m.gh, 10);
            f108061t0.append(g.m.fh, 9);
            f108061t0.append(g.m.Qh, 13);
            f108061t0.append(g.m.Th, 16);
            f108061t0.append(g.m.Rh, 14);
            f108061t0.append(g.m.Oh, 11);
            f108061t0.append(g.m.Sh, 15);
            f108061t0.append(g.m.Ph, 12);
            f108061t0.append(g.m.Fh, 38);
            f108061t0.append(g.m.rh, 37);
            f108061t0.append(g.m.qh, 39);
            f108061t0.append(g.m.Eh, 40);
            f108061t0.append(g.m.ph, 20);
            f108061t0.append(g.m.Dh, 36);
            f108061t0.append(g.m.eh, 5);
            f108061t0.append(g.m.sh, 91);
            f108061t0.append(g.m.Ah, 91);
            f108061t0.append(g.m.vh, 91);
            f108061t0.append(g.m.Yg, 91);
            f108061t0.append(g.m.Ug, 91);
            f108061t0.append(g.m.Fg, 23);
            f108061t0.append(g.m.Hg, 27);
            f108061t0.append(g.m.Jg, 30);
            f108061t0.append(g.m.Kg, 8);
            f108061t0.append(g.m.Gg, 33);
            f108061t0.append(g.m.Ig, 2);
            f108061t0.append(g.m.Dg, 22);
            f108061t0.append(g.m.Eg, 21);
            f108061t0.append(g.m.Gh, 41);
            f108061t0.append(g.m.kh, 42);
            f108061t0.append(g.m.Tg, 41);
            f108061t0.append(g.m.Sg, 42);
            f108061t0.append(g.m.Vh, 76);
            f108061t0.append(g.m.bh, 61);
            f108061t0.append(g.m.dh, 62);
            f108061t0.append(g.m.ch, 63);
            f108061t0.append(g.m.Kh, 69);
            f108061t0.append(g.m.oh, 70);
            f108061t0.append(g.m.Og, 71);
            f108061t0.append(g.m.Mg, 72);
            f108061t0.append(g.m.Ng, 73);
            f108061t0.append(g.m.Pg, 74);
            f108061t0.append(g.m.Lg, 75);
        }

        public void a(b src) {
            this.f108101a = src.f108101a;
            this.f108107d = src.f108107d;
            this.f108103b = src.f108103b;
            this.f108109e = src.f108109e;
            this.f108111f = src.f108111f;
            this.f108113g = src.f108113g;
            this.f108115h = src.f108115h;
            this.f108117i = src.f108117i;
            this.f108119j = src.f108119j;
            this.f108121k = src.f108121k;
            this.f108123l = src.f108123l;
            this.f108125m = src.f108125m;
            this.f108127n = src.f108127n;
            this.f108129o = src.f108129o;
            this.f108131p = src.f108131p;
            this.f108133q = src.f108133q;
            this.f108135r = src.f108135r;
            this.f108136s = src.f108136s;
            this.f108137t = src.f108137t;
            this.f108138u = src.f108138u;
            this.f108139v = src.f108139v;
            this.f108140w = src.f108140w;
            this.f108141x = src.f108141x;
            this.f108142y = src.f108142y;
            this.f108143z = src.f108143z;
            this.f108075A = src.f108075A;
            this.f108076B = src.f108076B;
            this.f108077C = src.f108077C;
            this.f108078D = src.f108078D;
            this.f108079E = src.f108079E;
            this.f108080F = src.f108080F;
            this.f108081G = src.f108081G;
            this.f108082H = src.f108082H;
            this.f108083I = src.f108083I;
            this.f108084J = src.f108084J;
            this.f108085K = src.f108085K;
            this.f108086L = src.f108086L;
            this.f108087M = src.f108087M;
            this.f108088N = src.f108088N;
            this.f108089O = src.f108089O;
            this.f108090P = src.f108090P;
            this.f108091Q = src.f108091Q;
            this.f108092R = src.f108092R;
            this.f108093S = src.f108093S;
            this.f108094T = src.f108094T;
            this.f108095U = src.f108095U;
            this.f108096V = src.f108096V;
            this.f108097W = src.f108097W;
            this.f108098X = src.f108098X;
            this.f108099Y = src.f108099Y;
            this.f108100Z = src.f108100Z;
            this.f108102a0 = src.f108102a0;
            this.f108104b0 = src.f108104b0;
            this.f108106c0 = src.f108106c0;
            this.f108108d0 = src.f108108d0;
            this.f108110e0 = src.f108110e0;
            this.f108112f0 = src.f108112f0;
            this.f108114g0 = src.f108114g0;
            this.f108116h0 = src.f108116h0;
            this.f108118i0 = src.f108118i0;
            this.f108120j0 = src.f108120j0;
            this.f108126m0 = src.f108126m0;
            int[] iArr = src.f108122k0;
            if (iArr == null || src.f108124l0 != null) {
                this.f108122k0 = null;
            } else {
                this.f108122k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f108124l0 = src.f108124l0;
            this.f108128n0 = src.f108128n0;
            this.f108130o0 = src.f108130o0;
            this.f108132p0 = src.f108132p0;
            this.f108134q0 = src.f108134q0;
        }

        public void b(u uVar, StringBuilder sb2) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb2.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objX = uVar.X(num.intValue());
                                sb2.append(TextProcessor.f150538k0);
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(objX == null ? num : objX);
                                sb2.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f10 = (Float) obj;
                            if (f10.floatValue() != -1.0f) {
                                sb2.append(TextProcessor.f150538k0);
                                sb2.append(name);
                                sb2.append(" = \"");
                                sb2.append(f10);
                                sb2.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }

        public void c(Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.Bg);
            this.f108103b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f108061t0.get(index);
                switch (i11) {
                    case 1:
                        this.f108135r = d.y0(typedArrayObtainStyledAttributes, index, this.f108135r);
                        break;
                    case 2:
                        this.f108085K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108085K);
                        break;
                    case 3:
                        this.f108133q = d.y0(typedArrayObtainStyledAttributes, index, this.f108133q);
                        break;
                    case 4:
                        this.f108131p = d.y0(typedArrayObtainStyledAttributes, index, this.f108131p);
                        break;
                    case 5:
                        this.f108075A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f108079E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f108079E);
                        break;
                    case 7:
                        this.f108080F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f108080F);
                        break;
                    case 8:
                        this.f108086L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108086L);
                        break;
                    case 9:
                        this.f108141x = d.y0(typedArrayObtainStyledAttributes, index, this.f108141x);
                        break;
                    case 10:
                        this.f108140w = d.y0(typedArrayObtainStyledAttributes, index, this.f108140w);
                        break;
                    case 11:
                        this.f108092R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108092R);
                        break;
                    case 12:
                        this.f108093S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108093S);
                        break;
                    case 13:
                        this.f108089O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108089O);
                        break;
                    case 14:
                        this.f108091Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108091Q);
                        break;
                    case 15:
                        this.f108094T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108094T);
                        break;
                    case 16:
                        this.f108090P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108090P);
                        break;
                    case 17:
                        this.f108111f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f108111f);
                        break;
                    case 18:
                        this.f108113g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f108113g);
                        break;
                    case 19:
                        this.f108115h = typedArrayObtainStyledAttributes.getFloat(index, this.f108115h);
                        break;
                    case 20:
                        this.f108142y = typedArrayObtainStyledAttributes.getFloat(index, this.f108142y);
                        break;
                    case 21:
                        this.f108109e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f108109e);
                        break;
                    case 22:
                        this.f108107d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f108107d);
                        break;
                    case 23:
                        this.f108082H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108082H);
                        break;
                    case 24:
                        this.f108119j = d.y0(typedArrayObtainStyledAttributes, index, this.f108119j);
                        break;
                    case 25:
                        this.f108121k = d.y0(typedArrayObtainStyledAttributes, index, this.f108121k);
                        break;
                    case 26:
                        this.f108081G = typedArrayObtainStyledAttributes.getInt(index, this.f108081G);
                        break;
                    case 27:
                        this.f108083I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108083I);
                        break;
                    case 28:
                        this.f108123l = d.y0(typedArrayObtainStyledAttributes, index, this.f108123l);
                        break;
                    case 29:
                        this.f108125m = d.y0(typedArrayObtainStyledAttributes, index, this.f108125m);
                        break;
                    case 30:
                        this.f108087M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108087M);
                        break;
                    case 31:
                        this.f108138u = d.y0(typedArrayObtainStyledAttributes, index, this.f108138u);
                        break;
                    case 32:
                        this.f108139v = d.y0(typedArrayObtainStyledAttributes, index, this.f108139v);
                        break;
                    case 33:
                        this.f108084J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108084J);
                        break;
                    case 34:
                        this.f108129o = d.y0(typedArrayObtainStyledAttributes, index, this.f108129o);
                        break;
                    case 35:
                        this.f108127n = d.y0(typedArrayObtainStyledAttributes, index, this.f108127n);
                        break;
                    case 36:
                        this.f108143z = typedArrayObtainStyledAttributes.getFloat(index, this.f108143z);
                        break;
                    case 37:
                        this.f108097W = typedArrayObtainStyledAttributes.getFloat(index, this.f108097W);
                        break;
                    case 38:
                        this.f108096V = typedArrayObtainStyledAttributes.getFloat(index, this.f108096V);
                        break;
                    case 39:
                        this.f108098X = typedArrayObtainStyledAttributes.getInt(index, this.f108098X);
                        break;
                    case 40:
                        this.f108099Y = typedArrayObtainStyledAttributes.getInt(index, this.f108099Y);
                        break;
                    case 41:
                        d.A0(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.A0(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f108076B = d.y0(typedArrayObtainStyledAttributes, index, this.f108076B);
                                break;
                            case 62:
                                this.f108077C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108077C);
                                break;
                            case 63:
                                this.f108078D = typedArrayObtainStyledAttributes.getFloat(index, this.f108078D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f108112f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f108114g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f108116h0 = typedArrayObtainStyledAttributes.getInt(index, this.f108116h0);
                                        break;
                                    case 73:
                                        this.f108118i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108118i0);
                                        break;
                                    case 74:
                                        this.f108124l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f108132p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f108132p0);
                                        break;
                                    case 76:
                                        this.f108134q0 = typedArrayObtainStyledAttributes.getInt(index, this.f108134q0);
                                        break;
                                    case 77:
                                        this.f108136s = d.y0(typedArrayObtainStyledAttributes, index, this.f108136s);
                                        break;
                                    case 78:
                                        this.f108137t = d.y0(typedArrayObtainStyledAttributes, index, this.f108137t);
                                        break;
                                    case 79:
                                        this.f108095U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108095U);
                                        break;
                                    case 80:
                                        this.f108088N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108088N);
                                        break;
                                    case 81:
                                        this.f108100Z = typedArrayObtainStyledAttributes.getInt(index, this.f108100Z);
                                        break;
                                    case 82:
                                        this.f108102a0 = typedArrayObtainStyledAttributes.getInt(index, this.f108102a0);
                                        break;
                                    case 83:
                                        this.f108106c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108106c0);
                                        break;
                                    case 84:
                                        this.f108104b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108104b0);
                                        break;
                                    case 85:
                                        this.f108110e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108110e0);
                                        break;
                                    case 86:
                                        this.f108108d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f108108d0);
                                        break;
                                    case 87:
                                        this.f108128n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f108128n0);
                                        break;
                                    case 88:
                                        this.f108130o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f108130o0);
                                        break;
                                    case 89:
                                        this.f108126m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f108117i = typedArrayObtainStyledAttributes.getBoolean(index, this.f108117i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f108061t0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f108061t0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f108144A = 9;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int f108145B = 10;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f108146o = -2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f108147p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f108148q = -3;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static SparseIntArray f108149r = null;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f108150s = 1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f108151t = 2;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f108152u = 3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f108153v = 4;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f108154w = 5;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f108155x = 6;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f108156y = 7;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f108157z = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108158a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f108159b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f108160c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f108161d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f108162e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f108163f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f108164g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f108165h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f108166i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f108167j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f108168k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f108169l = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f108170m = -3;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f108171n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f108149r = sparseIntArray;
            sparseIntArray.append(g.m.sj, 1);
            f108149r.append(g.m.uj, 2);
            f108149r.append(g.m.yj, 3);
            f108149r.append(g.m.rj, 4);
            f108149r.append(g.m.qj, 5);
            f108149r.append(g.m.pj, 6);
            f108149r.append(g.m.tj, 7);
            f108149r.append(g.m.xj, 8);
            f108149r.append(g.m.wj, 9);
            f108149r.append(g.m.vj, 10);
        }

        public void a(c src) {
            this.f108158a = src.f108158a;
            this.f108159b = src.f108159b;
            this.f108161d = src.f108161d;
            this.f108162e = src.f108162e;
            this.f108163f = src.f108163f;
            this.f108166i = src.f108166i;
            this.f108164g = src.f108164g;
            this.f108165h = src.f108165h;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.oj);
            this.f108158a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f108149r.get(index)) {
                    case 1:
                        this.f108166i = typedArrayObtainStyledAttributes.getFloat(index, this.f108166i);
                        break;
                    case 2:
                        this.f108162e = typedArrayObtainStyledAttributes.getInt(index, this.f108162e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f108161d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f108161d = C5563e.f238019o[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f108163f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f108159b = d.y0(typedArrayObtainStyledAttributes, index, this.f108159b);
                        break;
                    case 6:
                        this.f108160c = typedArrayObtainStyledAttributes.getInteger(index, this.f108160c);
                        break;
                    case 7:
                        this.f108164g = typedArrayObtainStyledAttributes.getFloat(index, this.f108164g);
                        break;
                    case 8:
                        this.f108168k = typedArrayObtainStyledAttributes.getInteger(index, this.f108168k);
                        break;
                    case 9:
                        this.f108167j = typedArrayObtainStyledAttributes.getFloat(index, this.f108167j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f108171n = resourceId;
                            if (resourceId != -1) {
                                this.f108170m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f108169l = string;
                            if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                                this.f108171n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f108170m = -2;
                            } else {
                                this.f108170m = -1;
                            }
                        } else {
                            this.f108170m = typedArrayObtainStyledAttributes.getInteger(index, this.f108171n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0274d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108172a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f108173b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f108174c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f108175d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f108176e = Float.NaN;

        public void a(C0274d src) {
            this.f108172a = src.f108172a;
            this.f108173b = src.f108173b;
            this.f108175d = src.f108175d;
            this.f108176e = src.f108176e;
            this.f108174c = src.f108174c;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.cl);
            this.f108172a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.el) {
                    this.f108175d = typedArrayObtainStyledAttributes.getFloat(index, this.f108175d);
                } else if (index == g.m.dl) {
                    this.f108173b = typedArrayObtainStyledAttributes.getInt(index, this.f108173b);
                    this.f108173b = d.f107888U[this.f108173b];
                } else if (index == g.m.hl) {
                    this.f108174c = typedArrayObtainStyledAttributes.getInt(index, this.f108174c);
                } else if (index == g.m.gl) {
                    this.f108176e = typedArrayObtainStyledAttributes.getFloat(index, this.f108176e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f108177A = 12;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static SparseIntArray f108178o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f108179p = 1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f108180q = 2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f108181r = 3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f108182s = 4;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f108183t = 5;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f108184u = 6;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f108185v = 7;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f108186w = 8;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f108187x = 9;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f108188y = 10;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f108189z = 11;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f108190a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f108191b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f108192c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f108193d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f108194e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f108195f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f108196g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f108197h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f108198i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f108199j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f108200k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f108201l = 0.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f108202m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f108203n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f108178o = sparseIntArray;
            sparseIntArray.append(g.m.Qn, 1);
            f108178o.append(g.m.Rn, 2);
            f108178o.append(g.m.Sn, 3);
            f108178o.append(g.m.On, 4);
            f108178o.append(g.m.Pn, 5);
            f108178o.append(g.m.Kn, 6);
            f108178o.append(g.m.Ln, 7);
            f108178o.append(g.m.Mn, 8);
            f108178o.append(g.m.Nn, 9);
            f108178o.append(g.m.Tn, 10);
            f108178o.append(g.m.Un, 11);
            f108178o.append(g.m.Vn, 12);
        }

        public void a(e src) {
            this.f108190a = src.f108190a;
            this.f108191b = src.f108191b;
            this.f108192c = src.f108192c;
            this.f108193d = src.f108193d;
            this.f108194e = src.f108194e;
            this.f108195f = src.f108195f;
            this.f108196g = src.f108196g;
            this.f108197h = src.f108197h;
            this.f108198i = src.f108198i;
            this.f108199j = src.f108199j;
            this.f108200k = src.f108200k;
            this.f108201l = src.f108201l;
            this.f108202m = src.f108202m;
            this.f108203n = src.f108203n;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.Jn);
            this.f108190a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f108178o.get(index)) {
                    case 1:
                        this.f108191b = typedArrayObtainStyledAttributes.getFloat(index, this.f108191b);
                        break;
                    case 2:
                        this.f108192c = typedArrayObtainStyledAttributes.getFloat(index, this.f108192c);
                        break;
                    case 3:
                        this.f108193d = typedArrayObtainStyledAttributes.getFloat(index, this.f108193d);
                        break;
                    case 4:
                        this.f108194e = typedArrayObtainStyledAttributes.getFloat(index, this.f108194e);
                        break;
                    case 5:
                        this.f108195f = typedArrayObtainStyledAttributes.getFloat(index, this.f108195f);
                        break;
                    case 6:
                        this.f108196g = typedArrayObtainStyledAttributes.getDimension(index, this.f108196g);
                        break;
                    case 7:
                        this.f108197h = typedArrayObtainStyledAttributes.getDimension(index, this.f108197h);
                        break;
                    case 8:
                        this.f108199j = typedArrayObtainStyledAttributes.getDimension(index, this.f108199j);
                        break;
                    case 9:
                        this.f108200k = typedArrayObtainStyledAttributes.getDimension(index, this.f108200k);
                        break;
                    case 10:
                        this.f108201l = typedArrayObtainStyledAttributes.getDimension(index, this.f108201l);
                        break;
                    case 11:
                        this.f108202m = true;
                        this.f108203n = typedArrayObtainStyledAttributes.getDimension(index, this.f108203n);
                        break;
                    case 12:
                        this.f108198i = d.y0(typedArrayObtainStyledAttributes, index, this.f108198i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class f {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f108204o = "       ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Writer f108205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintLayout f108206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f108207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f108208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f108209e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f108210f = "'left'";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f108211g = "'right'";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f108212h = "'baseline'";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f108213i = "'bottom'";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f108214j = "'top'";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f108215k = "'start'";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f108216l = "'end'";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HashMap<Integer, String> f108217m = new HashMap<>();

        public f(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.f108205a = writer;
            this.f108206b = layout;
            this.f108207c = layout.getContext();
            this.f108208d = flags;
        }

        public String a(int id2) {
            if (this.f108217m.containsKey(Integer.valueOf(id2))) {
                return android.support.v4.media.e.a(new StringBuilder("'"), this.f108217m.get(Integer.valueOf(id2)), "'");
            }
            if (id2 == 0) {
                return "'parent'";
            }
            String strB = b(id2);
            this.f108217m.put(Integer.valueOf(id2), strB);
            return "'" + strB + "'";
        }

        public String b(int id2) {
            try {
                if (id2 != -1) {
                    return this.f108207c.getResources().getResourceEntryName(id2);
                }
                StringBuilder sb2 = new StringBuilder("unknown");
                int i10 = this.f108209e + 1;
                this.f108209e = i10;
                sb2.append(i10);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder("unknown");
                int i11 = this.f108209e + 1;
                this.f108209e = i11;
                sb3.append(i11);
                return sb3.toString();
            }
        }

        public void c(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.f108205a.write("       circle");
            this.f108205a.write(":[");
            this.f108205a.write(a(circleConstraint));
            this.f108205a.write(j.f68738d + circleAngle);
            this.f108205a.write(circleRadius + "]");
        }

        public void d(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f108205a.write(f108204o + my);
            this.f108205a.write(":[");
            this.f108205a.write(a(leftToLeft));
            this.f108205a.write(" , ");
            this.f108205a.write(other);
            if (margin != 0) {
                this.f108205a.write(" , " + margin);
            }
            this.f108205a.write("],\n");
        }

        public final void e(String dimString, int dim, int dimDefault, float dimPercent, int dimMin, int dimMax, boolean constrainedDim) throws IOException {
            if (dim != 0) {
                if (dim == -2) {
                    this.f108205a.write(f108204o + dimString + ": 'wrap'\n");
                    return;
                }
                if (dim == -1) {
                    this.f108205a.write(f108204o + dimString + ": 'parent'\n");
                    return;
                }
                this.f108205a.write(f108204o + dimString + ": " + dim + ",\n");
                return;
            }
            if (dimMax == -1 && dimMin == -1) {
                if (dimDefault == 1) {
                    this.f108205a.write(f108204o + dimString + ": '???????????',\n");
                    return;
                }
                if (dimDefault != 2) {
                    return;
                }
                this.f108205a.write(f108204o + dimString + ": '" + dimPercent + "%',\n");
                return;
            }
            if (dimDefault == 0) {
                Writer writer = this.f108205a;
                StringBuilder sbA = androidx.constraintlayout.widget.e.a(f108204o, dimString, ": {'spread' ,", dimMin, j.f68738d);
                sbA.append(dimMax);
                sbA.append("}\n");
                writer.write(sbA.toString());
                return;
            }
            if (dimDefault == 1) {
                Writer writer2 = this.f108205a;
                StringBuilder sbA2 = androidx.constraintlayout.widget.e.a(f108204o, dimString, ": {'wrap' ,", dimMin, j.f68738d);
                sbA2.append(dimMax);
                sbA2.append("}\n");
                writer2.write(sbA2.toString());
                return;
            }
            if (dimDefault != 2) {
                return;
            }
            this.f108205a.write(f108204o + dimString + ": {'" + dimPercent + "'% ," + dimMin + j.f68738d + dimMax + "}\n");
        }

        public final void f(int orientation, int guideBegin, int guideEnd, float guidePercent) {
        }

        public void g() throws IOException {
            this.f108205a.write("\n'ConstraintSet':{\n");
            for (Integer num : d.this.f107979g.keySet()) {
                a aVar = d.this.f107979g.get(num);
                String strA = a(num.intValue());
                this.f108205a.write(strA + ":{\n");
                b bVar = aVar.f107984e;
                e(InMobiNetworkValues.HEIGHT, bVar.f108109e, bVar.f108102a0, bVar.f108114g0, bVar.f108110e0, bVar.f108106c0, bVar.f108130o0);
                e(InMobiNetworkValues.WIDTH, bVar.f108107d, bVar.f108100Z, bVar.f108112f0, bVar.f108108d0, bVar.f108104b0, bVar.f108128n0);
                d("'left'", bVar.f108119j, "'left'", bVar.f108082H, bVar.f108089O);
                d("'left'", bVar.f108121k, "'right'", bVar.f108082H, bVar.f108089O);
                d("'right'", bVar.f108123l, "'left'", bVar.f108083I, bVar.f108091Q);
                d("'right'", bVar.f108125m, "'right'", bVar.f108083I, bVar.f108091Q);
                d("'baseline'", bVar.f108135r, "'baseline'", -1, bVar.f108095U);
                d("'baseline'", bVar.f108136s, "'top'", -1, bVar.f108095U);
                d("'baseline'", bVar.f108137t, "'bottom'", -1, bVar.f108095U);
                d("'top'", bVar.f108129o, "'bottom'", bVar.f108084J, bVar.f108090P);
                d("'top'", bVar.f108127n, "'top'", bVar.f108084J, bVar.f108090P);
                d("'bottom'", bVar.f108133q, "'bottom'", bVar.f108085K, bVar.f108092R);
                d("'bottom'", bVar.f108131p, "'top'", bVar.f108085K, bVar.f108092R);
                d("'start'", bVar.f108139v, "'start'", bVar.f108087M, bVar.f108094T);
                d("'start'", bVar.f108138u, "'end'", bVar.f108087M, bVar.f108094T);
                d("'end'", bVar.f108140w, "'start'", bVar.f108086L, bVar.f108093S);
                d("'end'", bVar.f108141x, "'end'", bVar.f108086L, bVar.f108093S);
                i("'horizontalBias'", bVar.f108142y, 0.5f);
                i("'verticalBias'", bVar.f108143z, 0.5f);
                c(bVar.f108076B, bVar.f108078D, bVar.f108077C);
                k("'dimensionRatio'", bVar.f108075A);
                j("'barrierMargin'", bVar.f108118i0);
                j("'type'", bVar.f108120j0);
                k("'ReferenceId'", bVar.f108124l0);
                m("'mBarrierAllowsGoneWidgets'", bVar.f108132p0, true);
                j("'WrapBehavior'", bVar.f108134q0);
                h("'verticalWeight'", bVar.f108096V);
                h("'horizontalWeight'", bVar.f108097W);
                j("'horizontalChainStyle'", bVar.f108098X);
                j("'verticalChainStyle'", bVar.f108099Y);
                j("'barrierDirection'", bVar.f108116h0);
                int[] iArr = bVar.f108122k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f108205a.write("}\n");
            }
            this.f108205a.write("}\n");
        }

        public void h(String name, float value) throws IOException {
            if (value == -1.0f) {
                return;
            }
            this.f108205a.write(f108204o + name);
            this.f108205a.write(": " + value);
            this.f108205a.write(",\n");
        }

        public void i(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            this.f108205a.write(f108204o + name);
            this.f108205a.write(": " + value);
            this.f108205a.write(",\n");
        }

        public void j(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.f108205a.write(f108204o + name);
            this.f108205a.write(com.prism.gaia.server.accounts.b.f166434b0);
            this.f108205a.write(j.f68738d + value);
            this.f108205a.write("\n");
        }

        public void k(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.f108205a.write(f108204o + name);
            this.f108205a.write(com.prism.gaia.server.accounts.b.f166434b0);
            this.f108205a.write(j.f68738d.concat(value));
            this.f108205a.write("\n");
        }

        public void l(String name, boolean value) throws IOException {
            if (value) {
                this.f108205a.write(f108204o + name);
                this.f108205a.write(": " + value);
                this.f108205a.write(",\n");
            }
        }

        public void m(String name, boolean value, boolean def) throws IOException {
            if (value == def) {
                return;
            }
            this.f108205a.write(f108204o + name);
            this.f108205a.write(": " + value);
            this.f108205a.write(",\n");
        }

        public void n(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            this.f108205a.write(f108204o + name);
            this.f108205a.write(": ");
            int i10 = 0;
            while (i10 < value.length) {
                Writer writer = this.f108205a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "[" : j.f68738d);
                sb2.append(a(value[i10]));
                writer.write(sb2.toString());
                i10++;
            }
            this.f108205a.write("],\n");
        }
    }

    public class g {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f108219o = "\n       ";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Writer f108220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ConstraintLayout f108221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f108222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f108223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f108224e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f108225f = "'left'";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f108226g = "'right'";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f108227h = "'baseline'";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f108228i = "'bottom'";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f108229j = "'top'";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f108230k = "'start'";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f108231l = "'end'";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HashMap<Integer, String> f108232m = new HashMap<>();

        public g(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.f108220a = writer;
            this.f108221b = layout;
            this.f108222c = layout.getContext();
            this.f108223d = flags;
        }

        public String a(int id2) {
            if (this.f108232m.containsKey(Integer.valueOf(id2))) {
                return android.support.v4.media.e.a(new StringBuilder("@+id/"), this.f108232m.get(Integer.valueOf(id2)), "");
            }
            if (id2 == 0) {
                return d.f107893V1;
            }
            String strB = b(id2);
            this.f108232m.put(Integer.valueOf(id2), strB);
            return "@+id/" + strB + "";
        }

        public String b(int id2) {
            try {
                if (id2 != -1) {
                    return this.f108222c.getResources().getResourceEntryName(id2);
                }
                StringBuilder sb2 = new StringBuilder("unknown");
                int i10 = this.f108224e + 1;
                this.f108224e = i10;
                sb2.append(i10);
                return sb2.toString();
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder("unknown");
                int i11 = this.f108224e + 1;
                this.f108224e = i11;
                sb3.append(i11);
                return sb3.toString();
            }
        }

        public final void c(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                if (dim == -2) {
                    this.f108220a.write(f108219o + dimString + "=\"wrap_content\"");
                    return;
                }
                if (dim == -1) {
                    this.f108220a.write(f108219o + dimString + "=\"match_parent\"");
                    return;
                }
                this.f108220a.write(f108219o + dimString + "=\"" + dim + "dp\"");
            }
        }

        public final void d(String dimString, boolean val, boolean def) throws IOException {
            if (val != def) {
                this.f108220a.write(f108219o + dimString + "=\"" + val + "dp\"");
            }
        }

        public void e(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.f108220a.write("circle");
            this.f108220a.write(":[");
            this.f108220a.write(a(circleConstraint));
            this.f108220a.write(j.f68738d + circleAngle);
            this.f108220a.write(circleRadius + "]");
        }

        public void f(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f108220a.write(f108219o + my);
            this.f108220a.write(":[");
            this.f108220a.write(a(leftToLeft));
            this.f108220a.write(" , ");
            this.f108220a.write(other);
            if (margin != 0) {
                this.f108220a.write(" , " + margin);
            }
            this.f108220a.write("],\n");
        }

        public final void g(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                this.f108220a.write(f108219o + dimString + "=\"" + dim + "dp\"");
            }
        }

        public final void h(String dimString, int val, String[] types, int def) throws IOException {
            if (val != def) {
                Writer writer = this.f108220a;
                StringBuilder sbA = androidx.activity.result.i.a(f108219o, dimString, "=\"");
                sbA.append(types[val]);
                sbA.append("\"");
                writer.write(sbA.toString());
            }
        }

        public void i() throws IOException {
            this.f108220a.write("\n<ConstraintSet>\n");
            for (Integer num : d.this.f107979g.keySet()) {
                a aVar = d.this.f107979g.get(num);
                String strA = a(num.intValue());
                this.f108220a.write("  <Constraint");
                this.f108220a.write("\n       android:id=\"" + strA + "\"");
                b bVar = aVar.f107984e;
                c("android:layout_width", bVar.f108107d, -5);
                c("android:layout_height", bVar.f108109e, -5);
                j("app:layout_constraintGuide_begin", bVar.f108111f, -1.0f);
                j("app:layout_constraintGuide_end", bVar.f108113g, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.f108115h, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.f108142y, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.f108143z, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.f108075A, null);
                o("app:layout_constraintCircle", bVar.f108076B);
                j("app:layout_constraintCircleRadius", bVar.f108077C, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.f108078D, 0.0f);
                j("android:orientation", bVar.f108081G, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.f108096V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.f108097W, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.f108098X, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.f108099Y, 0.0f);
                j("app:barrierDirection", bVar.f108116h0, -1.0f);
                j("app:barrierMargin", bVar.f108118i0, 0.0f);
                g("app:layout_marginLeft", bVar.f108082H, 0);
                g("app:layout_goneMarginLeft", bVar.f108089O, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.f108083I, 0);
                g("app:layout_goneMarginRight", bVar.f108091Q, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.f108087M, 0);
                g("app:layout_goneMarginStart", bVar.f108094T, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.f108086L, 0);
                g("app:layout_goneMarginEnd", bVar.f108093S, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.f108084J, 0);
                g("app:layout_goneMarginTop", bVar.f108090P, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.f108085K, 0);
                g("app:layout_goneMarginBottom", bVar.f108092R, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.f108095U, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.f108088N, 0);
                d("app:layout_constrainedWidth", bVar.f108128n0, false);
                d("app:layout_constrainedHeight", bVar.f108130o0, false);
                d("app:barrierAllowsGoneWidgets", bVar.f108132p0, true);
                j("app:layout_wrapBehaviorInParent", bVar.f108134q0, 0.0f);
                o("app:baselineToBaseline", bVar.f108135r);
                o("app:baselineToBottom", bVar.f108137t);
                o("app:baselineToTop", bVar.f108136s);
                o("app:layout_constraintBottom_toBottomOf", bVar.f108133q);
                o("app:layout_constraintBottom_toTopOf", bVar.f108131p);
                o("app:layout_constraintEnd_toEndOf", bVar.f108141x);
                o("app:layout_constraintEnd_toStartOf", bVar.f108140w);
                o("app:layout_constraintLeft_toLeftOf", bVar.f108119j);
                o("app:layout_constraintLeft_toRightOf", bVar.f108121k);
                o("app:layout_constraintRight_toLeftOf", bVar.f108123l);
                o("app:layout_constraintRight_toRightOf", bVar.f108125m);
                o("app:layout_constraintStart_toEndOf", bVar.f108138u);
                o("app:layout_constraintStart_toStartOf", bVar.f108139v);
                o("app:layout_constraintTop_toBottomOf", bVar.f108129o);
                o("app:layout_constraintTop_toTopOf", bVar.f108127n);
                String[] strArr = {"spread", "wrap", "percent"};
                h("app:layout_constraintHeight_default", bVar.f108102a0, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.f108114g0, 1.0f);
                g("app:layout_constraintHeight_min", bVar.f108110e0, 0);
                g("app:layout_constraintHeight_max", bVar.f108106c0, 0);
                d("android:layout_constrainedHeight", bVar.f108130o0, false);
                h("app:layout_constraintWidth_default", bVar.f108100Z, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.f108112f0, 1.0f);
                g("app:layout_constraintWidth_min", bVar.f108108d0, 0);
                g("app:layout_constraintWidth_max", bVar.f108104b0, 0);
                d("android:layout_constrainedWidth", bVar.f108128n0, false);
                j("app:layout_constraintVertical_weight", bVar.f108096V, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.f108097W, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.f108098X);
                k("app:layout_constraintVertical_chainStyle", bVar.f108099Y);
                h("app:barrierDirection", bVar.f108116h0, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                m("app:layout_constraintTag", bVar.f108126m0, null);
                int[] iArr = bVar.f108122k0;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.f108220a.write(" />\n");
            }
            this.f108220a.write("</ConstraintSet>\n");
        }

        public void j(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            this.f108220a.write(f108219o + name);
            this.f108220a.write("=\"" + value + "\"");
        }

        public void k(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            this.f108220a.write(f108219o + name + "=\"" + value + "\"\n");
        }

        public void l(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.f108220a.write(name);
            this.f108220a.write(com.prism.gaia.server.accounts.b.f166434b0);
            this.f108220a.write(j.f68738d.concat(value));
            this.f108220a.write("\n");
        }

        public void m(String name, String value, String def) throws IOException {
            if (value == null || value.equals(def)) {
                return;
            }
            this.f108220a.write(f108219o + name);
            this.f108220a.write("=\"" + value + "\"");
        }

        public void n(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            this.f108220a.write(f108219o + name);
            this.f108220a.write(com.prism.gaia.server.accounts.b.f166434b0);
            int i10 = 0;
            while (i10 < value.length) {
                Writer writer = this.f108220a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10 == 0 ? "[" : j.f68738d);
                sb2.append(a(value[i10]));
                writer.write(sb2.toString());
                i10++;
            }
            this.f108220a.write("],\n");
        }

        public void o(String str, int leftToLeft) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            this.f108220a.write(f108219o + str);
            this.f108220a.write("=\"" + a(leftToLeft) + "\"");
        }
    }

    static {
        f107894W.append(g.m.f109921I5, 25);
        f107894W.append(g.m.f109936J5, 26);
        f107894W.append(g.m.f109966L5, 29);
        f107894W.append(g.m.f109981M5, 30);
        f107894W.append(g.m.f110071S5, 36);
        f107894W.append(g.m.f110056R5, 35);
        f107894W.append(g.m.f110411p5, 4);
        f107894W.append(g.m.f110396o5, 3);
        f107894W.append(g.m.f110336k5, 1);
        f107894W.append(g.m.f110366m5, 91);
        f107894W.append(g.m.f110351l5, 92);
        f107894W.append(g.m.f110200b6, 6);
        f107894W.append(g.m.f110215c6, 7);
        f107894W.append(g.m.f110516w5, 17);
        f107894W.append(g.m.f110531x5, 18);
        f107894W.append(g.m.f110546y5, 19);
        f107894W.append(g.m.f110274g5, 99);
        f107894W.append(g.m.f110243e4, 27);
        f107894W.append(g.m.f109996N5, 32);
        f107894W.append(g.m.f110011O5, 33);
        f107894W.append(g.m.f110501v5, 10);
        f107894W.append(g.m.f110486u5, 9);
        f107894W.append(g.m.f110275g6, 13);
        f107894W.append(g.m.f110322j6, 16);
        f107894W.append(g.m.f110290h6, 14);
        f107894W.append(g.m.f110245e6, 11);
        f107894W.append(g.m.f110305i6, 15);
        f107894W.append(g.m.f110260f6, 12);
        f107894W.append(g.m.f110114V5, 40);
        f107894W.append(g.m.f109891G5, 39);
        f107894W.append(g.m.f109876F5, 41);
        f107894W.append(g.m.f110100U5, 42);
        f107894W.append(g.m.f109861E5, 20);
        f107894W.append(g.m.f110086T5, 37);
        f107894W.append(g.m.f110471t5, 5);
        f107894W.append(g.m.f109906H5, 87);
        f107894W.append(g.m.f110041Q5, 87);
        f107894W.append(g.m.f109951K5, 87);
        f107894W.append(g.m.f110381n5, 87);
        f107894W.append(g.m.f110321j5, 87);
        f107894W.append(g.m.f110320j4, 24);
        f107894W.append(g.m.f110350l4, 28);
        f107894W.append(g.m.f109815B4, 31);
        f107894W.append(g.m.f109830C4, 8);
        f107894W.append(g.m.f110335k4, 34);
        f107894W.append(g.m.f110365m4, 2);
        f107894W.append(g.m.f110288h4, 23);
        f107894W.append(g.m.f110303i4, 21);
        f107894W.append(g.m.f110128W5, 95);
        f107894W.append(g.m.f110561z5, 96);
        f107894W.append(g.m.f110273g4, 22);
        f107894W.append(g.m.f110440r4, 43);
        f107894W.append(g.m.f109860E4, 44);
        f107894W.append(g.m.f110560z4, 45);
        f107894W.append(g.m.f109800A4, 46);
        f107894W.append(g.m.f110545y4, 60);
        f107894W.append(g.m.f110515w4, 47);
        f107894W.append(g.m.f110530x4, 48);
        f107894W.append(g.m.f110455s4, 49);
        f107894W.append(g.m.f110470t4, 50);
        f107894W.append(g.m.f110485u4, 51);
        f107894W.append(g.m.f110500v4, 52);
        f107894W.append(g.m.f109845D4, 53);
        f107894W.append(g.m.f110142X5, 54);
        f107894W.append(g.m.f109801A5, 55);
        f107894W.append(g.m.f110156Y5, 56);
        f107894W.append(g.m.f109816B5, 57);
        f107894W.append(g.m.f110170Z5, 58);
        f107894W.append(g.m.f109831C5, 59);
        f107894W.append(g.m.f110426q5, 61);
        f107894W.append(g.m.f110456s5, 62);
        f107894W.append(g.m.f110441r5, 63);
        f107894W.append(g.m.f109890G4, 64);
        f107894W.append(g.m.f110502v6, 65);
        f107894W.append(g.m.f109995N4, 66);
        f107894W.append(g.m.f110517w6, 67);
        f107894W.append(g.m.f110382n6, 79);
        f107894W.append(g.m.f110258f4, 38);
        f107894W.append(g.m.f110367m6, 68);
        f107894W.append(g.m.f110185a6, 69);
        f107894W.append(g.m.f109846D5, 70);
        f107894W.append(g.m.f110352l6, 97);
        f107894W.append(g.m.f109950K4, 71);
        f107894W.append(g.m.f109920I4, 72);
        f107894W.append(g.m.f109935J4, 73);
        f107894W.append(g.m.f109965L4, 74);
        f107894W.append(g.m.f109905H4, 75);
        f107894W.append(g.m.f110397o6, 76);
        f107894W.append(g.m.f110026P5, 77);
        f107894W.append(g.m.f110532x6, 78);
        f107894W.append(g.m.f110304i5, 80);
        f107894W.append(g.m.f110289h5, 81);
        f107894W.append(g.m.f110427q6, 82);
        f107894W.append(g.m.f110487u6, 83);
        f107894W.append(g.m.f110472t6, 84);
        f107894W.append(g.m.f110457s6, 85);
        f107894W.append(g.m.f110442r6, 86);
        SparseIntArray sparseIntArray = f107896X;
        int i10 = g.m.f109806Aa;
        sparseIntArray.append(i10, 6);
        f107896X.append(i10, 7);
        f107896X.append(g.m.f110089T8, 27);
        f107896X.append(g.m.f109866Ea, 13);
        f107896X.append(g.m.f109911Ha, 16);
        f107896X.append(g.m.f109881Fa, 14);
        f107896X.append(g.m.f109836Ca, 11);
        f107896X.append(g.m.f109896Ga, 15);
        f107896X.append(g.m.f109851Da, 12);
        f107896X.append(g.m.f110476ta, 40);
        f107896X.append(g.m.f110371ma, 39);
        f107896X.append(g.m.f110356la, 41);
        f107896X.append(g.m.f110461sa, 42);
        f107896X.append(g.m.f110341ka, 20);
        f107896X.append(g.m.f110446ra, 37);
        f107896X.append(g.m.f110204ba, 5);
        f107896X.append(g.m.f110386na, 87);
        f107896X.append(g.m.f110431qa, 87);
        f107896X.append(g.m.f110401oa, 87);
        f107896X.append(g.m.f110160Y9, 87);
        f107896X.append(g.m.f110146X9, 87);
        f107896X.append(g.m.f110159Y8, 24);
        f107896X.append(g.m.f110188a9, 28);
        f107896X.append(g.m.f110430q9, 31);
        f107896X.append(g.m.f110445r9, 8);
        f107896X.append(g.m.f110173Z8, 34);
        f107896X.append(g.m.f110203b9, 2);
        f107896X.append(g.m.f110131W8, 23);
        f107896X.append(g.m.f110145X8, 21);
        f107896X.append(g.m.f110491ua, 95);
        f107896X.append(g.m.f110264fa, 96);
        f107896X.append(g.m.f110117V8, 22);
        f107896X.append(g.m.f110278g9, 43);
        f107896X.append(g.m.f110475t9, 44);
        f107896X.append(g.m.f110400o9, 45);
        f107896X.append(g.m.f110415p9, 46);
        f107896X.append(g.m.f110385n9, 60);
        f107896X.append(g.m.f110355l9, 47);
        f107896X.append(g.m.f110370m9, 48);
        f107896X.append(g.m.f110293h9, 49);
        f107896X.append(g.m.f110308i9, 50);
        f107896X.append(g.m.f110325j9, 51);
        f107896X.append(g.m.f110340k9, 52);
        f107896X.append(g.m.f110460s9, 53);
        f107896X.append(g.m.f110506va, 54);
        f107896X.append(g.m.f110279ga, 55);
        f107896X.append(g.m.f110521wa, 56);
        f107896X.append(g.m.f110294ha, 57);
        f107896X.append(g.m.f110536xa, 58);
        f107896X.append(g.m.f110309ia, 59);
        f107896X.append(g.m.f110189aa, 62);
        f107896X.append(g.m.f110174Z9, 63);
        f107896X.append(g.m.f110505v9, 64);
        f107896X.append(g.m.f110105Ua, 65);
        f107896X.append(g.m.f109820B9, 66);
        f107896X.append(g.m.f110119Va, 67);
        f107896X.append(g.m.f109971La, 79);
        f107896X.append(g.m.f110103U8, 38);
        f107896X.append(g.m.f109986Ma, 98);
        f107896X.append(g.m.f109956Ka, 68);
        f107896X.append(g.m.f110551ya, 69);
        f107896X.append(g.m.f110326ja, 70);
        f107896X.append(g.m.f110565z9, 71);
        f107896X.append(g.m.f110535x9, 72);
        f107896X.append(g.m.f110550y9, 73);
        f107896X.append(g.m.f109805A9, 74);
        f107896X.append(g.m.f110520w9, 75);
        f107896X.append(g.m.f110001Na, 76);
        f107896X.append(g.m.f110416pa, 77);
        f107896X.append(g.m.f110133Wa, 78);
        f107896X.append(g.m.f110132W9, 80);
        f107896X.append(g.m.f110118V9, 81);
        f107896X.append(g.m.f110031Pa, 82);
        f107896X.append(g.m.f110091Ta, 83);
        f107896X.append(g.m.f110076Sa, 84);
        f107896X.append(g.m.f110061Ra, 85);
        f107896X.append(g.m.f110046Qa, 86);
        f107896X.append(g.m.f109941Ja, 97);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L4
            goto L71
        L4:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L72
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2b
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L27
            r6 = -3
            if (r5 == r6) goto L21
            if (r5 == r0) goto L23
            r6 = -1
            if (r5 == r6) goto L23
        L21:
            r5 = r2
            goto L30
        L23:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L30
        L27:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L30
        L2b:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L23
        L30:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r6 == 0) goto L42
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            if (r7 != 0) goto L3d
            r4.width = r2
            r4.f107650a0 = r5
            return
        L3d:
            r4.height = r2
            r4.f107652b0 = r5
            return
        L42:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.b
            if (r6 == 0) goto L54
            androidx.constraintlayout.widget.d$b r4 = (androidx.constraintlayout.widget.d.b) r4
            if (r7 != 0) goto L4f
            r4.f108107d = r2
            r4.f108128n0 = r5
            return
        L4f:
            r4.f108109e = r2
            r4.f108130o0 = r5
            return
        L54:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.a.C0273a
            if (r6 == 0) goto L71
            androidx.constraintlayout.widget.d$a$a r4 = (androidx.constraintlayout.widget.d.a.C0273a) r4
            if (r7 != 0) goto L67
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            return
        L67:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L71:
            return
        L72:
            java.lang.String r5 = r5.getString(r6)
            B0(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.A0(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void B0(Object data, String value, int orientation) {
        if (value == null) {
            return;
        }
        int iIndexOf = value.indexOf(61);
        int length = value.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = value.substring(0, iIndexOf);
        String strSubstring2 = value.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if (f107890U1.equalsIgnoreCase(strTrim)) {
                if (data instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) data;
                    if (orientation == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    C0(layoutParams, strTrim2);
                    return;
                }
                if (data instanceof b) {
                    ((b) data).f108075A = strTrim2;
                    return;
                } else {
                    if (data instanceof a.C0273a) {
                        ((a.C0273a) data).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (data instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.f107634L = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.f107635M = f10;
                            return;
                        }
                    }
                    if (data instanceof b) {
                        b bVar = (b) data;
                        if (orientation == 0) {
                            bVar.f108107d = 0;
                            bVar.f108097W = f10;
                            return;
                        } else {
                            bVar.f108109e = 0;
                            bVar.f108096V = f10;
                            return;
                        }
                    }
                    if (data instanceof a.C0273a) {
                        a.C0273a c0273a = (a.C0273a) data;
                        if (orientation == 0) {
                            c0273a.b(23, 0);
                            c0273a.a(39, f10);
                            return;
                        } else {
                            c0273a.b(21, 0);
                            c0273a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if (f107893V1.equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (data instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.f107644V = fMax;
                            layoutParams3.f107638P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f107645W = fMax;
                            layoutParams3.f107639Q = 2;
                            return;
                        }
                    }
                    if (data instanceof b) {
                        b bVar2 = (b) data;
                        if (orientation == 0) {
                            bVar2.f108107d = 0;
                            bVar2.f108112f0 = fMax;
                            bVar2.f108100Z = 2;
                            return;
                        } else {
                            bVar2.f108109e = 0;
                            bVar2.f108114g0 = fMax;
                            bVar2.f108102a0 = 2;
                            return;
                        }
                    }
                    if (data instanceof a.C0273a) {
                        a.C0273a c0273a2 = (a.C0273a) data;
                        if (orientation == 0) {
                            c0273a2.b(23, 0);
                            c0273a2.b(54, 2);
                        } else {
                            c0273a2.b(21, 0);
                            c0273a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void C0(ConstraintLayout.LayoutParams params, String value) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (value != null) {
            int length = value.length();
            int iIndexOf = value.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = value.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase(t1.b.f238834T4)) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = value.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = value.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = value.substring(i11, iIndexOf2);
                    String strSubstring4 = value.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        params.f107631I = value;
        params.f107632J = fAbs;
        params.f107633K = i10;
    }

    public static String[] G1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 == ',' && !z10) {
                arrayList.add(new String(charArray, i10, i11 - i10));
                i10 = i11 + 1;
            } else if (c10 == '\"') {
                z10 = !z10;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void H0(Context ctx, a c10, TypedArray a10) {
        int indexCount = a10.getIndexCount();
        a.C0273a c0273a = new a.C0273a();
        c10.f107987h = c0273a;
        c10.f107983d.f108158a = false;
        c10.f107984e.f108103b = false;
        c10.f107982c.f108172a = false;
        c10.f107985f.f108190a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = a10.getIndex(i10);
            switch (f107896X.get(index)) {
                case 2:
                    c0273a.b(2, a10.getDimensionPixelSize(index, c10.f107984e.f108085K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f107894W.get(index));
                    break;
                case 5:
                    c0273a.c(5, a10.getString(index));
                    break;
                case 6:
                    c0273a.b(6, a10.getDimensionPixelOffset(index, c10.f107984e.f108079E));
                    break;
                case 7:
                    c0273a.b(7, a10.getDimensionPixelOffset(index, c10.f107984e.f108080F));
                    break;
                case 8:
                    c0273a.b(8, a10.getDimensionPixelSize(index, c10.f107984e.f108086L));
                    break;
                case 11:
                    c0273a.b(11, a10.getDimensionPixelSize(index, c10.f107984e.f108092R));
                    break;
                case 12:
                    c0273a.b(12, a10.getDimensionPixelSize(index, c10.f107984e.f108093S));
                    break;
                case 13:
                    c0273a.b(13, a10.getDimensionPixelSize(index, c10.f107984e.f108089O));
                    break;
                case 14:
                    c0273a.b(14, a10.getDimensionPixelSize(index, c10.f107984e.f108091Q));
                    break;
                case 15:
                    c0273a.b(15, a10.getDimensionPixelSize(index, c10.f107984e.f108094T));
                    break;
                case 16:
                    c0273a.b(16, a10.getDimensionPixelSize(index, c10.f107984e.f108090P));
                    break;
                case 17:
                    c0273a.b(17, a10.getDimensionPixelOffset(index, c10.f107984e.f108111f));
                    break;
                case 18:
                    c0273a.b(18, a10.getDimensionPixelOffset(index, c10.f107984e.f108113g));
                    break;
                case 19:
                    c0273a.a(19, a10.getFloat(index, c10.f107984e.f108115h));
                    break;
                case 20:
                    c0273a.a(20, a10.getFloat(index, c10.f107984e.f108142y));
                    break;
                case 21:
                    c0273a.b(21, a10.getLayoutDimension(index, c10.f107984e.f108109e));
                    break;
                case 22:
                    c0273a.b(22, f107888U[a10.getInt(index, c10.f107982c.f108173b)]);
                    break;
                case 23:
                    c0273a.b(23, a10.getLayoutDimension(index, c10.f107984e.f108107d));
                    break;
                case 24:
                    c0273a.b(24, a10.getDimensionPixelSize(index, c10.f107984e.f108082H));
                    break;
                case 27:
                    c0273a.b(27, a10.getInt(index, c10.f107984e.f108081G));
                    break;
                case 28:
                    c0273a.b(28, a10.getDimensionPixelSize(index, c10.f107984e.f108083I));
                    break;
                case 31:
                    c0273a.b(31, a10.getDimensionPixelSize(index, c10.f107984e.f108087M));
                    break;
                case 34:
                    c0273a.b(34, a10.getDimensionPixelSize(index, c10.f107984e.f108084J));
                    break;
                case 37:
                    c0273a.a(37, a10.getFloat(index, c10.f107984e.f108143z));
                    break;
                case 38:
                    int resourceId = a10.getResourceId(index, c10.f107980a);
                    c10.f107980a = resourceId;
                    c0273a.b(38, resourceId);
                    break;
                case 39:
                    c0273a.a(39, a10.getFloat(index, c10.f107984e.f108097W));
                    break;
                case 40:
                    c0273a.a(40, a10.getFloat(index, c10.f107984e.f108096V));
                    break;
                case 41:
                    c0273a.b(41, a10.getInt(index, c10.f107984e.f108098X));
                    break;
                case 42:
                    c0273a.b(42, a10.getInt(index, c10.f107984e.f108099Y));
                    break;
                case 43:
                    c0273a.a(43, a10.getFloat(index, c10.f107982c.f108175d));
                    break;
                case 44:
                    c0273a.d(44, true);
                    c0273a.a(44, a10.getDimension(index, c10.f107985f.f108203n));
                    break;
                case 45:
                    c0273a.a(45, a10.getFloat(index, c10.f107985f.f108192c));
                    break;
                case 46:
                    c0273a.a(46, a10.getFloat(index, c10.f107985f.f108193d));
                    break;
                case 47:
                    c0273a.a(47, a10.getFloat(index, c10.f107985f.f108194e));
                    break;
                case 48:
                    c0273a.a(48, a10.getFloat(index, c10.f107985f.f108195f));
                    break;
                case 49:
                    c0273a.a(49, a10.getDimension(index, c10.f107985f.f108196g));
                    break;
                case 50:
                    c0273a.a(50, a10.getDimension(index, c10.f107985f.f108197h));
                    break;
                case 51:
                    c0273a.a(51, a10.getDimension(index, c10.f107985f.f108199j));
                    break;
                case 52:
                    c0273a.a(52, a10.getDimension(index, c10.f107985f.f108200k));
                    break;
                case 53:
                    c0273a.a(53, a10.getDimension(index, c10.f107985f.f108201l));
                    break;
                case 54:
                    c0273a.b(54, a10.getInt(index, c10.f107984e.f108100Z));
                    break;
                case 55:
                    c0273a.b(55, a10.getInt(index, c10.f107984e.f108102a0));
                    break;
                case 56:
                    c0273a.b(56, a10.getDimensionPixelSize(index, c10.f107984e.f108104b0));
                    break;
                case 57:
                    c0273a.b(57, a10.getDimensionPixelSize(index, c10.f107984e.f108106c0));
                    break;
                case 58:
                    c0273a.b(58, a10.getDimensionPixelSize(index, c10.f107984e.f108108d0));
                    break;
                case 59:
                    c0273a.b(59, a10.getDimensionPixelSize(index, c10.f107984e.f108110e0));
                    break;
                case 60:
                    c0273a.a(60, a10.getFloat(index, c10.f107985f.f108191b));
                    break;
                case 62:
                    c0273a.b(62, a10.getDimensionPixelSize(index, c10.f107984e.f108077C));
                    break;
                case 63:
                    c0273a.a(63, a10.getFloat(index, c10.f107984e.f108078D));
                    break;
                case 64:
                    c0273a.b(64, y0(a10, index, c10.f107983d.f108159b));
                    break;
                case 65:
                    if (a10.peekValue(index).type == 3) {
                        c0273a.c(65, a10.getString(index));
                    } else {
                        c0273a.c(65, C5563e.f238019o[a10.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0273a.b(66, a10.getInt(index, 0));
                    break;
                case 67:
                    c0273a.a(67, a10.getFloat(index, c10.f107983d.f108166i));
                    break;
                case 68:
                    c0273a.a(68, a10.getFloat(index, c10.f107982c.f108176e));
                    break;
                case 69:
                    c0273a.a(69, a10.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0273a.a(70, a10.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0273a.b(72, a10.getInt(index, c10.f107984e.f108116h0));
                    break;
                case 73:
                    c0273a.b(73, a10.getDimensionPixelSize(index, c10.f107984e.f108118i0));
                    break;
                case 74:
                    c0273a.c(74, a10.getString(index));
                    break;
                case 75:
                    c0273a.d(75, a10.getBoolean(index, c10.f107984e.f108132p0));
                    break;
                case 76:
                    c0273a.b(76, a10.getInt(index, c10.f107983d.f108162e));
                    break;
                case 77:
                    c0273a.c(77, a10.getString(index));
                    break;
                case 78:
                    c0273a.b(78, a10.getInt(index, c10.f107982c.f108174c));
                    break;
                case 79:
                    c0273a.a(79, a10.getFloat(index, c10.f107983d.f108164g));
                    break;
                case 80:
                    c0273a.d(80, a10.getBoolean(index, c10.f107984e.f108128n0));
                    break;
                case 81:
                    c0273a.d(81, a10.getBoolean(index, c10.f107984e.f108130o0));
                    break;
                case 82:
                    c0273a.b(82, a10.getInteger(index, c10.f107983d.f108160c));
                    break;
                case 83:
                    c0273a.b(83, y0(a10, index, c10.f107985f.f108198i));
                    break;
                case 84:
                    c0273a.b(84, a10.getInteger(index, c10.f107983d.f108168k));
                    break;
                case 85:
                    c0273a.a(85, a10.getFloat(index, c10.f107983d.f108167j));
                    break;
                case 86:
                    int i11 = a10.peekValue(index).type;
                    if (i11 == 1) {
                        c10.f107983d.f108171n = a10.getResourceId(index, -1);
                        c0273a.b(89, c10.f107983d.f108171n);
                        c cVar = c10.f107983d;
                        if (cVar.f108171n != -1) {
                            cVar.f108170m = -2;
                            c0273a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        c10.f107983d.f108169l = a10.getString(index);
                        c0273a.c(90, c10.f107983d.f108169l);
                        if (c10.f107983d.f108169l.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                            c10.f107983d.f108171n = a10.getResourceId(index, -1);
                            c0273a.b(89, c10.f107983d.f108171n);
                            c10.f107983d.f108170m = -2;
                            c0273a.b(88, -2);
                        } else {
                            c10.f107983d.f108170m = -1;
                            c0273a.b(88, -1);
                        }
                    } else {
                        c cVar2 = c10.f107983d;
                        cVar2.f108170m = a10.getInteger(index, cVar2.f108171n);
                        c0273a.b(88, c10.f107983d.f108170m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f107894W.get(index));
                    break;
                case 93:
                    c0273a.b(93, a10.getDimensionPixelSize(index, c10.f107984e.f108088N));
                    break;
                case 94:
                    c0273a.b(94, a10.getDimensionPixelSize(index, c10.f107984e.f108095U));
                    break;
                case 95:
                    A0(c0273a, a10, index, 0);
                    break;
                case 96:
                    A0(c0273a, a10, index, 1);
                    break;
                case 97:
                    c0273a.b(97, a10.getInt(index, c10.f107984e.f108134q0));
                    break;
                case 98:
                    if (MotionLayout.f106695O0) {
                        int resourceId2 = a10.getResourceId(index, c10.f107980a);
                        c10.f107980a = resourceId2;
                        if (resourceId2 == -1) {
                            c10.f107981b = a10.getString(index);
                        }
                    } else if (a10.peekValue(index).type == 3) {
                        c10.f107981b = a10.getString(index);
                    } else {
                        c10.f107980a = a10.getResourceId(index, c10.f107980a);
                    }
                    break;
                case 99:
                    c0273a.d(99, a10.getBoolean(index, c10.f107984e.f108117i));
                    break;
            }
        }
    }

    public static void R0(a c10, int type, float value) {
        if (type == 19) {
            c10.f107984e.f108115h = value;
            return;
        }
        if (type == 20) {
            c10.f107984e.f108142y = value;
            return;
        }
        if (type == 37) {
            c10.f107984e.f108143z = value;
            return;
        }
        if (type == 60) {
            c10.f107985f.f108191b = value;
            return;
        }
        if (type == 63) {
            c10.f107984e.f108078D = value;
            return;
        }
        if (type == 79) {
            c10.f107983d.f108164g = value;
            return;
        }
        if (type == 85) {
            c10.f107983d.f108167j = value;
            return;
        }
        if (type != 87) {
            if (type == 39) {
                c10.f107984e.f108097W = value;
                return;
            }
            if (type == 40) {
                c10.f107984e.f108096V = value;
                return;
            }
            switch (type) {
                case 43:
                    c10.f107982c.f108175d = value;
                    break;
                case 44:
                    e eVar = c10.f107985f;
                    eVar.f108203n = value;
                    eVar.f108202m = true;
                    break;
                case 45:
                    c10.f107985f.f108192c = value;
                    break;
                case 46:
                    c10.f107985f.f108193d = value;
                    break;
                case 47:
                    c10.f107985f.f108194e = value;
                    break;
                case 48:
                    c10.f107985f.f108195f = value;
                    break;
                case 49:
                    c10.f107985f.f108196g = value;
                    break;
                case 50:
                    c10.f107985f.f108197h = value;
                    break;
                case 51:
                    c10.f107985f.f108199j = value;
                    break;
                case 52:
                    c10.f107985f.f108200k = value;
                    break;
                case 53:
                    c10.f107985f.f108201l = value;
                    break;
                default:
                    switch (type) {
                        case 67:
                            c10.f107983d.f108166i = value;
                            break;
                        case 68:
                            c10.f107982c.f108176e = value;
                            break;
                        case 69:
                            c10.f107984e.f108112f0 = value;
                            break;
                        case 70:
                            c10.f107984e.f108114g0 = value;
                            break;
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            break;
                    }
                    break;
            }
        }
    }

    public static void S0(a c10, int type, int value) {
        if (type == 6) {
            c10.f107984e.f108079E = value;
            return;
        }
        if (type == 7) {
            c10.f107984e.f108080F = value;
            return;
        }
        if (type == 8) {
            c10.f107984e.f108086L = value;
            return;
        }
        if (type == 27) {
            c10.f107984e.f108081G = value;
            return;
        }
        if (type == 28) {
            c10.f107984e.f108083I = value;
            return;
        }
        if (type == 41) {
            c10.f107984e.f108098X = value;
            return;
        }
        if (type == 42) {
            c10.f107984e.f108099Y = value;
            return;
        }
        if (type == 61) {
            c10.f107984e.f108076B = value;
            return;
        }
        if (type == 62) {
            c10.f107984e.f108077C = value;
            return;
        }
        if (type == 72) {
            c10.f107984e.f108116h0 = value;
            return;
        }
        if (type == 73) {
            c10.f107984e.f108118i0 = value;
            return;
        }
        switch (type) {
            case 2:
                c10.f107984e.f108085K = value;
                break;
            case 11:
                c10.f107984e.f108092R = value;
                break;
            case 12:
                c10.f107984e.f108093S = value;
                break;
            case 13:
                c10.f107984e.f108089O = value;
                break;
            case 14:
                c10.f107984e.f108091Q = value;
                break;
            case 15:
                c10.f107984e.f108094T = value;
                break;
            case 16:
                c10.f107984e.f108090P = value;
                break;
            case 17:
                c10.f107984e.f108111f = value;
                break;
            case 18:
                c10.f107984e.f108113g = value;
                break;
            case 31:
                c10.f107984e.f108087M = value;
                break;
            case 34:
                c10.f107984e.f108084J = value;
                break;
            case 38:
                c10.f107980a = value;
                break;
            case 64:
                c10.f107983d.f108159b = value;
                break;
            case 66:
                c10.f107983d.f108163f = value;
                break;
            case 76:
                c10.f107983d.f108162e = value;
                break;
            case 78:
                c10.f107982c.f108174c = value;
                break;
            case 93:
                c10.f107984e.f108088N = value;
                break;
            case 94:
                c10.f107984e.f108095U = value;
                break;
            case 97:
                c10.f107984e.f108134q0 = value;
                break;
            default:
                switch (type) {
                    case 21:
                        c10.f107984e.f108109e = value;
                        break;
                    case 22:
                        c10.f107982c.f108173b = value;
                        break;
                    case 23:
                        c10.f107984e.f108107d = value;
                        break;
                    case 24:
                        c10.f107984e.f108082H = value;
                        break;
                    default:
                        switch (type) {
                            case 54:
                                c10.f107984e.f108100Z = value;
                                break;
                            case 55:
                                c10.f107984e.f108102a0 = value;
                                break;
                            case 56:
                                c10.f107984e.f108104b0 = value;
                                break;
                            case 57:
                                c10.f107984e.f108106c0 = value;
                                break;
                            case 58:
                                c10.f107984e.f108108d0 = value;
                                break;
                            case 59:
                                c10.f107984e.f108110e0 = value;
                                break;
                            default:
                                switch (type) {
                                    case 82:
                                        c10.f107983d.f108160c = value;
                                        break;
                                    case 83:
                                        c10.f107985f.f108198i = value;
                                        break;
                                    case 84:
                                        c10.f107983d.f108168k = value;
                                        break;
                                    default:
                                        switch (type) {
                                            case 87:
                                                break;
                                            case 88:
                                                c10.f107983d.f108170m = value;
                                                break;
                                            case 89:
                                                c10.f107983d.f108171n = value;
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public static void T0(a c10, int type, String value) {
        if (type == 5) {
            c10.f107984e.f108075A = value;
            return;
        }
        if (type == 65) {
            c10.f107983d.f108161d = value;
            return;
        }
        if (type == 74) {
            b bVar = c10.f107984e;
            bVar.f108124l0 = value;
            bVar.f108122k0 = null;
        } else if (type == 77) {
            c10.f107984e.f108126m0 = value;
        } else if (type != 87) {
            if (type != 90) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                c10.f107983d.f108169l = value;
            }
        }
    }

    public static void U0(a c10, int type, boolean value) {
        if (type == 44) {
            c10.f107985f.f108202m = value;
            return;
        }
        if (type == 75) {
            c10.f107984e.f108132p0 = value;
            return;
        }
        if (type != 87) {
            if (type == 80) {
                c10.f107984e.f108128n0 = value;
            } else if (type != 81) {
                Log.w("ConstraintSet", "Unknown attribute 0x");
            } else {
                c10.f107984e.f108130o0 = value;
            }
        }
    }

    public static String m0(int v10) {
        for (Field field : d.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == v10) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return q.f194113a;
    }

    public static String p0(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + C2377c.i(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    public static a w(Context context, XmlPullParser parser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(parser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, g.m.f110074S8);
        H0(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int y0(TypedArray a10, int index, int def) {
        int resourceId = a10.getResourceId(index, def);
        return resourceId == -1 ? a10.getInt(index, -1) : resourceId;
    }

    public void A(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(viewId, toView, 7, 0, toView, 6, 0, 0.5f);
        }
    }

    public void A1(int viewId, float bias) {
        i0(viewId).f107984e.f108143z = bias;
    }

    public void B(int centerID, int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        L(centerID, 6, startId, startSide, startMargin);
        L(centerID, 7, endId, endSide, endMargin);
        a aVar = this.f107979g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f107984e.f108142y = bias;
        }
    }

    public void B1(int viewId, int chainStyle) {
        i0(viewId).f107984e.f108099Y = chainStyle;
    }

    public void C(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(viewId, toView, 4, 0, toView, 3, 0, 0.5f);
        }
    }

    public void C1(int viewId, float weight) {
        i0(viewId).f107984e.f108096V = weight;
    }

    public void D(int centerID, int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        L(centerID, 3, topId, topSide, topMargin);
        L(centerID, 4, bottomId, bottomSide, bottomMargin);
        a aVar = this.f107979g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f107984e.f108143z = bias;
        }
    }

    public void D0(a set, String attributes) {
        String[] strArrSplit = attributes.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                androidx.constraintlayout.widget.c.a(new StringBuilder(" Unable to parse "), strArrSplit[i10], "ConstraintSet");
            } else {
                set.q(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void D1(int viewId, int visibility) {
        i0(viewId).f107982c.f108173b = visibility;
    }

    public void E(int viewId) {
        this.f107979g.remove(Integer.valueOf(viewId));
    }

    public void E0(a set, String attributes) {
        String[] strArrSplit = attributes.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                androidx.constraintlayout.widget.c.a(new StringBuilder(" Unable to parse "), strArrSplit[i10], "ConstraintSet");
            } else {
                set.q(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void E1(int viewId, int visibilityMode) {
        i0(viewId).f107982c.f108174c = visibilityMode;
    }

    public void F(int viewId, int anchor) {
        a aVar;
        if (!this.f107979g.containsKey(Integer.valueOf(viewId)) || (aVar = this.f107979g.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        switch (anchor) {
            case 1:
                b bVar = aVar.f107984e;
                bVar.f108121k = -1;
                bVar.f108119j = -1;
                bVar.f108082H = -1;
                bVar.f108089O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f107984e;
                bVar2.f108125m = -1;
                bVar2.f108123l = -1;
                bVar2.f108083I = -1;
                bVar2.f108091Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f107984e;
                bVar3.f108129o = -1;
                bVar3.f108127n = -1;
                bVar3.f108084J = 0;
                bVar3.f108090P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f107984e;
                bVar4.f108131p = -1;
                bVar4.f108133q = -1;
                bVar4.f108085K = 0;
                bVar4.f108092R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f107984e;
                bVar5.f108135r = -1;
                bVar5.f108136s = -1;
                bVar5.f108137t = -1;
                bVar5.f108088N = 0;
                bVar5.f108095U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f107984e;
                bVar6.f108138u = -1;
                bVar6.f108139v = -1;
                bVar6.f108087M = 0;
                bVar6.f108094T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f107984e;
                bVar7.f108140w = -1;
                bVar7.f108141x = -1;
                bVar7.f108086L = 0;
                bVar7.f108093S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f107984e;
                bVar8.f108078D = -1.0f;
                bVar8.f108077C = -1;
                bVar8.f108076B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F0(a set, String attributes) {
        String[] strArrG1 = G1(attributes);
        for (int i10 = 0; i10 < strArrG1.length; i10++) {
            String[] strArrSplit = strArrG1[i10].split("=");
            androidx.constraintlayout.widget.c.a(new StringBuilder(" Unable to parse "), strArrG1[i10], "ConstraintSet");
            set.s(strArrSplit[0], strArrSplit[1]);
        }
    }

    public final String F1(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public void G(Context context, int constraintLayoutId) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(constraintLayoutId, (ViewGroup) null));
    }

    public final void G0(Context ctx, a c10, TypedArray a10, boolean override) {
        if (override) {
            H0(ctx, c10, a10);
            return;
        }
        int indexCount = a10.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = a10.getIndex(i10);
            if (index != g.m.f110258f4 && g.m.f109815B4 != index && g.m.f109830C4 != index) {
                c10.f107983d.f108158a = true;
                c10.f107984e.f108103b = true;
                c10.f107982c.f108172a = true;
                c10.f107985f.f108190a = true;
            }
            switch (f107894W.get(index)) {
                case 1:
                    b bVar = c10.f107984e;
                    bVar.f108135r = y0(a10, index, bVar.f108135r);
                    break;
                case 2:
                    b bVar2 = c10.f107984e;
                    bVar2.f108085K = a10.getDimensionPixelSize(index, bVar2.f108085K);
                    break;
                case 3:
                    b bVar3 = c10.f107984e;
                    bVar3.f108133q = y0(a10, index, bVar3.f108133q);
                    break;
                case 4:
                    b bVar4 = c10.f107984e;
                    bVar4.f108131p = y0(a10, index, bVar4.f108131p);
                    break;
                case 5:
                    c10.f107984e.f108075A = a10.getString(index);
                    break;
                case 6:
                    b bVar5 = c10.f107984e;
                    bVar5.f108079E = a10.getDimensionPixelOffset(index, bVar5.f108079E);
                    break;
                case 7:
                    b bVar6 = c10.f107984e;
                    bVar6.f108080F = a10.getDimensionPixelOffset(index, bVar6.f108080F);
                    break;
                case 8:
                    b bVar7 = c10.f107984e;
                    bVar7.f108086L = a10.getDimensionPixelSize(index, bVar7.f108086L);
                    break;
                case 9:
                    b bVar8 = c10.f107984e;
                    bVar8.f108141x = y0(a10, index, bVar8.f108141x);
                    break;
                case 10:
                    b bVar9 = c10.f107984e;
                    bVar9.f108140w = y0(a10, index, bVar9.f108140w);
                    break;
                case 11:
                    b bVar10 = c10.f107984e;
                    bVar10.f108092R = a10.getDimensionPixelSize(index, bVar10.f108092R);
                    break;
                case 12:
                    b bVar11 = c10.f107984e;
                    bVar11.f108093S = a10.getDimensionPixelSize(index, bVar11.f108093S);
                    break;
                case 13:
                    b bVar12 = c10.f107984e;
                    bVar12.f108089O = a10.getDimensionPixelSize(index, bVar12.f108089O);
                    break;
                case 14:
                    b bVar13 = c10.f107984e;
                    bVar13.f108091Q = a10.getDimensionPixelSize(index, bVar13.f108091Q);
                    break;
                case 15:
                    b bVar14 = c10.f107984e;
                    bVar14.f108094T = a10.getDimensionPixelSize(index, bVar14.f108094T);
                    break;
                case 16:
                    b bVar15 = c10.f107984e;
                    bVar15.f108090P = a10.getDimensionPixelSize(index, bVar15.f108090P);
                    break;
                case 17:
                    b bVar16 = c10.f107984e;
                    bVar16.f108111f = a10.getDimensionPixelOffset(index, bVar16.f108111f);
                    break;
                case 18:
                    b bVar17 = c10.f107984e;
                    bVar17.f108113g = a10.getDimensionPixelOffset(index, bVar17.f108113g);
                    break;
                case 19:
                    b bVar18 = c10.f107984e;
                    bVar18.f108115h = a10.getFloat(index, bVar18.f108115h);
                    break;
                case 20:
                    b bVar19 = c10.f107984e;
                    bVar19.f108142y = a10.getFloat(index, bVar19.f108142y);
                    break;
                case 21:
                    b bVar20 = c10.f107984e;
                    bVar20.f108109e = a10.getLayoutDimension(index, bVar20.f108109e);
                    break;
                case 22:
                    C0274d c0274d = c10.f107982c;
                    c0274d.f108173b = a10.getInt(index, c0274d.f108173b);
                    C0274d c0274d2 = c10.f107982c;
                    c0274d2.f108173b = f107888U[c0274d2.f108173b];
                    break;
                case 23:
                    b bVar21 = c10.f107984e;
                    bVar21.f108107d = a10.getLayoutDimension(index, bVar21.f108107d);
                    break;
                case 24:
                    b bVar22 = c10.f107984e;
                    bVar22.f108082H = a10.getDimensionPixelSize(index, bVar22.f108082H);
                    break;
                case 25:
                    b bVar23 = c10.f107984e;
                    bVar23.f108119j = y0(a10, index, bVar23.f108119j);
                    break;
                case 26:
                    b bVar24 = c10.f107984e;
                    bVar24.f108121k = y0(a10, index, bVar24.f108121k);
                    break;
                case 27:
                    b bVar25 = c10.f107984e;
                    bVar25.f108081G = a10.getInt(index, bVar25.f108081G);
                    break;
                case 28:
                    b bVar26 = c10.f107984e;
                    bVar26.f108083I = a10.getDimensionPixelSize(index, bVar26.f108083I);
                    break;
                case 29:
                    b bVar27 = c10.f107984e;
                    bVar27.f108123l = y0(a10, index, bVar27.f108123l);
                    break;
                case 30:
                    b bVar28 = c10.f107984e;
                    bVar28.f108125m = y0(a10, index, bVar28.f108125m);
                    break;
                case 31:
                    b bVar29 = c10.f107984e;
                    bVar29.f108087M = a10.getDimensionPixelSize(index, bVar29.f108087M);
                    break;
                case 32:
                    b bVar30 = c10.f107984e;
                    bVar30.f108138u = y0(a10, index, bVar30.f108138u);
                    break;
                case 33:
                    b bVar31 = c10.f107984e;
                    bVar31.f108139v = y0(a10, index, bVar31.f108139v);
                    break;
                case 34:
                    b bVar32 = c10.f107984e;
                    bVar32.f108084J = a10.getDimensionPixelSize(index, bVar32.f108084J);
                    break;
                case 35:
                    b bVar33 = c10.f107984e;
                    bVar33.f108129o = y0(a10, index, bVar33.f108129o);
                    break;
                case 36:
                    b bVar34 = c10.f107984e;
                    bVar34.f108127n = y0(a10, index, bVar34.f108127n);
                    break;
                case 37:
                    b bVar35 = c10.f107984e;
                    bVar35.f108143z = a10.getFloat(index, bVar35.f108143z);
                    break;
                case 38:
                    c10.f107980a = a10.getResourceId(index, c10.f107980a);
                    break;
                case 39:
                    b bVar36 = c10.f107984e;
                    bVar36.f108097W = a10.getFloat(index, bVar36.f108097W);
                    break;
                case 40:
                    b bVar37 = c10.f107984e;
                    bVar37.f108096V = a10.getFloat(index, bVar37.f108096V);
                    break;
                case 41:
                    b bVar38 = c10.f107984e;
                    bVar38.f108098X = a10.getInt(index, bVar38.f108098X);
                    break;
                case 42:
                    b bVar39 = c10.f107984e;
                    bVar39.f108099Y = a10.getInt(index, bVar39.f108099Y);
                    break;
                case 43:
                    C0274d c0274d3 = c10.f107982c;
                    c0274d3.f108175d = a10.getFloat(index, c0274d3.f108175d);
                    break;
                case 44:
                    e eVar = c10.f107985f;
                    eVar.f108202m = true;
                    eVar.f108203n = a10.getDimension(index, eVar.f108203n);
                    break;
                case 45:
                    e eVar2 = c10.f107985f;
                    eVar2.f108192c = a10.getFloat(index, eVar2.f108192c);
                    break;
                case 46:
                    e eVar3 = c10.f107985f;
                    eVar3.f108193d = a10.getFloat(index, eVar3.f108193d);
                    break;
                case 47:
                    e eVar4 = c10.f107985f;
                    eVar4.f108194e = a10.getFloat(index, eVar4.f108194e);
                    break;
                case 48:
                    e eVar5 = c10.f107985f;
                    eVar5.f108195f = a10.getFloat(index, eVar5.f108195f);
                    break;
                case 49:
                    e eVar6 = c10.f107985f;
                    eVar6.f108196g = a10.getDimension(index, eVar6.f108196g);
                    break;
                case 50:
                    e eVar7 = c10.f107985f;
                    eVar7.f108197h = a10.getDimension(index, eVar7.f108197h);
                    break;
                case 51:
                    e eVar8 = c10.f107985f;
                    eVar8.f108199j = a10.getDimension(index, eVar8.f108199j);
                    break;
                case 52:
                    e eVar9 = c10.f107985f;
                    eVar9.f108200k = a10.getDimension(index, eVar9.f108200k);
                    break;
                case 53:
                    e eVar10 = c10.f107985f;
                    eVar10.f108201l = a10.getDimension(index, eVar10.f108201l);
                    break;
                case 54:
                    b bVar40 = c10.f107984e;
                    bVar40.f108100Z = a10.getInt(index, bVar40.f108100Z);
                    break;
                case 55:
                    b bVar41 = c10.f107984e;
                    bVar41.f108102a0 = a10.getInt(index, bVar41.f108102a0);
                    break;
                case 56:
                    b bVar42 = c10.f107984e;
                    bVar42.f108104b0 = a10.getDimensionPixelSize(index, bVar42.f108104b0);
                    break;
                case 57:
                    b bVar43 = c10.f107984e;
                    bVar43.f108106c0 = a10.getDimensionPixelSize(index, bVar43.f108106c0);
                    break;
                case 58:
                    b bVar44 = c10.f107984e;
                    bVar44.f108108d0 = a10.getDimensionPixelSize(index, bVar44.f108108d0);
                    break;
                case 59:
                    b bVar45 = c10.f107984e;
                    bVar45.f108110e0 = a10.getDimensionPixelSize(index, bVar45.f108110e0);
                    break;
                case 60:
                    e eVar11 = c10.f107985f;
                    eVar11.f108191b = a10.getFloat(index, eVar11.f108191b);
                    break;
                case 61:
                    b bVar46 = c10.f107984e;
                    bVar46.f108076B = y0(a10, index, bVar46.f108076B);
                    break;
                case 62:
                    b bVar47 = c10.f107984e;
                    bVar47.f108077C = a10.getDimensionPixelSize(index, bVar47.f108077C);
                    break;
                case 63:
                    b bVar48 = c10.f107984e;
                    bVar48.f108078D = a10.getFloat(index, bVar48.f108078D);
                    break;
                case 64:
                    c cVar = c10.f107983d;
                    cVar.f108159b = y0(a10, index, cVar.f108159b);
                    break;
                case 65:
                    if (a10.peekValue(index).type == 3) {
                        c10.f107983d.f108161d = a10.getString(index);
                    } else {
                        c10.f107983d.f108161d = C5563e.f238019o[a10.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c10.f107983d.f108163f = a10.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = c10.f107983d;
                    cVar2.f108166i = a10.getFloat(index, cVar2.f108166i);
                    break;
                case 68:
                    C0274d c0274d4 = c10.f107982c;
                    c0274d4.f108176e = a10.getFloat(index, c0274d4.f108176e);
                    break;
                case 69:
                    c10.f107984e.f108112f0 = a10.getFloat(index, 1.0f);
                    break;
                case 70:
                    c10.f107984e.f108114g0 = a10.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = c10.f107984e;
                    bVar49.f108116h0 = a10.getInt(index, bVar49.f108116h0);
                    break;
                case 73:
                    b bVar50 = c10.f107984e;
                    bVar50.f108118i0 = a10.getDimensionPixelSize(index, bVar50.f108118i0);
                    break;
                case 74:
                    c10.f107984e.f108124l0 = a10.getString(index);
                    break;
                case 75:
                    b bVar51 = c10.f107984e;
                    bVar51.f108132p0 = a10.getBoolean(index, bVar51.f108132p0);
                    break;
                case 76:
                    c cVar3 = c10.f107983d;
                    cVar3.f108162e = a10.getInt(index, cVar3.f108162e);
                    break;
                case 77:
                    c10.f107984e.f108126m0 = a10.getString(index);
                    break;
                case 78:
                    C0274d c0274d5 = c10.f107982c;
                    c0274d5.f108174c = a10.getInt(index, c0274d5.f108174c);
                    break;
                case 79:
                    c cVar4 = c10.f107983d;
                    cVar4.f108164g = a10.getFloat(index, cVar4.f108164g);
                    break;
                case 80:
                    b bVar52 = c10.f107984e;
                    bVar52.f108128n0 = a10.getBoolean(index, bVar52.f108128n0);
                    break;
                case 81:
                    b bVar53 = c10.f107984e;
                    bVar53.f108130o0 = a10.getBoolean(index, bVar53.f108130o0);
                    break;
                case 82:
                    c cVar5 = c10.f107983d;
                    cVar5.f108160c = a10.getInteger(index, cVar5.f108160c);
                    break;
                case 83:
                    e eVar12 = c10.f107985f;
                    eVar12.f108198i = y0(a10, index, eVar12.f108198i);
                    break;
                case 84:
                    c cVar6 = c10.f107983d;
                    cVar6.f108168k = a10.getInteger(index, cVar6.f108168k);
                    break;
                case 85:
                    c cVar7 = c10.f107983d;
                    cVar7.f108167j = a10.getFloat(index, cVar7.f108167j);
                    break;
                case 86:
                    int i11 = a10.peekValue(index).type;
                    if (i11 == 1) {
                        c10.f107983d.f108171n = a10.getResourceId(index, -1);
                        c cVar8 = c10.f107983d;
                        if (cVar8.f108171n != -1) {
                            cVar8.f108170m = -2;
                        }
                    } else if (i11 == 3) {
                        c10.f107983d.f108169l = a10.getString(index);
                        if (c10.f107983d.f108169l.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                            c10.f107983d.f108171n = a10.getResourceId(index, -1);
                            c10.f107983d.f108170m = -2;
                        } else {
                            c10.f107983d.f108170m = -1;
                        }
                    } else {
                        c cVar9 = c10.f107983d;
                        cVar9.f108170m = a10.getInteger(index, cVar9.f108171n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f107894W.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f107894W.get(index));
                    break;
                case 91:
                    b bVar54 = c10.f107984e;
                    bVar54.f108136s = y0(a10, index, bVar54.f108136s);
                    break;
                case 92:
                    b bVar55 = c10.f107984e;
                    bVar55.f108137t = y0(a10, index, bVar55.f108137t);
                    break;
                case 93:
                    b bVar56 = c10.f107984e;
                    bVar56.f108088N = a10.getDimensionPixelSize(index, bVar56.f108088N);
                    break;
                case 94:
                    b bVar57 = c10.f107984e;
                    bVar57.f108095U = a10.getDimensionPixelSize(index, bVar57.f108095U);
                    break;
                case 95:
                    A0(c10.f107984e, a10, index, 0);
                    break;
                case 96:
                    A0(c10.f107984e, a10, index, 1);
                    break;
                case 97:
                    b bVar58 = c10.f107984e;
                    bVar58.f108134q0 = a10.getInt(index, bVar58.f108134q0);
                    break;
            }
        }
        b bVar59 = c10.f107984e;
        if (bVar59.f108124l0 != null) {
            bVar59.f108122k0 = null;
        }
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f107979g.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f107978f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f107979g.containsKey(Integer.valueOf(id2))) {
                this.f107979g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f107979g.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f107986g = ConstraintAttribute.d(this.f107977e, childAt);
                aVar.k(id2, layoutParams);
                aVar.f107982c.f108173b = childAt.getVisibility();
                aVar.f107982c.f108175d = childAt.getAlpha();
                aVar.f107985f.f108191b = childAt.getRotation();
                aVar.f107985f.f108192c = childAt.getRotationX();
                aVar.f107985f.f108193d = childAt.getRotationY();
                aVar.f107985f.f108194e = childAt.getScaleX();
                aVar.f107985f.f108195f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f107985f;
                    eVar.f108196g = pivotX;
                    eVar.f108197h = pivotY;
                }
                aVar.f107985f.f108199j = childAt.getTranslationX();
                aVar.f107985f.f108200k = childAt.getTranslationY();
                aVar.f107985f.f108201l = childAt.getTranslationZ();
                e eVar2 = aVar.f107985f;
                if (eVar2.f108202m) {
                    eVar2.f108203n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f107984e.f108132p0 = barrier.P();
                    aVar.f107984e.f108122k0 = barrier.x();
                    aVar.f107984e.f108116h0 = barrier.R();
                    aVar.f107984e.f108118i0 = barrier.Q();
                }
            }
        }
    }

    public void H1(Writer writer, ConstraintLayout layout, int flags) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((flags & 1) == 1) {
            new g(writer, layout, flags).i();
        } else {
            new f(writer, layout, flags).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void I(d set) {
        this.f107979g.clear();
        for (Integer num : set.f107979g.keySet()) {
            a aVar = set.f107979g.get(num);
            if (aVar != null) {
                this.f107979g.put(num, aVar.clone());
            }
        }
    }

    public void I0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f107978f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f107979g.containsKey(Integer.valueOf(id2))) {
                this.f107979g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f107979g.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f107984e.f108103b) {
                    aVar.k(id2, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f107984e.f108122k0 = ((ConstraintHelper) childAt).x();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f107984e.f108132p0 = barrier.P();
                            aVar.f107984e.f108116h0 = barrier.R();
                            aVar.f107984e.f108118i0 = barrier.Q();
                        }
                    }
                    aVar.f107984e.f108103b = true;
                }
                C0274d c0274d = aVar.f107982c;
                if (!c0274d.f108172a) {
                    c0274d.f108173b = childAt.getVisibility();
                    aVar.f107982c.f108175d = childAt.getAlpha();
                    aVar.f107982c.f108172a = true;
                }
                e eVar = aVar.f107985f;
                if (!eVar.f108190a) {
                    eVar.f108190a = true;
                    eVar.f108191b = childAt.getRotation();
                    aVar.f107985f.f108192c = childAt.getRotationX();
                    aVar.f107985f.f108193d = childAt.getRotationY();
                    aVar.f107985f.f108194e = childAt.getScaleX();
                    aVar.f107985f.f108195f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f107985f;
                        eVar2.f108196g = pivotX;
                        eVar2.f108197h = pivotY;
                    }
                    aVar.f107985f.f108199j = childAt.getTranslationX();
                    aVar.f107985f.f108200k = childAt.getTranslationY();
                    aVar.f107985f.f108201l = childAt.getTranslationZ();
                    e eVar3 = aVar.f107985f;
                    if (eVar3.f108202m) {
                        eVar3.f108203n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void J(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f107979g.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraints.getChildAt(i10);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f107978f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f107979g.containsKey(Integer.valueOf(id2))) {
                this.f107979g.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f107979g.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    aVar.m((ConstraintHelper) childAt, id2, layoutParams);
                }
                aVar.l(id2, layoutParams);
            }
        }
    }

    public void J0(d set) {
        for (Integer num : set.f107979g.keySet()) {
            num.getClass();
            a aVar = set.f107979g.get(num);
            if (!this.f107979g.containsKey(num)) {
                this.f107979g.put(num, new a());
            }
            a aVar2 = this.f107979g.get(num);
            if (aVar2 != null) {
                b bVar = aVar2.f107984e;
                if (!bVar.f108103b) {
                    bVar.a(aVar.f107984e);
                }
                C0274d c0274d = aVar2.f107982c;
                if (!c0274d.f108172a) {
                    c0274d.a(aVar.f107982c);
                }
                e eVar = aVar2.f107985f;
                if (!eVar.f108190a) {
                    eVar.a(aVar.f107985f);
                }
                c cVar = aVar2.f107983d;
                if (!cVar.f108158a) {
                    cVar.a(aVar.f107983d);
                }
                for (String str : aVar.f107986g.keySet()) {
                    if (!aVar2.f107986g.containsKey(str)) {
                        aVar2.f107986g.put(str, aVar.f107986g.get(str));
                    }
                }
            }
        }
    }

    public void K(int startID, int startSide, int endID, int endSide) {
        if (!this.f107979g.containsKey(Integer.valueOf(startID))) {
            this.f107979g.put(Integer.valueOf(startID), new a());
        }
        a aVar = this.f107979g.get(Integer.valueOf(startID));
        if (aVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    b bVar = aVar.f107984e;
                    bVar.f108119j = endID;
                    bVar.f108121k = -1;
                    return;
                } else if (endSide == 2) {
                    b bVar2 = aVar.f107984e;
                    bVar2.f108121k = endID;
                    bVar2.f108119j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + F1(endSide) + " undefined");
                }
            case 2:
                if (endSide == 1) {
                    b bVar3 = aVar.f107984e;
                    bVar3.f108123l = endID;
                    bVar3.f108125m = -1;
                    return;
                } else if (endSide == 2) {
                    b bVar4 = aVar.f107984e;
                    bVar4.f108125m = endID;
                    bVar4.f108123l = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
            case 3:
                if (endSide == 3) {
                    b bVar5 = aVar.f107984e;
                    bVar5.f108127n = endID;
                    bVar5.f108129o = -1;
                    bVar5.f108135r = -1;
                    bVar5.f108136s = -1;
                    bVar5.f108137t = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
                b bVar6 = aVar.f107984e;
                bVar6.f108129o = endID;
                bVar6.f108127n = -1;
                bVar6.f108135r = -1;
                bVar6.f108136s = -1;
                bVar6.f108137t = -1;
                return;
            case 4:
                if (endSide == 4) {
                    b bVar7 = aVar.f107984e;
                    bVar7.f108133q = endID;
                    bVar7.f108131p = -1;
                    bVar7.f108135r = -1;
                    bVar7.f108136s = -1;
                    bVar7.f108137t = -1;
                    return;
                }
                if (endSide != 3) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
                b bVar8 = aVar.f107984e;
                bVar8.f108131p = endID;
                bVar8.f108133q = -1;
                bVar8.f108135r = -1;
                bVar8.f108136s = -1;
                bVar8.f108137t = -1;
                return;
            case 5:
                if (endSide == 5) {
                    b bVar9 = aVar.f107984e;
                    bVar9.f108135r = endID;
                    bVar9.f108133q = -1;
                    bVar9.f108131p = -1;
                    bVar9.f108127n = -1;
                    bVar9.f108129o = -1;
                    return;
                }
                if (endSide == 3) {
                    b bVar10 = aVar.f107984e;
                    bVar10.f108136s = endID;
                    bVar10.f108133q = -1;
                    bVar10.f108131p = -1;
                    bVar10.f108127n = -1;
                    bVar10.f108129o = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
                b bVar11 = aVar.f107984e;
                bVar11.f108137t = endID;
                bVar11.f108133q = -1;
                bVar11.f108131p = -1;
                bVar11.f108127n = -1;
                bVar11.f108129o = -1;
                return;
            case 6:
                if (endSide == 6) {
                    b bVar12 = aVar.f107984e;
                    bVar12.f108139v = endID;
                    bVar12.f108138u = -1;
                    return;
                } else if (endSide == 7) {
                    b bVar13 = aVar.f107984e;
                    bVar13.f108138u = endID;
                    bVar13.f108139v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
            case 7:
                if (endSide == 7) {
                    b bVar14 = aVar.f107984e;
                    bVar14.f108141x = endID;
                    bVar14.f108140w = -1;
                    return;
                } else if (endSide == 6) {
                    b bVar15 = aVar.f107984e;
                    bVar15.f108140w = endID;
                    bVar15.f108141x = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
            default:
                throw new IllegalArgumentException(F1(startSide) + " to " + F1(endSide) + " unknown");
        }
    }

    public void K0(String attributeName) {
        this.f107977e.remove(attributeName);
    }

    public void L(int startID, int startSide, int endID, int endSide, int margin) {
        if (!this.f107979g.containsKey(Integer.valueOf(startID))) {
            this.f107979g.put(Integer.valueOf(startID), new a());
        }
        a aVar = this.f107979g.get(Integer.valueOf(startID));
        if (aVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    b bVar = aVar.f107984e;
                    bVar.f108119j = endID;
                    bVar.f108121k = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException("Left to " + F1(endSide) + " undefined");
                    }
                    b bVar2 = aVar.f107984e;
                    bVar2.f108121k = endID;
                    bVar2.f108119j = -1;
                }
                aVar.f107984e.f108082H = margin;
                return;
            case 2:
                if (endSide == 1) {
                    b bVar3 = aVar.f107984e;
                    bVar3.f108123l = endID;
                    bVar3.f108125m = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                    }
                    b bVar4 = aVar.f107984e;
                    bVar4.f108125m = endID;
                    bVar4.f108123l = -1;
                }
                aVar.f107984e.f108083I = margin;
                return;
            case 3:
                if (endSide == 3) {
                    b bVar5 = aVar.f107984e;
                    bVar5.f108127n = endID;
                    bVar5.f108129o = -1;
                    bVar5.f108135r = -1;
                    bVar5.f108136s = -1;
                    bVar5.f108137t = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                    }
                    b bVar6 = aVar.f107984e;
                    bVar6.f108129o = endID;
                    bVar6.f108127n = -1;
                    bVar6.f108135r = -1;
                    bVar6.f108136s = -1;
                    bVar6.f108137t = -1;
                }
                aVar.f107984e.f108084J = margin;
                return;
            case 4:
                if (endSide == 4) {
                    b bVar7 = aVar.f107984e;
                    bVar7.f108133q = endID;
                    bVar7.f108131p = -1;
                    bVar7.f108135r = -1;
                    bVar7.f108136s = -1;
                    bVar7.f108137t = -1;
                } else {
                    if (endSide != 3) {
                        throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                    }
                    b bVar8 = aVar.f107984e;
                    bVar8.f108131p = endID;
                    bVar8.f108133q = -1;
                    bVar8.f108135r = -1;
                    bVar8.f108136s = -1;
                    bVar8.f108137t = -1;
                }
                aVar.f107984e.f108085K = margin;
                return;
            case 5:
                if (endSide == 5) {
                    b bVar9 = aVar.f107984e;
                    bVar9.f108135r = endID;
                    bVar9.f108133q = -1;
                    bVar9.f108131p = -1;
                    bVar9.f108127n = -1;
                    bVar9.f108129o = -1;
                    return;
                }
                if (endSide == 3) {
                    b bVar10 = aVar.f107984e;
                    bVar10.f108136s = endID;
                    bVar10.f108133q = -1;
                    bVar10.f108131p = -1;
                    bVar10.f108127n = -1;
                    bVar10.f108129o = -1;
                    return;
                }
                if (endSide != 4) {
                    throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                }
                b bVar11 = aVar.f107984e;
                bVar11.f108137t = endID;
                bVar11.f108133q = -1;
                bVar11.f108131p = -1;
                bVar11.f108127n = -1;
                bVar11.f108129o = -1;
                return;
            case 6:
                if (endSide == 6) {
                    b bVar12 = aVar.f107984e;
                    bVar12.f108139v = endID;
                    bVar12.f108138u = -1;
                } else {
                    if (endSide != 7) {
                        throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                    }
                    b bVar13 = aVar.f107984e;
                    bVar13.f108138u = endID;
                    bVar13.f108139v = -1;
                }
                aVar.f107984e.f108087M = margin;
                return;
            case 7:
                if (endSide == 7) {
                    b bVar14 = aVar.f107984e;
                    bVar14.f108141x = endID;
                    bVar14.f108140w = -1;
                } else {
                    if (endSide != 6) {
                        throw new IllegalArgumentException("right to " + F1(endSide) + " undefined");
                    }
                    b bVar15 = aVar.f107984e;
                    bVar15.f108140w = endID;
                    bVar15.f108141x = -1;
                }
                aVar.f107984e.f108086L = margin;
                return;
            default:
                throw new IllegalArgumentException(F1(startSide) + " to " + F1(endSide) + " unknown");
        }
    }

    public void L0(int viewId) {
        a aVar;
        if (!this.f107979g.containsKey(Integer.valueOf(viewId)) || (aVar = this.f107979g.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        b bVar = aVar.f107984e;
        int i10 = bVar.f108121k;
        int i11 = bVar.f108123l;
        if (i10 != -1 || i11 != -1) {
            if (i10 == -1 || i11 == -1) {
                int i12 = bVar.f108125m;
                if (i12 != -1) {
                    L(i10, 2, i12, 2, 0);
                } else {
                    int i13 = bVar.f108119j;
                    if (i13 != -1) {
                        L(i11, 1, i13, 1, 0);
                    }
                }
            } else {
                L(i10, 2, i11, 1, 0);
                L(i11, 1, i10, 2, 0);
            }
            F(viewId, 1);
            F(viewId, 2);
            return;
        }
        int i14 = bVar.f108138u;
        int i15 = bVar.f108140w;
        if (i14 != -1 || i15 != -1) {
            if (i14 != -1 && i15 != -1) {
                L(i14, 7, i15, 6, 0);
                L(i15, 6, i10, 7, 0);
            } else if (i15 != -1) {
                int i16 = bVar.f108125m;
                if (i16 != -1) {
                    L(i10, 7, i16, 7, 0);
                } else {
                    int i17 = bVar.f108119j;
                    if (i17 != -1) {
                        L(i15, 6, i17, 6, 0);
                    }
                }
            }
        }
        F(viewId, 6);
        F(viewId, 7);
    }

    public void M(int viewId, int id2, int radius, float angle) {
        b bVar = i0(viewId).f107984e;
        bVar.f108076B = id2;
        bVar.f108077C = radius;
        bVar.f108078D = angle;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M0(int r10) {
        /*
            r9 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f107979g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L27
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f107979g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.widget.d$a r0 = (androidx.constraintlayout.widget.d.a) r0
            if (r0 != 0) goto L1b
            return
        L1b:
            androidx.constraintlayout.widget.d$b r0 = r0.f107984e
            int r2 = r0.f108129o
            int r4 = r0.f108131p
            r1 = -1
            if (r2 != r1) goto L29
            if (r4 == r1) goto L27
            goto L29
        L27:
            r1 = r9
            goto L58
        L29:
            if (r2 == r1) goto L3e
            if (r4 == r1) goto L3e
            r5 = 3
            r6 = 0
            r3 = 4
            r1 = r9
            r1.L(r2, r3, r4, r5, r6)
            r5 = 4
            r3 = 3
            r1 = r4
            r4 = r2
            r2 = r1
            r1 = r9
            r1.L(r2, r3, r4, r5, r6)
            goto L58
        L3e:
            r3 = r4
            int r4 = r0.f108133q
            if (r4 == r1) goto L4b
            r5 = 4
            r6 = 0
            r3 = 4
            r1 = r9
            r1.L(r2, r3, r4, r5, r6)
            goto L58
        L4b:
            int r6 = r0.f108127n
            if (r6 == r1) goto L27
            r7 = 3
            r8 = 0
            r5 = 3
            r4 = r3
            r3 = r9
            r3.L(r4, r5, r6, r7, r8)
            r1 = r3
        L58:
            r0 = 3
            r9.F(r10, r0)
            r0 = 4
            r9.F(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.M0(int):void");
    }

    public void N(int viewId, int height) {
        i0(viewId).f107984e.f108102a0 = height;
    }

    public void N0(int viewId, float alpha) {
        i0(viewId).f107982c.f108175d = alpha;
    }

    public void O(int viewId, int width) {
        i0(viewId).f107984e.f108100Z = width;
    }

    public void O0(int viewId, boolean apply) {
        i0(viewId).f107985f.f108202m = apply;
    }

    public void P(int viewId, int height) {
        i0(viewId).f107984e.f108109e = height;
    }

    public void P0(int id2, int type) {
        i0(id2).f107984e.f108120j0 = type;
    }

    public void Q(int viewId, int height) {
        i0(viewId).f107984e.f108106c0 = height;
    }

    public void Q0(int viewId, String attributeName, int value) {
        i0(viewId).p(attributeName, value);
    }

    public void R(int viewId, int width) {
        i0(viewId).f107984e.f108104b0 = width;
    }

    public void S(int viewId, int height) {
        i0(viewId).f107984e.f108110e0 = height;
    }

    public void T(int viewId, int width) {
        i0(viewId).f107984e.f108108d0 = width;
    }

    public void U(int viewId, float percent) {
        i0(viewId).f107984e.f108114g0 = percent;
    }

    public void V(int viewId, float percent) {
        i0(viewId).f107984e.f108112f0 = percent;
    }

    public void V0(int viewId, String ratio) {
        i0(viewId).f107984e.f108075A = ratio;
    }

    public void W(int viewId, int width) {
        i0(viewId).f107984e.f108107d = width;
    }

    public void W0(int viewId, int position) {
        i0(viewId).f107984e.f108079E = position;
    }

    public void X(int viewId, boolean constrained) {
        i0(viewId).f107984e.f108130o0 = constrained;
    }

    public void X0(int viewId, int position) {
        i0(viewId).f107984e.f108080F = position;
    }

    public void Y(int viewId, boolean constrained) {
        i0(viewId).f107984e.f108128n0 = constrained;
    }

    public void Y0(int viewId, float elevation) {
        i0(viewId).f107985f.f108203n = elevation;
        i0(viewId).f107985f.f108202m = true;
    }

    public final int[] Z(View view, String referenceIdString) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = referenceIdString.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = g.C0275g.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public void Z0(int viewId, String attributeName, float value) {
        i0(viewId).q(attributeName, value);
    }

    public void a0(int guidelineID, int orientation) {
        b bVar = i0(guidelineID).f107984e;
        bVar.f108101a = true;
        bVar.f108081G = orientation;
    }

    public void a1(boolean forceId) {
        this.f107978f = forceId;
    }

    public void b0(int id2, int direction, int margin, int... referenced) {
        b bVar = i0(id2).f107984e;
        bVar.f108120j0 = 1;
        bVar.f108116h0 = direction;
        bVar.f108118i0 = margin;
        bVar.f108101a = false;
        bVar.f108122k0 = referenced;
    }

    public void b1(int viewId, int anchor, int value) {
        a aVarI0 = i0(viewId);
        switch (anchor) {
            case 1:
                aVarI0.f107984e.f108089O = value;
                return;
            case 2:
                aVarI0.f107984e.f108091Q = value;
                return;
            case 3:
                aVarI0.f107984e.f108090P = value;
                return;
            case 4:
                aVarI0.f107984e.f108092R = value;
                return;
            case 5:
                aVarI0.f107984e.f108095U = value;
                return;
            case 6:
                aVarI0.f107984e.f108094T = value;
                return;
            case 7:
                aVarI0.f107984e.f108093S = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void c0(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style) {
        d0(leftId, leftSide, rightId, rightSide, chainIds, weights, style, 1, 2);
    }

    public void c1(int guidelineID, int margin) {
        i0(guidelineID).f107984e.f108111f = margin;
        i0(guidelineID).f107984e.f108113g = -1;
        i0(guidelineID).f107984e.f108115h = -1.0f;
    }

    public final void d0(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style, int left, int right) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            i0(chainIds[0]).f107984e.f108097W = weights[0];
        }
        i0(chainIds[0]).f107984e.f108098X = style;
        L(chainIds[0], left, leftId, leftSide, -1);
        for (int i10 = 1; i10 < chainIds.length; i10++) {
            int i11 = i10 - 1;
            L(chainIds[i10], left, chainIds[i11], right, -1);
            L(chainIds[i11], right, chainIds[i10], left, -1);
            if (weights != null) {
                i0(chainIds[i10]).f107984e.f108097W = weights[i10];
            }
        }
        L(chainIds[chainIds.length - 1], right, rightId, rightSide, -1);
    }

    public void d1(int guidelineID, int margin) {
        i0(guidelineID).f107984e.f108113g = margin;
        i0(guidelineID).f107984e.f108111f = -1;
        i0(guidelineID).f107984e.f108115h = -1.0f;
    }

    public void e0(int startId, int startSide, int endId, int endSide, int[] chainIds, float[] weights, int style) {
        d0(startId, startSide, endId, endSide, chainIds, weights, style, 6, 7);
    }

    public void e1(int guidelineID, float ratio) {
        i0(guidelineID).f107984e.f108115h = ratio;
        i0(guidelineID).f107984e.f108113g = -1;
        i0(guidelineID).f107984e.f108111f = -1;
    }

    public void f0(int topId, int topSide, int bottomId, int bottomSide, int[] chainIds, float[] weights, int style) {
        if (chainIds.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null && weights.length != chainIds.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (weights != null) {
            i0(chainIds[0]).f107984e.f108096V = weights[0];
        }
        i0(chainIds[0]).f107984e.f108099Y = style;
        L(chainIds[0], 3, topId, topSide, 0);
        for (int i10 = 1; i10 < chainIds.length; i10++) {
            int i11 = i10 - 1;
            L(chainIds[i10], 3, chainIds[i11], 4, 0);
            L(chainIds[i11], 4, chainIds[i10], 3, 0);
            if (weights != null) {
                i0(chainIds[i10]).f107984e.f108096V = weights[i10];
            }
        }
        L(chainIds[chainIds.length - 1], 4, bottomId, bottomSide, 0);
    }

    public void f1(int viewId, float bias) {
        i0(viewId).f107984e.f108142y = bias;
    }

    public void g0(u scene, int... ids) {
        HashSet hashSet;
        Set<Integer> setKeySet = this.f107979g.keySet();
        if (ids.length != 0) {
            hashSet = new HashSet();
            for (int i10 : ids) {
                hashSet.add(Integer.valueOf(i10));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.f107979g.get(num);
            if (aVar != null) {
                sb2.append("<Constraint id=");
                sb2.append(num);
                sb2.append(" \n");
                aVar.f107984e.b(scene, sb2);
                sb2.append("/>\n");
            }
        }
        System.out.println(sb2.toString());
    }

    public void g1(int viewId, int chainStyle) {
        i0(viewId).f107984e.f108098X = chainStyle;
    }

    public final void h(ConstraintAttribute.AttributeType attributeType, String... attributeName) {
        for (int i10 = 0; i10 < attributeName.length; i10++) {
            if (this.f107977e.containsKey(attributeName[i10])) {
                ConstraintAttribute constraintAttribute = this.f107977e.get(attributeName[i10]);
                if (constraintAttribute != null && constraintAttribute.j() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + constraintAttribute.j().name());
                }
            } else {
                String str = attributeName[i10];
                this.f107977e.put(str, new ConstraintAttribute(str, attributeType));
            }
        }
    }

    public final a h0(Context context, AttributeSet attrs, boolean override) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, override ? g.m.f110074S8 : g.m.f110228d4);
        G0(context, aVar, typedArrayObtainStyledAttributes, override);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public void h1(int viewId, float weight) {
        i0(viewId).f107984e.f108097W = weight;
    }

    public void i(String... attributeName) {
        h(ConstraintAttribute.AttributeType.COLOR_TYPE, attributeName);
    }

    public final a i0(int id2) {
        if (!this.f107979g.containsKey(Integer.valueOf(id2))) {
            this.f107979g.put(Integer.valueOf(id2), new a());
        }
        return this.f107979g.get(Integer.valueOf(id2));
    }

    public void i1(int viewId, String attributeName, int value) {
        i0(viewId).r(attributeName, value);
    }

    public void j(String... attributeName) {
        h(ConstraintAttribute.AttributeType.FLOAT_TYPE, attributeName);
    }

    public boolean j0(int viewId) {
        return i0(viewId).f107985f.f108202m;
    }

    public void j1(int viewId, int behavior) {
        if (behavior < 0 || behavior > 3) {
            return;
        }
        i0(viewId).f107984e.f108134q0 = behavior;
    }

    public void k(String... attributeName) {
        h(ConstraintAttribute.AttributeType.INT_TYPE, attributeName);
    }

    public a k0(int id2) {
        if (this.f107979g.containsKey(Integer.valueOf(id2))) {
            return this.f107979g.get(Integer.valueOf(id2));
        }
        return null;
    }

    public void k1(int viewId, int anchor, int value) {
        a aVarI0 = i0(viewId);
        switch (anchor) {
            case 1:
                aVarI0.f107984e.f108082H = value;
                return;
            case 2:
                aVarI0.f107984e.f108083I = value;
                return;
            case 3:
                aVarI0.f107984e.f108084J = value;
                return;
            case 4:
                aVarI0.f107984e.f108085K = value;
                return;
            case 5:
                aVarI0.f107984e.f108088N = value;
                return;
            case 6:
                aVarI0.f107984e.f108087M = value;
                return;
            case 7:
                aVarI0.f107984e.f108086L = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void l(String... attributeName) {
        h(ConstraintAttribute.AttributeType.STRING_TYPE, attributeName);
    }

    public HashMap<String, ConstraintAttribute> l0() {
        return this.f107977e;
    }

    public void l1(int id2, int... referenced) {
        i0(id2).f107984e.f108122k0 = referenced;
    }

    public void m(int viewId, int leftId, int rightId) {
        L(viewId, 1, leftId, leftId == 0 ? 1 : 2, 0);
        L(viewId, 2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            L(leftId, 2, viewId, 1, 0);
        }
        if (rightId != 0) {
            L(rightId, 1, viewId, 2, 0);
        }
    }

    public void m1(int viewId, float rotation) {
        i0(viewId).f107985f.f108191b = rotation;
    }

    public void n(int viewId, int leftId, int rightId) {
        L(viewId, 6, leftId, leftId == 0 ? 6 : 7, 0);
        L(viewId, 7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            L(leftId, 7, viewId, 6, 0);
        }
        if (rightId != 0) {
            L(rightId, 6, viewId, 7, 0);
        }
    }

    public int n0(int viewId) {
        return i0(viewId).f107984e.f108109e;
    }

    public void n1(int viewId, float rotationX) {
        i0(viewId).f107985f.f108192c = rotationX;
    }

    public void o(int viewId, int topId, int bottomId) {
        L(viewId, 3, topId, topId == 0 ? 3 : 4, 0);
        L(viewId, 4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            L(topId, 4, viewId, 3, 0);
        }
        if (bottomId != 0) {
            L(bottomId, 3, viewId, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.f107979g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public void o1(int viewId, float rotationY) {
        i0(viewId).f107985f.f108193d = rotationY;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f107979g.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C2377c.k(childAt));
            } else {
                if (this.f107978f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f107979g.containsKey(Integer.valueOf(id2)) && (aVar = this.f107979g.get(Integer.valueOf(id2))) != null) {
                    ConstraintAttribute.r(childAt, aVar.f107986g);
                }
            }
        }
    }

    public void p1(int viewId, float scaleX) {
        i0(viewId).f107985f.f108194e = scaleX;
    }

    public void q(d cs) {
        for (a aVar : cs.f107979g.values()) {
            if (aVar.f107987h != null) {
                if (aVar.f107981b != null) {
                    Iterator<Integer> it = this.f107979g.keySet().iterator();
                    while (it.hasNext()) {
                        a aVarK0 = k0(it.next().intValue());
                        String str = aVarK0.f107984e.f108126m0;
                        if (str != null && aVar.f107981b.matches(str)) {
                            aVar.f107987h.e(aVarK0);
                            aVarK0.f107986g.putAll((HashMap) aVar.f107986g.clone());
                        }
                    }
                } else {
                    aVar.f107987h.e(k0(aVar.f107980a));
                }
            }
        }
    }

    public a q0(int mId) {
        return i0(mId);
    }

    public void q1(int viewId, float scaleY) {
        i0(viewId).f107985f.f108195f = scaleY;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int id2) {
        int[] iArr = i0(id2).f107984e.f108122k0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int viewId, String attributeName, String value) {
        i0(viewId).s(attributeName, value);
    }

    public void s(ConstraintHelper helper, ConstraintWidget child, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> mapIdToWidget) {
        a aVar;
        int id2 = helper.getId();
        if (this.f107979g.containsKey(Integer.valueOf(id2)) && (aVar = this.f107979g.get(Integer.valueOf(id2))) != null && (child instanceof C5634b)) {
            helper.B(aVar, (C5634b) child, layoutParams, mapIdToWidget);
        }
    }

    public int s0(int viewId) {
        return i0(viewId).f107982c.f108173b;
    }

    public void s1(int viewId, float transformPivotX, float transformPivotY) {
        e eVar = i0(viewId).f107985f;
        eVar.f108197h = transformPivotY;
        eVar.f108196g = transformPivotX;
    }

    public void t(ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f107979g.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f107979g.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C2377c.k(childAt));
            } else {
                if (this.f107978f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f107979g.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f107979g.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f107984e.f108120j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.V(aVar.f107984e.f108116h0);
                                barrier.U(aVar.f107984e.f108118i0);
                                barrier.S(aVar.f107984e.f108132p0);
                                b bVar = aVar.f107984e;
                                int[] iArr = bVar.f108122k0;
                                if (iArr != null) {
                                    barrier.G(iArr);
                                } else {
                                    String str = bVar.f108124l0;
                                    if (str != null) {
                                        bVar.f108122k0 = Z(barrier, str);
                                        barrier.G(aVar.f107984e.f108122k0);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.e();
                            aVar.i(layoutParams);
                            if (applyPostLayout) {
                                ConstraintAttribute.r(childAt, aVar.f107986g);
                            }
                            childAt.setLayoutParams(layoutParams);
                            C0274d c0274d = aVar.f107982c;
                            if (c0274d.f108174c == 0) {
                                childAt.setVisibility(c0274d.f108173b);
                            }
                            childAt.setAlpha(aVar.f107982c.f108175d);
                            childAt.setRotation(aVar.f107985f.f108191b);
                            childAt.setRotationX(aVar.f107985f.f108192c);
                            childAt.setRotationY(aVar.f107985f.f108193d);
                            childAt.setScaleX(aVar.f107985f.f108194e);
                            childAt.setScaleY(aVar.f107985f.f108195f);
                            e eVar = aVar.f107985f;
                            if (eVar.f108198i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f107985f.f108198i) != null) {
                                    float bottom = (r4.getBottom() + r4.getTop()) / 2.0f;
                                    float right = (r4.getRight() + r4.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f108196g)) {
                                    childAt.setPivotX(aVar.f107985f.f108196g);
                                }
                                if (!Float.isNaN(aVar.f107985f.f108197h)) {
                                    childAt.setPivotY(aVar.f107985f.f108197h);
                                }
                            }
                            childAt.setTranslationX(aVar.f107985f.f108199j);
                            childAt.setTranslationY(aVar.f107985f.f108200k);
                            childAt.setTranslationZ(aVar.f107985f.f108201l);
                            e eVar2 = aVar.f107985f;
                            if (eVar2.f108202m) {
                                childAt.setElevation(eVar2.f108203n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.f107979g.get(num);
            if (aVar2 != null) {
                if (aVar2.f107984e.f108120j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar2.f107984e;
                    int[] iArr2 = bVar2.f108122k0;
                    if (iArr2 != null) {
                        barrier2.G(iArr2);
                    } else {
                        String str2 = bVar2.f108124l0;
                        if (str2 != null) {
                            bVar2.f108122k0 = Z(barrier2, str2);
                            barrier2.G(aVar2.f107984e.f108122k0);
                        }
                    }
                    b bVar3 = aVar2.f107984e;
                    barrier2.f107577j = bVar3.f108116h0;
                    barrier2.U(bVar3.f108118i0);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.N();
                    aVar2.i(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (aVar2.f107984e.f108101a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.i(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).s(constraintLayout);
            }
        }
    }

    public int t0(int viewId) {
        return i0(viewId).f107982c.f108174c;
    }

    public void t1(int viewId, float transformPivotX) {
        i0(viewId).f107985f.f108196g = transformPivotX;
    }

    public void u(int id2, ConstraintLayout.LayoutParams layoutParams) {
        a aVar;
        if (!this.f107979g.containsKey(Integer.valueOf(id2)) || (aVar = this.f107979g.get(Integer.valueOf(id2))) == null) {
            return;
        }
        aVar.i(layoutParams);
    }

    public int u0(int viewId) {
        return i0(viewId).f107984e.f108107d;
    }

    public void u1(int viewId, float transformPivotY) {
        i0(viewId).f107985f.f108197h = transformPivotY;
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public boolean v0() {
        return this.f107978f;
    }

    public void v1(int viewId, float translationX, float translationY) {
        e eVar = i0(viewId).f107985f;
        eVar.f108199j = translationX;
        eVar.f108200k = translationY;
    }

    public void w0(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarH0 = h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarH0.f107984e.f108101a = true;
                    }
                    this.f107979g.put(Integer.valueOf(aVarH0.f107980a), aVarH0);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public void w1(int viewId, float translationX) {
        i0(viewId).f107985f.f108199j = translationX;
    }

    public void x(int centerID, int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            L(centerID, 1, firstID, firstSide, firstMargin);
            L(centerID, 2, secondId, secondSide, secondMargin);
            a aVar = this.f107979g.get(Integer.valueOf(centerID));
            if (aVar != null) {
                aVar.f107984e.f108142y = bias;
                return;
            }
            return;
        }
        if (firstSide == 6 || firstSide == 7) {
            L(centerID, 6, firstID, firstSide, firstMargin);
            L(centerID, 7, secondId, secondSide, secondMargin);
            a aVar2 = this.f107979g.get(Integer.valueOf(centerID));
            if (aVar2 != null) {
                aVar2.f107984e.f108142y = bias;
                return;
            }
            return;
        }
        L(centerID, 3, firstID, firstSide, firstMargin);
        L(centerID, 4, secondId, secondSide, secondMargin);
        a aVar3 = this.f107979g.get(Integer.valueOf(centerID));
        if (aVar3 != null) {
            aVar3.f107984e.f108143z = bias;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ce, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x0(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.x0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void x1(int viewId, float translationY) {
        i0(viewId).f107985f.f108200k = translationY;
    }

    public void y(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(viewId, toView, 2, 0, toView, 1, 0, 0.5f);
        }
    }

    public void y1(int viewId, float translationZ) {
        i0(viewId).f107985f.f108201l = translationZ;
    }

    public void z(int centerID, int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        L(centerID, 1, leftId, leftSide, leftMargin);
        L(centerID, 2, rightId, rightSide, rightMargin);
        a aVar = this.f107979g.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.f107984e.f108142y = bias;
        }
    }

    public void z0(a set, String attributes) {
        String[] strArrSplit = attributes.split(",");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String[] strArrSplit2 = strArrSplit[i10].split("=");
            if (strArrSplit2.length != 2) {
                androidx.constraintlayout.widget.c.a(new StringBuilder(" Unable to parse "), strArrSplit[i10], "ConstraintSet");
            } else {
                set.p(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void z1(boolean validate) {
        this.f107973a = validate;
    }
}
