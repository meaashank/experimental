package G0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n278#1,3:296\n211#1,6:299\n114#1:305\n122#1:307\n278#1,3:309\n278#1,3:312\n1#2:295\n1#2:306\n1#2:308\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n161#1:296,3\n207#1:299,6\n220#1:305\n223#1:307\n253#1:309,3\n290#1:312,3\n220#1:306\n223#1:308\n*E\n"})
public final class O {
    @NotNull
    public static final Rect A(@NotNull Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i10;
        rect2.left *= i10;
        rect2.right *= i10;
        rect2.bottom *= i10;
        return rect2;
    }

    @NotNull
    public static final RectF B(@NotNull RectF rectF, float f10) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f10;
        rectF2.left *= f10;
        rectF2.right *= f10;
        rectF2.bottom *= f10;
        return rectF2;
    }

    @NotNull
    public static final RectF C(@NotNull RectF rectF, int i10) {
        float f10 = i10;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f10;
        rectF2.left *= f10;
        rectF2.right *= f10;
        rectF2.bottom *= f10;
        return rectF2;
    }

    @NotNull
    public static final Rect D(@NotNull RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @NotNull
    public static final RectF E(@NotNull Rect rect) {
        return new RectF(rect);
    }

    @NotNull
    public static final Region F(@NotNull Rect rect) {
        return new Region(rect);
    }

    @NotNull
    public static final Region G(@NotNull RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @NotNull
    public static final RectF H(@NotNull RectF rectF, @NotNull Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    @NotNull
    public static final Region I(@NotNull Rect rect, @NotNull Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @NotNull
    public static final Region J(@NotNull RectF rectF, @NotNull RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final Rect a(@NotNull Rect rect, @NotNull Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final RectF b(@NotNull RectF rectF, @NotNull RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final float c(@NotNull RectF rectF) {
        return rectF.left;
    }

    public static final int d(@NotNull Rect rect) {
        return rect.left;
    }

    public static final float e(@NotNull RectF rectF) {
        return rectF.top;
    }

    public static final int f(@NotNull Rect rect) {
        return rect.top;
    }

    public static final float g(@NotNull RectF rectF) {
        return rectF.right;
    }

    public static final int h(@NotNull Rect rect) {
        return rect.right;
    }

    public static final float i(@NotNull RectF rectF) {
        return rectF.bottom;
    }

    public static final int j(@NotNull Rect rect) {
        return rect.bottom;
    }

    public static final boolean k(@NotNull Rect rect, @NotNull Point point) {
        return rect.contains(point.x, point.y);
    }

    public static final boolean l(@NotNull RectF rectF, @NotNull PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    @NotNull
    public static final Rect m(@NotNull Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        int i11 = -i10;
        rect2.offset(i11, i11);
        return rect2;
    }

    @NotNull
    public static final Rect n(@NotNull Rect rect, @NotNull Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @NotNull
    public static final RectF o(@NotNull RectF rectF, float f10) {
        RectF rectF2 = new RectF(rectF);
        float f11 = -f10;
        rectF2.offset(f11, f11);
        return rectF2;
    }

    @NotNull
    public static final RectF p(@NotNull RectF rectF, @NotNull PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }

    @NotNull
    public static final Region q(@NotNull Rect rect, @NotNull Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @NotNull
    public static final Region r(@NotNull RectF rectF, @NotNull RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @NotNull
    public static final Rect s(@NotNull Rect rect, @NotNull Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @NotNull
    public static final RectF t(@NotNull RectF rectF, @NotNull RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @NotNull
    public static final Rect u(@NotNull Rect rect, int i10) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i10, i10);
        return rect2;
    }

    @NotNull
    public static final Rect v(@NotNull Rect rect, @NotNull Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @NotNull
    public static final Rect w(@NotNull Rect rect, @NotNull Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @NotNull
    public static final RectF x(@NotNull RectF rectF, float f10) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f10, f10);
        return rectF2;
    }

    @NotNull
    public static final RectF y(@NotNull RectF rectF, @NotNull PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @NotNull
    public static final RectF z(@NotNull RectF rectF, @NotNull RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }
}
