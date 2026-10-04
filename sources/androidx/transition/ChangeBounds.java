package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C2507z0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeBounds extends Transition {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f117636d = "android:changeBounds:bounds";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f117637e = "android:changeBounds:clip";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f117638f = "android:changeBounds:parent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f117639g = "android:changeBounds:windowX";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f117640h = "android:changeBounds:windowY";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f117641i = {f117636d, f117637e, f117638f, f117639g, f117640h};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Property<Drawable, PointF> f117642j = new b(PointF.class, "boundsOrigin");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Property<k, PointF> f117643k = new c(PointF.class, "topLeft");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Property<k, PointF> f117644l = new d(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Property<View, PointF> f117645m = new e(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Property<View, PointF> f117646n = new f(PointF.class, "topLeft");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Property<View, PointF> f117647o = new g(PointF.class, W3.o.f76584m);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static r f117648p = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f117649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f117650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f117651c;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f117652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f117653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f117654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f117655d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f10) {
            this.f117652a = viewGroup;
            this.f117653b = bitmapDrawable;
            this.f117654c = view;
            this.f117655d = f10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ((L) N.b(this.f117652a)).remove(this.f117653b);
            N.h(this.f117654c, this.f117655d);
        }
    }

    public class b extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Rect f117657a;

        public b(Class cls, String str) {
            super(cls, str);
            this.f117657a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f117657a);
            Rect rect = this.f117657a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f117657a);
            this.f117657a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f117657a);
        }
    }

    public class c extends Property<k, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(k kVar) {
            return null;
        }
    }

    public class d extends Property<k, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(k kVar) {
            return null;
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            N.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }
    }

    public class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            N.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }
    }

    public class g extends Property<View, PointF> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        public PointF a(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            N.g(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f117658a;
        private k mViewBounds;

        public h(k kVar) {
            this.f117658a = kVar;
            this.mViewBounds = kVar;
        }
    }

    public class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f117660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f117661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Rect f117662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f117663d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f117664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f117665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f117666g;

        public i(View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f117661b = view;
            this.f117662c = rect;
            this.f117663d = i10;
            this.f117664e = i11;
            this.f117665f = i12;
            this.f117666g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f117660a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f117660a) {
                return;
            }
            C2507z0.S1(this.f117661b, this.f117662c);
            N.g(this.f117661b, this.f117663d, this.f117664e, this.f117665f, this.f117666g);
        }
    }

    public class j extends C2710w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f117668a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f117669b;

        public j(ViewGroup viewGroup) {
            this.f117669b = viewGroup;
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionCancel(@NonNull Transition transition) {
            I.d(this.f117669b, false);
            this.f117668a = true;
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionEnd(@NonNull Transition transition) {
            if (!this.f117668a) {
                I.d(this.f117669b, false);
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionPause(@NonNull Transition transition) {
            I.d(this.f117669b, false);
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionResume(@NonNull Transition transition) {
            I.d(this.f117669b, true);
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f117672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f117673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f117674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f117675e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f117676f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f117677g;

        public k(View view) {
            this.f117675e = view;
        }

        public void a(PointF pointF) {
            this.f117673c = Math.round(pointF.x);
            this.f117674d = Math.round(pointF.y);
            int i10 = this.f117677g + 1;
            this.f117677g = i10;
            if (this.f117676f == i10) {
                b();
            }
        }

        public final void b() {
            N.g(this.f117675e, this.f117671a, this.f117672b, this.f117673c, this.f117674d);
            this.f117676f = 0;
            this.f117677g = 0;
        }

        public void c(PointF pointF) {
            this.f117671a = Math.round(pointF.x);
            this.f117672b = Math.round(pointF.y);
            int i10 = this.f117676f + 1;
            this.f117676f = i10;
            if (i10 == this.f117677g) {
                b();
            }
        }
    }

    public ChangeBounds() {
        this.f117649a = new int[2];
        this.f117650b = false;
        this.f117651c = false;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull A a10) {
        captureValues(a10);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull A a10) {
        captureValues(a10);
    }

    public final void captureValues(A a10) {
        View view = a10.f117612b;
        if (!C2507z0.Y0(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        a10.f117611a.put(f117636d, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        a10.f117611a.put(f117638f, a10.f117612b.getParent());
        if (this.f117651c) {
            a10.f117612b.getLocationInWindow(this.f117649a);
            a10.f117611a.put(f117639g, Integer.valueOf(this.f117649a[0]));
            a10.f117611a.put(f117640h, Integer.valueOf(this.f117649a[1]));
        }
        if (this.f117650b) {
            a10.f117611a.put(f117637e, view.getClipBounds());
        }
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable A a10, @Nullable A a11) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        if (a10 == null || a11 == null) {
            return null;
        }
        Map<String, Object> map = a10.f117611a;
        Map<String, Object> map2 = a11.f117611a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(f117638f);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(f117638f);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = a11.f117612b;
        if (!u(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) a10.f117611a.get(f117639g)).intValue();
            int iIntValue2 = ((Integer) a10.f117611a.get(f117640h)).intValue();
            int iIntValue3 = ((Integer) a11.f117611a.get(f117639g)).intValue();
            int iIntValue4 = ((Integer) a11.f117611a.get(f117640h)).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f117649a);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = N.c(view);
            N.h(view, 0.0f);
            new L(viewGroup).add(bitmapDrawable);
            PathMotion pathMotion = getPathMotion();
            int[] iArr = this.f117649a;
            int i12 = iArr[0];
            int i13 = iArr[1];
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, PropertyValuesHolder.ofObject(f117642j, (TypeConverter) null, pathMotion.getPath(iIntValue - i12, iIntValue2 - i13, iIntValue3 - i12, iIntValue4 - i13)));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) a10.f117611a.get(f117636d);
        Rect rect3 = (Rect) a11.f117611a.get(f117636d);
        int i14 = rect2.left;
        int i15 = rect3.left;
        int i16 = rect2.top;
        int i17 = rect3.top;
        int i18 = rect2.right;
        int i19 = rect3.right;
        int i20 = rect2.bottom;
        int i21 = rect3.bottom;
        int i22 = i18 - i14;
        int i23 = i20 - i16;
        int i24 = i19 - i15;
        int i25 = i21 - i17;
        Rect rect4 = (Rect) a10.f117611a.get(f117637e);
        Rect rect5 = (Rect) a11.f117611a.get(f117637e);
        if ((i22 == 0 || i23 == 0) && (i24 == 0 || i25 == 0)) {
            i10 = 0;
        } else {
            i10 = (i14 == i15 && i16 == i17) ? 0 : 1;
            if (i18 != i19 || i20 != i21) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.f117650b) {
            N.g(view, i14, i16, Math.max(i22, i24) + i14, Math.max(i23, i25) + i16);
            ObjectAnimator objectAnimatorOfObject = (i14 == i15 && i16 == i17) ? null : ObjectAnimator.ofObject(view, (Property<View, V>) f117647o, (TypeConverter) null, getPathMotion().getPath(i14, i16, i15, i17));
            if (rect4 == null) {
                i11 = 0;
                rect = new Rect(0, 0, i22, i23);
            } else {
                i11 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i11, i11, i24, i25) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                C2507z0.S1(view, rect);
                r rVar = f117648p;
                Object[] objArr = new Object[2];
                objArr[i11] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(view, "clipBounds", rVar, objArr);
                objectAnimatorOfObject2.addListener(new i(view, rect5, i15, i17, i19, i21));
                objectAnimator = objectAnimatorOfObject2;
            }
            animatorC = C2713z.c(objectAnimatorOfObject, objectAnimator);
        } else {
            N.g(view, i14, i16, i18, i20);
            if (i10 != 2) {
                animatorC = (i14 == i15 && i16 == i17) ? ObjectAnimator.ofObject(view, (Property<View, V>) f117645m, (TypeConverter) null, getPathMotion().getPath(i18, i20, i19, i21)) : ObjectAnimator.ofObject(view, (Property<View, V>) f117646n, (TypeConverter) null, getPathMotion().getPath(i14, i16, i15, i17));
            } else if (i22 == i24 && i23 == i25) {
                animatorC = ObjectAnimator.ofObject(view, (Property<View, V>) f117647o, (TypeConverter) null, getPathMotion().getPath(i14, i16, i15, i17));
            } else {
                k kVar = new k(view);
                ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(kVar, (Property<k, V>) f117643k, (TypeConverter) null, getPathMotion().getPath(i14, i16, i15, i17));
                ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(kVar, (Property<k, V>) f117644l, (TypeConverter) null, getPathMotion().getPath(i18, i20, i19, i21));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfObject3, objectAnimatorOfObject4);
                animatorSet.addListener(new h(kVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            I.d(viewGroup4, true);
            addListener(new j(viewGroup4));
        }
        return animatorC;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return f117641i;
    }

    public boolean t() {
        return this.f117650b;
    }

    public final boolean u(View view, View view2) {
        if (!this.f117651c) {
            return true;
        }
        A matchedTransitionValues = getMatchedTransitionValues(view, true);
        return matchedTransitionValues == null ? view == view2 : view2 == matchedTransitionValues.f117612b;
    }

    public void v(boolean z10) {
        this.f117650b = z10;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117649a = new int[2];
        this.f117650b = false;
        this.f117651c = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2708u.f119544d);
        boolean zE = D0.n.e(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        v(zE);
    }
}
