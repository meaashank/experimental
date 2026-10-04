package V9;

import U9.InterfaceC1300i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.launcher3.BubbleTextView;
import com.prism.commons.utils.C3861z;
import com.prism.commons.utils.r;
import com.prism.gaia.helper.utils.q;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes6.dex */
public class b implements InterfaceC1300i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76396c = "AD_TAG";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f76397d = 1.36364f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f76398e = 0.3181822f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @InterfaceC4337k
    public static final int f76399f = -15433001;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @InterfaceC4337k
    public static final int f76400g = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f76401a = new Paint(3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3861z<Drawable, Context> f76402b = new C3861z<>(new a());

    public static Drawable b(Context context, String str) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r.a(context, 24), r.a(context, 24), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setTextSize(r.a(context, 16));
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return new BitmapDrawable(context.getResources(), q.G(context, bitmapCreateBitmap, str, paint, rect, r.a(context, 0), rect.height() + r.a(context, 4)));
    }

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
        this.f76401a.setColor(-1);
        canvas.drawRoundRect(rectF, f18, f18, this.f76401a);
        Drawable drawableA = this.f76402b.a(bubbleTextView.getContext());
        drawableA.setBounds((int) f14, (int) f15, (int) f16, (int) f17);
        drawableA.setTint(-15433001);
        drawableA.draw(canvas);
    }
}
