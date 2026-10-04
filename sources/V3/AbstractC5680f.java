package v3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.h;
import e.C;
import e.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import q8.C5443b;

/* JADX INFO: renamed from: v3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5680f<T extends View, Z> implements p<Z> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f239785f = "CustomViewTarget";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @C
    public static final int f239786g = h.C0363h.f138398u0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f239787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f239788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View.OnAttachStateChangeListener f239789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f239790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f239791e;

    /* JADX INFO: renamed from: v3.f$a */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC5680f.this.p();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC5680f.this.o();
        }
    }

    /* JADX INFO: renamed from: v3.f$b */
    @f0
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f239793e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        @f0
        public static Integer f239794f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f239795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<o> f239796b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f239797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public a f239798d;

        /* JADX INFO: renamed from: v3.f$b$a */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<b> f239799a;

            public a(@NonNull b bVar) {
                this.f239799a = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(AbstractC5680f.f239785f, 2)) {
                    Log.v(AbstractC5680f.f239785f, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f239799a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.f239795a = view;
        }

        public static int c(@NonNull Context context) {
            if (f239794f == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService(C5443b.f226850e);
                y3.m.f(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f239794f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f239794f.intValue();
        }

        public void a() {
            if (this.f239796b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f239795a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f239798d);
            }
            this.f239798d = null;
            this.f239796b.clear();
        }

        public void d(@NonNull o oVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                oVar.d(iG, iF);
                return;
            }
            if (!this.f239796b.contains(oVar)) {
                this.f239796b.add(oVar);
            }
            if (this.f239798d == null) {
                ViewTreeObserver viewTreeObserver = this.f239795a.getViewTreeObserver();
                a aVar = new a(this);
                this.f239798d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f239797c && this.f239795a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f239795a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable(AbstractC5680f.f239785f, 4)) {
                Log.i(AbstractC5680f.f239785f, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f239795a.getContext());
        }

        public final int f() {
            int paddingBottom = this.f239795a.getPaddingBottom() + this.f239795a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f239795a.getLayoutParams();
            return e(this.f239795a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int g() {
            int paddingRight = this.f239795a.getPaddingRight() + this.f239795a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f239795a.getLayoutParams();
            return e(this.f239795a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            ArrayList arrayList = new ArrayList(this.f239796b);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((o) obj).d(i10, i11);
            }
        }

        public void k(@NonNull o oVar) {
            this.f239796b.remove(oVar);
        }
    }

    public AbstractC5680f(@NonNull T t10) {
        y3.m.f(t10, "Argument must not be null");
        this.f239788b = t10;
        this.f239787a = new b(t10);
    }

    @Nullable
    private Object b() {
        return this.f239788b.getTag(f239786g);
    }

    private void e() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f239789c;
        if (onAttachStateChangeListener == null || this.f239791e) {
            return;
        }
        this.f239788b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f239791e = true;
    }

    private void i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f239789c;
        if (onAttachStateChangeListener == null || !this.f239791e) {
            return;
        }
        this.f239788b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f239791e = false;
    }

    private void q(@Nullable Object obj) {
        this.f239788b.setTag(f239786g, obj);
    }

    @NonNull
    public final AbstractC5680f<T, Z> a() {
        if (this.f239789c != null) {
            return this;
        }
        this.f239789c = new a();
        e();
        return this;
    }

    @NonNull
    public final T c() {
        return this.f239788b;
    }

    @Override // v3.p
    public final void d(@Nullable Drawable drawable) {
        this.f239787a.b();
        if (this.f239790d) {
            return;
        }
        i();
    }

    @Override // v3.p
    public final void f(@NonNull o oVar) {
        this.f239787a.k(oVar);
    }

    @Override // v3.p
    @Nullable
    public final com.bumptech.glide.request.e getRequest() {
        Object objB = b();
        if (objB == null) {
            return null;
        }
        if (objB instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) objB;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // v3.p
    public final void h(@NonNull o oVar) {
        this.f239787a.d(oVar);
    }

    public abstract void j(@Nullable Drawable drawable);

    @Override // v3.p
    public final void k(@Nullable Drawable drawable) {
        e();
    }

    @Override // v3.p
    public final void m(@Nullable com.bumptech.glide.request.e eVar) {
        q(eVar);
    }

    public final void o() {
        com.bumptech.glide.request.e request = getRequest();
        if (request != null) {
            this.f239790d = true;
            request.clear();
            this.f239790d = false;
        }
    }

    public final void p() {
        com.bumptech.glide.request.e request = getRequest();
        if (request == null || !request.e()) {
            return;
        }
        request.i();
    }

    @NonNull
    public final AbstractC5680f<T, Z> s() {
        this.f239787a.f239797c = true;
        return this;
    }

    public String toString() {
        return "Target for: " + this.f239788b;
    }

    @Override // s3.l
    public void onDestroy() {
    }

    @Override // s3.l
    public void onStart() {
    }

    @Override // s3.l
    public void onStop() {
    }

    public void l(@Nullable Drawable drawable) {
    }

    @Deprecated
    public final AbstractC5680f<T, Z> r(@C int i10) {
        return this;
    }
}
