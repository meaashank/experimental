package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import android.os.Build;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public abstract class Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public RenderEffect f100800a;

    public Q2() {
    }

    @e.T(31)
    @NotNull
    public final RenderEffect a() {
        RenderEffect renderEffect = this.f100800a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.f100800a = renderEffectB;
        return renderEffectB;
    }

    @e.T(31)
    @NotNull
    public abstract RenderEffect b();

    public boolean c() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public Q2(C4969v c4969v) {
    }
}
