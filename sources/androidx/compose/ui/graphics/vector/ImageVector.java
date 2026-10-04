package androidx.compose.ui.graphics.vector;

import androidx.compose.animation.B;
import androidx.compose.animation.C1635o;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.ui.graphics.AbstractC2131z0;
import androidx.compose.ui.graphics.C2099r0;
import androidx.compose.ui.graphics.K0;
import java.util.ArrayList;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class ImageVector {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f101455k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f101456l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f101457m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f101459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f101460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f101461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f101462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f101463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f101464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f101465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f101466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f101467j;

    @V({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,784:1\n42#2,7:785\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Builder\n*L\n370#1:785,7\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class Builder {
        public static final int $stable = 8;
        private final boolean autoMirror;
        private final float defaultHeight;
        private final float defaultWidth;
        private boolean isConsumed;

        @NotNull
        private final String name;

        @NotNull
        private final ArrayList<a> nodes;

        @NotNull
        private a root;
        private final int tintBlendMode;
        private final long tintColor;
        private final float viewportHeight;
        private final float viewportWidth;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public String f101468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public float f101469b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public float f101470c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f101471d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f101472e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public float f101473f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public float f101474g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public float f101475h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            @NotNull
            public List<? extends e> f101476i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            @NotNull
            public List<p> f101477j;

            public a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            @NotNull
            public final List<p> a() {
                return this.f101477j;
            }

            @NotNull
            public final List<e> b() {
                return this.f101476i;
            }

            @NotNull
            public final String c() {
                return this.f101468a;
            }

            public final float d() {
                return this.f101470c;
            }

            public final float e() {
                return this.f101471d;
            }

            public final float f() {
                return this.f101469b;
            }

            public final float g() {
                return this.f101472e;
            }

            public final float h() {
                return this.f101473f;
            }

            public final float i() {
                return this.f101474g;
            }

            public final float j() {
                return this.f101475h;
            }

            public final void k(@NotNull List<p> list) {
                this.f101477j = list;
            }

            public final void l(@NotNull List<? extends e> list) {
                this.f101476i = list;
            }

            public final void m(@NotNull String str) {
                this.f101468a = str;
            }

            public final void n(float f10) {
                this.f101470c = f10;
            }

            public final void o(float f10) {
                this.f101471d = f10;
            }

            public final void p(float f10) {
                this.f101469b = f10;
            }

            public final void q(float f10) {
                this.f101472e = f10;
            }

            public final void r(float f10) {
                this.f101473f = f10;
            }

            public final void s(float f10) {
                this.f101474g = f10;
            }

            public final void t(float f10) {
                this.f101475h = f10;
            }

            public a(@NotNull String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends e> list, @NotNull List<p> list2) {
                this.f101468a = str;
                this.f101469b = f10;
                this.f101470c = f11;
                this.f101471d = f12;
                this.f101472e = f13;
                this.f101473f = f14;
                this.f101474g = f15;
                this.f101475h = f16;
                this.f101476i = list;
                this.f101477j = list2;
            }

            public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, C4969v c4969v) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? o.h() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @InterfaceC4852c0(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public /* synthetic */ Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, C4969v c4969v) {
            this(str, f10, f11, f12, f13, j10, i10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder addGroup$default(Builder builder, String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "";
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i10 & 4) != 0) {
                f11 = 0.0f;
            }
            if ((i10 & 8) != 0) {
                f12 = 0.0f;
            }
            if ((i10 & 16) != 0) {
                f13 = 1.0f;
            }
            if ((i10 & 32) != 0) {
                f14 = 1.0f;
            }
            if ((i10 & 64) != 0) {
                f15 = 0.0f;
            }
            if ((i10 & 128) != 0) {
                f16 = 0.0f;
            }
            if ((i10 & 256) != 0) {
                list = o.h();
            }
            float f17 = f16;
            List list2 = list;
            float f18 = f15;
            float f19 = f13;
            return builder.addGroup(str, f10, f11, f12, f19, f14, f18, f17, list2);
        }

        private final n asVectorGroup(a aVar) {
            return new n(aVar.f101468a, aVar.f101469b, aVar.f101470c, aVar.f101471d, aVar.f101472e, aVar.f101473f, aVar.f101474g, aVar.f101475h, aVar.f101476i, aVar.f101477j);
        }

        private final void ensureNotConsumed() {
            if (this.isConsumed) {
                W.a.g("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
        }

        private final a getCurrentGroup() {
            return (a) c.h(this.nodes);
        }

        @NotNull
        public final Builder addGroup(@NotNull String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, @NotNull List<? extends e> list) {
            ensureNotConsumed();
            this.nodes.add(new a(str, f10, f11, f12, f13, f14, f15, f16, list, null, 512, null));
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: addPath-oIyEayM, reason: not valid java name */
        public final Builder m6addPathoIyEayM(@NotNull List<? extends e> list, int i10, @NotNull String str, @Nullable AbstractC2131z0 abstractC2131z0, float f10, @Nullable AbstractC2131z0 abstractC2131z02, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            ensureNotConsumed();
            getCurrentGroup().f101477j.add(new q(str, list, i10, abstractC2131z0, f10, abstractC2131z02, f11, f12, i11, i12, f13, f14, f15, f16));
            return this;
        }

        @NotNull
        public final ImageVector build() {
            ensureNotConsumed();
            while (this.nodes.size() > 1) {
                clearGroup();
            }
            ImageVector imageVector = new ImageVector(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, asVectorGroup(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return imageVector;
        }

        @NotNull
        public final Builder clearGroup() {
            ensureNotConsumed();
            getCurrentGroup().f101477j.add(asVectorGroup((a) c.i(this.nodes)));
            return this;
        }

        public /* synthetic */ Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, C4969v c4969v) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        private Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.name = str;
            this.defaultWidth = f10;
            this.defaultHeight = f11;
            this.viewportWidth = f12;
            this.viewportHeight = f13;
            this.tintColor = j10;
            this.tintBlendMode = i10;
            this.autoMirror = z10;
            ArrayList<a> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            a aVar = new a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.root = aVar;
            arrayList.add(aVar);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, C4969v c4969v) {
            long j11;
            int i12;
            String str2 = (i11 & 1) != 0 ? "" : str;
            if ((i11 & 32) != 0) {
                K0.f100733b.getClass();
                j11 = K0.f100746o;
            } else {
                j11 = j10;
            }
            if ((i11 & 64) != 0) {
                C2099r0.f101402b.getClass();
                i12 = C2099r0.f101408h;
            } else {
                i12 = i10;
            }
            this(str2, f10, f11, f12, f13, j11, i12, (i11 & 128) != 0 ? false : z10, (C4969v) null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10, int i11, C4969v c4969v) {
            long j11;
            int i12;
            String str2 = (i11 & 1) != 0 ? "" : str;
            if ((i11 & 32) != 0) {
                K0.f100733b.getClass();
                j11 = K0.f100746o;
            } else {
                j11 = j10;
            }
            if ((i11 & 64) != 0) {
                C2099r0.f101402b.getClass();
                i12 = C2099r0.f101408h;
            } else {
                i12 = i10;
            }
            this(str2, f10, f11, f12, f13, j11, i12, (C4969v) null);
        }

        private Builder(String str, float f10, float f11, float f12, float f13, long j10, int i10) {
            this(str, f10, f11, f12, f13, j10, i10, false, (C4969v) null);
        }
    }

    @V({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Companion\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,784:1\n36#2:785\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVector$Companion\n*L\n417#1:785\n*E\n"})
    public static final class a {
        public a() {
        }

        public final int a() {
            int i10;
            synchronized (this) {
                i10 = ImageVector.f101457m;
                ImageVector.f101457m = i10 + 1;
            }
            return i10;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ ImageVector(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11, C4969v c4969v) {
        this(str, f10, f11, f12, f13, nVar, j10, i10, z10, i11);
    }

    public final boolean c() {
        return this.f101466i;
    }

    public final float d() {
        return this.f101460c;
    }

    public final float e() {
        return this.f101459b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageVector)) {
            return false;
        }
        ImageVector imageVector = (ImageVector) obj;
        return G.g(this.f101458a, imageVector.f101458a) && k0.i.l(this.f101459b, imageVector.f101459b) && k0.i.l(this.f101460c, imageVector.f101460c) && this.f101461d == imageVector.f101461d && this.f101462e == imageVector.f101462e && G.g(this.f101463f, imageVector.f101463f) && K0.y(this.f101464g, imageVector.f101464g) && this.f101465h == imageVector.f101465h && this.f101466i == imageVector.f101466i;
    }

    public final int f() {
        return this.f101467j;
    }

    @NotNull
    public final String g() {
        return this.f101458a;
    }

    @NotNull
    public final n h() {
        return this.f101463f;
    }

    public int hashCode() {
        return C1635o.a(this.f101466i) + ((((K0.K(this.f101464g) + ((this.f101463f.hashCode() + B.a(this.f101462e, B.a(this.f101461d, B.a(this.f101460c, B.a(this.f101459b, this.f101458a.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31) + this.f101465h) * 31);
    }

    public final int i() {
        return this.f101465h;
    }

    public final long j() {
        return this.f101464g;
    }

    public final float k() {
        return this.f101462e;
    }

    public final float l() {
        return this.f101461d;
    }

    public ImageVector(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11) {
        this.f101458a = str;
        this.f101459b = f10;
        this.f101460c = f11;
        this.f101461d = f12;
        this.f101462e = f13;
        this.f101463f = nVar;
        this.f101464g = j10;
        this.f101465h = i10;
        this.f101466i = z10;
        this.f101467j = i11;
    }

    public /* synthetic */ ImageVector(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11, int i12, C4969v c4969v) {
        this(str, f10, f11, f12, f13, nVar, j10, i10, z10, (i12 & 512) != 0 ? f101455k.a() : i11);
    }
}
