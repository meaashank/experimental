package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC2459h0;
import e.InterfaceC4327a;
import u1.C5637a;

/* JADX INFO: renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2580s {
    @InterfaceC4327a
    public static int a(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.fragment.app.C2580s.a b(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.fragment.app.Fragment r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.getNextTransition()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L1e
            int r3 = u1.C5637a.c.f239346c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L1e
            android.view.ViewGroup r1 = r5.mContainer
            r1.setTag(r3, r2)
        L1e:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L29
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L29
            return r2
        L29:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L35
            androidx.fragment.app.s$a r4 = new androidx.fragment.app.s$a
            r4.<init>(r1)
            return r4
        L35:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L41
            androidx.fragment.app.s$a r4 = new androidx.fragment.app.s$a
            r4.<init>(r5)
            return r4
        L41:
            if (r7 != 0) goto L49
            if (r0 == 0) goto L49
            int r7 = d(r4, r0, r6)
        L49:
            if (r7 == 0) goto L85
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L69
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            if (r6 == 0) goto L85
            androidx.fragment.app.s$a r0 = new androidx.fragment.app.s$a     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            return r0
        L67:
            r4 = move-exception
            throw r4
        L69:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L75
            if (r6 == 0) goto L85
            androidx.fragment.app.s$a r0 = new androidx.fragment.app.s$a     // Catch: java.lang.RuntimeException -> L75
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L75
            return r0
        L75:
            r6 = move-exception
            if (r5 != 0) goto L84
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L85
            androidx.fragment.app.s$a r5 = new androidx.fragment.app.s$a
            r5.<init>(r4)
            return r5
        L84:
            throw r6
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2580s.b(android.content.Context, androidx.fragment.app.Fragment, boolean, boolean):androidx.fragment.app.s$a");
    }

    @InterfaceC4327a
    public static int c(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @InterfaceC4327a
    public static int d(@NonNull Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? C5637a.b.f239342e : C5637a.b.f239343f;
        }
        if (i10 == 8194) {
            return z10 ? C5637a.b.f239338a : C5637a.b.f239339b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? C5637a.b.f239340c : C5637a.b.f239341d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.s$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f113873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f113874b;

        public a(Animation animation) {
            this.f113873a = animation;
            this.f113874b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f113873a = null;
            this.f113874b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.s$b */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f113875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f113876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f113877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f113878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f113879e;

        public b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f113879e = true;
            this.f113875a = viewGroup;
            this.f113876b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation) {
            this.f113879e = true;
            if (this.f113877c) {
                return !this.f113878d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f113877c = true;
                ViewTreeObserverOnPreDrawListenerC2459h0.a(this.f113875a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f113877c || !this.f113879e) {
                this.f113875a.endViewTransition(this.f113876b);
                this.f113878d = true;
            } else {
                this.f113879e = false;
                this.f113875a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, @NonNull Transformation transformation, float f10) {
            this.f113879e = true;
            if (this.f113877c) {
                return !this.f113878d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f113877c = true;
                ViewTreeObserverOnPreDrawListenerC2459h0.a(this.f113875a, this);
            }
            return true;
        }
    }
}
