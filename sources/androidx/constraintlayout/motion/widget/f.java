package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;
import w0.AbstractC5735d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f106843A = "motionProgress";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f106844B = "transitionEasing";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f106845C = "visibility";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f106846f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f106847g = "alpha";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f106848h = "elevation";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f106849i = "rotation";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f106850j = "rotationX";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f106851k = "rotationY";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f106852l = "transformPivotX";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f106853m = "transformPivotY";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f106854n = "transitionPathRotate";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f106855o = "scaleX";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f106856p = "scaleY";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f106857q = "wavePeriod";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f106858r = "waveOffset";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f106859s = "wavePhase";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f106860t = "waveVariesBy";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f106861u = "translationX";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f106862v = "translationY";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f106863w = "translationZ";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f106864x = "progress";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f106865y = "CUSTOM";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f106866z = "curveFit";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f106868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f106869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f106870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f106871e;

    public f() {
        int i10 = f106846f;
        this.f106867a = i10;
        this.f106868b = i10;
        this.f106869c = null;
    }

    public abstract void a(HashMap<String, AbstractC5735d> splines);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract f clone();

    public f c(f src) {
        this.f106867a = src.f106867a;
        this.f106868b = src.f106868b;
        this.f106869c = src.f106869c;
        this.f106870d = src.f106870d;
        this.f106871e = src.f106871e;
        return this;
    }

    public abstract void d(HashSet<String> attributes);

    public int e() {
        return this.f106867a;
    }

    public abstract void f(Context context, AttributeSet attrs);

    public boolean g(String constraintTag) {
        String str = this.f106869c;
        if (str == null || constraintTag == null) {
            return false;
        }
        return constraintTag.matches(str);
    }

    public void h(int pos) {
        this.f106867a = pos;
    }

    public void i(HashMap<String, Integer> interpolation) {
    }

    public abstract void j(String tag, Object value);

    public f k(int id2) {
        this.f106868b = id2;
        return this;
    }

    public boolean l(Object value) {
        return value instanceof Boolean ? ((Boolean) value).booleanValue() : Boolean.parseBoolean(value.toString());
    }

    public float m(Object value) {
        return value instanceof Float ? ((Float) value).floatValue() : Float.parseFloat(value.toString());
    }

    public int n(Object value) {
        return value instanceof Integer ? ((Integer) value).intValue() : Integer.parseInt(value.toString());
    }
}
