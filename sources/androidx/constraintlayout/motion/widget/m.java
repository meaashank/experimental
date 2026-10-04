package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.g;
import com.android.launcher3.IconCache;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import w0.AbstractC5735d;

/* JADX INFO: loaded from: classes2.dex */
public class m extends f {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final String f107065Y = "KeyTrigger";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final String f107066Z = "KeyTrigger";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f107067a0 = "viewTransitionOnCross";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f107068b0 = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f107069c0 = "viewTransitionOnNegativeCross";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f107070d0 = "postLayout";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f107071e0 = "triggerSlack";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f107072f0 = "triggerCollisionView";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f107073g0 = "triggerCollisionId";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f107074h0 = "triggerID";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f107075i0 = "positiveCross";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f107076j0 = "negativeCross";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f107077k0 = "triggerReceiver";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f107078l0 = "CROSS";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f107079m0 = 5;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f107080D = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f107081E = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f107082F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f107083G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f107084H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f107085I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f107086J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public View f107087K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public float f107088L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f107089M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f107090N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f107091O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public float f107092P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f107093Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f107094R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f107095S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f107096T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f107097U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RectF f107098V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public RectF f107099W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public HashMap<String, Method> f107100X;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f107101a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f107102b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f107103c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f107104d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f107105e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f107106f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f107107g = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f107108h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f107109i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f107110j = 11;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f107111k = 12;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f107112l = 13;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f107113m = 14;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static SparseIntArray f107114n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f107114n = sparseIntArray;
            sparseIntArray.append(g.m.og, 8);
            f107114n.append(g.m.sg, 4);
            f107114n.append(g.m.tg, 1);
            f107114n.append(g.m.ug, 2);
            f107114n.append(g.m.pg, 7);
            f107114n.append(g.m.vg, 6);
            f107114n.append(g.m.xg, 5);
            f107114n.append(g.m.rg, 9);
            f107114n.append(g.m.qg, 10);
            f107114n.append(g.m.wg, 11);
            f107114n.append(g.m.yg, 12);
            f107114n.append(g.m.zg, 13);
            f107114n.append(g.m.Ag, 14);
        }

        public static void a(m c10, TypedArray a10, Context context) {
            int indexCount = a10.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = a10.getIndex(i10);
                switch (f107114n.get(index)) {
                    case 1:
                        c10.f107083G = a10.getString(index);
                        break;
                    case 2:
                        c10.f107084H = a10.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + f107114n.get(index));
                        break;
                    case 4:
                        c10.f107081E = a10.getString(index);
                        break;
                    case 5:
                        c10.f107088L = a10.getFloat(index, c10.f107088L);
                        break;
                    case 6:
                        c10.f107085I = a10.getResourceId(index, c10.f107085I);
                        break;
                    case 7:
                        if (MotionLayout.f106695O0) {
                            int resourceId = a10.getResourceId(index, c10.f106868b);
                            c10.f106868b = resourceId;
                            if (resourceId == -1) {
                                c10.f106869c = a10.getString(index);
                            }
                        } else if (a10.peekValue(index).type == 3) {
                            c10.f106869c = a10.getString(index);
                        } else {
                            c10.f106868b = a10.getResourceId(index, c10.f106868b);
                        }
                        break;
                    case 8:
                        int integer = a10.getInteger(index, c10.f106867a);
                        c10.f106867a = integer;
                        c10.f107092P = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c10.f107086J = a10.getResourceId(index, c10.f107086J);
                        break;
                    case 10:
                        c10.f107094R = a10.getBoolean(index, c10.f107094R);
                        break;
                    case 11:
                        c10.f107082F = a10.getResourceId(index, c10.f107082F);
                        break;
                    case 12:
                        c10.f107097U = a10.getResourceId(index, c10.f107097U);
                        break;
                    case 13:
                        c10.f107095S = a10.getResourceId(index, c10.f107095S);
                        break;
                    case 14:
                        c10.f107096T = a10.getResourceId(index, c10.f107096T);
                        break;
                }
            }
        }
    }

    public m() {
        int i10 = f.f106846f;
        this.f107082F = i10;
        this.f107083G = null;
        this.f107084H = null;
        this.f107085I = i10;
        this.f107086J = i10;
        this.f107087K = null;
        this.f107088L = 0.1f;
        this.f107089M = true;
        this.f107090N = true;
        this.f107091O = true;
        this.f107092P = Float.NaN;
        this.f107094R = false;
        this.f107095S = i10;
        this.f107096T = i10;
        this.f107097U = i10;
        this.f107098V = new RectF();
        this.f107099W = new RectF();
        this.f107100X = new HashMap<>();
        this.f106870d = 5;
        this.f106871e = new HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A(float r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.A(float, android.view.View):void");
    }

    public final void B(String str, View call) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(IconCache.EMPTY_CLASS_NAME)) {
            C(str, call);
            return;
        }
        if (this.f107100X.containsKey(str)) {
            method = this.f107100X.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, null);
                this.f107100X.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f107100X.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + call.getClass().getSimpleName() + C4.q.f17581a + C2377c.k(call));
                return;
            }
        }
        try {
            method.invoke(call, null);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.f107081E + "\"on class " + call.getClass().getSimpleName() + C4.q.f17581a + C2377c.k(call));
        }
    }

    public final void C(String str, View view) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f106871e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f106871e.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.a(view);
                }
            }
        }
    }

    public int D() {
        return this.f107080D;
    }

    public final void E(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, AbstractC5735d> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        m mVar = new m();
        mVar.c(this);
        return mVar;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        m mVar = (m) src;
        this.f107080D = mVar.f107080D;
        this.f107081E = mVar.f107081E;
        this.f107082F = mVar.f107082F;
        this.f107083G = mVar.f107083G;
        this.f107084H = mVar.f107084H;
        this.f107085I = mVar.f107085I;
        this.f107086J = mVar.f107086J;
        this.f107087K = mVar.f107087K;
        this.f107088L = mVar.f107088L;
        this.f107089M = mVar.f107089M;
        this.f107090N = mVar.f107090N;
        this.f107091O = mVar.f107091O;
        this.f107092P = mVar.f107092P;
        this.f107093Q = mVar.f107093Q;
        this.f107094R = mVar.f107094R;
        this.f107098V = mVar.f107098V;
        this.f107099W = mVar.f107099W;
        this.f107100X = mVar.f107100X;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> attributes) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attrs) {
        a.a(this, context.obtainStyledAttributes(attrs, g.m.ng), context);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String tag, Object value) {
        tag.getClass();
        switch (tag) {
            case "positiveCross":
                this.f107084H = value.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.f107096T = n(value);
                break;
            case "triggerCollisionId":
                this.f107086J = n(value);
                break;
            case "triggerID":
                this.f107085I = n(value);
                break;
            case "negativeCross":
                this.f107083G = value.toString();
                break;
            case "triggerCollisionView":
                this.f107087K = (View) value;
                break;
            case "viewTransitionOnNegativeCross":
                this.f107095S = n(value);
                break;
            case "CROSS":
                this.f107081E = value.toString();
                break;
            case "triggerSlack":
                this.f107088L = m(value);
                break;
            case "viewTransitionOnCross":
                this.f107097U = n(value);
                break;
            case "postLayout":
                this.f107094R = l(value);
                break;
            case "triggerReceiver":
                this.f107082F = n(value);
                break;
        }
    }
}
