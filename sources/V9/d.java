package V9;

import U9.InterfaceC1300i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.launcher3.BubbleTextView;
import com.prism.commons.utils.C3861z;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes6.dex */
public class d implements InterfaceC1300i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76403c = "IMPORTED";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f76404d = 1.36364f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f76405e = 0.3181822f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC4337k
    public static final int f76406f = -15433001;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4337k
    public static final int f76407g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f76408a = new Paint(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3861z<Drawable, Context> f76409b = new C3861z<>(new c());

    @Override // U9.InterfaceC1300i
    public void onDrawBadge(BubbleTextView bubbleTextView, Canvas canvas, Rect rect, Point point) {
        double dHeight = (((double) rect.height()) + 0.0d) * 0.31818220019340515d;
        int i10 = rect.right;
        float f10 = i10;
        int i11 = rect.bottom;
        float f11 = i11;
        double d10 = dHeight / 2.0d;
        float f12 = (float) (((double) (point.x + i10)) - d10);
        float f13 = (float) (((double) (point.y + i11)) - d10);
        double dMin = Math.min(f10, f12);
        float f14 = (float) (dMin - d10);
        double dMin2 = Math.min(f11, f13);
        float f15 = (float) (dMin2 - d10);
        float f16 = (float) (dMin + d10);
        float f17 = (float) (dMin2 + d10);
        float f18 = ((float) dHeight) * 0.5f;
        RectF rectF = new RectF(f14, f15, f16, f17);
        this.f76408a.setColor(-1);
        canvas.drawRoundRect(rectF, f18, f18, this.f76408a);
        Drawable drawableA = this.f76409b.a(bubbleTextView.getContext());
        drawableA.setBounds((int) f14, (int) f15, (int) f16, (int) f17);
        drawableA.setTint(-15433001);
        drawableA.draw(canvas);
    }
}
