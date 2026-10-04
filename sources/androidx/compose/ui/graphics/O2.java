package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class O2 {
    @InterfaceC4982o(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @InterfaceC4852c0(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    @NotNull
    public static final Rect a(@NotNull P.j jVar) {
        return new Rect((int) jVar.f65511a, (int) jVar.f65512b, (int) jVar.f65513c, (int) jVar.f65514d);
    }

    @NotNull
    public static final Rect b(@NotNull k0.v vVar) {
        return new Rect(vVar.f214334a, vVar.f214335b, vVar.f214336c, vVar.f214337d);
    }

    @NotNull
    public static final RectF c(@NotNull P.j jVar) {
        return new RectF(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d);
    }

    @NotNull
    public static final k0.v d(@NotNull Rect rect) {
        return new k0.v(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final P.j e(@NotNull Rect rect) {
        return new P.j(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final P.j f(@NotNull RectF rectF) {
        return new P.j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
