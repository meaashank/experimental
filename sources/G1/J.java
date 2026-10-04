package g1;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.databinding.InterfaceC2511d;
import i1.C4543a;

/* JADX INFO: loaded from: classes2.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @androidx.databinding.g(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @androidx.databinding.g(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @androidx.databinding.g(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @androidx.databinding.g(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @androidx.databinding.g(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @androidx.databinding.g(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @androidx.databinding.g(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @androidx.databinding.g(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @androidx.databinding.g(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @androidx.databinding.g(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @androidx.databinding.g(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @androidx.databinding.g(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @androidx.databinding.g(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @androidx.databinding.g(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @androidx.databinding.g(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @androidx.databinding.g(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @androidx.databinding.g(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @androidx.databinding.g(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f202183a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f202184b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f202185c = 2;

    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f202186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f202187b;

        public a(b bVar, c cVar) {
            this.f202186a = bVar;
            this.f202187b = cVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b bVar = this.f202186a;
            if (bVar != null) {
                bVar.onViewAttachedToWindow(view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            c cVar = this.f202187b;
            if (cVar != null) {
                cVar.onViewDetachedFromWindow(view);
            }
        }
    }

    @TargetApi(12)
    public interface b {
        void onViewAttachedToWindow(View view);
    }

    @TargetApi(12)
    public interface c {
        void onViewDetachedFromWindow(View view);
    }

    public static int a(float f10) {
        int i10 = (int) (0.5f + f10);
        if (i10 != 0) {
            return i10;
        }
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    @InterfaceC2511d({"android:background"})
    public static void b(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @InterfaceC2511d({"android:onClickListener", "android:clickable"})
    public static void c(View view, View.OnClickListener onClickListener, boolean z10) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z10);
    }

    @InterfaceC2511d(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void d(View view, c cVar, b bVar) {
        a aVar = (cVar == null && bVar == null) ? null : new a(bVar, cVar);
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) r.b(view, aVar, C4543a.C0748a.f202775a);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (aVar != null) {
            view.addOnAttachStateChangeListener(aVar);
        }
    }

    @InterfaceC2511d({"android:onClick", "android:clickable"})
    public static void e(View view, View.OnClickListener onClickListener, boolean z10) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z10);
    }

    @InterfaceC2511d({"android:onLayoutChange"})
    public static void f(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @InterfaceC2511d({"android:onLongClick", "android:longClickable"})
    public static void g(View view, View.OnLongClickListener onLongClickListener, boolean z10) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z10);
    }

    @InterfaceC2511d({"android:onLongClickListener", "android:longClickable"})
    public static void h(View view, View.OnLongClickListener onLongClickListener, boolean z10) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z10);
    }

    @InterfaceC2511d({"android:padding"})
    public static void i(View view, float f10) {
        int iA = a(f10);
        view.setPadding(iA, iA, iA, iA);
    }

    @InterfaceC2511d({"android:paddingBottom"})
    public static void j(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), a(f10));
    }

    @InterfaceC2511d({"android:paddingEnd"})
    public static void k(View view, float f10) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), a(f10), view.getPaddingBottom());
    }

    @InterfaceC2511d({"android:paddingLeft"})
    public static void l(View view, float f10) {
        view.setPadding(a(f10), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @InterfaceC2511d({"android:paddingRight"})
    public static void m(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), a(f10), view.getPaddingBottom());
    }

    @InterfaceC2511d({"android:paddingStart"})
    public static void n(View view, float f10) {
        view.setPaddingRelative(a(f10), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    @InterfaceC2511d({"android:paddingTop"})
    public static void o(View view, float f10) {
        view.setPadding(view.getPaddingLeft(), a(f10), view.getPaddingRight(), view.getPaddingBottom());
    }

    @InterfaceC2511d({"android:requiresFadingEdge"})
    public static void p(View view, int i10) {
        boolean z10 = (i10 & 2) != 0;
        boolean z11 = (i10 & 1) != 0;
        view.setVerticalFadingEdgeEnabled(z10);
        view.setHorizontalFadingEdgeEnabled(z11);
    }
}
