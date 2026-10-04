package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.C2006b0;
import androidx.compose.ui.graphics.InterfaceC2121w2;
import androidx.compose.ui.graphics.drawscope.k;
import androidx.compose.ui.graphics.drawscope.p;
import androidx.compose.ui.graphics.drawscope.q;
import androidx.compose.ui.graphics.f3;
import androidx.compose.ui.graphics.g3;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104939b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final k f104940a;

    public a(@NotNull k kVar) {
        this.f104940a = kVar;
    }

    @NotNull
    public final k a() {
        return this.f104940a;
    }

    public final Paint.Cap b(int i10) {
        f3.a aVar = f3.f101112b;
        aVar.getClass();
        if (i10 == f3.f101113c) {
            return Paint.Cap.BUTT;
        }
        aVar.getClass();
        if (i10 == f3.f101114d) {
            return Paint.Cap.ROUND;
        }
        aVar.getClass();
        return i10 == f3.f101115e ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public final Paint.Join c(int i10) {
        g3.a aVar = g3.f101118b;
        aVar.getClass();
        if (i10 == g3.f101119c) {
            return Paint.Join.MITER;
        }
        aVar.getClass();
        if (i10 == g3.f101120d) {
            return Paint.Join.ROUND;
        }
        aVar.getClass();
        return i10 == g3.f101121e ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@Nullable TextPaint textPaint) {
        if (textPaint != null) {
            k kVar = this.f104940a;
            if (G.g(kVar, p.f101084a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (kVar instanceof q) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((q) this.f104940a).f101090a);
                textPaint.setStrokeMiter(((q) this.f104940a).f101091b);
                textPaint.setStrokeJoin(c(((q) this.f104940a).f101093d));
                textPaint.setStrokeCap(b(((q) this.f104940a).f101092c));
                InterfaceC2121w2 interfaceC2121w2 = ((q) this.f104940a).f101094e;
                textPaint.setPathEffect(interfaceC2121w2 != null ? C2006b0.e(interfaceC2121w2) : null);
            }
        }
    }
}
