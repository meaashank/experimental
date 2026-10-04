package com.cookiegames.smartcookie.icon;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.p;
import d4.g;
import dd.k;
import java.text.NumberFormat;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nTabCountView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabCountView.kt\ncom/cookiegames/smartcookie/icon/TabCountView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,92:1\n52#2,9:93\n*S KotlinDebug\n*F\n+ 1 TabCountView.kt\ncom/cookiegames/smartcookie/icon/TabCountView\n*L\n46#1:93,9\n*E\n"})
@r(parameters = 0)
public final class TabCountView extends View {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f141348i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NumberFormat f141349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PorterDuffXfermode f141350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PorterDuffXfermode f141351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Paint f141352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f141353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f141354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final RectF f141355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f141356h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public TabCountView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        G.p(context, "context");
    }

    public final void a(int i10) {
        this.f141356h = i10;
        setContentDescription(String.valueOf(i10));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        String string;
        G.p(canvas, "canvas");
        int i10 = this.f141356h;
        if (i10 > 99) {
            string = getContext().getString(p.s.f146046v7);
            G.m(string);
        } else {
            string = this.f141349a.format(Integer.valueOf(i10));
            G.m(string);
        }
        this.f141352d.setXfermode(this.f141351c);
        this.f141355g.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.f141355g;
        float f10 = this.f141353e;
        canvas.drawRoundRect(rectF, f10, f10, this.f141352d);
        this.f141352d.setXfermode(this.f141350b);
        float f11 = this.f141353e - 1;
        RectF rectF2 = this.f141355g;
        float f12 = this.f141354f;
        rectF2.set(f12, f12, getWidth() - this.f141354f, getHeight() - this.f141354f);
        canvas.drawRoundRect(this.f141355g, f11, f11, this.f141352d);
        this.f141352d.setXfermode(this.f141351c);
        canvas.drawText(string, getWidth() / 2.0f, (getHeight() / 2) - ((this.f141352d.ascent() + this.f141352d.descent()) / 2), this.f141352d);
        super.onDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public TabCountView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        G.p(context, "context");
    }

    public /* synthetic */ TabCountView(Context context, AttributeSet attributeSet, int i10, int i11, C4969v c4969v) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k
    public TabCountView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        G.p(context, "context");
        this.f141349a = NumberFormat.getInstance(g.e(context));
        this.f141350b = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f141351c = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);
        Paint paint = new Paint();
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f141352d = paint;
        this.f141355g = new RectF();
        setLayerType(1, null);
        int[] TabCountView = p.u.KD;
        G.o(TabCountView, "TabCountView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TabCountView, 0, 0);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(p.u.ND, -16777216));
        paint.setTextSize(typedArrayObtainStyledAttributes.getDimension(p.u.OD, 14.0f));
        this.f141353e = typedArrayObtainStyledAttributes.getDimension(p.u.LD, 0.0f);
        this.f141354f = typedArrayObtainStyledAttributes.getDimension(p.u.MD, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
