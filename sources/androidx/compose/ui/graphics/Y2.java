package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.InterfaceC1924k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
public abstract class Y2 extends AbstractC2131z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Shader f100923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f100924d;

    public Y2() {
        P.n.f65527b.getClass();
        this.f100924d = P.n.f65529d;
    }

    @Override // androidx.compose.ui.graphics.AbstractC2131z0
    public final void a(long j10, @NotNull InterfaceC2105s2 interfaceC2105s2, float f10) {
        Shader shaderC = this.f100923c;
        if (shaderC == null || !P.n.k(this.f100924d, j10)) {
            if (P.n.v(j10)) {
                shaderC = null;
                this.f100923c = null;
                P.n.f65527b.getClass();
                this.f100924d = P.n.f65529d;
            } else {
                shaderC = c(j10);
                this.f100923c = shaderC;
                this.f100924d = j10;
            }
        }
        long jA = interfaceC2105s2.a();
        K0.f100733b.getClass();
        long j11 = K0.f100734c;
        if (!kotlin.B0.p(jA, j11)) {
            interfaceC2105s2.y(j11);
        }
        if (!kotlin.jvm.internal.G.g(interfaceC2105s2.C(), shaderC)) {
            interfaceC2105s2.L(shaderC);
        }
        if (interfaceC2105s2.f() == f10) {
            return;
        }
        interfaceC2105s2.h(f10);
    }

    @NotNull
    public abstract Shader c(long j10);
}
