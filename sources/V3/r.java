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
import e.InterfaceC4335i;
import e.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import q8.C5443b;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class r<T extends View, Z> extends AbstractC5676b<Z> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f239822g = "ViewTarget";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f239823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f239824i = h.C0363h.f138398u0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f239825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f239826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View.OnAttachStateChangeListener f239827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f239828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f239829f;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.o();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.l();
        }
    }

    @f0
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f239831e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        @f0
        public static Integer f239832f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f239833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<o> f239834b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f239835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public a f239836d;

        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<b> f239837a;

            public a(@NonNull b bVar) {
                this.f239837a = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(r.f239822g, 2)) {
                    Log.v(r.f239822g, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f239837a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.f239833a = view;
        }

        public static int c(@NonNull Context context) {
            if (f239832f == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService(C5443b.f226850e);
                y3.m.f(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f239832f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f239832f.intValue();
        }

        public void a() {
            if (this.f239834b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f239833a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f239836d);
            }
            this.f239836d = null;
            this.f239834b.clear();
        }

        public void d(@NonNull o oVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                oVar.d(iG, iF);
                return;
            }
            if (!this.f239834b.contains(oVar)) {
                this.f239834b.add(oVar);
            }
            if (this.f239836d == null) {
                ViewTreeObserver viewTreeObserver = this.f239833a.getViewTreeObserver();
                a aVar = new a(this);
                this.f239836d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f239835c && this.f239833a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f239833a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable(r.f239822g, 4)) {
                Log.i(r.f239822g, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f239833a.getContext());
        }

        public final int f() {
            int paddingBottom = this.f239833a.getPaddingBottom() + this.f239833a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f239833a.getLayoutParams();
            return e(this.f239833a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int g() {
            int paddingRight = this.f239833a.getPaddingRight() + this.f239833a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f239833a.getLayoutParams();
            return e(this.f239833a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            ArrayList arrayList = new ArrayList(this.f239834b);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((o) obj).d(i10, i11);
            }
        }

        public void k(@NonNull o oVar) {
            this.f239834b.remove(oVar);
        }
    }

    public r(@NonNull T t10) {
        y3.m.f(t10, "Argument must not be null");
        this.f239825b = t10;
        this.f239826c = new b(t10);
    }

    @Deprecated
    public static void q(int i10) {
        if (f239823h) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f239824i = i10;
    }

    @NonNull
    public final r<T, Z> c() {
        if (this.f239827d != null) {
            return this;
        }
        this.f239827d = new a();
        i();
        return this;
    }

    @Override // v3.AbstractC5676b, v3.p
    @InterfaceC4335i
    public void d(@Nullable Drawable drawable) {
        this.f239826c.b();
        if (this.f239828e) {
            return;
        }
        j();
    }

    @Nullable
    public final Object e() {
        return this.f239825b.getTag(f239824i);
    }

    @Override // v3.p
    @InterfaceC4335i
    public void f(@NonNull o oVar) {
        this.f239826c.k(oVar);
    }

    @Override // v3.AbstractC5676b, v3.p
    @Nullable
    public com.bumptech.glide.request.e getRequest() {
        Object objE = e();
        if (objE == null) {
            return null;
        }
        if (objE instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) objE;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @NonNull
    public T getView() {
        return this.f239825b;
    }

    @Override // v3.p
    @InterfaceC4335i
    public void h(@NonNull o oVar) {
        this.f239826c.d(oVar);
    }

    public final void i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f239827d;
        if (onAttachStateChangeListener == null || this.f239829f) {
            return;
        }
        this.f239825b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f239829f = true;
    }

    public final void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f239827d;
        if (onAttachStateChangeListener == null || !this.f239829f) {
            return;
        }
        this.f239825b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f239829f = false;
    }

    @Override // v3.AbstractC5676b, v3.p
    @InterfaceC4335i
    public void k(@Nullable Drawable drawable) {
        i();
    }

    public void l() {
        com.bumptech.glide.request.e request = getRequest();
        if (request != null) {
            this.f239828e = true;
            request.clear();
            this.f239828e = false;
        }
    }

    @Override // v3.AbstractC5676b, v3.p
    public void m(@Nullable com.bumptech.glide.request.e eVar) {
        p(eVar);
    }

    public void o() {
        com.bumptech.glide.request.e request = getRequest();
        if (request == null || !request.e()) {
            return;
        }
        request.i();
    }

    public final void p(@Nullable Object obj) {
        f239823h = true;
        this.f239825b.setTag(f239824i, obj);
    }

    @NonNull
    public final r<T, Z> r() {
        this.f239826c.f239835c = true;
        return this;
    }

    public String toString() {
        return "Target for: " + this.f239825b;
    }

    @Deprecated
    public r(@NonNull T t10, boolean z10) {
        this(t10);
        if (z10) {
            r();
        }
    }
}
