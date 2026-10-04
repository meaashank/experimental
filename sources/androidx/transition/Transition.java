package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.C1520a;
import androidx.collection.C1531f0;
import androidx.core.view.C2507z0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<A> mEndValuesList;
    private f mEpicenterCallback;
    private C1520a<String, String> mNameOverrides;
    AbstractC2712y mPropagation;
    private ArrayList<A> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final PathMotion STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<C1520a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private B mStartValues = new B();
    private B mEndValues = new B();
    TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<h> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    public class a extends PathMotion {
        @Override // androidx.transition.PathMotion
        public Path getPath(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C1520a f117778a;

        public b(C1520a c1520a) {
            this.f117778a = c1520a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f117778a.remove(animator);
            Transition.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.mCurrentAnimators.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.end();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f117781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f117782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public A f117783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e0 f117784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Transition f117785e;

        public d(View view, String str, Transition transition, e0 e0Var, A a10) {
            this.f117781a = view;
            this.f117782b = str;
            this.f117783c = a10;
            this.f117784d = e0Var;
            this.f117785e = transition;
        }
    }

    public static class e {
        public static <T> ArrayList<T> a(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t10)) {
                arrayList.add(t10);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> b(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t10);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static abstract class f {
        public abstract Rect a(@NonNull Transition transition);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface g {
    }

    public interface h {
        void onTransitionCancel(@NonNull Transition transition);

        void onTransitionEnd(@NonNull Transition transition);

        void onTransitionPause(@NonNull Transition transition);

        void onTransitionResume(@NonNull Transition transition);

        void onTransitionStart(@NonNull Transition transition);
    }

    public Transition() {
    }

    public static void b(B b10, View view, A a10) {
        b10.f117623a.put(view, a10);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (b10.f117624b.indexOfKey(id2) >= 0) {
                b10.f117624b.put(id2, null);
            } else {
                b10.f117624b.put(id2, view);
            }
        }
        String strA0 = C2507z0.A0(view);
        if (strA0 != null) {
            if (b10.f117626d.containsKey(strA0)) {
                b10.f117626d.put(strA0, null);
            } else {
                b10.f117626d.put(strA0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (b10.f117625c.i(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    b10.f117625c.m(itemIdAtPosition, view);
                    return;
                }
                View viewG = b10.f117625c.g(itemIdAtPosition);
                if (viewG != null) {
                    viewG.setHasTransientState(false);
                    b10.f117625c.m(itemIdAtPosition, null);
                }
            }
        }
    }

    public static boolean c(int[] iArr, int i10) {
        int i11 = iArr[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    public static <T> ArrayList<T> f(ArrayList<T> arrayList, T t10, boolean z10) {
        return t10 != null ? z10 ? e.a(arrayList, t10) : e.b(arrayList, t10) : arrayList;
    }

    public static C1520a<Animator, d> i() {
        C1520a<Animator, d> c1520a = sRunningAnimators.get();
        if (c1520a != null) {
            return c1520a;
        }
        C1520a<Animator, d> c1520a2 = new C1520a<>();
        sRunningAnimators.set(c1520a2);
        return c1520a2;
    }

    public static boolean j(int i10) {
        return i10 >= 1 && i10 <= 4;
    }

    public static boolean k(A a10, A a11, String str) {
        Object obj = a10.f117611a.get(str);
        Object obj2 = a11.f117611a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static int[] r(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException(android.support.v4.media.i.a("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                i10--;
                iArr = iArr2;
            }
            i10++;
        }
        return iArr;
    }

    public final void a(C1520a<View, A> c1520a, C1520a<View, A> c1520a2) {
        for (int i10 = 0; i10 < c1520a.size(); i10++) {
            A aO = c1520a.o(i10);
            if (isValidTarget(aO.f117612b)) {
                this.mStartValuesList.add(aO);
                this.mEndValuesList.add(null);
            }
        }
        for (int i11 = 0; i11 < c1520a2.size(); i11++) {
            A aO2 = c1520a2.o(i11);
            if (isValidTarget(aO2.f117612b)) {
                this.mEndValuesList.add(aO2);
                this.mStartValuesList.add(null);
            }
        }
    }

    @NonNull
    public Transition addListener(@NonNull h hVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(hVar);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<h> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((h) arrayList2.get(i10)).onTransitionCancel(this);
        }
    }

    public abstract void captureEndValues(@NonNull A a10);

    public void capturePropagationValues(A a10) {
        String[] strArrB;
        if (this.mPropagation == null || a10.f117611a.isEmpty() || (strArrB = this.mPropagation.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!a10.f117611a.containsKey(str)) {
                this.mPropagation.a(a10);
                return;
            }
        }
    }

    public abstract void captureStartValues(@NonNull A a10);

    public void captureValues(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C1520a<String, String> c1520a;
        clearValues(z10);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.mTargetIds.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i10).intValue());
                if (viewFindViewById != null) {
                    A a10 = new A(viewFindViewById);
                    if (z10) {
                        captureStartValues(a10);
                    } else {
                        captureEndValues(a10);
                    }
                    a10.f117613c.add(this);
                    capturePropagationValues(a10);
                    if (z10) {
                        b(this.mStartValues, viewFindViewById, a10);
                    } else {
                        b(this.mEndValues, viewFindViewById, a10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.mTargets.size(); i11++) {
                View view = this.mTargets.get(i11);
                A a11 = new A(view);
                if (z10) {
                    captureStartValues(a11);
                } else {
                    captureEndValues(a11);
                }
                a11.f117613c.add(this);
                capturePropagationValues(a11);
                if (z10) {
                    b(this.mStartValues, view, a11);
                } else {
                    b(this.mEndValues, view, a11);
                }
            }
        } else {
            d(viewGroup, z10);
        }
        if (z10 || (c1520a = this.mNameOverrides) == null) {
            return;
        }
        int size = c1520a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.mStartValues.f117626d.remove(this.mNameOverrides.i(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.mStartValues.f117626d.put(this.mNameOverrides.o(i13), view2);
            }
        }
    }

    public void clearValues(boolean z10) {
        if (z10) {
            this.mStartValues.f117623a.clear();
            this.mStartValues.f117624b.clear();
            this.mStartValues.f117625c.b();
        } else {
            this.mEndValues.f117623a.clear();
            this.mEndValues.f117624b.clear();
            this.mEndValues.f117625c.b();
        }
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable A a10, @Nullable A a11) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, B b10, B b11, ArrayList<A> arrayList, ArrayList<A> arrayList2) {
        Animator animatorCreateAnimator;
        int i10;
        int i11;
        View view;
        A a10;
        Animator animator;
        A a11;
        int i12;
        C1520a<Animator, d> c1520aI = i();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i13 = 0;
        while (i13 < size) {
            A a12 = arrayList.get(i13);
            A a13 = arrayList2.get(i13);
            if (a12 != null && !a12.f117613c.contains(this)) {
                a12 = null;
            }
            if (a13 != null && !a13.f117613c.contains(this)) {
                a13 = null;
            }
            if (!(a12 == null && a13 == null) && ((a12 == null || a13 == null || isTransitionRequired(a12, a13)) && (animatorCreateAnimator = createAnimator(viewGroup, a12, a13)) != null)) {
                if (a13 != null) {
                    view = a13.f117612b;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        a11 = new A(view);
                        i10 = size;
                        i11 = i13;
                        A a14 = b11.f117623a.get(view);
                        if (a14 != null) {
                            int i14 = 0;
                            while (i14 < transitionProperties.length) {
                                Map<String, Object> map = a11.f117611a;
                                String[] strArr = transitionProperties;
                                String str = strArr[i14];
                                map.put(str, a14.f117611a.get(str));
                                i14++;
                                transitionProperties = strArr;
                            }
                        }
                        int size2 = c1520aI.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                animator = animatorCreateAnimator;
                                break;
                            }
                            d dVar = c1520aI.get(c1520aI.i(i15));
                            if (dVar.f117783c != null && dVar.f117781a == view) {
                                i12 = size2;
                                if (dVar.f117782b.equals(getName()) && dVar.f117783c.equals(a11)) {
                                    animator = null;
                                    break;
                                }
                            } else {
                                i12 = size2;
                            }
                            i15++;
                            size2 = i12;
                        }
                    } else {
                        i10 = size;
                        i11 = i13;
                        animator = animatorCreateAnimator;
                        a11 = null;
                    }
                    animatorCreateAnimator = animator;
                    a10 = a11;
                } else {
                    i10 = size;
                    i11 = i13;
                    view = a12.f117612b;
                    a10 = null;
                }
                if (animatorCreateAnimator != null) {
                    AbstractC2712y abstractC2712y = this.mPropagation;
                    if (abstractC2712y != null) {
                        long jC = abstractC2712y.c(viewGroup, this, a12, a13);
                        sparseIntArray.put(this.mAnimators.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    c1520aI.put(animatorCreateAnimator, new d(view, getName(), this, N.d(viewGroup), a10));
                    this.mAnimators.add(animatorCreateAnimator);
                    jMin = jMin;
                }
            } else {
                i10 = size;
                i11 = i13;
            }
            i13 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator2 = this.mAnimators.get(sparseIntArray.keyAt(i16));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i16)) - jMin));
            }
        }
    }

    public final void d(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.mTargetTypeExcludes.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    A a10 = new A(view);
                    if (z10) {
                        captureStartValues(a10);
                    } else {
                        captureEndValues(a10);
                    }
                    a10.f117613c.add(this);
                    capturePropagationValues(a10);
                    if (z10) {
                        b(this.mStartValues, view, a10);
                    } else {
                        b(this.mEndValues, view, a10);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.mTargetTypeChildExcludes.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                d(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public final ArrayList<Integer> e(ArrayList<Integer> arrayList, int i10, boolean z10) {
        return i10 > 0 ? z10 ? e.a(arrayList, Integer.valueOf(i10)) : e.b(arrayList, Integer.valueOf(i10)) : arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i10 = this.mNumInstances - 1;
        this.mNumInstances = i10;
        if (i10 == 0) {
            ArrayList<h> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((h) arrayList2.get(i11)).onTransitionEnd(this);
                }
            }
            for (int i12 = 0; i12 < this.mStartValues.f117625c.w(); i12++) {
                View viewX = this.mStartValues.f117625c.x(i12);
                if (viewX != null) {
                    C2507z0.X1(viewX, false);
                }
            }
            for (int i13 = 0; i13 < this.mEndValues.f117625c.w(); i13++) {
                View viewX2 = this.mEndValues.f117625c.x(i13);
                if (viewX2 != null) {
                    C2507z0.X1(viewX2, false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z10) {
        this.mTargetChildExcludes = h(this.mTargetChildExcludes, view, z10);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z10) {
        this.mTargetExcludes = h(this.mTargetExcludes, view, z10);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        C1520a<Animator, d> c1520aI = i();
        int size = c1520aI.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        e0 e0VarD = N.d(viewGroup);
        C1520a c1520a = new C1520a(c1520aI);
        c1520aI.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d dVar = (d) c1520a.o(i10);
            if (dVar.f117781a != null && e0VarD.equals(dVar.f117784d)) {
                ((Animator) c1520a.i(i10)).end();
            }
        }
    }

    public final ArrayList<Class<?>> g(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z10) {
        return cls != null ? z10 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @Nullable
    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.mEndValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.mStartValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.transition.A getMatchedTransitionValues(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.TransitionSet r0 = r5.mParent
            if (r0 == 0) goto L9
            androidx.transition.A r6 = r0.getMatchedTransitionValues(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<androidx.transition.A> r0 = r5.mStartValuesList
            goto L10
        Le:
            java.util.ArrayList<androidx.transition.A> r0 = r5.mEndValuesList
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            androidx.transition.A r4 = (androidx.transition.A) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f117612b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<androidx.transition.A> r6 = r5.mEndValuesList
            goto L36
        L34:
            java.util.ArrayList<androidx.transition.A> r6 = r5.mStartValuesList
        L36:
            java.lang.Object r6 = r6.get(r3)
            androidx.transition.A r6 = (androidx.transition.A) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.getMatchedTransitionValues(android.view.View, boolean):androidx.transition.A");
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable
    public AbstractC2712y getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public A getTransitionValues(@NonNull View view, boolean z10) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z10);
        }
        return (z10 ? this.mStartValues : this.mEndValues).f117623a.get(view);
    }

    public final ArrayList<View> h(ArrayList<View> arrayList, View view, boolean z10) {
        return view != null ? z10 ? e.a(arrayList, view) : e.b(arrayList, view) : arrayList;
    }

    public boolean isTransitionRequired(@Nullable A a10, @Nullable A a11) {
        if (a10 != null && a11 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (k(a10, a11, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = a10.f117611a.keySet().iterator();
                while (it.hasNext()) {
                    if (k(a10, a11, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.mTargetTypeExcludes.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && C2507z0.A0(view) != null && this.mTargetNameExcludes.contains(C2507z0.h.k(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id2)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(C2507z0.A0(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i11 = 0; i11 < this.mTargetTypes.size(); i11++) {
                if (this.mTargetTypes.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void l(C1520a<View, A> c1520a, C1520a<View, A> c1520a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && isValidTarget(view)) {
                A a10 = c1520a.get(viewValueAt);
                A a11 = c1520a2.get(view);
                if (a10 != null && a11 != null) {
                    this.mStartValuesList.add(a10);
                    this.mEndValuesList.add(a11);
                    c1520a.remove(viewValueAt);
                    c1520a2.remove(view);
                }
            }
        }
    }

    public final void m(C1520a<View, A> c1520a, C1520a<View, A> c1520a2) {
        A aRemove;
        for (int size = c1520a.size() - 1; size >= 0; size--) {
            View viewI = c1520a.i(size);
            if (viewI != null && isValidTarget(viewI) && (aRemove = c1520a2.remove(viewI)) != null && isValidTarget(aRemove.f117612b)) {
                this.mStartValuesList.add(c1520a.l(size));
                this.mEndValuesList.add(aRemove);
            }
        }
    }

    public final void n(C1520a<View, A> c1520a, C1520a<View, A> c1520a2, C1531f0<View> c1531f0, C1531f0<View> c1531f02) {
        View viewG;
        int iW = c1531f0.w();
        for (int i10 = 0; i10 < iW; i10++) {
            View viewX = c1531f0.x(i10);
            if (viewX != null && isValidTarget(viewX) && (viewG = c1531f02.g(c1531f0.l(i10))) != null && isValidTarget(viewG)) {
                A a10 = c1520a.get(viewX);
                A a11 = c1520a2.get(viewG);
                if (a10 != null && a11 != null) {
                    this.mStartValuesList.add(a10);
                    this.mEndValuesList.add(a11);
                    c1520a.remove(viewX);
                    c1520a2.remove(viewG);
                }
            }
        }
    }

    public final void p(C1520a<View, A> c1520a, C1520a<View, A> c1520a2, C1520a<String, View> c1520a3, C1520a<String, View> c1520a4) {
        View view;
        int size = c1520a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewO = c1520a3.o(i10);
            if (viewO != null && isValidTarget(viewO) && (view = c1520a4.get(c1520a3.i(i10))) != null && isValidTarget(view)) {
                A a10 = c1520a.get(viewO);
                A a11 = c1520a2.get(view);
                if (a10 != null && a11 != null) {
                    this.mStartValuesList.add(a10);
                    this.mEndValuesList.add(a11);
                    c1520a.remove(viewO);
                    c1520a2.remove(view);
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).pause();
        }
        ArrayList<h> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((h) arrayList2.get(i10)).onTransitionPause(this);
            }
        }
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        q(this.mStartValues, this.mEndValues);
        C1520a<Animator, d> c1520aI = i();
        int size = c1520aI.size();
        e0 e0VarD = N.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorI = c1520aI.i(i10);
            if (animatorI != null && (dVar = c1520aI.get(animatorI)) != null && dVar.f117781a != null && e0VarD.equals(dVar.f117784d)) {
                A a10 = dVar.f117783c;
                View view = dVar.f117781a;
                A transitionValues = getTransitionValues(view, true);
                A matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f117623a.get(view);
                }
                if ((transitionValues != null || matchedTransitionValues != null) && dVar.f117785e.isTransitionRequired(a10, matchedTransitionValues)) {
                    if (animatorI.isRunning() || animatorI.isStarted()) {
                        animatorI.cancel();
                    } else {
                        c1520aI.remove(animatorI);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public final void q(B b10, B b11) {
        C1520a<View, A> c1520a = new C1520a<>(b10.f117623a);
        C1520a<View, A> c1520a2 = new C1520a<>(b11.f117623a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i10 >= iArr.length) {
                a(c1520a, c1520a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                m(c1520a, c1520a2);
            } else if (i11 == 2) {
                p(c1520a, c1520a2, b10.f117626d, b11.f117626d);
            } else if (i11 == 3) {
                l(c1520a, c1520a2, b10.f117624b, b11.f117624b);
            } else if (i11 == 4) {
                n(c1520a, c1520a2, b10.f117625c, b11.f117625c);
            }
            i10++;
        }
    }

    @NonNull
    public Transition removeListener(@NonNull h hVar) {
        ArrayList<h> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(hVar);
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
                    this.mCurrentAnimators.get(size).resume();
                }
                ArrayList<h> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((h) arrayList2.get(i10)).onTransitionResume(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        C1520a<Animator, d> c1520aI = i();
        ArrayList<Animator> arrayList = this.mAnimators;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Animator animator = arrayList.get(i10);
            i10++;
            Animator animator2 = animator;
            if (c1520aI.containsKey(animator2)) {
                start();
                s(animator2, c1520aI);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public final void s(Animator animator, C1520a<Animator, d> c1520a) {
        if (animator != null) {
            animator.addListener(new b(c1520a));
            animate(animator);
        }
    }

    public void setCanRemoveViews(boolean z10) {
        this.mCanRemoveViews = z10;
    }

    @NonNull
    public Transition setDuration(long j10) {
        this.mDuration = j10;
        return this;
    }

    public void setEpicenterCallback(@Nullable f fVar) {
        this.mEpicenterCallback = fVar;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!j(iArr[i10])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (c(iArr, i10)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public void setPropagation(@Nullable AbstractC2712y abstractC2712y) {
        this.mPropagation = abstractC2712y;
    }

    @NonNull
    public Transition setStartDelay(long j10) {
        this.mStartDelay = j10;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<h> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((h) arrayList2.get(i10)).onTransitionStart(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString(String str) {
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a(str);
        sbA.append(getClass().getSimpleName());
        sbA.append("@");
        sbA.append(Integer.toHexString(hashCode()));
        sbA.append(": ");
        String string = sbA.toString();
        if (this.mDuration != -1) {
            string = android.support.v4.media.session.f.a(android.support.v4.media.f.a(string, "dur("), this.mDuration, ") ");
        }
        if (this.mStartDelay != -1) {
            string = android.support.v4.media.session.f.a(android.support.v4.media.f.a(string, "dly("), this.mStartDelay, ") ");
        }
        if (this.mInterpolator != null) {
            StringBuilder sbA2 = android.support.v4.media.f.a(string, "interp(");
            sbA2.append(this.mInterpolator);
            sbA2.append(") ");
            string = sbA2.toString();
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return string;
        }
        String strA = androidx.compose.runtime.changelist.j.a(string, "tgts(");
        if (this.mTargetIds.size() > 0) {
            for (int i10 = 0; i10 < this.mTargetIds.size(); i10++) {
                if (i10 > 0) {
                    strA = androidx.compose.runtime.changelist.j.a(strA, U6.j.f68738d);
                }
                StringBuilder sbA3 = androidx.compose.runtime.changelist.a.a(strA);
                sbA3.append(this.mTargetIds.get(i10));
                strA = sbA3.toString();
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i11 = 0; i11 < this.mTargets.size(); i11++) {
                if (i11 > 0) {
                    strA = androidx.compose.runtime.changelist.j.a(strA, U6.j.f68738d);
                }
                StringBuilder sbA4 = androidx.compose.runtime.changelist.a.a(strA);
                sbA4.append(this.mTargets.get(i11));
                strA = sbA4.toString();
            }
        }
        return androidx.compose.runtime.changelist.j.a(strA, ")");
    }

    @NonNull
    public Transition addTarget(@e.C int i10) {
        if (i10 != 0) {
            this.mTargetIds.add(Integer.valueOf(i10));
        }
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transition mo8clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new B();
            transition.mEndValues = new B();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @NonNull
    public Transition excludeChildren(@e.C int i10, boolean z10) {
        this.mTargetIdChildExcludes = e(this.mTargetIdChildExcludes, i10, z10);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@e.C int i10, boolean z10) {
        this.mTargetIdExcludes = e(this.mTargetIdExcludes, i10, z10);
        return this;
    }

    @NonNull
    public Transition removeTarget(@e.C int i10) {
        if (i10 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i10));
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z10) {
        this.mTargetTypeChildExcludes = g(this.mTargetTypeChildExcludes, cls, z10);
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z10) {
        this.mTargetNameExcludes = f(this.mTargetNameExcludes, str, z10);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z10) {
        this.mTargetTypeExcludes = g(this.mTargetTypeExcludes, cls, z10);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2708u.f119543c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jK = D0.n.k(typedArrayObtainStyledAttributes, xmlResourceParser, x.h.f238399b, 1, -1);
        if (jK >= 0) {
            setDuration(jK);
        }
        long j10 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j10 > 0) {
            setStartDelay(j10);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strM = D0.n.m(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM != null) {
            setMatchOrder(r(strM));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public String toString() {
        return toString("");
    }
}
