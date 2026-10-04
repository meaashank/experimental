package C4;

import B0.C0920d;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import com.cookiegames.smartcookie.p;
import e.InterfaceC4332f;
import e.InterfaceC4337k;
import e.InterfaceC4346u;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TypedValue f17583a = new TypedValue();

    @NonNull
    public static Bitmap a(@NonNull Context context, @InterfaceC4346u int i10, boolean z10) {
        int color = z10 ? C0920d.getColor(context, p.f.f142851n2) : C0920d.getColor(context, p.f.f142333E2);
        Bitmap bitmapC = c(context, i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC.getWidth(), bitmapC.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapC, 0.0f, 0.0f, paint);
        bitmapC.recycle();
        return bitmapCreateBitmap;
    }

    @InterfaceC4337k
    public static int b(@NonNull Context context) {
        return d(context, R.attr.colorAccent);
    }

    @NonNull
    public static Bitmap c(@NonNull Context context, int i10) {
        Drawable drawableL = l(context, i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableL.getIntrinsicWidth(), drawableL.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableL.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableL.draw(canvas);
        return bitmapCreateBitmap;
    }

    @InterfaceC4337k
    public static int d(@NonNull Context context, @InterfaceC4332f int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f17583a.data, new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @InterfaceC4337k
    public static int e(@NonNull Context context) {
        return d(context, R.attr.colorBackground);
    }

    @InterfaceC4337k
    public static int f(@NonNull Context context) {
        return C0920d.getColor(context, p.f.f142851n2);
    }

    @InterfaceC4337k
    public static int g(@NonNull Context context) {
        return C0920d.getColor(context, p.f.f142333E2);
    }

    @InterfaceC4337k
    public static int h(@NonNull Context context, boolean z10) {
        return z10 ? C0920d.getColor(context, p.f.f142851n2) : C0920d.getColor(context, p.f.f142333E2);
    }

    @InterfaceC4337k
    public static int i(@NonNull Context context) {
        return d(context, R.attr.colorPrimary);
    }

    @TargetApi(21)
    @InterfaceC4337k
    public static int j(@NonNull Context context) {
        return d(context, R.attr.statusBarColor);
    }

    @InterfaceC4337k
    public static int k(@NonNull Context context) {
        return d(context, R.attr.editTextColor);
    }

    @NonNull
    public static Drawable l(@NonNull Context context, int i10) {
        Drawable drawable = C0920d.getDrawable(context, i10);
        l.a(drawable);
        return drawable;
    }
}
