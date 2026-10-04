package j5;

import B0.C0920d;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import e.C;
import e.InterfaceC4337k;
import e.InterfaceC4339m;
import e.InterfaceC4342p;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f214056A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f214057B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f214058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final CharSequence f214059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f214060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f214061d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Rect f214062e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f214063f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Typeface f214064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Typeface f214065h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @InterfaceC4339m
    public int f214066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @InterfaceC4339m
    public int f214067j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @InterfaceC4339m
    public int f214068k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @InterfaceC4339m
    public int f214069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @InterfaceC4339m
    public int f214070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Integer f214071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f214072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f214073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Integer f214074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Integer f214075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @InterfaceC4342p
    public int f214076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @InterfaceC4342p
    public int f214077t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f214078u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f214079v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f214080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f214081x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f214082y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f214083z;

    public e(Rect rect, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        this(charSequence, charSequence2);
        if (rect == null) {
            throw new IllegalArgumentException("Cannot pass null bounds or title");
        }
        this.f214062e = rect;
    }

    public static e A(Toolbar toolbar, CharSequence charSequence) {
        return B(toolbar, charSequence, null);
    }

    public static e B(Toolbar toolbar, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return new h(toolbar, false, charSequence, charSequence2);
    }

    public static e C(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence) {
        return D(toolbar, charSequence, null);
    }

    public static e D(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return new h(toolbar, false, charSequence, charSequence2);
    }

    public static e E(View view, CharSequence charSequence) {
        return new j(view, charSequence, null);
    }

    public static e F(View view, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return new j(view, charSequence, charSequence2);
    }

    public static e q(Rect rect, CharSequence charSequence) {
        return new e(rect, charSequence, null);
    }

    public static e r(Rect rect, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return new e(rect, charSequence, charSequence2);
    }

    public static e s(Toolbar toolbar, @C int i10, CharSequence charSequence) {
        return new h(toolbar, i10, charSequence, (CharSequence) null);
    }

    public static e t(Toolbar toolbar, @C int i10, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return new h(toolbar, i10, charSequence, charSequence2);
    }

    public static e u(androidx.appcompat.widget.Toolbar toolbar, @C int i10, CharSequence charSequence) {
        return new h(toolbar, i10, charSequence, (CharSequence) null);
    }

    public static e v(androidx.appcompat.widget.Toolbar toolbar, @C int i10, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return new h(toolbar, i10, charSequence, charSequence2);
    }

    public static e w(Toolbar toolbar, CharSequence charSequence) {
        return x(toolbar, charSequence, null);
    }

    public static e x(Toolbar toolbar, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return new h(toolbar, true, charSequence, charSequence2);
    }

    public static e y(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence) {
        return z(toolbar, charSequence, null);
    }

    public static e z(androidx.appcompat.widget.Toolbar toolbar, CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return new h(toolbar, true, charSequence, charSequence2);
    }

    public e G(Drawable drawable) {
        return H(drawable, false);
    }

    public e H(Drawable drawable, boolean z10) {
        if (drawable == null) {
            throw new IllegalArgumentException("Cannot use null drawable");
        }
        this.f214063f = drawable;
        if (!z10) {
            drawable.setBounds(new Rect(0, 0, this.f214063f.getIntrinsicWidth(), this.f214063f.getIntrinsicHeight()));
        }
        return this;
    }

    public int I() {
        return this.f214080w;
    }

    public e J(int i10) {
        this.f214080w = i10;
        return this;
    }

    public void K(Runnable runnable) {
        runnable.run();
    }

    public e L(float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.f214060c = f10;
            return this;
        }
        throw new IllegalArgumentException("Given an invalid alpha value: " + f10);
    }

    public e M(@InterfaceC4339m int i10) {
        this.f214066i = i10;
        return this;
    }

    public e N(@InterfaceC4337k int i10) {
        this.f214071n = Integer.valueOf(i10);
        return this;
    }

    @Nullable
    public Integer O(Context context) {
        return c(context, this.f214071n, this.f214066i);
    }

    public e P(@InterfaceC4339m int i10) {
        this.f214067j = i10;
        return this;
    }

    public e Q(@InterfaceC4337k int i10) {
        this.f214072o = Integer.valueOf(i10);
        return this;
    }

    @Nullable
    public Integer R(Context context) {
        return c(context, this.f214072o, this.f214067j);
    }

    public e S(int i10) {
        this.f214061d = i10;
        return this;
    }

    public e T(@InterfaceC4339m int i10) {
        this.f214069l = i10;
        this.f214070m = i10;
        return this;
    }

    public e U(@InterfaceC4337k int i10) {
        this.f214074q = Integer.valueOf(i10);
        this.f214075r = Integer.valueOf(i10);
        return this;
    }

    public e V(Typeface typeface) {
        if (typeface == null) {
            throw new IllegalArgumentException("Cannot use a null typeface");
        }
        this.f214064g = typeface;
        this.f214065h = typeface;
        return this;
    }

    public e W(boolean z10) {
        this.f214083z = z10;
        return this;
    }

    public e X(@InterfaceC4339m int i10) {
        this.f214069l = i10;
        return this;
    }

    public e Y(@InterfaceC4337k int i10) {
        this.f214074q = Integer.valueOf(i10);
        return this;
    }

    @Nullable
    public Integer Z(Context context) {
        return c(context, this.f214074q, this.f214069l);
    }

    public Rect a() {
        Rect rect = this.f214062e;
        if (rect != null) {
            return rect;
        }
        throw new IllegalStateException("Requesting bounds that are not set! Make sure your target is ready");
    }

    public e a0(@InterfaceC4342p int i10) {
        this.f214076s = i10;
        return this;
    }

    public e b(boolean z10) {
        this.f214082y = z10;
        return this;
    }

    public e b0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Given negative text size");
        }
        this.f214078u = i10;
        return this;
    }

    @Nullable
    public final Integer c(Context context, @Nullable Integer num, @InterfaceC4339m int i10) {
        return i10 != -1 ? Integer.valueOf(C0920d.getColor(context, i10)) : num;
    }

    public int c0(Context context) {
        return o(context, this.f214078u, this.f214076s);
    }

    public e d(float f10) {
        if (f10 >= 0.0f && f10 <= 1.0f) {
            this.f214057B = f10;
            return this;
        }
        throw new IllegalArgumentException("Given an invalid alpha value: " + f10);
    }

    public e d0(Typeface typeface) {
        if (typeface == null) {
            throw new IllegalArgumentException("Cannot use a null typeface");
        }
        this.f214064g = typeface;
        return this;
    }

    public e e(@InterfaceC4339m int i10) {
        this.f214070m = i10;
        return this;
    }

    public e e0(boolean z10) {
        this.f214056A = z10;
        return this;
    }

    public e f(@InterfaceC4337k int i10) {
        this.f214075r = Integer.valueOf(i10);
        return this;
    }

    @Nullable
    public Integer g(Context context) {
        return c(context, this.f214075r, this.f214070m);
    }

    public e h(@InterfaceC4342p int i10) {
        this.f214077t = i10;
        return this;
    }

    public e i(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Given negative text size");
        }
        this.f214079v = i10;
        return this;
    }

    public int j(Context context) {
        return o(context, this.f214079v, this.f214077t);
    }

    public e k(Typeface typeface) {
        if (typeface == null) {
            throw new IllegalArgumentException("Cannot use a null typeface");
        }
        this.f214065h = typeface;
        return this;
    }

    public e l(@InterfaceC4339m int i10) {
        this.f214068k = i10;
        return this;
    }

    public e m(@InterfaceC4337k int i10) {
        this.f214073p = Integer.valueOf(i10);
        return this;
    }

    @Nullable
    public Integer n(Context context) {
        return c(context, this.f214073p, this.f214068k);
    }

    public final int o(Context context, int i10, @InterfaceC4342p int i11) {
        return i11 != -1 ? context.getResources().getDimensionPixelSize(i11) : i.c(context, i10);
    }

    public e p(boolean z10) {
        this.f214081x = z10;
        return this;
    }

    public e(CharSequence charSequence, @Nullable CharSequence charSequence2) {
        this.f214060c = 0.96f;
        this.f214061d = 44;
        this.f214066i = -1;
        this.f214067j = -1;
        this.f214068k = -1;
        this.f214069l = -1;
        this.f214070m = -1;
        this.f214071n = null;
        this.f214072o = null;
        this.f214073p = null;
        this.f214074q = null;
        this.f214075r = null;
        this.f214076s = -1;
        this.f214077t = -1;
        this.f214078u = 20;
        this.f214079v = 18;
        this.f214080w = -1;
        this.f214081x = false;
        this.f214082y = true;
        this.f214083z = true;
        this.f214056A = false;
        this.f214057B = 0.54f;
        if (charSequence != null) {
            this.f214058a = charSequence;
            this.f214059b = charSequence2;
            return;
        }
        throw new IllegalArgumentException("Cannot pass null title");
    }
}
