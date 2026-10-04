package androidx.transition;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 extends AbstractC2712y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f117831a = "android:visibilityPropagation:visibility";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117832b = "android:visibilityPropagation:center";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f117833c = {f117831a, f117832b};

    public static int d(A a10, int i10) {
        int[] iArr;
        if (a10 == null || (iArr = (int[]) a10.f117611a.get(f117832b)) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // androidx.transition.AbstractC2712y
    public void a(A a10) {
        View view = a10.f117612b;
        Integer numValueOf = (Integer) a10.f117611a.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        a10.f117611a.put(f117831a, numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = Math.round(view.getTranslationX()) + iArr[0];
        iArr[0] = (view.getWidth() / 2) + iRound;
        int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = iRound2;
        iArr[1] = (view.getHeight() / 2) + iRound2;
        a10.f117611a.put(f117832b, iArr);
    }

    @Override // androidx.transition.AbstractC2712y
    public String[] b() {
        return f117833c;
    }

    public int e(A a10) {
        Integer num;
        if (a10 == null || (num = (Integer) a10.f117611a.get(f117831a)) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(A a10) {
        return d(a10, 0);
    }

    public int g(A a10) {
        return d(a10, 1);
    }
}
