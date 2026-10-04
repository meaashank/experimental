package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2013a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final d f100974b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final AbstractC2013a f100975c = new C0249a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final AbstractC2013a f100976d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final AbstractC2013a f100977e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final float[] f100978a;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a$a, reason: collision with other inner class name */
    public static final class C0249a extends AbstractC2013a {
        public C0249a(float[] fArr) {
            super(fArr);
        }

        @NotNull
        public String toString() {
            return "Bradford";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a$b */
    public static final class b extends AbstractC2013a {
        public b(float[] fArr) {
            super(fArr);
        }

        @NotNull
        public String toString() {
            return "Ciecat02";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a$c */
    public static final class c extends AbstractC2013a {
        public c(float[] fArr) {
            super(fArr);
        }

        @NotNull
        public String toString() {
            return "VonKries";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.a$d */
    public static final class d {
        public d() {
        }

        @NotNull
        public final AbstractC2013a a() {
            return AbstractC2013a.f100975c;
        }

        @NotNull
        public final AbstractC2013a b() {
            return AbstractC2013a.f100977e;
        }

        @NotNull
        public final AbstractC2013a c() {
            return AbstractC2013a.f100976d;
        }

        public d(C4969v c4969v) {
        }
    }

    public /* synthetic */ AbstractC2013a(float[] fArr, C4969v c4969v) {
        this(fArr);
    }

    @NotNull
    public final float[] d() {
        return this.f100978a;
    }

    public AbstractC2013a(float[] fArr) {
        this.f100978a = fArr;
    }
}
