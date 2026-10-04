package androidx.compose.ui.graphics.vector;

import androidx.compose.animation.B;
import androidx.compose.animation.C1571b;
import androidx.compose.animation.C1635o;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f101605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101606b;

    @InterfaceC1924k0
    public static final class a extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f101610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f101611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f101612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f101613i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f101607c = f10;
            this.f101608d = f11;
            this.f101609e = f12;
            this.f101610f = z10;
            this.f101611g = z11;
            this.f101612h = f13;
            this.f101613i = f14;
        }

        public static a k(a aVar, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = aVar.f101607c;
            }
            if ((i10 & 2) != 0) {
                f11 = aVar.f101608d;
            }
            if ((i10 & 4) != 0) {
                f12 = aVar.f101609e;
            }
            if ((i10 & 8) != 0) {
                z10 = aVar.f101610f;
            }
            if ((i10 & 16) != 0) {
                z11 = aVar.f101611g;
            }
            if ((i10 & 32) != 0) {
                f13 = aVar.f101612h;
            }
            if ((i10 & 64) != 0) {
                f14 = aVar.f101613i;
            }
            float f15 = f14;
            aVar.getClass();
            float f16 = f13;
            boolean z12 = z11;
            float f17 = f12;
            return new a(f10, f11, f17, z10, z12, f16, f15);
        }

        public final float c() {
            return this.f101607c;
        }

        public final float d() {
            return this.f101608d;
        }

        public final float e() {
            return this.f101609e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f101607c, aVar.f101607c) == 0 && Float.compare(this.f101608d, aVar.f101608d) == 0 && Float.compare(this.f101609e, aVar.f101609e) == 0 && this.f101610f == aVar.f101610f && this.f101611g == aVar.f101611g && Float.compare(this.f101612h, aVar.f101612h) == 0 && Float.compare(this.f101613i, aVar.f101613i) == 0;
        }

        public final boolean f() {
            return this.f101610f;
        }

        public final boolean g() {
            return this.f101611g;
        }

        public final float h() {
            return this.f101612h;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101613i) + B.a(this.f101612h, (C1635o.a(this.f101611g) + ((C1635o.a(this.f101610f) + B.a(this.f101609e, B.a(this.f101608d, Float.floatToIntBits(this.f101607c) * 31, 31), 31)) * 31)) * 31, 31);
        }

        public final float i() {
            return this.f101613i;
        }

        @NotNull
        public final a j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            return new a(f10, f11, f12, z10, z11, f13, f14);
        }

        public final float l() {
            return this.f101612h;
        }

        public final float m() {
            return this.f101613i;
        }

        public final float n() {
            return this.f101607c;
        }

        public final float o() {
            return this.f101609e;
        }

        public final float p() {
            return this.f101608d;
        }

        public final boolean q() {
            return this.f101610f;
        }

        public final boolean r() {
            return this.f101611g;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb2.append(this.f101607c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f101608d);
            sb2.append(", theta=");
            sb2.append(this.f101609e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f101610f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f101611g);
            sb2.append(", arcStartX=");
            sb2.append(this.f101612h);
            sb2.append(", arcStartY=");
            return C1571b.a(sb2, this.f101613i, ')');
        }
    }

    @InterfaceC1924k0
    public static final class b extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f101614c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    @InterfaceC1924k0
    public static final class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f101618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f101619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f101620h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f101615c = f10;
            this.f101616d = f11;
            this.f101617e = f12;
            this.f101618f = f13;
            this.f101619g = f14;
            this.f101620h = f15;
        }

        public static c j(c cVar, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = cVar.f101615c;
            }
            if ((i10 & 2) != 0) {
                f11 = cVar.f101616d;
            }
            if ((i10 & 4) != 0) {
                f12 = cVar.f101617e;
            }
            if ((i10 & 8) != 0) {
                f13 = cVar.f101618f;
            }
            if ((i10 & 16) != 0) {
                f14 = cVar.f101619g;
            }
            if ((i10 & 32) != 0) {
                f15 = cVar.f101620h;
            }
            float f16 = f15;
            cVar.getClass();
            float f17 = f14;
            float f18 = f12;
            return new c(f10, f11, f18, f13, f17, f16);
        }

        public final float c() {
            return this.f101615c;
        }

        public final float d() {
            return this.f101616d;
        }

        public final float e() {
            return this.f101617e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f101615c, cVar.f101615c) == 0 && Float.compare(this.f101616d, cVar.f101616d) == 0 && Float.compare(this.f101617e, cVar.f101617e) == 0 && Float.compare(this.f101618f, cVar.f101618f) == 0 && Float.compare(this.f101619g, cVar.f101619g) == 0 && Float.compare(this.f101620h, cVar.f101620h) == 0;
        }

        public final float f() {
            return this.f101618f;
        }

        public final float g() {
            return this.f101619g;
        }

        public final float h() {
            return this.f101620h;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101620h) + B.a(this.f101619g, B.a(this.f101618f, B.a(this.f101617e, B.a(this.f101616d, Float.floatToIntBits(this.f101615c) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public final c i(float f10, float f11, float f12, float f13, float f14, float f15) {
            return new c(f10, f11, f12, f13, f14, f15);
        }

        public final float k() {
            return this.f101615c;
        }

        public final float l() {
            return this.f101617e;
        }

        public final float m() {
            return this.f101619g;
        }

        public final float n() {
            return this.f101616d;
        }

        public final float o() {
            return this.f101618f;
        }

        public final float p() {
            return this.f101620h;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
            sb2.append(this.f101615c);
            sb2.append(", y1=");
            sb2.append(this.f101616d);
            sb2.append(", x2=");
            sb2.append(this.f101617e);
            sb2.append(", y2=");
            sb2.append(this.f101618f);
            sb2.append(", x3=");
            sb2.append(this.f101619g);
            sb2.append(", y3=");
            return C1571b.a(sb2, this.f101620h, ')');
        }
    }

    @InterfaceC1924k0
    public static final class d extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101621c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f101621c = f10;
        }

        public static d e(d dVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = dVar.f101621c;
            }
            dVar.getClass();
            return new d(f10);
        }

        public final float c() {
            return this.f101621c;
        }

        @NotNull
        public final d d(float f10) {
            return new d(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f101621c, ((d) obj).f101621c) == 0;
        }

        public final float f() {
            return this.f101621c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101621c);
        }

        @NotNull
        public String toString() {
            return C1571b.a(new StringBuilder("HorizontalTo(x="), this.f101621c, ')');
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.e$e, reason: collision with other inner class name */
    @InterfaceC1924k0
    public static final class C0252e extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101623d;

        /* JADX WARN: Illegal instructions before constructor call */
        public C0252e(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f101622c = f10;
            this.f101623d = f11;
        }

        public static C0252e f(C0252e c0252e, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = c0252e.f101622c;
            }
            if ((i10 & 2) != 0) {
                f11 = c0252e.f101623d;
            }
            c0252e.getClass();
            return new C0252e(f10, f11);
        }

        public final float c() {
            return this.f101622c;
        }

        public final float d() {
            return this.f101623d;
        }

        @NotNull
        public final C0252e e(float f10, float f11) {
            return new C0252e(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0252e)) {
                return false;
            }
            C0252e c0252e = (C0252e) obj;
            return Float.compare(this.f101622c, c0252e.f101622c) == 0 && Float.compare(this.f101623d, c0252e.f101623d) == 0;
        }

        public final float g() {
            return this.f101622c;
        }

        public final float h() {
            return this.f101623d;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101623d) + (Float.floatToIntBits(this.f101622c) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("LineTo(x=");
            sb2.append(this.f101622c);
            sb2.append(", y=");
            return C1571b.a(sb2, this.f101623d, ')');
        }
    }

    @InterfaceC1924k0
    public static final class f extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101625d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f101624c = f10;
            this.f101625d = f11;
        }

        public static f f(f fVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = fVar.f101624c;
            }
            if ((i10 & 2) != 0) {
                f11 = fVar.f101625d;
            }
            fVar.getClass();
            return new f(f10, f11);
        }

        public final float c() {
            return this.f101624c;
        }

        public final float d() {
            return this.f101625d;
        }

        @NotNull
        public final f e(float f10, float f11) {
            return new f(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f101624c, fVar.f101624c) == 0 && Float.compare(this.f101625d, fVar.f101625d) == 0;
        }

        public final float g() {
            return this.f101624c;
        }

        public final float h() {
            return this.f101625d;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101625d) + (Float.floatToIntBits(this.f101624c) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MoveTo(x=");
            sb2.append(this.f101624c);
            sb2.append(", y=");
            return C1571b.a(sb2, this.f101625d, ')');
        }
    }

    @InterfaceC1924k0
    public static final class g extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f101629f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f101626c = f10;
            this.f101627d = f11;
            this.f101628e = f12;
            this.f101629f = f13;
        }

        public static g h(g gVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = gVar.f101626c;
            }
            if ((i10 & 2) != 0) {
                f11 = gVar.f101627d;
            }
            if ((i10 & 4) != 0) {
                f12 = gVar.f101628e;
            }
            if ((i10 & 8) != 0) {
                f13 = gVar.f101629f;
            }
            gVar.getClass();
            return new g(f10, f11, f12, f13);
        }

        public final float c() {
            return this.f101626c;
        }

        public final float d() {
            return this.f101627d;
        }

        public final float e() {
            return this.f101628e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f101626c, gVar.f101626c) == 0 && Float.compare(this.f101627d, gVar.f101627d) == 0 && Float.compare(this.f101628e, gVar.f101628e) == 0 && Float.compare(this.f101629f, gVar.f101629f) == 0;
        }

        public final float f() {
            return this.f101629f;
        }

        @NotNull
        public final g g(float f10, float f11, float f12, float f13) {
            return new g(f10, f11, f12, f13);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101629f) + B.a(this.f101628e, B.a(this.f101627d, Float.floatToIntBits(this.f101626c) * 31, 31), 31);
        }

        public final float i() {
            return this.f101626c;
        }

        public final float j() {
            return this.f101628e;
        }

        public final float k() {
            return this.f101627d;
        }

        public final float l() {
            return this.f101629f;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
            sb2.append(this.f101626c);
            sb2.append(", y1=");
            sb2.append(this.f101627d);
            sb2.append(", x2=");
            sb2.append(this.f101628e);
            sb2.append(", y2=");
            return C1571b.a(sb2, this.f101629f, ')');
        }
    }

    @InterfaceC1924k0
    public static final class h extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101632e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f101633f;

        public h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f101630c = f10;
            this.f101631d = f11;
            this.f101632e = f12;
            this.f101633f = f13;
        }

        public static h h(h hVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = hVar.f101630c;
            }
            if ((i10 & 2) != 0) {
                f11 = hVar.f101631d;
            }
            if ((i10 & 4) != 0) {
                f12 = hVar.f101632e;
            }
            if ((i10 & 8) != 0) {
                f13 = hVar.f101633f;
            }
            hVar.getClass();
            return new h(f10, f11, f12, f13);
        }

        public final float c() {
            return this.f101630c;
        }

        public final float d() {
            return this.f101631d;
        }

        public final float e() {
            return this.f101632e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.f101630c, hVar.f101630c) == 0 && Float.compare(this.f101631d, hVar.f101631d) == 0 && Float.compare(this.f101632e, hVar.f101632e) == 0 && Float.compare(this.f101633f, hVar.f101633f) == 0;
        }

        public final float f() {
            return this.f101633f;
        }

        @NotNull
        public final h g(float f10, float f11, float f12, float f13) {
            return new h(f10, f11, f12, f13);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101633f) + B.a(this.f101632e, B.a(this.f101631d, Float.floatToIntBits(this.f101630c) * 31, 31), 31);
        }

        public final float i() {
            return this.f101630c;
        }

        public final float j() {
            return this.f101632e;
        }

        public final float k() {
            return this.f101631d;
        }

        public final float l() {
            return this.f101633f;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
            sb2.append(this.f101630c);
            sb2.append(", y1=");
            sb2.append(this.f101631d);
            sb2.append(", x2=");
            sb2.append(this.f101632e);
            sb2.append(", y2=");
            return C1571b.a(sb2, this.f101633f, ')');
        }
    }

    @InterfaceC1924k0
    public static final class i extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101635d;

        public i(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f101634c = f10;
            this.f101635d = f11;
        }

        public static i f(i iVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = iVar.f101634c;
            }
            if ((i10 & 2) != 0) {
                f11 = iVar.f101635d;
            }
            iVar.getClass();
            return new i(f10, f11);
        }

        public final float c() {
            return this.f101634c;
        }

        public final float d() {
            return this.f101635d;
        }

        @NotNull
        public final i e(float f10, float f11) {
            return new i(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f101634c, iVar.f101634c) == 0 && Float.compare(this.f101635d, iVar.f101635d) == 0;
        }

        public final float g() {
            return this.f101634c;
        }

        public final float h() {
            return this.f101635d;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101635d) + (Float.floatToIntBits(this.f101634c) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
            sb2.append(this.f101634c);
            sb2.append(", y=");
            return C1571b.a(sb2, this.f101635d, ')');
        }
    }

    @InterfaceC1924k0
    public static final class j extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f101639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f101640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f101641h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f101642i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f101636c = f10;
            this.f101637d = f11;
            this.f101638e = f12;
            this.f101639f = z10;
            this.f101640g = z11;
            this.f101641h = f13;
            this.f101642i = f14;
        }

        public static j k(j jVar, float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = jVar.f101636c;
            }
            if ((i10 & 2) != 0) {
                f11 = jVar.f101637d;
            }
            if ((i10 & 4) != 0) {
                f12 = jVar.f101638e;
            }
            if ((i10 & 8) != 0) {
                z10 = jVar.f101639f;
            }
            if ((i10 & 16) != 0) {
                z11 = jVar.f101640g;
            }
            if ((i10 & 32) != 0) {
                f13 = jVar.f101641h;
            }
            if ((i10 & 64) != 0) {
                f14 = jVar.f101642i;
            }
            float f15 = f14;
            jVar.getClass();
            float f16 = f13;
            boolean z12 = z11;
            float f17 = f12;
            return new j(f10, f11, f17, z10, z12, f16, f15);
        }

        public final float c() {
            return this.f101636c;
        }

        public final float d() {
            return this.f101637d;
        }

        public final float e() {
            return this.f101638e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f101636c, jVar.f101636c) == 0 && Float.compare(this.f101637d, jVar.f101637d) == 0 && Float.compare(this.f101638e, jVar.f101638e) == 0 && this.f101639f == jVar.f101639f && this.f101640g == jVar.f101640g && Float.compare(this.f101641h, jVar.f101641h) == 0 && Float.compare(this.f101642i, jVar.f101642i) == 0;
        }

        public final boolean f() {
            return this.f101639f;
        }

        public final boolean g() {
            return this.f101640g;
        }

        public final float h() {
            return this.f101641h;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101642i) + B.a(this.f101641h, (C1635o.a(this.f101640g) + ((C1635o.a(this.f101639f) + B.a(this.f101638e, B.a(this.f101637d, Float.floatToIntBits(this.f101636c) * 31, 31), 31)) * 31)) * 31, 31);
        }

        public final float i() {
            return this.f101642i;
        }

        @NotNull
        public final j j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            return new j(f10, f11, f12, z10, z11, f13, f14);
        }

        public final float l() {
            return this.f101641h;
        }

        public final float m() {
            return this.f101642i;
        }

        public final float n() {
            return this.f101636c;
        }

        public final float o() {
            return this.f101638e;
        }

        public final float p() {
            return this.f101637d;
        }

        public final boolean q() {
            return this.f101639f;
        }

        public final boolean r() {
            return this.f101640g;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb2.append(this.f101636c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f101637d);
            sb2.append(", theta=");
            sb2.append(this.f101638e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f101639f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f101640g);
            sb2.append(", arcStartDx=");
            sb2.append(this.f101641h);
            sb2.append(", arcStartDy=");
            return C1571b.a(sb2, this.f101642i, ')');
        }
    }

    @InterfaceC1924k0
    public static final class k extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f101646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f101647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f101648h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f101643c = f10;
            this.f101644d = f11;
            this.f101645e = f12;
            this.f101646f = f13;
            this.f101647g = f14;
            this.f101648h = f15;
        }

        public static k j(k kVar, float f10, float f11, float f12, float f13, float f14, float f15, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = kVar.f101643c;
            }
            if ((i10 & 2) != 0) {
                f11 = kVar.f101644d;
            }
            if ((i10 & 4) != 0) {
                f12 = kVar.f101645e;
            }
            if ((i10 & 8) != 0) {
                f13 = kVar.f101646f;
            }
            if ((i10 & 16) != 0) {
                f14 = kVar.f101647g;
            }
            if ((i10 & 32) != 0) {
                f15 = kVar.f101648h;
            }
            float f16 = f15;
            kVar.getClass();
            float f17 = f14;
            float f18 = f12;
            return new k(f10, f11, f18, f13, f17, f16);
        }

        public final float c() {
            return this.f101643c;
        }

        public final float d() {
            return this.f101644d;
        }

        public final float e() {
            return this.f101645e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f101643c, kVar.f101643c) == 0 && Float.compare(this.f101644d, kVar.f101644d) == 0 && Float.compare(this.f101645e, kVar.f101645e) == 0 && Float.compare(this.f101646f, kVar.f101646f) == 0 && Float.compare(this.f101647g, kVar.f101647g) == 0 && Float.compare(this.f101648h, kVar.f101648h) == 0;
        }

        public final float f() {
            return this.f101646f;
        }

        public final float g() {
            return this.f101647g;
        }

        public final float h() {
            return this.f101648h;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101648h) + B.a(this.f101647g, B.a(this.f101646f, B.a(this.f101645e, B.a(this.f101644d, Float.floatToIntBits(this.f101643c) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public final k i(float f10, float f11, float f12, float f13, float f14, float f15) {
            return new k(f10, f11, f12, f13, f14, f15);
        }

        public final float k() {
            return this.f101643c;
        }

        public final float l() {
            return this.f101645e;
        }

        public final float m() {
            return this.f101647g;
        }

        public final float n() {
            return this.f101644d;
        }

        public final float o() {
            return this.f101646f;
        }

        public final float p() {
            return this.f101648h;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
            sb2.append(this.f101643c);
            sb2.append(", dy1=");
            sb2.append(this.f101644d);
            sb2.append(", dx2=");
            sb2.append(this.f101645e);
            sb2.append(", dy2=");
            sb2.append(this.f101646f);
            sb2.append(", dx3=");
            sb2.append(this.f101647g);
            sb2.append(", dy3=");
            return C1571b.a(sb2, this.f101648h, ')');
        }
    }

    @InterfaceC1924k0
    public static final class l extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101649c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f101649c = f10;
        }

        public static l e(l lVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = lVar.f101649c;
            }
            lVar.getClass();
            return new l(f10);
        }

        public final float c() {
            return this.f101649c;
        }

        @NotNull
        public final l d(float f10) {
            return new l(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f101649c, ((l) obj).f101649c) == 0;
        }

        public final float f() {
            return this.f101649c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101649c);
        }

        @NotNull
        public String toString() {
            return C1571b.a(new StringBuilder("RelativeHorizontalTo(dx="), this.f101649c, ')');
        }
    }

    @InterfaceC1924k0
    public static final class m extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101651d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f101650c = f10;
            this.f101651d = f11;
        }

        public static m f(m mVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = mVar.f101650c;
            }
            if ((i10 & 2) != 0) {
                f11 = mVar.f101651d;
            }
            mVar.getClass();
            return new m(f10, f11);
        }

        public final float c() {
            return this.f101650c;
        }

        public final float d() {
            return this.f101651d;
        }

        @NotNull
        public final m e(float f10, float f11) {
            return new m(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f101650c, mVar.f101650c) == 0 && Float.compare(this.f101651d, mVar.f101651d) == 0;
        }

        public final float g() {
            return this.f101650c;
        }

        public final float h() {
            return this.f101651d;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101651d) + (Float.floatToIntBits(this.f101650c) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
            sb2.append(this.f101650c);
            sb2.append(", dy=");
            return C1571b.a(sb2, this.f101651d, ')');
        }
    }

    @InterfaceC1924k0
    public static final class n extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101653d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f101652c = f10;
            this.f101653d = f11;
        }

        public static n f(n nVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = nVar.f101652c;
            }
            if ((i10 & 2) != 0) {
                f11 = nVar.f101653d;
            }
            nVar.getClass();
            return new n(f10, f11);
        }

        public final float c() {
            return this.f101652c;
        }

        public final float d() {
            return this.f101653d;
        }

        @NotNull
        public final n e(float f10, float f11) {
            return new n(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f101652c, nVar.f101652c) == 0 && Float.compare(this.f101653d, nVar.f101653d) == 0;
        }

        public final float g() {
            return this.f101652c;
        }

        public final float h() {
            return this.f101653d;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101653d) + (Float.floatToIntBits(this.f101652c) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
            sb2.append(this.f101652c);
            sb2.append(", dy=");
            return C1571b.a(sb2, this.f101653d, ')');
        }
    }

    @InterfaceC1924k0
    public static final class o extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f101657f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f101654c = f10;
            this.f101655d = f11;
            this.f101656e = f12;
            this.f101657f = f13;
        }

        public static o h(o oVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = oVar.f101654c;
            }
            if ((i10 & 2) != 0) {
                f11 = oVar.f101655d;
            }
            if ((i10 & 4) != 0) {
                f12 = oVar.f101656e;
            }
            if ((i10 & 8) != 0) {
                f13 = oVar.f101657f;
            }
            oVar.getClass();
            return new o(f10, f11, f12, f13);
        }

        public final float c() {
            return this.f101654c;
        }

        public final float d() {
            return this.f101655d;
        }

        public final float e() {
            return this.f101656e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f101654c, oVar.f101654c) == 0 && Float.compare(this.f101655d, oVar.f101655d) == 0 && Float.compare(this.f101656e, oVar.f101656e) == 0 && Float.compare(this.f101657f, oVar.f101657f) == 0;
        }

        public final float f() {
            return this.f101657f;
        }

        @NotNull
        public final o g(float f10, float f11, float f12, float f13) {
            return new o(f10, f11, f12, f13);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101657f) + B.a(this.f101656e, B.a(this.f101655d, Float.floatToIntBits(this.f101654c) * 31, 31), 31);
        }

        public final float i() {
            return this.f101654c;
        }

        public final float j() {
            return this.f101656e;
        }

        public final float k() {
            return this.f101655d;
        }

        public final float l() {
            return this.f101657f;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
            sb2.append(this.f101654c);
            sb2.append(", dy1=");
            sb2.append(this.f101655d);
            sb2.append(", dx2=");
            sb2.append(this.f101656e);
            sb2.append(", dy2=");
            return C1571b.a(sb2, this.f101657f, ')');
        }
    }

    @InterfaceC1924k0
    public static final class p extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f101660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f101661f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f101658c = f10;
            this.f101659d = f11;
            this.f101660e = f12;
            this.f101661f = f13;
        }

        public static p h(p pVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = pVar.f101658c;
            }
            if ((i10 & 2) != 0) {
                f11 = pVar.f101659d;
            }
            if ((i10 & 4) != 0) {
                f12 = pVar.f101660e;
            }
            if ((i10 & 8) != 0) {
                f13 = pVar.f101661f;
            }
            pVar.getClass();
            return new p(f10, f11, f12, f13);
        }

        public final float c() {
            return this.f101658c;
        }

        public final float d() {
            return this.f101659d;
        }

        public final float e() {
            return this.f101660e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f101658c, pVar.f101658c) == 0 && Float.compare(this.f101659d, pVar.f101659d) == 0 && Float.compare(this.f101660e, pVar.f101660e) == 0 && Float.compare(this.f101661f, pVar.f101661f) == 0;
        }

        public final float f() {
            return this.f101661f;
        }

        @NotNull
        public final p g(float f10, float f11, float f12, float f13) {
            return new p(f10, f11, f12, f13);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101661f) + B.a(this.f101660e, B.a(this.f101659d, Float.floatToIntBits(this.f101658c) * 31, 31), 31);
        }

        public final float i() {
            return this.f101658c;
        }

        public final float j() {
            return this.f101660e;
        }

        public final float k() {
            return this.f101659d;
        }

        public final float l() {
            return this.f101661f;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb2.append(this.f101658c);
            sb2.append(", dy1=");
            sb2.append(this.f101659d);
            sb2.append(", dx2=");
            sb2.append(this.f101660e);
            sb2.append(", dy2=");
            return C1571b.a(sb2, this.f101661f, ')');
        }
    }

    @InterfaceC1924k0
    public static final class q extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f101663d;

        public q(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f101662c = f10;
            this.f101663d = f11;
        }

        public static q f(q qVar, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = qVar.f101662c;
            }
            if ((i10 & 2) != 0) {
                f11 = qVar.f101663d;
            }
            qVar.getClass();
            return new q(f10, f11);
        }

        public final float c() {
            return this.f101662c;
        }

        public final float d() {
            return this.f101663d;
        }

        @NotNull
        public final q e(float f10, float f11) {
            return new q(f10, f11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f101662c, qVar.f101662c) == 0 && Float.compare(this.f101663d, qVar.f101663d) == 0;
        }

        public final float g() {
            return this.f101662c;
        }

        public final float h() {
            return this.f101663d;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101663d) + (Float.floatToIntBits(this.f101662c) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb2.append(this.f101662c);
            sb2.append(", dy=");
            return C1571b.a(sb2, this.f101663d, ')');
        }
    }

    @InterfaceC1924k0
    public static final class r extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101664c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f101664c = f10;
        }

        public static r e(r rVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = rVar.f101664c;
            }
            rVar.getClass();
            return new r(f10);
        }

        public final float c() {
            return this.f101664c;
        }

        @NotNull
        public final r d(float f10) {
            return new r(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f101664c, ((r) obj).f101664c) == 0;
        }

        public final float f() {
            return this.f101664c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101664c);
        }

        @NotNull
        public String toString() {
            return C1571b.a(new StringBuilder("RelativeVerticalTo(dy="), this.f101664c, ')');
        }
    }

    @InterfaceC1924k0
    public static final class s extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f101665c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f101665c = f10;
        }

        public static s e(s sVar, float f10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = sVar.f101665c;
            }
            sVar.getClass();
            return new s(f10);
        }

        public final float c() {
            return this.f101665c;
        }

        @NotNull
        public final s d(float f10) {
            return new s(f10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f101665c, ((s) obj).f101665c) == 0;
        }

        public final float f() {
            return this.f101665c;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f101665c);
        }

        @NotNull
        public String toString() {
            return C1571b.a(new StringBuilder("VerticalTo(y="), this.f101665c, ')');
        }
    }

    public /* synthetic */ e(boolean z10, boolean z11, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    public final boolean a() {
        return this.f101605a;
    }

    public final boolean b() {
        return this.f101606b;
    }

    public /* synthetic */ e(boolean z10, boolean z11, C4969v c4969v) {
        this(z10, z11);
    }

    public e(boolean z10, boolean z11) {
        this.f101605a = z10;
        this.f101606b = z11;
    }
}
