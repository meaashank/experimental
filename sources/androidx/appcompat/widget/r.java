package androidx.appcompat.widget;

import D0.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import b1.C2776c;
import e.InterfaceC4345t;
import g.C4426a;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f86414n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f86415o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f86416p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f86417q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f86418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U f86419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public U f86420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U f86421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U f86422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U f86423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public U f86424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U f86425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final C1512s f86426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86427j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f86428k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f86429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f86430m;

    public class a extends i.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f86431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f86432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f86433c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f86431a = i10;
            this.f86432b = i11;
            this.f86433c = weakReference;
        }

        @Override // D0.i.f
        public void onFontRetrievalFailed(int i10) {
        }

        @Override // D0.i.f
        public void onFontRetrieved(@NonNull Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f86431a) != -1) {
                typeface = g.a(typeface, i10, (this.f86432b & 2) != 0);
            }
            r.this.n(this.f86433c, typeface);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f86435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f86436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f86437c;

        public b(TextView textView, Typeface typeface, int i10) {
            this.f86435a = textView;
            this.f86436b = typeface;
            this.f86437c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f86435a.setTypeface(this.f86436b, this.f86437c);
        }
    }

    @e.T(17)
    public static class c {
        @InterfaceC4345t
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @InterfaceC4345t
        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @InterfaceC4345t
        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @e.T(21)
    public static class d {
        @InterfaceC4345t
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @e.T(24)
    public static class e {
        @InterfaceC4345t
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @InterfaceC4345t
        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @e.T(26)
    public static class f {
        @InterfaceC4345t
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @InterfaceC4345t
        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @InterfaceC4345t
        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @InterfaceC4345t
        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @e.T(28)
    public static class g {
        @InterfaceC4345t
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public r(@NonNull TextView textView) {
        this.f86418a = textView;
        this.f86426i = new C1512s(textView);
    }

    public static U d(Context context, C1502h c1502h, int i10) {
        ColorStateList colorStateListF = c1502h.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        U u10 = new U();
        u10.f86241d = true;
        u10.f86238a = colorStateListF;
        return u10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void A(int i10, float f10) {
        if (h0.f86390c || l()) {
            return;
        }
        B(i10, f10);
    }

    public final void B(int i10, float f10) {
        this.f86426i.w(i10, f10);
    }

    public final void C(Context context, W w10) {
        String strW;
        this.f86427j = w10.o(C4426a.m.f201984d6, this.f86427j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iO = w10.o(C4426a.m.f202063m6, -1);
            this.f86428k = iO;
            if (iO != -1) {
                this.f86427j &= 2;
            }
        }
        int i11 = C4426a.m.f202055l6;
        if (!w10.C(i11) && !w10.C(C4426a.m.f202071n6)) {
            int i12 = C4426a.m.f201975c6;
            if (w10.C(i12)) {
                this.f86430m = false;
                int iO2 = w10.o(i12, 1);
                if (iO2 == 1) {
                    this.f86429l = Typeface.SANS_SERIF;
                    return;
                } else if (iO2 == 2) {
                    this.f86429l = Typeface.SERIF;
                    return;
                } else {
                    if (iO2 != 3) {
                        return;
                    }
                    this.f86429l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f86429l = null;
        int i13 = C4426a.m.f202071n6;
        if (w10.C(i13)) {
            i11 = i13;
        }
        int i14 = this.f86428k;
        int i15 = this.f86427j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceK = w10.k(i11, this.f86427j, new a(i14, i15, new WeakReference(this.f86418a)));
                if (typefaceK != null) {
                    if (i10 < 28 || this.f86428k == -1) {
                        this.f86429l = typefaceK;
                    } else {
                        this.f86429l = g.a(Typeface.create(typefaceK, 0), this.f86428k, (this.f86427j & 2) != 0);
                    }
                }
                this.f86430m = this.f86429l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f86429l != null || (strW = w10.w(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f86428k == -1) {
            this.f86429l = Typeface.create(strW, this.f86427j);
        } else {
            this.f86429l = g.a(Typeface.create(strW, 0), this.f86428k, (this.f86427j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, U u10) {
        if (drawable == null || u10 == null) {
            return;
        }
        C1502h.j(drawable, u10, this.f86418a.getDrawableState());
    }

    public void b() {
        if (this.f86419b != null || this.f86420c != null || this.f86421d != null || this.f86422e != null) {
            Drawable[] compoundDrawables = this.f86418a.getCompoundDrawables();
            a(compoundDrawables[0], this.f86419b);
            a(compoundDrawables[1], this.f86420c);
            a(compoundDrawables[2], this.f86421d);
            a(compoundDrawables[3], this.f86422e);
        }
        if (this.f86423f == null && this.f86424g == null) {
            return;
        }
        Drawable[] drawableArrA = c.a(this.f86418a);
        a(drawableArrA[0], this.f86423f);
        a(drawableArrA[2], this.f86424g);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void c() {
        this.f86426i.b();
    }

    public int e() {
        return this.f86426i.h();
    }

    public int f() {
        return this.f86426i.i();
    }

    public int g() {
        return this.f86426i.j();
    }

    public int[] h() {
        return this.f86426i.k();
    }

    public int i() {
        return this.f86426i.l();
    }

    @Nullable
    public ColorStateList j() {
        U u10 = this.f86425h;
        if (u10 != null) {
            return u10.f86238a;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode k() {
        U u10 = this.f86425h;
        if (u10 != null) {
            return u10.f86239b;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean l() {
        return this.f86426i.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(@androidx.annotation.Nullable android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f86430m) {
            this.f86429l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C2507z0.R0(textView)) {
                    textView.post(new b(textView, typeface, this.f86427j));
                } else {
                    textView.setTypeface(typeface, this.f86427j);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (h0.f86390c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String string;
        W wE = W.E(context, i10, C4426a.m.f201957a6);
        int i11 = C4426a.m.f202087p6;
        if (wE.f86249b.hasValue(i11)) {
            s(wE.f86249b.getBoolean(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = C4426a.m.f201966b6;
        if (wE.f86249b.hasValue(i13) && wE.f86249b.getDimensionPixelSize(i13, -1) == 0) {
            this.f86418a.setTextSize(0, 0.0f);
        }
        C(context, wE);
        if (i12 >= 26) {
            int i14 = C4426a.m.f202079o6;
            if (wE.f86249b.hasValue(i14) && (string = wE.f86249b.getString(i14)) != null) {
                f.d(this.f86418a, string);
            }
        }
        wE.I();
        Typeface typeface = this.f86429l;
        if (typeface != null) {
            this.f86418a.setTypeface(typeface, this.f86427j);
        }
    }

    public void r(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C2776c.k(editorInfo, textView.getText());
    }

    public void s(boolean z10) {
        this.f86418a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f86426i.s(i10, i11, i12, i13);
    }

    public void u(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        this.f86426i.t(iArr, i10);
    }

    public void v(int i10) {
        this.f86426i.u(i10);
    }

    public void w(@Nullable ColorStateList colorStateList) {
        if (this.f86425h == null) {
            this.f86425h = new U();
        }
        U u10 = this.f86425h;
        u10.f86238a = colorStateList;
        u10.f86241d = colorStateList != null;
        z();
    }

    public void x(@Nullable PorterDuff.Mode mode) {
        if (this.f86425h == null) {
            this.f86425h = new U();
        }
        U u10 = this.f86425h;
        u10.f86239b = mode;
        u10.f86240c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] drawableArrA = c.a(this.f86418a);
            TextView textView = this.f86418a;
            if (drawable5 == null) {
                drawable5 = drawableArrA[0];
            }
            if (drawable2 == null) {
                drawable2 = drawableArrA[1];
            }
            if (drawable6 == null) {
                drawable6 = drawableArrA[2];
            }
            if (drawable4 == null) {
                drawable4 = drawableArrA[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] drawableArrA2 = c.a(this.f86418a);
        Drawable drawable7 = drawableArrA2[0];
        if (drawable7 != null || drawableArrA2[2] != null) {
            TextView textView2 = this.f86418a;
            if (drawable2 == null) {
                drawable2 = drawableArrA2[1];
            }
            Drawable drawable8 = drawableArrA2[2];
            if (drawable4 == null) {
                drawable4 = drawableArrA2[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f86418a.getCompoundDrawables();
        TextView textView3 = this.f86418a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        U u10 = this.f86425h;
        this.f86419b = u10;
        this.f86420c = u10;
        this.f86421d = u10;
        this.f86422e = u10;
        this.f86423f = u10;
        this.f86424g = u10;
    }
}
