package androidx.compose.ui.input.pointer.util;

import V.c;
import androidx.compose.runtime.internal.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,734:1\n42#2,7:735\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker1D\n*L\n294#1:735,7\n*E\n"})
@r(parameters = 0)
public final class VelocityTracker1D {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f102332i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f102333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Strategy f102334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f102335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final V.a[] f102336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final float[] f102338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final float[] f102339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final float[] f102340h;

    public enum Strategy {
        Lsq2,
        Impulse
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102341a;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102341a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VelocityTracker1D() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f102337e + 1) % 20;
        this.f102337e = i10;
        c.r(this.f102336d, i10, j10, f10);
    }

    public final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            float[] fArr3 = this.f102340h;
            c.p(fArr2, fArr, i10, 2, fArr3);
            return fArr3[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final float c() {
        float fG;
        float[] fArr = this.f102338f;
        float[] fArr2 = this.f102339g;
        int i10 = this.f102337e;
        V.a aVar = this.f102336d[i10];
        if (aVar == null) {
            return 0.0f;
        }
        int i11 = 0;
        V.a aVar2 = aVar;
        while (true) {
            V.a aVar3 = this.f102336d[i10];
            if (aVar3 == null) {
                break;
            }
            long j10 = aVar.f74442a;
            long j11 = aVar3.f74442a;
            float f10 = j10 - j11;
            float fAbs = Math.abs(j11 - aVar2.f74442a);
            V.a aVar4 = (this.f102334b == Strategy.Lsq2 || this.f102333a) ? aVar3 : aVar;
            if (f10 > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = aVar3.f74443b;
            fArr2[i11] = -f10;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            aVar2 = aVar4;
        }
        if (i11 < this.f102335c) {
            return 0.0f;
        }
        int i12 = a.f102341a[this.f102334b.ordinal()];
        if (i12 == 1) {
            fG = c.g(fArr, fArr2, i11, this.f102333a);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fG = b(fArr, fArr2, i11);
        }
        return fG * 1000;
    }

    public final float d(float f10) {
        if (!(f10 > 0.0f)) {
            W.a.g("maximumVelocity should be a positive value. You specified=" + f10);
            throw null;
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        if (fC <= 0.0f) {
            float f11 = -f10;
            if (fC < f11) {
                return f11;
            }
        } else if (fC > f10) {
            return f10;
        }
        return fC;
    }

    public final boolean e() {
        return this.f102333a;
    }

    public final void f() {
        C4875q.V1(this.f102336d, null, 0, 0, 6, null);
        this.f102337e = 0;
    }

    public VelocityTracker1D(boolean z10, @NotNull Strategy strategy) {
        this.f102333a = z10;
        this.f102334b = strategy;
        if (z10 && strategy.equals(Strategy.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = a.f102341a[strategy.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.f102335c = i11;
        this.f102336d = new V.a[20];
        this.f102338f = new float[20];
        this.f102339g = new float[20];
        this.f102340h = new float[3];
    }

    public /* synthetic */ VelocityTracker1D(boolean z10, Strategy strategy, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? Strategy.Lsq2 : strategy);
    }

    public VelocityTracker1D(boolean z10) {
        this(z10, Strategy.Impulse);
    }
}
