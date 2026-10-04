package androidx.appcompat.widget;

import B0.C0920d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.C1531f0;
import androidx.collection.C1535h0;
import androidx.collection.U0;
import androidx.collection.W0;
import com.github.appintro.AppIntroBaseFragmentKt;
import e.InterfaceC4346u;
import i.C4538a;
import j.C4772a;
import j.C4773b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class J {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f85989h = "ResourceManagerInternal";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f85990i = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f85992k = "appcompat_skip_skip";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f85993l = "android.graphics.drawable.VectorDrawable";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static J f85994m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, W0<ColorStateList>> f85996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U0<String, e> f85997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public W0<String> f85998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, C1531f0<WeakReference<Drawable.ConstantState>>> f85999d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f86000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f86002g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f85991j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f85995n = new c(6);

    public static class a implements e {
        @Override // androidx.appcompat.widget.J.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return C4538a.C(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    public static class b implements e {
        @Override // androidx.appcompat.widget.J.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.c(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    public static class c extends C1535h0<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        public static int b(int i10, PorterDuff.Mode mode) {
            return mode.hashCode() + ((i10 + 31) * 31);
        }

        public PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(b(i10, mode)));
        }

        public PorterDuffColorFilter d(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(b(i10, mode)), porterDuffColorFilter);
        }
    }

    public static class d implements e {
        @Override // androidx.appcompat.widget.J.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    C4772a.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    public interface e {
        Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface f {
        @Nullable
        Drawable a(@NonNull J j10, @NonNull Context context, @InterfaceC4346u int i10);

        @Nullable
        ColorStateList b(@NonNull Context context, @InterfaceC4346u int i10);

        @Nullable
        PorterDuff.Mode c(int i10);

        boolean d(@NonNull Context context, @InterfaceC4346u int i10, @NonNull Drawable drawable);

        boolean e(@NonNull Context context, @InterfaceC4346u int i10, @NonNull Drawable drawable);
    }

    public static class g implements e {
        @Override // androidx.appcompat.widget.J.e
        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    public static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized J h() {
        try {
            if (f85994m == null) {
                J j10 = new J();
                f85994m = j10;
                p(j10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f85994m;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterC;
        c cVar = f85995n;
        porterDuffColorFilterC = cVar.c(i10, mode);
        if (porterDuffColorFilterC == null) {
            porterDuffColorFilterC = new PorterDuffColorFilter(i10, mode);
            cVar.d(i10, mode, porterDuffColorFilterC);
        }
        return porterDuffColorFilterC;
    }

    public static void p(@NonNull J j10) {
        if (Build.VERSION.SDK_INT < 24) {
            j10.a(androidx.vectordrawable.graphics.drawable.i.f119716p, new g());
            j10.a(androidx.vectordrawable.graphics.drawable.c.f119676j, new b());
            j10.a("animated-selector", new a());
            j10.a(AppIntroBaseFragmentKt.ARG_DRAWABLE, new d());
        }
    }

    public static boolean q(@NonNull Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || f85993l.equals(drawable.getClass().getName());
    }

    public static void w(Drawable drawable, U u10, int[] iArr) {
        int[] state = drawable.getState();
        B.a(drawable);
        if (drawable.mutate() != drawable) {
            Log.d(f85989h, "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = u10.f86241d;
        if (z10 || u10.f86240c) {
            drawable.setColorFilter(g(z10 ? u10.f86238a : null, u10.f86240c ? u10.f86239b : f85991j, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final void a(@NonNull String str, @NonNull e eVar) {
        if (this.f85997b == null) {
            this.f85997b = new U0<>();
        }
        this.f85997b.put(str, eVar);
    }

    public final synchronized boolean b(@NonNull Context context, long j10, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C1531f0<WeakReference<Drawable.ConstantState>> c1531f0 = this.f85999d.get(context);
            if (c1531f0 == null) {
                c1531f0 = new C1531f0<>();
                this.f85999d.put(context, c1531f0);
            }
            c1531f0.m(j10, new WeakReference<>(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(@NonNull Context context, @InterfaceC4346u int i10, @NonNull ColorStateList colorStateList) {
        if (this.f85996a == null) {
            this.f85996a = new WeakHashMap<>();
        }
        W0<ColorStateList> w02 = this.f85996a.get(context);
        if (w02 == null) {
            w02 = new W0<>();
            this.f85996a.put(context, w02);
        }
        w02.a(i10, colorStateList);
    }

    public final void d(@NonNull Context context) {
        if (this.f86001f) {
            return;
        }
        this.f86001f = true;
        Drawable drawableJ = j(context, C4773b.a.f212438a);
        if (drawableJ == null || !q(drawableJ)) {
            this.f86001f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable f(@NonNull Context context, @InterfaceC4346u int i10) {
        if (this.f86000e == null) {
            this.f86000e = new TypedValue();
        }
        TypedValue typedValue = this.f86000e;
        context.getResources().getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        f fVar = this.f86002g;
        Drawable drawableA = fVar == null ? null : fVar.a(this, context, i10);
        if (drawableA != null) {
            drawableA.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, jE, drawableA);
        }
        return drawableA;
    }

    public final synchronized Drawable i(@NonNull Context context, long j10) {
        C1531f0<WeakReference<Drawable.ConstantState>> c1531f0 = this.f85999d.get(context);
        if (c1531f0 == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceG = c1531f0.g(j10);
        if (weakReferenceG != null) {
            Drawable.ConstantState constantState = weakReferenceG.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1531f0.q(j10);
        }
        return null;
    }

    public synchronized Drawable j(@NonNull Context context, @InterfaceC4346u int i10) {
        return k(context, i10, false);
    }

    public synchronized Drawable k(@NonNull Context context, @InterfaceC4346u int i10, boolean z10) {
        Drawable drawableR;
        try {
            d(context);
            drawableR = r(context, i10);
            if (drawableR == null) {
                drawableR = f(context, i10);
            }
            if (drawableR == null) {
                drawableR = C0920d.getDrawable(context, i10);
            }
            if (drawableR != null) {
                drawableR = v(context, i10, z10, drawableR);
            }
            if (drawableR != null) {
                B.b(drawableR);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableR;
    }

    public synchronized ColorStateList m(@NonNull Context context, @InterfaceC4346u int i10) {
        ColorStateList colorStateListN;
        colorStateListN = n(context, i10);
        if (colorStateListN == null) {
            f fVar = this.f86002g;
            colorStateListN = fVar == null ? null : fVar.b(context, i10);
            if (colorStateListN != null) {
                c(context, i10, colorStateListN);
            }
        }
        return colorStateListN;
    }

    public final ColorStateList n(@NonNull Context context, @InterfaceC4346u int i10) {
        W0<ColorStateList> w02;
        WeakHashMap<Context, W0<ColorStateList>> weakHashMap = this.f85996a;
        if (weakHashMap == null || (w02 = weakHashMap.get(context)) == null) {
            return null;
        }
        return w02.g(i10);
    }

    public PorterDuff.Mode o(int i10) {
        f fVar = this.f86002g;
        if (fVar == null) {
            return null;
        }
        return fVar.c(i10);
    }

    public final Drawable r(@NonNull Context context, @InterfaceC4346u int i10) {
        int next;
        U0<String, e> u02 = this.f85997b;
        if (u02 == null || u02.isEmpty()) {
            return null;
        }
        W0<String> w02 = this.f85998c;
        if (w02 != null) {
            String strG = w02.g(i10);
            if (f85992k.equals(strG)) {
                return null;
            }
            if (strG != null && this.f85997b.get(strG) == null) {
                return null;
            }
        } else {
            this.f85998c = new W0<>();
        }
        if (this.f86000e == null) {
            this.f86000e = new TypedValue();
        }
        TypedValue typedValue = this.f86000e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long jE = e(typedValue);
        Drawable drawableI = i(context, jE);
        if (drawableI != null) {
            return drawableI;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(C1498d.f86308y)) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f85998c.a(i10, name);
                e eVar = this.f85997b.get(name);
                if (eVar != null) {
                    drawableI = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, jE, drawableI);
                }
            } catch (Exception e10) {
                Log.e(f85989h, "Exception while inflating drawable", e10);
            }
        }
        if (drawableI == null) {
            this.f85998c.a(i10, f85992k);
        }
        return drawableI;
    }

    public synchronized void s(@NonNull Context context) {
        C1531f0<WeakReference<Drawable.ConstantState>> c1531f0 = this.f85999d.get(context);
        if (c1531f0 != null) {
            c1531f0.b();
        }
    }

    public synchronized Drawable t(@NonNull Context context, @NonNull g0 g0Var, @InterfaceC4346u int i10) {
        try {
            Drawable drawableR = r(context, i10);
            if (drawableR == null) {
                drawableR = g0Var.a(i10);
            }
            if (drawableR == null) {
                return null;
            }
            return v(context, i10, false, drawableR);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.f86002g = fVar;
    }

    public final Drawable v(@NonNull Context context, @InterfaceC4346u int i10, boolean z10, @NonNull Drawable drawable) {
        ColorStateList colorStateListM = m(context, i10);
        if (colorStateListM != null) {
            B.a(drawable);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListM);
            PorterDuff.Mode modeO = o(i10);
            if (modeO != null) {
                drawableMutate.setTintMode(modeO);
            }
            return drawableMutate;
        }
        f fVar = this.f86002g;
        if ((fVar == null || !fVar.d(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    public boolean x(@NonNull Context context, @InterfaceC4346u int i10, @NonNull Drawable drawable) {
        f fVar = this.f86002g;
        return fVar != null && fVar.e(context, i10, drawable);
    }
}
