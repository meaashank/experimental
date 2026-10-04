package androidx.compose.ui.text.platform.style;

import P.d;
import P.n;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.K1;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.Y2;
import androidx.compose.ui.text.platform.l;
import ed.InterfaceC4376a;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,56:1\n81#2:57\n107#2,2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:57\n41#1:58,2\n*E\n"})
@r(parameters = 1)
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104933e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Y2 f104934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f104935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final L0 f104936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final X1<Shader> f104937d;

    public ShaderBrushSpan(@NotNull Y2 y22, float f10) {
        this.f104934a = y22;
        this.f104935b = f10;
        n.f65527b.getClass();
        this.f104936c = M1.g(new n(n.f65529d), null, 2, null);
        this.f104937d = K1.d(new InterfaceC4376a<Shader>() { // from class: androidx.compose.ui.text.platform.style.ShaderBrushSpan$shaderState$1
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @Nullable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Shader invoke() {
                if (this.f104938d.c() == d.f65493d || n.v(this.f104938d.c())) {
                    return null;
                }
                ShaderBrushSpan shaderBrushSpan = this.f104938d;
                return shaderBrushSpan.f104934a.c(shaderBrushSpan.c());
            }
        });
    }

    public final float a() {
        return this.f104935b;
    }

    @NotNull
    public final Y2 b() {
        return this.f104934a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((n) this.f104936c.getValue()).f65530a;
    }

    public final void d(long j10) {
        this.f104936c.setValue(new n(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        l.a(textPaint, this.f104935b);
        textPaint.setShader(this.f104937d.getValue());
    }
}
