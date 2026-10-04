package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.C2689a;
import androidx.transition.C2705q;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    private int mMode;
    static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final String PROPNAME_PARENT = "android:visibility:parent";
    private static final String[] sTransitionProperties = {PROPNAME_VISIBILITY, PROPNAME_PARENT};

    public class a extends C2710w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f117803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f117804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f117805c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f117803a = viewGroup;
            this.f117804b = view;
            this.f117805c = view2;
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionEnd(@NonNull Transition transition) {
            this.f117805c.setTag(C2705q.g.f118529Z0, null);
            new E(this.f117803a).remove(this.f117804b);
            transition.removeListener(this);
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionPause(@NonNull Transition transition) {
            new E(this.f117803a).remove(this.f117804b);
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionResume(@NonNull Transition transition) {
            if (this.f117804b.getParent() == null) {
                new E(this.f117803a).add(this.f117804b);
            } else {
                Visibility.this.cancel();
            }
        }
    }

    public static class b extends AnimatorListenerAdapter implements Transition.h, C2689a.InterfaceC0334a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f117807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f117808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f117809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f117810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f117811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f117812f = false;

        public b(View view, int i10, boolean z10) {
            this.f117807a = view;
            this.f117808b = i10;
            this.f117809c = (ViewGroup) view.getParent();
            this.f117810d = z10;
            b(true);
        }

        public final void a() {
            if (!this.f117812f) {
                N.i(this.f117807a, this.f117808b);
                ViewGroup viewGroup = this.f117809c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        public final void b(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f117810d || this.f117811e == z10 || (viewGroup = this.f117809c) == null) {
                return;
            }
            this.f117811e = z10;
            I.d(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f117812f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.C2689a.InterfaceC0334a
        public void onAnimationPause(Animator animator) {
            if (this.f117812f) {
                return;
            }
            N.i(this.f117807a, this.f117808b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.C2689a.InterfaceC0334a
        public void onAnimationResume(Animator animator) {
            if (this.f117812f) {
                return;
            }
            N.i(this.f117807a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionCancel(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionEnd(@NonNull Transition transition) {
            a();
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionPause(@NonNull Transition transition) {
            b(false);
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionResume(@NonNull Transition transition) {
            b(true);
        }

        @Override // androidx.transition.Transition.h
        public void onTransitionStart(@NonNull Transition transition) {
        }
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f117813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f117814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f117815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f117816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f117817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f117818f;
    }

    public Visibility() {
        this.mMode = 3;
    }

    private void captureValues(A a10) {
        a10.f117611a.put(PROPNAME_VISIBILITY, Integer.valueOf(a10.f117612b.getVisibility()));
        a10.f117611a.put(PROPNAME_PARENT, a10.f117612b.getParent());
        int[] iArr = new int[2];
        a10.f117612b.getLocationOnScreen(iArr);
        a10.f117611a.put(PROPNAME_SCREEN_LOCATION, iArr);
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull A a10) {
        captureValues(a10);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull A a10) {
        captureValues(a10);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable A a10, @Nullable A a11) {
        d dVarT = t(a10, a11);
        if (!dVarT.f117813a) {
            return null;
        }
        if (dVarT.f117817e == null && dVarT.f117818f == null) {
            return null;
        }
        return dVarT.f117814b ? onAppear(viewGroup, a10, dVarT.f117815c, a11, dVarT.f117816d) : onDisappear(viewGroup, a10, dVarT.f117815c, a11, dVarT.f117816d);
    }

    public int getMode() {
        return this.mMode;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    @Override // androidx.transition.Transition
    public boolean isTransitionRequired(@Nullable A a10, @Nullable A a11) {
        if (a10 == null && a11 == null) {
            return false;
        }
        if (a10 != null && a11 != null && a11.f117611a.containsKey(PROPNAME_VISIBILITY) != a10.f117611a.containsKey(PROPNAME_VISIBILITY)) {
            return false;
        }
        d dVarT = t(a10, a11);
        return dVarT.f117813a && (dVarT.f117815c == 0 || dVarT.f117816d == 0);
    }

    public boolean isVisible(A a10) {
        if (a10 == null) {
            return false;
        }
        return ((Integer) a10.f117611a.get(PROPNAME_VISIBILITY)).intValue() == 0 && ((View) a10.f117611a.get(PROPNAME_PARENT)) != null;
    }

    @Nullable
    public Animator onAppear(ViewGroup viewGroup, View view, A a10, A a11) {
        return null;
    }

    @Nullable
    public Animator onDisappear(ViewGroup viewGroup, View view, A a10, A a11) {
        return null;
    }

    public void setMode(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.mMode = i10;
    }

    public final d t(A a10, A a11) {
        d dVar = new d();
        dVar.f117813a = false;
        dVar.f117814b = false;
        if (a10 == null || !a10.f117611a.containsKey(PROPNAME_VISIBILITY)) {
            dVar.f117815c = -1;
            dVar.f117817e = null;
        } else {
            dVar.f117815c = ((Integer) a10.f117611a.get(PROPNAME_VISIBILITY)).intValue();
            dVar.f117817e = (ViewGroup) a10.f117611a.get(PROPNAME_PARENT);
        }
        if (a11 == null || !a11.f117611a.containsKey(PROPNAME_VISIBILITY)) {
            dVar.f117816d = -1;
            dVar.f117818f = null;
        } else {
            dVar.f117816d = ((Integer) a11.f117611a.get(PROPNAME_VISIBILITY)).intValue();
            dVar.f117818f = (ViewGroup) a11.f117611a.get(PROPNAME_PARENT);
        }
        if (a10 != null && a11 != null) {
            int i10 = dVar.f117815c;
            int i11 = dVar.f117816d;
            if (i10 != i11 || dVar.f117817e != dVar.f117818f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        dVar.f117814b = false;
                        dVar.f117813a = true;
                        return dVar;
                    }
                    if (i11 == 0) {
                        dVar.f117814b = true;
                        dVar.f117813a = true;
                        return dVar;
                    }
                } else {
                    if (dVar.f117818f == null) {
                        dVar.f117814b = false;
                        dVar.f117813a = true;
                        return dVar;
                    }
                    if (dVar.f117817e == null) {
                        dVar.f117814b = true;
                        dVar.f117813a = true;
                        return dVar;
                    }
                }
            }
        } else {
            if (a10 == null && dVar.f117816d == 0) {
                dVar.f117814b = true;
                dVar.f117813a = true;
                return dVar;
            }
            if (a11 == null && dVar.f117815c == 0) {
                dVar.f117814b = false;
                dVar.f117813a = true;
            }
        }
        return dVar;
    }

    @Nullable
    public Animator onAppear(ViewGroup viewGroup, A a10, int i10, A a11, int i11) {
        if ((this.mMode & 1) != 1 || a11 == null) {
            return null;
        }
        if (a10 == null) {
            View view = (View) a11.f117612b.getParent();
            if (t(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f117813a) {
                return null;
            }
        }
        return onAppear(viewGroup, a11.f117612b, a10, a11);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator onDisappear(android.view.ViewGroup r11, androidx.transition.A r12, int r13, androidx.transition.A r14, int r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.onDisappear(android.view.ViewGroup, androidx.transition.A, int, androidx.transition.A, int):android.animation.Animator");
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMode = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2708u.f119545e);
        int iK = D0.n.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iK != 0) {
            setMode(iK);
        }
    }
}
