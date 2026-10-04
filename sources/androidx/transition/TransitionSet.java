package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionSet extends Transition {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f117786f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f117787g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f117788h = 4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f117789i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f117790j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f117791k = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<Transition> f117792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f117793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f117795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f117796e;

    public class a extends C2710w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Transition f117797a;

        public a(Transition transition) {
            this.f117797a = transition;
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionEnd(@NonNull Transition transition) {
            this.f117797a.runAnimators();
            transition.removeListener(this);
        }
    }

    public static class b extends C2710w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TransitionSet f117799a;

        public b(TransitionSet transitionSet) {
            this.f117799a = transitionSet;
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionEnd(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f117799a;
            int i10 = transitionSet.f117794c - 1;
            transitionSet.f117794c = i10;
            if (i10 == 0) {
                transitionSet.f117795d = false;
                transitionSet.end();
            }
            transition.removeListener(this);
        }

        @Override // androidx.transition.C2710w, androidx.transition.Transition.h
        public void onTransitionStart(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f117799a;
            if (transitionSet.f117795d) {
                return;
            }
            transitionSet.start();
            this.f117799a.f117795d = true;
        }
    }

    public TransitionSet() {
        this.f117792a = new ArrayList<>();
        this.f117793b = true;
        this.f117795d = false;
        this.f117796e = 0;
    }

    public int A() {
        return !this.f117793b ? 1 : 0;
    }

    @Nullable
    public Transition B(int i10) {
        if (i10 < 0 || i10 >= this.f117792a.size()) {
            return null;
        }
        return this.f117792a.get(i10);
    }

    public int C() {
        return this.f117792a.size();
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeListener(@NonNull Transition.h hVar) {
        return (TransitionSet) super.removeListener(hVar);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeTarget(@e.C int i10) {
        for (int i11 = 0; i11 < this.f117792a.size(); i11++) {
            this.f117792a.get(i11).removeTarget(i10);
        }
        return (TransitionSet) super.removeTarget(i10);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeTarget(@NonNull View view) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).removeTarget(view);
        }
        return (TransitionSet) super.removeTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeTarget(@NonNull Class<?> cls) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).removeTarget(cls);
        }
        return (TransitionSet) super.removeTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public TransitionSet removeTarget(@NonNull String str) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).removeTarget(str);
        }
        return (TransitionSet) super.removeTarget(str);
    }

    @NonNull
    public TransitionSet I(@NonNull Transition transition) {
        this.f117792a.remove(transition);
        transition.mParent = null;
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public TransitionSet setDuration(long j10) {
        ArrayList<Transition> arrayList;
        super.setDuration(j10);
        if (this.mDuration >= 0 && (arrayList = this.f117792a) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f117792a.get(i10).setDuration(j10);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public TransitionSet setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.f117796e |= 1;
        ArrayList<Transition> arrayList = this.f117792a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f117792a.get(i10).setInterpolator(timeInterpolator);
            }
        }
        return (TransitionSet) super.setInterpolator(timeInterpolator);
    }

    @NonNull
    public TransitionSet L(int i10) {
        if (i10 == 0) {
            this.f117793b = true;
            return this;
        }
        if (i10 != 1) {
            throw new AndroidRuntimeException(android.support.v4.media.c.a("Invalid parameter for TransitionSet ordering: ", i10));
        }
        this.f117793b = false;
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public TransitionSet setStartDelay(long j10) {
        return (TransitionSet) super.setStartDelay(j10);
    }

    public final void N() {
        b bVar = new b(this);
        ArrayList<Transition> arrayList = this.f117792a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Transition transition = arrayList.get(i10);
            i10++;
            transition.addListener(bVar);
        }
        this.f117794c = this.f117792a.size();
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f117792a.get(i10).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull A a10) {
        if (isValidTarget(a10.f117612b)) {
            ArrayList<Transition> arrayList = this.f117792a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Transition transition = arrayList.get(i10);
                i10++;
                Transition transition2 = transition;
                if (transition2.isValidTarget(a10.f117612b)) {
                    transition2.captureEndValues(a10);
                    a10.f117613c.add(transition2);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void capturePropagationValues(A a10) {
        super.capturePropagationValues(a10);
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f117792a.get(i10).capturePropagationValues(a10);
        }
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull A a10) {
        if (isValidTarget(a10.f117612b)) {
            ArrayList<Transition> arrayList = this.f117792a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Transition transition = arrayList.get(i10);
                i10++;
                Transition transition2 = transition;
                if (transition2.isValidTarget(a10.f117612b)) {
                    transition2.captureStartValues(a10);
                    a10.f117613c.add(transition2);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, B b10, B b11, ArrayList<A> arrayList, ArrayList<A> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition transition = this.f117792a.get(i10);
            if (startDelay > 0 && (this.f117793b || i10 == 0)) {
                long startDelay2 = transition.getStartDelay();
                if (startDelay2 > 0) {
                    transition.setStartDelay(startDelay2 + startDelay);
                } else {
                    transition.setStartDelay(startDelay);
                }
            }
            transition.createAnimators(viewGroup, b10, b11, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z10) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).excludeTarget(view, z10);
        }
        return super.excludeTarget(view, z10);
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f117792a.get(i10).forceToEnd(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        super.pause(view);
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f117792a.get(i10).pause(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        super.resume(view);
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f117792a.get(i10).resume(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        if (this.f117792a.isEmpty()) {
            start();
            end();
            return;
        }
        N();
        int i10 = 0;
        if (this.f117793b) {
            ArrayList<Transition> arrayList = this.f117792a;
            int size = arrayList.size();
            while (i10 < size) {
                Transition transition = arrayList.get(i10);
                i10++;
                transition.runAnimators();
            }
            return;
        }
        for (int i11 = 1; i11 < this.f117792a.size(); i11++) {
            this.f117792a.get(i11 - 1).addListener(new a(this.f117792a.get(i11)));
        }
        Transition transition2 = this.f117792a.get(0);
        if (transition2 != null) {
            transition2.runAnimators();
        }
    }

    @Override // androidx.transition.Transition
    public void setCanRemoveViews(boolean z10) {
        super.setCanRemoveViews(z10);
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f117792a.get(i10).setCanRemoveViews(z10);
        }
    }

    @Override // androidx.transition.Transition
    public void setEpicenterCallback(Transition.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f117796e |= 8;
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f117792a.get(i10).setEpicenterCallback(fVar);
        }
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f117796e |= 4;
        if (this.f117792a != null) {
            for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
                this.f117792a.get(i10).setPathMotion(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void setPropagation(AbstractC2712y abstractC2712y) {
        super.setPropagation(abstractC2712y);
        this.f117796e |= 2;
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f117792a.get(i10).setPropagation(abstractC2712y);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public TransitionSet addListener(@NonNull Transition.h hVar) {
        return (TransitionSet) super.addListener(hVar);
    }

    @Override // androidx.transition.Transition
    public String toString(String str) {
        String string = super.toString(str);
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            StringBuilder sbA = android.support.v4.media.f.a(string, "\n");
            sbA.append(this.f117792a.get(i10).toString(str + GlideException.a.f139488d));
            string = sbA.toString();
        }
        return string;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public TransitionSet addTarget(@e.C int i10) {
        for (int i11 = 0; i11 < this.f117792a.size(); i11++) {
            this.f117792a.get(i11).addTarget(i10);
        }
        return (TransitionSet) super.addTarget(i10);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public TransitionSet addTarget(@NonNull View view) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).addTarget(view);
        }
        return (TransitionSet) super.addTarget(view);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public TransitionSet addTarget(@NonNull Class<?> cls) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).addTarget(cls);
        }
        return (TransitionSet) super.addTarget(cls);
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public TransitionSet addTarget(@NonNull String str) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).addTarget(str);
        }
        return (TransitionSet) super.addTarget(str);
    }

    @NonNull
    public TransitionSet y(@NonNull Transition transition) {
        z(transition);
        long j10 = this.mDuration;
        if (j10 >= 0) {
            transition.setDuration(j10);
        }
        if ((this.f117796e & 1) != 0) {
            transition.setInterpolator(getInterpolator());
        }
        if ((this.f117796e & 2) != 0) {
            transition.setPropagation(getPropagation());
        }
        if ((this.f117796e & 4) != 0) {
            transition.setPathMotion(getPathMotion());
        }
        if ((this.f117796e & 8) != 0) {
            transition.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    public final void z(@NonNull Transition transition) {
        this.f117792a.add(transition);
        transition.mParent = this;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: clone */
    public Transition mo8clone() {
        TransitionSet transitionSet = (TransitionSet) super.mo8clone();
        transitionSet.f117792a = new ArrayList<>();
        int size = this.f117792a.size();
        for (int i10 = 0; i10 < size; i10++) {
            transitionSet.z(this.f117792a.get(i10).mo8clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z10) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).excludeTarget(str, z10);
        }
        return super.excludeTarget(str, z10);
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117792a = new ArrayList<>();
        this.f117793b = true;
        this.f117795d = false;
        this.f117796e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2708u.f119549i);
        L(D0.n.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.f117792a.size(); i11++) {
            this.f117792a.get(i11).excludeTarget(i10, z10);
        }
        return super.excludeTarget(i10, z10);
    }

    @Override // androidx.transition.Transition
    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z10) {
        for (int i10 = 0; i10 < this.f117792a.size(); i10++) {
            this.f117792a.get(i10).excludeTarget(cls, z10);
        }
        return super.excludeTarget(cls, z10);
    }
}
