package Ha;

import Ha.d;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public interface c {

    /* JADX INFO: renamed from: A2, reason: collision with root package name */
    public static final int f50679A2 = 200;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final float f50680x2 = 3.0f;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final float f50681y2 = 1.75f;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final float f50682z2 = 1.0f;

    Bitmap B();

    boolean C(Matrix matrix);

    void D(d.h hVar);

    void E(float f10, float f11, float f12);

    float F();

    float G();

    void a(Matrix matrix);

    void b(float f10, float f11, float f12, boolean z10);

    float c();

    void d(d.i iVar);

    void e(float f10);

    void f(float f10, boolean z10);

    float g();

    void h(boolean z10);

    RectF i();

    void j(View.OnLongClickListener onLongClickListener);

    void k(boolean z10);

    void m(float f10);

    void n(float f10);

    void o(d.g gVar);

    void p(float f10);

    ImageView.ScaleType q();

    void r(int i10);

    boolean s();

    void t(float f10);

    void u(float f10);

    void v(GestureDetector.OnDoubleTapListener onDoubleTapListener);

    void w(d.f fVar);

    void x(ImageView.ScaleType scaleType);

    c y();

    void z(d.e eVar);
}
