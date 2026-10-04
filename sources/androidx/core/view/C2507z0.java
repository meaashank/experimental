package androidx.core.view;

import a1.C1420a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2437a;
import androidx.core.view.O0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import e.InterfaceC4348w;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import y0.C5809a;

/* JADX INFO: renamed from: androidx.core.view.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C2507z0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Deprecated
    public static final int f111974A = 16777216;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f111975B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f111976C = 1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f111977D = 2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f111978E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f111979F = 1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f111980G = 1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f111981H = 2;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f111982I = 4;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f111983J = 8;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f111984K = 16;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f111985L = 32;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static Method f111986M = null;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static Method f111987N = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static boolean f111988O = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static WeakHashMap<View, String> f111989P = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static WeakHashMap<View, I0> f111990Q = null;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static Method f111991R = null;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static Field f111992S = null;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static boolean f111993T = false;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static ThreadLocal<Rect> f111994U = null;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int[] f111995V = {C5809a.e.f240751b, C5809a.e.f240753c, C5809a.e.f240775n, C5809a.e.f240795y, C5809a.e.f240724B, C5809a.e.f240725C, C5809a.e.f240726D, C5809a.e.f240727E, C5809a.e.f240728F, C5809a.e.f240729G, C5809a.e.f240755d, C5809a.e.f240757e, C5809a.e.f240759f, C5809a.e.f240761g, C5809a.e.f240763h, C5809a.e.f240765i, C5809a.e.f240767j, C5809a.e.f240769k, C5809a.e.f240771l, C5809a.e.f240773m, C5809a.e.f240777o, C5809a.e.f240779p, C5809a.e.f240781q, C5809a.e.f240783r, C5809a.e.f240785s, C5809a.e.f240787t, C5809a.e.f240789u, C5809a.e.f240791v, C5809a.e.f240793w, C5809a.e.f240794x, C5809a.e.f240796z, C5809a.e.f240723A};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final InterfaceC2456g0 f111996W = new C2505y0();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final e f111997X = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f111998a = "ViewCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f111999b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f112000c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f112001d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f112002e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f112003f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f112004g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f112005h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f112006i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Deprecated
    public static final int f112007j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Deprecated
    public static final int f112008k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final int f112009l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Deprecated
    public static final int f112010m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f112011n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f112012o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f112013p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Deprecated
    public static final int f112014q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f112015r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f112016s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Deprecated
    public static final int f112017t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Deprecated
    public static final int f112018u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final int f112019v = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Deprecated
    public static final int f112020w = 3;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Deprecated
    public static final int f112021x = 16777215;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Deprecated
    public static final int f112022y = -16777216;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Deprecated
    public static final int f112023z = 16;

    /* JADX INFO: renamed from: androidx.core.view.z0$a */
    public class a extends f<Boolean> {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, 0, i11);
        }

        @Override // androidx.core.view.C2507z0.f
        @e.T(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(@NonNull View view) {
            return Boolean.valueOf(l.d(view));
        }

        @Override // androidx.core.view.C2507z0.f
        @e.T(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(@NonNull View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        @Override // androidx.core.view.C2507z0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$b */
    public class b extends f<CharSequence> {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.C2507z0.f
        @e.T(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        @Override // androidx.core.view.C2507z0.f
        @e.T(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        @Override // androidx.core.view.C2507z0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$c */
    public class c extends f<CharSequence> {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.C2507z0.f
        @e.T(30)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        @Override // androidx.core.view.C2507z0.f
        @e.T(30)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.f(view, charSequence);
        }

        @Override // androidx.core.view.C2507z0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$d */
    public class d extends f<Boolean> {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, 0, i11);
        }

        @Override // androidx.core.view.C2507z0.f
        @e.T(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        @Override // androidx.core.view.C2507z0.f
        @e.T(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.C2507z0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$e */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f112024a = new WeakHashMap<>();

        public void a(View view) {
            this.f112024a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        public final void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z10 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                C2507z0.g1(key, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f112024a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f112024a.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$f */
    public static abstract class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f112025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<T> f112026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f112027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f112028d;

        public f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f112027c;
        }

        public abstract T c(View view);

        public abstract void d(View view, T t10);

        public T e(View view) {
            if (b()) {
                return c(view);
            }
            T t10 = (T) view.getTag(this.f112025a);
            if (this.f112026b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        public void f(View view, T t10) {
            if (b()) {
                d(view, t10);
            } else if (g(e(view), t10)) {
                C2507z0.C(view);
                view.setTag(this.f112025a, t10);
                C2507z0.g1(view, this.f112028d);
            }
        }

        public boolean g(T t10, T t11) {
            return !t11.equals(t10);
        }

        public f(int i10, Class<T> cls, int i11, int i12) {
            this.f112025a = i10;
            this.f112026b = cls;
            this.f112028d = i11;
            this.f112027c = i12;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$g */
    @e.T(20)
    public static class g {
        private g() {
        }

        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$h */
    @e.T(21)
    public static class h {

        /* JADX INFO: renamed from: androidx.core.view.z0$h$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public WindowInsetsCompat f112029a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f112030b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2450e0 f112031c;

            public a(View view, InterfaceC2450e0 interfaceC2450e0) {
                this.f112030b = view;
                this.f112031c = interfaceC2450e0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompatL = WindowInsetsCompat.L(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f112030b);
                    if (windowInsetsCompatL.equals(this.f112029a)) {
                        return this.f112031c.onApplyWindowInsets(view, windowInsetsCompatL).J();
                    }
                }
                this.f112029a = windowInsetsCompatL;
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = this.f112031c.onApplyWindowInsets(view, windowInsetsCompatL);
                if (i10 >= 30) {
                    return windowInsetsCompatOnApplyWindowInsets.J();
                }
                C2507z0.A1(view);
                return windowInsetsCompatOnApplyWindowInsets.J();
            }
        }

        private h() {
        }

        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C5809a.e.f240784r0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static WindowInsetsCompat b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsetsJ = windowInsetsCompat.J();
            if (windowInsetsJ != null) {
                return WindowInsetsCompat.L(view.computeSystemWindowInsets(windowInsetsJ, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static boolean c(@NonNull View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        public static boolean d(@NonNull View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        @Nullable
        public static WindowInsetsCompat j(@NonNull View view) {
            return WindowInsetsCompat.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(@NonNull View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f10) {
            view.setElevation(f10);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(@NonNull View view, @Nullable InterfaceC2450e0 interfaceC2450e0) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C5809a.e.f240768j0, interfaceC2450e0);
            }
            if (interfaceC2450e0 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C5809a.e.f240784r0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC2450e0));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        public static void x(@NonNull View view, float f10) {
            view.setZ(f10);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$i */
    @e.T(23)
    public static class i {
        private i() {
        }

        @Nullable
        public static WindowInsetsCompat a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatK = WindowInsetsCompat.K(rootWindowInsets);
            windowInsetsCompatK.H(windowInsetsCompatK);
            windowInsetsCompatK.d(view.getRootView());
            return windowInsetsCompatK;
        }

        public static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        public static void c(@NonNull View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(@NonNull View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$j */
    @e.T(24)
    public static class j {
        private j() {
        }

        public static void a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$k */
    @e.T(26)
    public static class k {
        private k() {
        }

        public static void a(@NonNull View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(@NonNull View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        public static boolean j(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(@NonNull View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        public static void m(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void n(@NonNull View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void o(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        public static void p(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$l */
    @e.T(28)
    public static class l {
        private l() {
        }

        public static void a(@NonNull View view, @NonNull final u uVar) {
            int i10 = C5809a.e.f240782q0;
            androidx.collection.U0 u02 = (androidx.collection.U0) view.getTag(i10);
            if (u02 == null) {
                u02 = new androidx.collection.U0();
                view.setTag(i10, u02);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.A0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return uVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            u02.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(@NonNull View view, @NonNull u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.U0 u02 = (androidx.collection.U0) view.getTag(C5809a.e.f240782q0);
            if (u02 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) u02.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, Z0.a aVar) {
            view.setAutofillId(aVar == null ? null : aVar.a());
        }

        public static void j(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$m */
    @e.T(29)
    public static class m {
        private m() {
        }

        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void e(View view, C1420a c1420a) {
            view.setContentCaptureSession(c1420a == null ? null : c1420a.f());
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$n */
    @e.T(30)
    public static class n {
        private n() {
        }

        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        @Nullable
        public static M1 c(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new M1(windowInsetsController);
            }
            return null;
        }

        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        public static void e(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }

        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$o */
    @e.T(31)
    public static final class o {
        private o() {
        }

        @Nullable
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        public static ContentInfoCompat b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoL = contentInfoCompat.l();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoL);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoL ? contentInfoCompat : ContentInfoCompat.m(contentInfoPerformReceiveContent);
        }

        public static void c(@NonNull View view, @Nullable String[] strArr, @Nullable InterfaceC2453f0 interfaceC2453f0) {
            if (interfaceC2453f0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(interfaceC2453f0));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$p */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface p {
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$q */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface q {
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$r */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface r {
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$s */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface s {
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$t */
    @e.T(31)
    public static final class t implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final InterfaceC2453f0 f112032a;

        public t(@NonNull InterfaceC2453f0 interfaceC2453f0) {
            this.f112032a = interfaceC2453f0;
        }

        @Nullable
        public ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompatM = ContentInfoCompat.m(contentInfo);
            ContentInfoCompat contentInfoCompatA = this.f112032a.a(view, contentInfoCompatM);
            if (contentInfoCompatA == null) {
                return null;
            }
            return contentInfoCompatA == contentInfoCompatM ? contentInfo : contentInfoCompatA.l();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$u */
    public interface u {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$v */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface v {
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$w */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface w {
    }

    /* JADX INFO: renamed from: androidx.core.view.z0$x */
    public static class x {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f112033d = new ArrayList<>();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public WeakHashMap<View, Boolean> f112034a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f112035b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f112036c = null;

        public static x a(View view) {
            int i10 = C5809a.e.f240780p0;
            x xVar = (x) view.getTag(i10);
            if (xVar != null) {
                return xVar;
            }
            x xVar2 = new x();
            view.setTag(i10, xVar2);
            return xVar2;
        }

        public static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f112033d;
            synchronized (arrayList) {
                try {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        WeakReference<View> weakReference = arrayList.get(i10);
                        i10++;
                        if (weakReference.get() == view) {
                            return;
                        }
                    }
                    f112033d.add(new WeakReference<>(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static void i(View view) {
            synchronized (f112033d) {
                int i10 = 0;
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = f112033d;
                        if (i10 >= arrayList.size()) {
                            return;
                        }
                        if (arrayList.get(i10).get() == view) {
                            arrayList.remove(i10);
                            return;
                        }
                        i10++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        @Nullable
        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f112034a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.f112035b == null) {
                this.f112035b = new SparseArray<>();
            }
            return this.f112035b;
        }

        public final boolean e(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C5809a.e.f240782q0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f112036c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f112036c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f112034a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f112033d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f112034a == null) {
                        this.f112034a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f112033d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f112034a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f112034a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Deprecated
    public C2507z0() {
    }

    @e.e0
    public static boolean A(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return x.a(view).f(keyEvent);
    }

    @Nullable
    public static String A0(@NonNull View view) {
        return h.k(view);
    }

    public static void A1(@NonNull View view) {
        g.c(view);
    }

    public static void A2(@NonNull View view, @NonNull List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.f(view, list);
        }
    }

    public static void B(@NonNull View view) {
        C(view);
    }

    @e.S(expression = "view.getTranslationX()")
    @Deprecated
    public static float B0(View view) {
        return view.getTranslationX();
    }

    @NonNull
    public static <T extends View> T B1(@NonNull View view, @e.C int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) l.f(view, i10);
        }
        T t10 = (T) view.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void B2(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.p(view, charSequence);
        }
    }

    public static void C(@NonNull View view) {
        C2437a c2437aE = E(view);
        if (c2437aE == null) {
            c2437aE = new C2437a();
        }
        G1(view, c2437aE);
    }

    @e.S(expression = "view.getTranslationY()")
    @Deprecated
    public static float C0(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    public static int C1(int i10, int i11, int i12) {
        return View.resolveSizeAndState(i10, i11, i12);
    }

    public static void C2(@NonNull View view, @Nullable String str) {
        h.v(view, str);
    }

    @Deprecated
    public static int D() {
        return View.generateViewId();
    }

    public static float D0(@NonNull View view) {
        return h.l(view);
    }

    public static boolean D1(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 26 ? k.j(view) : view.requestFocus();
    }

    @e.S(expression = "view.setTranslationX(value)")
    @Deprecated
    public static void D2(View view, float f10) {
        view.setTranslationX(f10);
    }

    @Nullable
    public static C2437a E(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateF = F(view);
        if (accessibilityDelegateF == null) {
            return null;
        }
        return accessibilityDelegateF instanceof C2437a.C0285a ? ((C2437a.C0285a) accessibilityDelegateF).f111760a : new C2437a(accessibilityDelegateF);
    }

    @Nullable
    @Deprecated
    public static M1 E0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new M1(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void E1(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    @e.S(expression = "view.setTranslationY(value)")
    @Deprecated
    public static void E2(View view, float f10) {
        view.setTranslationY(f10);
    }

    @Nullable
    public static View.AccessibilityDelegate F(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : G(view);
    }

    @e.S(expression = "view.getWindowSystemUiVisibility()")
    @Deprecated
    public static int F0(@NonNull View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static f<Boolean> F1() {
        return new a(C5809a.e.f240774m0, Boolean.class, 0, 28);
    }

    public static void F2(@NonNull View view, float f10) {
        h.w(view, f10);
    }

    @Nullable
    public static View.AccessibilityDelegate G(@NonNull View view) {
        if (f111993T) {
            return null;
        }
        if (f111992S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f111992S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f111993T = true;
                return null;
            }
        }
        try {
            Object obj = f111992S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f111993T = true;
            return null;
        }
    }

    @e.S(expression = "view.getX()")
    @Deprecated
    public static float G0(View view) {
        return view.getX();
    }

    public static void G1(@NonNull View view, @Nullable C2437a c2437a) {
        if (c2437a == null && (F(view) instanceof C2437a.C0285a)) {
            c2437a = new C2437a();
        }
        Z1(view);
        view.setAccessibilityDelegate(c2437a == null ? null : c2437a.getBridge());
    }

    public static void G2(@NonNull View view, @Nullable O0.b bVar) {
        O0.h(view, bVar);
    }

    @e.S(expression = "view.getAccessibilityLiveRegion()")
    @Deprecated
    public static int H(@NonNull View view) {
        return view.getAccessibilityLiveRegion();
    }

    @e.S(expression = "view.getY()")
    @Deprecated
    public static float H0(View view) {
        return view.getY();
    }

    @e.e0
    public static void H1(@NonNull View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    @e.S(expression = "view.setX(value)")
    @Deprecated
    public static void H2(View view, float f10) {
        view.setX(f10);
    }

    @Nullable
    public static X0.S I(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new X0.S(accessibilityNodeProvider);
        }
        return null;
    }

    public static float I0(@NonNull View view) {
        return h.m(view);
    }

    @e.S(expression = "view.setAccessibilityLiveRegion(mode)")
    @Deprecated
    public static void I1(@NonNull View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    @e.S(expression = "view.setY(value)")
    @Deprecated
    public static void I2(View view, float f10) {
        view.setY(f10);
    }

    @Nullable
    @e.e0
    public static CharSequence J(@NonNull View view) {
        return n1().e(view);
    }

    public static boolean J0(@NonNull View view) {
        return F(view) != null;
    }

    @e.e0
    public static void J1(@NonNull View view, @Nullable CharSequence charSequence) {
        n1().f(view, charSequence);
        if (charSequence != null) {
            f111997X.a(view);
        } else {
            f111997X.d(view);
        }
    }

    public static void J2(@NonNull View view, float f10) {
        h.x(view, f10);
    }

    public static List<AccessibilityNodeInfoCompat.a> K(View view) {
        int i10 = C5809a.e.f240760f0;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static boolean K0(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 26 ? k.e(view) : view.hasFocusable();
    }

    @e.S(expression = "view.setActivated(activated)")
    @Deprecated
    public static void K1(View view, boolean z10) {
        view.setActivated(z10);
    }

    public static boolean K2(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? j.e(view, clipData, dragShadowBuilder, obj, i10) : view.startDrag(clipData, dragShadowBuilder, obj, i10);
    }

    @e.S(expression = "view.getAlpha()")
    @Deprecated
    public static float L(View view) {
        return view.getAlpha();
    }

    public static boolean L0(@NonNull View view) {
        return h.n(view);
    }

    @e.S(expression = "view.setAlpha(value)")
    @Deprecated
    public static void L1(View view, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        view.setAlpha(f10);
    }

    public static boolean L2(@NonNull View view, int i10) {
        return h.y(view, i10);
    }

    @Nullable
    public static Z0.a M(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Z0.a(k.b(view));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean M0(@NonNull View view, int i10) {
        if (view instanceof W) {
            ((W) view).hasNestedScrollingParent(i10);
            return false;
        }
        if (i10 == 0) {
            return h.n(view);
        }
        return false;
    }

    public static void M1(@NonNull View view, @Nullable String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.k(view, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean M2(@NonNull View view, int i10, int i11) {
        if (view instanceof W) {
            return ((W) view).startNestedScroll(i10, i11);
        }
        if (i11 == 0) {
            return h.y(view, i10);
        }
        return false;
    }

    public static int N(View view, @NonNull CharSequence charSequence) {
        List<AccessibilityNodeInfoCompat.a> listK = K(view);
        for (int i10 = 0; i10 < listK.size(); i10++) {
            if (TextUtils.equals(charSequence, listK.get(i10).c())) {
                return listK.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f111995V;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listK.size(); i14++) {
                z10 &= listK.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    @e.S(expression = "view.hasOnClickListeners()")
    @Deprecated
    public static boolean N0(@NonNull View view) {
        return view.hasOnClickListeners();
    }

    public static void N1(@NonNull View view, @Nullable Z0.a aVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.i(view, aVar);
        }
    }

    public static f<CharSequence> N2() {
        return new c(C5809a.e.f240776n0, CharSequence.class, 64, 30);
    }

    @Nullable
    public static ColorStateList O(@NonNull View view) {
        return h.g(view);
    }

    @e.S(expression = "view.hasOverlappingRendering()")
    @Deprecated
    public static boolean O0(@NonNull View view) {
        return view.hasOverlappingRendering();
    }

    @e.S(expression = "view.setBackground(background)")
    @Deprecated
    public static void O1(@NonNull View view, @Nullable Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void O2(@NonNull View view) {
        h.z(view);
    }

    @Nullable
    public static PorterDuff.Mode P(@NonNull View view) {
        return h.h(view);
    }

    @e.S(expression = "view.hasTransientState()")
    @Deprecated
    public static boolean P0(@NonNull View view) {
        return view.hasTransientState();
    }

    public static void P1(@NonNull View view, @Nullable ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void P2(@NonNull View view, int i10) {
        if (view instanceof W) {
            ((W) view).stopNestedScroll(i10);
        } else if (i10 == 0) {
            h.z(view);
        }
    }

    @Nullable
    @e.S(expression = "view.getClipBounds()")
    @Deprecated
    public static Rect Q(@NonNull View view) {
        return view.getClipBounds();
    }

    @e.e0
    public static boolean Q0(@NonNull View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    public static void Q1(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static void Q2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @Nullable
    public static C1420a R(@NonNull View view) {
        ContentCaptureSession contentCaptureSessionB;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionB = m.b(view)) == null) {
            return null;
        }
        return new C1420a(contentCaptureSessionB, view);
    }

    @e.S(expression = "view.isAttachedToWindow()")
    @Deprecated
    public static boolean R0(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void R1(ViewGroup viewGroup, boolean z10) {
        if (f111991R == null) {
            try {
                f111991R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e10) {
                Log.e(f111998a, "Unable to find childrenDrawingOrderEnabled", e10);
            }
            f111991R.setAccessible(true);
        }
        try {
            f111991R.invoke(viewGroup, Boolean.valueOf(z10));
        } catch (IllegalAccessException e11) {
            Log.e(f111998a, "Unable to invoke childrenDrawingOrderEnabled", e11);
        } catch (IllegalArgumentException e12) {
            Log.e(f111998a, "Unable to invoke childrenDrawingOrderEnabled", e12);
        } catch (InvocationTargetException e13) {
            Log.e(f111998a, "Unable to invoke childrenDrawingOrderEnabled", e13);
        }
    }

    public static void R2(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.f(view, dragShadowBuilder);
        }
    }

    @Nullable
    @e.S(expression = "view.getDisplay()")
    @Deprecated
    public static Display S(@NonNull View view) {
        return view.getDisplay();
    }

    public static boolean S0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.f(view);
        }
        return false;
    }

    @e.S(expression = "view.setClipBounds(clipBounds)")
    @Deprecated
    public static void S1(@NonNull View view, @Nullable Rect rect) {
        view.setClipBounds(rect);
    }

    public static float T(@NonNull View view) {
        return h.i(view);
    }

    public static boolean T0(@NonNull View view) {
        return h.o(view);
    }

    public static void T1(@NonNull View view, @Nullable C1420a c1420a) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.e(view, c1420a);
        }
    }

    public static Rect U() {
        if (f111994U == null) {
            f111994U = new ThreadLocal<>();
        }
        Rect rect = f111994U.get();
        if (rect == null) {
            rect = new Rect();
            f111994U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean U0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.g(view);
        }
        return true;
    }

    public static void U1(@NonNull View view, float f10) {
        h.s(view, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC2456g0 V(@NonNull View view) {
        return view instanceof InterfaceC2456g0 ? (InterfaceC2456g0) view : f111996W;
    }

    public static boolean V0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.d(view);
        }
        return false;
    }

    @e.S(expression = "view.setFitsSystemWindows(fitSystemWindows)")
    @Deprecated
    public static void V1(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @e.S(expression = "view.getFitsSystemWindows()")
    @Deprecated
    public static boolean W(@NonNull View view) {
        return view.getFitsSystemWindows();
    }

    @e.S(expression = "view.isInLayout()")
    @Deprecated
    public static boolean W0(@NonNull View view) {
        return view.isInLayout();
    }

    public static void W1(@NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.l(view, z10);
        }
    }

    @e.S(expression = "view.getImportantForAccessibility()")
    @Deprecated
    public static int X(@NonNull View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean X0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.h(view);
        }
        return false;
    }

    @e.S(expression = "view.setHasTransientState(hasTransientState)")
    @Deprecated
    public static void X1(@NonNull View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    @SuppressLint({"InlinedApi"})
    public static int Y(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return 0;
    }

    @e.S(expression = "view.isLaidOut()")
    @Deprecated
    public static boolean Y0(@NonNull View view) {
        return view.isLaidOut();
    }

    @e.e0
    @e.S(expression = "view.setImportantForAccessibility(mode)")
    @Deprecated
    public static void Y1(@NonNull View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static int Z(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.a(view);
        }
        return 0;
    }

    @e.S(expression = "view.isLayoutDirectionResolved()")
    @Deprecated
    public static boolean Z0(@NonNull View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void Z1(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static /* synthetic */ ContentInfoCompat a(ContentInfoCompat contentInfoCompat) {
        return contentInfoCompat;
    }

    @e.S(expression = "view.getLabelFor()")
    @Deprecated
    public static int a0(@NonNull View view) {
        return view.getLabelFor();
    }

    public static boolean a1(@NonNull View view) {
        return h.p(view);
    }

    public static void a2(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, i10);
        }
    }

    public static f<Boolean> b() {
        return new d(C5809a.e.f240764h0, Boolean.class, 0, 28);
    }

    @e.S(expression = "view.getLayerType()")
    @Deprecated
    public static int b0(View view) {
        return view.getLayerType();
    }

    @e.S(expression = "view.isOpaque()")
    @Deprecated
    public static boolean b1(View view) {
        return view.isOpaque();
    }

    public static void b2(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            n.e(view, i10);
        }
    }

    public static int c(@NonNull View view, @NonNull CharSequence charSequence, @NonNull androidx.core.view.accessibility.a aVar) {
        int iN = N(view, charSequence);
        if (iN != -1) {
            d(view, new AccessibilityNodeInfoCompat.a(iN, charSequence, aVar));
        }
        return iN;
    }

    @e.S(expression = "view.getLayoutDirection()")
    @Deprecated
    public static int c0(@NonNull View view) {
        return view.getLayoutDirection();
    }

    @e.S(expression = "view.isPaddingRelative()")
    @Deprecated
    public static boolean c1(@NonNull View view) {
        return view.isPaddingRelative();
    }

    public static void c2(@NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.n(view, z10);
        }
    }

    public static void d(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.a aVar) {
        C(view);
        x1(aVar.b(), view);
        K(view).add(aVar);
        g1(view, 0);
    }

    @Nullable
    @e.S(expression = "view.getMatrix()")
    @Deprecated
    public static Matrix d0(View view) {
        return view.getMatrix();
    }

    @e.e0
    public static boolean d1(@NonNull View view) {
        Boolean boolE = F1().e(view);
        return boolE != null && boolE.booleanValue();
    }

    @e.S(expression = "view.setLabelFor(labeledId)")
    @Deprecated
    public static void d2(@NonNull View view, @e.C int i10) {
        view.setLabelFor(i10);
    }

    public static void e(@NonNull View view, @NonNull Collection<View> collection, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.a(view, collection, i10);
        }
    }

    @e.S(expression = "view.getMeasuredHeightAndState()")
    @Deprecated
    public static int e0(View view) {
        return view.getMeasuredHeightAndState();
    }

    @e.S(expression = "view.jumpDrawablesToCurrentState()")
    @Deprecated
    public static void e1(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @e.S(expression = "view.setLayerPaint(paint)")
    @Deprecated
    public static void e2(@NonNull View view, @Nullable Paint paint) {
        view.setLayerPaint(paint);
    }

    public static void f(@NonNull View view, @NonNull u uVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.a(view, uVar);
            return;
        }
        int i10 = C5809a.e.f240782q0;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i10, arrayList);
        }
        arrayList.add(uVar);
        if (arrayList.size() == 1) {
            x.h(view);
        }
    }

    @e.S(expression = "view.getMeasuredState()")
    @Deprecated
    public static int f0(View view) {
        return view.getMeasuredState();
    }

    @Nullable
    public static View f1(@NonNull View view, @Nullable View view2, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.i(view, view2, i10);
        }
        return null;
    }

    @e.S(expression = "view.setLayerType(layerType, paint)")
    @Deprecated
    public static void f2(View view, int i10, Paint paint) {
        view.setLayerType(i10, paint);
    }

    @NonNull
    @Deprecated
    public static I0 g(@NonNull View view) {
        if (f111990Q == null) {
            f111990Q = new WeakHashMap<>();
        }
        I0 i02 = f111990Q.get(view);
        if (i02 != null) {
            return i02;
        }
        I0 i03 = new I0(view);
        f111990Q.put(view, i03);
        return i03;
    }

    @e.S(expression = "view.getMeasuredWidthAndState()")
    @Deprecated
    public static int g0(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static void g1(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = J(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(J(view));
                    Z1(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e(f111998a, view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(J(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    @e.S(expression = "view.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void g2(@NonNull View view, int i10) {
        view.setLayoutDirection(i10);
    }

    public static void h() {
        try {
            f111986M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            f111987N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException e10) {
            Log.e(f111998a, "Couldn't find method", e10);
        }
        f111988O = true;
    }

    @e.S(expression = "view.getMinimumHeight()")
    @Deprecated
    public static int h0(@NonNull View view) {
        return view.getMinimumHeight();
    }

    public static void h1(@NonNull View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void h2(@NonNull View view, boolean z10) {
        h.t(view, z10);
    }

    @e.S(expression = "view.canScrollHorizontally(direction)")
    @Deprecated
    public static boolean i(View view, int i10) {
        return view.canScrollHorizontally(i10);
    }

    @e.S(expression = "view.getMinimumWidth()")
    @Deprecated
    public static int i0(@NonNull View view) {
        return view.getMinimumWidth();
    }

    public static void i1(@NonNull View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static void i2(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.o(view, i10);
        }
    }

    @e.S(expression = "view.canScrollVertically(direction)")
    @Deprecated
    public static boolean j(View view, int i10) {
        return view.canScrollVertically(i10);
    }

    public static int j0(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.d(view);
        }
        return -1;
    }

    @NonNull
    public static WindowInsetsCompat j1(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsJ = windowInsetsCompat.J();
        if (windowInsetsJ != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsJ);
            if (!windowInsetsB.equals(windowInsetsJ)) {
                return WindowInsetsCompat.L(windowInsetsB, view);
            }
        }
        return windowInsetsCompat;
    }

    public static void j2(@NonNull View view, @Nullable InterfaceC2450e0 interfaceC2450e0) {
        h.u(view, interfaceC2450e0);
    }

    public static void k(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.a(view);
        }
    }

    @Nullable
    public static String[] k0(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(C5809a.e.f240772l0);
    }

    @e.S(expression = "v.onInitializeAccessibilityEvent(event)")
    @Deprecated
    public static void k1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void k2(@NonNull View view, @Nullable String[] strArr, @Nullable InterfaceC2453f0 interfaceC2453f0) {
        if (Build.VERSION.SDK_INT >= 31) {
            o.c(view, strArr, interfaceC2453f0);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z10 = false;
        if (interfaceC2453f0 != null) {
            androidx.core.util.t.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (strArr[i10].startsWith("*")) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            androidx.core.util.t.b(!z10, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(C5809a.e.f240772l0, strArr);
        view.setTag(C5809a.e.f240770k0, interfaceC2453f0);
    }

    @Deprecated
    public static int l(int i10, int i11) {
        return View.combineMeasuredStates(i10, i11);
    }

    @e.S(expression = "view.getOverScrollMode()")
    @Deprecated
    public static int l0(View view) {
        return view.getOverScrollMode();
    }

    @e.S(expression = "v.onInitializeAccessibilityNodeInfo(info.unwrap())")
    @Deprecated
    public static void l1(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat.q2());
    }

    @e.S(expression = "view.setOverScrollMode(overScrollMode)")
    @Deprecated
    public static void l2(View view, int i10) {
        view.setOverScrollMode(i10);
    }

    public static void m(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            Q2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                Q2((View) parent);
            }
        }
    }

    @e.P
    @e.S(expression = "view.getPaddingEnd()")
    @Deprecated
    public static int m0(@NonNull View view) {
        return view.getPaddingEnd();
    }

    @e.S(expression = "v.onPopulateAccessibilityEvent(event)")
    @Deprecated
    public static void m1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @e.S(expression = "view.setPaddingRelative(start, top, end, bottom)")
    @Deprecated
    public static void m2(@NonNull View view, @e.P int i10, @e.P int i11, @e.P int i12, @e.P int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static void n(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            Q2(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                Q2((View) parent);
            }
        }
    }

    @e.P
    @e.S(expression = "view.getPaddingStart()")
    @Deprecated
    public static int n0(@NonNull View view) {
        return view.getPaddingStart();
    }

    public static f<CharSequence> n1() {
        return new b(C5809a.e.f240766i0, CharSequence.class, 8, 28);
    }

    @e.S(expression = "view.setPivotX(value)")
    @Deprecated
    public static void n2(View view, float f10) {
        view.setPivotX(f10);
    }

    @NonNull
    public static WindowInsetsCompat o(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
        return h.b(view, windowInsetsCompat, rect);
    }

    @Nullable
    @e.S(expression = "view.getParentForAccessibility()")
    @Deprecated
    public static ViewParent o0(@NonNull View view) {
        return view.getParentForAccessibility();
    }

    @e.S(expression = "view.performAccessibilityAction(action, arguments)")
    @Deprecated
    public static boolean o1(@NonNull View view, int i10, @Nullable Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    @e.S(expression = "view.setPivotY(value)")
    @Deprecated
    public static void o2(View view, float f10) {
        view.setPivotY(f10);
    }

    @NonNull
    public static WindowInsetsCompat p(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsJ = windowInsetsCompat.J();
        if (windowInsetsJ != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsJ);
            if (!windowInsetsA.equals(windowInsetsJ)) {
                return WindowInsetsCompat.L(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    @e.S(expression = "view.getPivotX()")
    @Deprecated
    public static float p0(View view) {
        return view.getPivotX();
    }

    public static boolean p1(@NonNull View view, int i10) {
        int iA = F.a(i10);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA);
    }

    public static void p2(@NonNull View view, @Nullable C2462i0 c2462i0) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.d(view, C2503x0.a(c2462i0 != null ? c2462i0.f111936a : null));
        }
    }

    public static void q(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.b(view);
            return;
        }
        if (!f111988O) {
            h();
        }
        Method method = f111987N;
        if (method == null) {
            view.onFinishTemporaryDetach();
            return;
        }
        try {
            method.invoke(view, null);
        } catch (Exception e10) {
            Log.d(f111998a, "Error calling dispatchFinishTemporaryDetach", e10);
        }
    }

    @e.S(expression = "view.getPivotY()")
    @Deprecated
    public static float q0(View view) {
        return view.getPivotY();
    }

    public static boolean q1(@NonNull View view, int i10, int i11) {
        int iA = F.a(i10);
        if (iA == -1) {
            return false;
        }
        return view.performHapticFeedback(iA, i11);
    }

    @e.S(expression = "view.setRotation(value)")
    @Deprecated
    public static void q2(View view, float f10) {
        view.setRotation(f10);
    }

    public static boolean r(@NonNull View view, float f10, float f11, boolean z10) {
        return h.c(view, f10, f11, z10);
    }

    @Nullable
    public static WindowInsetsCompat r0(@NonNull View view) {
        return i.a(view);
    }

    @Nullable
    public static ContentInfoCompat r1(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable(f111998a, 3)) {
            Log.d(f111998a, "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, contentInfoCompat);
        }
        InterfaceC2453f0 interfaceC2453f0 = (InterfaceC2453f0) view.getTag(C5809a.e.f240770k0);
        if (interfaceC2453f0 == null) {
            return V(view).onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatA = interfaceC2453f0.a(view, contentInfoCompat);
        if (contentInfoCompatA == null) {
            return null;
        }
        return V(view).onReceiveContent(contentInfoCompatA);
    }

    @e.S(expression = "view.setRotationX(value)")
    @Deprecated
    public static void r2(View view, float f10) {
        view.setRotationX(f10);
    }

    public static boolean s(@NonNull View view, float f10, float f11) {
        return h.d(view, f10, f11);
    }

    @e.S(expression = "view.getRotation()")
    @Deprecated
    public static float s0(View view) {
        return view.getRotation();
    }

    @e.S(expression = "view.postInvalidateOnAnimation()")
    @Deprecated
    public static void s1(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    @e.S(expression = "view.setRotationY(value)")
    @Deprecated
    public static void s2(View view, float f10) {
        view.setRotationY(f10);
    }

    public static boolean t(@NonNull View view, int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return h.e(view, i10, i11, iArr, iArr2);
    }

    @e.S(expression = "view.getRotationX()")
    @Deprecated
    public static float t0(View view) {
        return view.getRotationX();
    }

    @e.S(expression = "view.postInvalidateOnAnimation(left, top, right, bottom)")
    @Deprecated
    public static void t1(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.postInvalidateOnAnimation(i10, i11, i12, i13);
    }

    @e.S(expression = "view.setSaveFromParentEnabled(enabled)")
    @Deprecated
    public static void t2(View view, boolean z10) {
        view.setSaveFromParentEnabled(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean u(@NonNull View view, int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2, int i12) {
        if (view instanceof W) {
            return ((W) view).dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
        }
        if (i12 == 0) {
            return h.e(view, i10, i11, iArr, iArr2);
        }
        return false;
    }

    @e.S(expression = "view.getRotationY()")
    @Deprecated
    public static float u0(View view) {
        return view.getRotationY();
    }

    @e.S(expression = "view.postOnAnimation(action)")
    @Deprecated
    public static void u1(@NonNull View view, @NonNull Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @e.S(expression = "view.setScaleX(value)")
    @Deprecated
    public static void u2(View view, float f10) {
        view.setScaleX(f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, @NonNull int[] iArr2) {
        if (view instanceof X) {
            ((X) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
        } else {
            x(view, i10, i11, i12, i13, iArr, i14);
        }
    }

    @e.S(expression = "view.getScaleX()")
    @Deprecated
    public static float v0(View view) {
        return view.getScaleX();
    }

    @SuppressLint({"LambdaLast"})
    @e.S(expression = "view.postOnAnimationDelayed(action, delayMillis)")
    @Deprecated
    public static void v1(@NonNull View view, @NonNull Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    @e.S(expression = "view.setScaleY(value)")
    @Deprecated
    public static void v2(View view, float f10) {
        view.setScaleY(f10);
    }

    public static boolean w(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr) {
        return h.f(view, i10, i11, i12, i13, iArr);
    }

    @e.S(expression = "view.getScaleY()")
    @Deprecated
    public static float w0(View view) {
        return view.getScaleY();
    }

    public static void w1(@NonNull View view, int i10) {
        x1(i10, view);
        g1(view, 0);
    }

    @e.e0
    public static void w2(@NonNull View view, boolean z10) {
        F1().f(view, Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean x(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14) {
        if (view instanceof W) {
            return ((W) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
        }
        if (i14 == 0) {
            return h.f(view, i10, i11, i12, i13, iArr);
        }
        return false;
    }

    public static int x0(@NonNull View view) {
        return i.b(view);
    }

    public static void x1(int i10, View view) {
        List<AccessibilityNodeInfoCompat.a> listK = K(view);
        for (int i11 = 0; i11 < listK.size(); i11++) {
            if (listK.get(i11).b() == i10) {
                listK.remove(i11);
                return;
            }
        }
    }

    public static void x2(@NonNull View view, int i10) {
        i.c(view, i10);
    }

    public static void y(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.c(view);
            return;
        }
        if (!f111988O) {
            h();
        }
        Method method = f111986M;
        if (method == null) {
            view.onStartTemporaryDetach();
            return;
        }
        try {
            method.invoke(view, null);
        } catch (Exception e10) {
            Log.d(f111998a, "Error calling dispatchStartTemporaryDetach", e10);
        }
    }

    @Nullable
    @e.e0
    public static CharSequence y0(@NonNull View view) {
        return N2().e(view);
    }

    public static void y1(@NonNull View view, @NonNull u uVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.e(view, uVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C5809a.e.f240782q0);
        if (arrayList != null) {
            arrayList.remove(uVar);
            if (arrayList.size() == 0) {
                x.i(view);
            }
        }
    }

    public static void y2(@NonNull View view, int i10, int i11) {
        i.d(view, i10, i11);
    }

    @e.e0
    public static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return x.a(view).b(view, keyEvent);
    }

    @NonNull
    public static List<Rect> z0(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.c(view) : Collections.EMPTY_LIST;
    }

    public static void z1(@NonNull View view, @NonNull AccessibilityNodeInfoCompat.a aVar, @Nullable CharSequence charSequence, @Nullable androidx.core.view.accessibility.a aVar2) {
        if (aVar2 == null && charSequence == null) {
            w1(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, aVar2));
        }
    }

    @e.e0
    public static void z2(@NonNull View view, @Nullable CharSequence charSequence) {
        N2().f(view, charSequence);
    }
}
