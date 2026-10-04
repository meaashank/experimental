package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.g;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s0.C5563e;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f107248A = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f107249B = -2;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f107250C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f107251D = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f107252E = 1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f107253F = 2;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f107254G = "MotionScene";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f107255H = "Transition";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f107256I = "OnSwipe";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f107257J = "OnClick";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final String f107258K = "StateSet";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f107259L = "Include";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f107260M = "include";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f107261N = "KeyFrameSet";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f107262O = "ConstraintSet";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f107263P = "ViewTransition";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f107264Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f107265R = 1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f107266S = 2;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int f107267T = 3;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f107268U = 4;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int f107269V = 5;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int f107270W = 6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f107271v = "MotionScene";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f107272w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f107273x = 8;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f107274y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f107275z = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f107276a;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MotionEvent f107289n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MotionLayout.i f107292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f107293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C f107294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f107295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f107296u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.widget.i f107277b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f107278c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f107279d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<b> f107280e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f107281f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList<b> f107282g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.d> f107283h = new SparseArray<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap<String, Integer> f107284i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SparseIntArray f107285j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f107286k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f107287l = 400;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f107288m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f107290o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f107291p = false;

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C5563e f107297a;

        public a(final u this$0, final C5563e val$easing) {
            this.f107297a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v10) {
            return (float) this.f107297a.a(v10);
        }
    }

    public u(MotionLayout layout) {
        this.f107276a = layout;
        this.f107294s = new C(layout);
    }

    public static String A(Context context, int resourceId, XmlPullParser pullParser) {
        return ".(" + C2377c.i(context, resourceId) + ".xml:" + pullParser.getLineNumber() + ") \"" + pullParser.getName() + "\"";
    }

    public static String q0(String id2) {
        if (id2 == null) {
            return "";
        }
        int iIndexOf = id2.indexOf(47);
        return iIndexOf < 0 ? id2 : id2.substring(iIndexOf + 1);
    }

    public float B() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0.0f;
        }
        return xVar.i();
    }

    public float C() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0.0f;
        }
        return xVar.j();
    }

    public boolean D() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return false;
        }
        return xVar.k();
    }

    public float E(View view, int position) {
        return 0.0f;
    }

    public float F(float dx, float dy) {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0.0f;
        }
        return xVar.l(dx, dy);
    }

    public final int G(int stateId) {
        int iE;
        androidx.constraintlayout.widget.i iVar = this.f107277b;
        return (iVar == null || (iE = iVar.e(stateId, -1, -1)) == -1) ? stateId : iE;
    }

    public int H() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0;
        }
        return xVar.m();
    }

    public float I() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0.0f;
        }
        return xVar.n();
    }

    public float J() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0.0f;
        }
        return xVar.o();
    }

    public float K() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0.0f;
        }
        return xVar.p();
    }

    public float L() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0.0f;
        }
        return xVar.q();
    }

    public float M() {
        b bVar = this.f107278c;
        if (bVar != null) {
            return bVar.f107323i;
        }
        return 0.0f;
    }

    public int N() {
        b bVar = this.f107278c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f107318d;
    }

    public b O(int id2) {
        ArrayList<b> arrayList = this.f107280e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            b bVar = arrayList.get(i10);
            i10++;
            b bVar2 = bVar;
            if (bVar2.f107315a == id2) {
                return bVar2;
            }
        }
        return null;
    }

    public int P(int stateId) {
        ArrayList<b> arrayList = this.f107280e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            b bVar = arrayList.get(i10);
            i10++;
            if (bVar.f107318d == stateId) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> Q(int stateId) {
        int iG = G(stateId);
        ArrayList arrayList = new ArrayList();
        ArrayList<b> arrayList2 = this.f107280e;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            b bVar = arrayList2.get(i10);
            i10++;
            b bVar2 = bVar;
            if (bVar2.f107318d == iG || bVar2.f107317c == iG) {
                arrayList.add(bVar2);
            }
        }
        return arrayList;
    }

    public final boolean R(int key) {
        int i10 = this.f107285j.get(key);
        int size = this.f107285j.size();
        while (i10 > 0) {
            if (i10 == key) {
                return true;
            }
            int i11 = size - 1;
            if (size < 0) {
                return true;
            }
            i10 = this.f107285j.get(i10);
            size = i11;
        }
        return false;
    }

    public boolean S(View view, int position) {
        b bVar = this.f107278c;
        if (bVar == null) {
            return false;
        }
        ArrayList<i> arrayList = bVar.f107325k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            i iVar = arrayList.get(i10);
            i10++;
            ArrayList<f> arrayListD = iVar.d(view.getId());
            int size2 = arrayListD.size();
            int i11 = 0;
            while (i11 < size2) {
                f fVar = arrayListD.get(i11);
                i11++;
                if (fVar.f106867a == position) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean T() {
        return this.f107292q != null;
    }

    public boolean U(int id2) {
        return this.f107294s.h(id2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void V(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f107286k) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            b10 = !name.equals("ConstraintSet") ? (byte) -1 : (byte) 5;
                            break;
                        case -1239391468:
                            b10 = !name.equals("KeyFrameSet") ? (byte) -1 : (byte) 8;
                            break;
                        case -687739768:
                            b10 = !name.equals(f107259L) ? (byte) -1 : (byte) 7;
                            break;
                        case 61998586:
                            b10 = !name.equals("ViewTransition") ? (byte) -1 : (byte) 9;
                            break;
                        case 269306229:
                            if (!name.equals(f107255H)) {
                                b10 = -1;
                            }
                            break;
                        case 312750793:
                            b10 = !name.equals(f107257J) ? (byte) -1 : (byte) 3;
                            break;
                        case 327855227:
                            b10 = !name.equals(f107256I) ? (byte) -1 : (byte) 2;
                            break;
                        case 793277014:
                            b10 = !name.equals("MotionScene") ? (byte) -1 : (byte) 0;
                            break;
                        case 1382829617:
                            b10 = !name.equals(f107258K) ? (byte) -1 : (byte) 4;
                            break;
                        case 1942574248:
                            b10 = !name.equals("include") ? (byte) -1 : (byte) 6;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            c0(context, xml);
                            break;
                        case 1:
                            ArrayList<b> arrayList = this.f107280e;
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.f107278c == null && !bVar.f107316b) {
                                this.f107278c = bVar;
                                x xVar = bVar.f107326l;
                                if (xVar != null) {
                                    xVar.D(this.f107293r);
                                }
                            }
                            if (bVar.f107316b) {
                                if (bVar.f107317c == -1) {
                                    this.f107281f = bVar;
                                } else {
                                    this.f107282g.add(bVar);
                                }
                                this.f107280e.remove(bVar);
                            }
                            break;
                        case 2:
                            if (bVar == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(resourceId) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (bVar != null) {
                                bVar.f107326l = new x(context, this.f107276a, xml);
                            }
                            break;
                        case 3:
                            if (bVar != null) {
                                bVar.v(context, xml);
                            }
                            break;
                        case 4:
                            this.f107277b = new androidx.constraintlayout.widget.i(context, xml);
                            break;
                        case 5:
                            Z(context, xml);
                            break;
                        case 6:
                        case 7:
                            b0(context, xml);
                            break;
                        case 8:
                            i iVar = new i(context, xml);
                            if (bVar != null) {
                                bVar.f107325k.add(iVar);
                            }
                            break;
                        case 9:
                            this.f107294s.b(new B(context, xml));
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public int W(String id2) {
        Integer num = this.f107284i.get(id2);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String X(int id2) {
        for (Map.Entry<String, Integer> entry : this.f107284i.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == id2) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void Y(boolean changed, int left, int top, int right, int bottom) {
    }

    public final int Z(Context context, XmlPullParser parser) {
        String attributeValue;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f107978f = false;
        int attributeCount = parser.getAttributeCount();
        int iV = -1;
        int iV2 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = parser.getAttributeName(i10);
            attributeValue = parser.getAttributeValue(i10);
            if (this.f107286k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iV2 = v(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        dVar.f107976d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                dVar.f107976d = 4;
                                break;
                            case "left":
                                dVar.f107976d = 2;
                                break;
                            case "none":
                                dVar.f107976d = 0;
                                break;
                            case "right":
                                dVar.f107976d = 1;
                                break;
                            case "x_right":
                                dVar.f107976d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iV = v(context, attributeValue);
                    this.f107284i.put(q0(attributeValue), Integer.valueOf(iV));
                    dVar.f107974b = C2377c.i(context, iV);
                    break;
            }
        }
        if (iV != -1) {
            if (this.f107276a.f106778x != 0) {
                dVar.f107973a = true;
            }
            dVar.x0(context, parser);
            if (iV2 != -1) {
                this.f107285j.put(iV, iV2);
            }
            this.f107283h.put(iV, dVar);
        }
        return iV;
    }

    public final int a0(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return Z(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            e10.printStackTrace();
            return -1;
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    public final void b0(Context context, XmlPullParser mainParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(mainParser), g.m.To);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == g.m.Uo) {
                a0(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c0(Context context, XmlPullParser parser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.sk);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == g.m.tk) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f107287l);
                this.f107287l = i11;
                if (i11 < 8) {
                    this.f107287l = 8;
                }
            } else if (index == g.m.uk) {
                this.f107288m = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void d0(float dx, float dy) {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return;
        }
        xVar.w(dx, dy);
    }

    public void e0(float dx, float dy) {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return;
        }
        xVar.x(dx, dy);
    }

    public void f(MotionLayout motionLayout, int currentState) {
        ArrayList<b> arrayList = this.f107280e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            b bVar = arrayList.get(i10);
            i10++;
            b bVar2 = bVar;
            if (bVar2.f107327m.size() > 0) {
                ArrayList<b.a> arrayList2 = bVar2.f107327m;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    b.a aVar = arrayList2.get(i11);
                    i11++;
                    aVar.c(motionLayout);
                }
            }
        }
        ArrayList<b> arrayList3 = this.f107282g;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            b bVar3 = arrayList3.get(i12);
            i12++;
            b bVar4 = bVar3;
            if (bVar4.f107327m.size() > 0) {
                ArrayList<b.a> arrayList4 = bVar4.f107327m;
                int size4 = arrayList4.size();
                int i13 = 0;
                while (i13 < size4) {
                    b.a aVar2 = arrayList4.get(i13);
                    i13++;
                    aVar2.c(motionLayout);
                }
            }
        }
        ArrayList<b> arrayList5 = this.f107280e;
        int size5 = arrayList5.size();
        int i14 = 0;
        while (i14 < size5) {
            b bVar5 = arrayList5.get(i14);
            i14++;
            b bVar6 = bVar5;
            if (bVar6.f107327m.size() > 0) {
                ArrayList<b.a> arrayList6 = bVar6.f107327m;
                int size6 = arrayList6.size();
                int i15 = 0;
                while (i15 < size6) {
                    b.a aVar3 = arrayList6.get(i15);
                    i15++;
                    aVar3.a(motionLayout, currentState, bVar6);
                }
            }
        }
        ArrayList<b> arrayList7 = this.f107282g;
        int size7 = arrayList7.size();
        int i16 = 0;
        while (i16 < size7) {
            b bVar7 = arrayList7.get(i16);
            i16++;
            b bVar8 = bVar7;
            if (bVar8.f107327m.size() > 0) {
                ArrayList<b.a> arrayList8 = bVar8.f107327m;
                int size8 = arrayList8.size();
                int i17 = 0;
                while (i17 < size8) {
                    b.a aVar4 = arrayList8.get(i17);
                    i17++;
                    aVar4.a(motionLayout, currentState, bVar8);
                }
            }
        }
    }

    public void f0(MotionEvent event, int currentState, MotionLayout motionLayout) {
        MotionLayout.i iVar;
        x xVar;
        MotionEvent motionEvent;
        RectF rectF = new RectF();
        if (this.f107292q == null) {
            this.f107292q = this.f107276a.H0();
        }
        this.f107292q.c(event);
        if (currentState != -1) {
            int action = event.getAction();
            boolean z10 = false;
            if (action == 0) {
                this.f107295t = event.getRawX();
                this.f107296u = event.getRawY();
                this.f107289n = event;
                this.f107290o = false;
                x xVar2 = this.f107278c.f107326l;
                if (xVar2 != null) {
                    RectF rectFG = xVar2.g(this.f107276a, rectF);
                    if (rectFG != null && !rectFG.contains(this.f107289n.getX(), this.f107289n.getY())) {
                        this.f107289n = null;
                        this.f107290o = true;
                        return;
                    }
                    RectF rectFR = this.f107278c.f107326l.r(this.f107276a, rectF);
                    if (rectFR == null || rectFR.contains(this.f107289n.getX(), this.f107289n.getY())) {
                        this.f107291p = false;
                    } else {
                        this.f107291p = true;
                    }
                    this.f107278c.f107326l.A(this.f107295t, this.f107296u);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f107290o) {
                float rawY = event.getRawY() - this.f107296u;
                float rawX = event.getRawX() - this.f107295t;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent = this.f107289n) == null) {
                    return;
                }
                b bVarJ = j(currentState, rawX, rawY, motionEvent);
                if (bVarJ != null) {
                    motionLayout.c1(bVarJ);
                    RectF rectFR2 = this.f107278c.f107326l.r(this.f107276a, rectF);
                    if (rectFR2 != null && !rectFR2.contains(this.f107289n.getX(), this.f107289n.getY())) {
                        z10 = true;
                    }
                    this.f107291p = z10;
                    this.f107278c.f107326l.G(this.f107295t, this.f107296u);
                }
            }
        }
        if (this.f107290o) {
            return;
        }
        b bVar = this.f107278c;
        if (bVar != null && (xVar = bVar.f107326l) != null && !this.f107291p) {
            xVar.u(event, this.f107292q, currentState, this);
        }
        this.f107295t = event.getRawX();
        this.f107296u = event.getRawY();
        if (event.getAction() != 1 || (iVar = this.f107292q) == null) {
            return;
        }
        iVar.a();
        this.f107292q = null;
        int i10 = motionLayout.f106742f;
        if (i10 != -1) {
            i(motionLayout, i10);
        }
    }

    public void g(b transition) {
        int iW = w(transition);
        if (iW == -1) {
            this.f107280e.add(transition);
        } else {
            this.f107280e.set(iW, transition);
        }
    }

    public final void g0(int key, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.d dVar = this.f107283h.get(key);
        dVar.f107975c = dVar.f107974b;
        int i10 = this.f107285j.get(key);
        if (i10 > 0) {
            g0(i10, motionLayout);
            androidx.constraintlayout.widget.d dVar2 = this.f107283h.get(i10);
            if (dVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + C2377c.i(this.f107276a.getContext(), i10));
                return;
            } else {
                dVar.f107975c += RemoteSettings.FORWARD_SLASH_STRING + dVar2.f107975c;
                dVar.J0(dVar2);
            }
        } else {
            dVar.f107975c = android.support.v4.media.e.a(new StringBuilder(), dVar.f107975c, "  layout");
            dVar.I0(motionLayout);
        }
        dVar.q(dVar);
    }

    public boolean h(int viewTransitionId, o motionController) {
        return this.f107294s.e(viewTransitionId, motionController);
    }

    public void h0(MotionLayout motionLayout) {
        for (int i10 = 0; i10 < this.f107283h.size(); i10++) {
            int iKeyAt = this.f107283h.keyAt(i10);
            if (R(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            g0(iKeyAt, motionLayout);
        }
    }

    public boolean i(MotionLayout motionLayout, int currentState) {
        b bVar;
        int i10;
        int i11;
        if (!T() && !this.f107279d) {
            ArrayList<b> arrayList = this.f107280e;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                b bVar2 = arrayList.get(i12);
                i12++;
                b bVar3 = bVar2;
                if (bVar3.f107328n != 0 && ((bVar = this.f107278c) != bVar3 || !bVar.L(2))) {
                    if (currentState == bVar3.f107318d && ((i11 = bVar3.f107328n) == 4 || i11 == 2)) {
                        MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                        motionLayout.Z0(transitionState);
                        motionLayout.c1(bVar3);
                        if (bVar3.f107328n == 4) {
                            motionLayout.k1();
                            motionLayout.Z0(MotionLayout.TransitionState.SETUP);
                            motionLayout.Z0(MotionLayout.TransitionState.MOVING);
                            return true;
                        }
                        motionLayout.V0(1.0f);
                        motionLayout.Z(true);
                        motionLayout.Z0(MotionLayout.TransitionState.SETUP);
                        motionLayout.Z0(MotionLayout.TransitionState.MOVING);
                        motionLayout.Z0(transitionState);
                        motionLayout.I0();
                        return true;
                    }
                    if (currentState == bVar3.f107317c && ((i10 = bVar3.f107328n) == 3 || i10 == 1)) {
                        MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                        motionLayout.Z0(transitionState2);
                        motionLayout.c1(bVar3);
                        if (bVar3.f107328n == 3) {
                            motionLayout.m1();
                            motionLayout.Z0(MotionLayout.TransitionState.SETUP);
                            motionLayout.Z0(MotionLayout.TransitionState.MOVING);
                            return true;
                        }
                        motionLayout.V0(0.0f);
                        motionLayout.Z(true);
                        motionLayout.Z0(MotionLayout.TransitionState.SETUP);
                        motionLayout.Z0(MotionLayout.TransitionState.MOVING);
                        motionLayout.Z0(transitionState2);
                        motionLayout.I0();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void i0(b transition) {
        int iW = w(transition);
        if (iW != -1) {
            this.f107280e.remove(iW);
        }
    }

    public b j(int currentState, float dx, float dy, MotionEvent lastTouchDown) {
        float f10 = dx;
        float f11 = dy;
        if (currentState == -1) {
            return this.f107278c;
        }
        List<b> listQ = Q(currentState);
        RectF rectF = new RectF();
        ArrayList arrayList = (ArrayList) listQ;
        int size = arrayList.size();
        float f12 = 0.0f;
        b bVar = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar2 = (b) obj;
            if (!bVar2.f107329o) {
                x xVar = bVar2.f107326l;
                if (xVar != null) {
                    xVar.D(this.f107293r);
                    RectF rectFR = bVar2.f107326l.r(this.f107276a, rectF);
                    if (rectFR == null || lastTouchDown == null || rectFR.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                        RectF rectFG = bVar2.f107326l.g(this.f107276a, rectF);
                        if (rectFG == null || lastTouchDown == null || rectFG.contains(lastTouchDown.getX(), lastTouchDown.getY())) {
                            float fA = bVar2.f107326l.a(f10, f11);
                            if (bVar2.f107326l.f107432l && lastTouchDown != null) {
                                fA = ((float) (Math.atan2(f11 + r12, f10 + r11) - Math.atan2(lastTouchDown.getX() - bVar2.f107326l.f107429i, lastTouchDown.getY() - bVar2.f107326l.f107430j))) * 10.0f;
                            }
                            float f13 = fA * (bVar2.f107317c == currentState ? -1.0f : 1.1f);
                            if (f13 > f12) {
                                bVar = bVar2;
                                f12 = f13;
                            }
                        }
                    }
                }
                f10 = dx;
                f11 = dy;
            }
        }
        return bVar;
    }

    public void j0(int id2, androidx.constraintlayout.widget.d set) {
        this.f107283h.put(id2, set);
    }

    public void k(boolean disable) {
        this.f107279d = disable;
    }

    public void k0(int duration) {
        b bVar = this.f107278c;
        if (bVar != null) {
            bVar.O(duration);
        } else {
            this.f107287l = duration;
        }
    }

    public void l(int id2, boolean enable) {
        this.f107294s.f(id2, enable);
    }

    public void l0(View view, int position, String name, Object value) {
        b bVar = this.f107278c;
        if (bVar == null) {
            return;
        }
        ArrayList<i> arrayList = bVar.f107325k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            i iVar = arrayList.get(i10);
            i10++;
            ArrayList<f> arrayListD = iVar.d(view.getId());
            int size2 = arrayListD.size();
            int i11 = 0;
            while (i11 < size2) {
                f fVar = arrayListD.get(i11);
                i11++;
                if (fVar.f106867a == position) {
                    if (value != null) {
                    }
                    name.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    public int m() {
        b bVar = this.f107278c;
        if (bVar != null) {
            return bVar.f107330p;
        }
        return -1;
    }

    public void m0(boolean rtl) {
        x xVar;
        this.f107293r = rtl;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return;
        }
        xVar.D(rtl);
    }

    public int n() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return 0;
        }
        return xVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n0(int r11, int r12) {
        /*
            r10 = this;
            androidx.constraintlayout.widget.i r0 = r10.f107277b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.e(r11, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r11
        Ld:
            androidx.constraintlayout.widget.i r2 = r10.f107277b
            int r2 = r2.e(r12, r1, r1)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r12
            goto L1a
        L18:
            r0 = r11
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.u$b r3 = r10.f107278c
            if (r3 == 0) goto L27
            int r4 = r3.f107317c
            if (r4 != r12) goto L27
            int r3 = r3.f107318d
            if (r3 != r11) goto L27
            goto L52
        L27:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.u$b> r3 = r10.f107280e
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L2f:
            if (r6 >= r4) goto L53
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            androidx.constraintlayout.motion.widget.u$b r7 = (androidx.constraintlayout.motion.widget.u.b) r7
            int r8 = r7.f107317c
            if (r8 != r2) goto L41
            int r9 = r7.f107318d
            if (r9 == r0) goto L47
        L41:
            if (r8 != r12) goto L2f
            int r8 = r7.f107318d
            if (r8 != r11) goto L2f
        L47:
            r10.f107278c = r7
            androidx.constraintlayout.motion.widget.x r11 = r7.f107326l
            if (r11 == 0) goto L52
            boolean r12 = r10.f107293r
            r11.D(r12)
        L52:
            return
        L53:
            androidx.constraintlayout.motion.widget.u$b r11 = r10.f107281f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.u$b> r3 = r10.f107282g
            int r4 = r3.size()
        L5b:
            if (r5 >= r4) goto L6b
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            androidx.constraintlayout.motion.widget.u$b r6 = (androidx.constraintlayout.motion.widget.u.b) r6
            int r7 = r6.f107317c
            if (r7 != r12) goto L5b
            r11 = r6
            goto L5b
        L6b:
            androidx.constraintlayout.motion.widget.u$b r12 = new androidx.constraintlayout.motion.widget.u$b
            r12.<init>(r10, r11)
            r12.f107318d = r0
            r12.f107317c = r2
            if (r0 == r1) goto L7b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.u$b> r11 = r10.f107280e
            r11.add(r12)
        L7b:
            r10.f107278c = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.u.n0(int, int):void");
    }

    public androidx.constraintlayout.widget.d o(int id2) {
        return p(id2, -1, -1);
    }

    public void o0(b transition) {
        x xVar;
        this.f107278c = transition;
        if (transition == null || (xVar = transition.f107326l) == null) {
            return;
        }
        xVar.D(this.f107293r);
    }

    public androidx.constraintlayout.widget.d p(int id2, int width, int height) {
        int iE;
        if (this.f107286k) {
            System.out.println("id " + id2);
            System.out.println("size " + this.f107283h.size());
        }
        androidx.constraintlayout.widget.i iVar = this.f107277b;
        if (iVar != null && (iE = iVar.e(id2, width, height)) != -1) {
            id2 = iE;
        }
        if (this.f107283h.get(id2) != null) {
            return this.f107283h.get(id2);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + C2377c.i(this.f107276a.getContext(), id2) + " In MotionScene");
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f107283h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public void p0() {
        x xVar;
        b bVar = this.f107278c;
        if (bVar == null || (xVar = bVar.f107326l) == null) {
            return;
        }
        xVar.H();
    }

    public androidx.constraintlayout.widget.d q(Context context, String id2) {
        if (this.f107286k) {
            System.out.println("id " + id2);
            System.out.println("size " + this.f107283h.size());
        }
        for (int i10 = 0; i10 < this.f107283h.size(); i10++) {
            int iKeyAt = this.f107283h.keyAt(i10);
            String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.f107286k) {
                System.out.println("Id for <" + i10 + "> is <" + resourceName + "> looking for <" + id2 + ">");
            }
            if (id2.equals(resourceName)) {
                return this.f107283h.get(iKeyAt);
            }
        }
        return null;
    }

    public int[] r() {
        int size = this.f107283h.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f107283h.keyAt(i10);
        }
        return iArr;
    }

    public boolean r0() {
        ArrayList<b> arrayList = this.f107280e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            b bVar = arrayList.get(i10);
            i10++;
            if (bVar.f107326l != null) {
                return true;
            }
        }
        b bVar2 = this.f107278c;
        return (bVar2 == null || bVar2.f107326l == null) ? false : true;
    }

    public ArrayList<b> s() {
        return this.f107280e;
    }

    public boolean s0(MotionLayout layout) {
        return layout == this.f107276a && layout.f106732a == this;
    }

    public int t() {
        b bVar = this.f107278c;
        return bVar != null ? bVar.f107322h : this.f107287l;
    }

    public void t0(int id2, View... view) {
        this.f107294s.m(id2, view);
    }

    public int u() {
        b bVar = this.f107278c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f107317c;
    }

    public final int v(Context context, String idString) {
        int identifier;
        if (idString.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
            identifier = context.getResources().getIdentifier(idString.substring(idString.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f107286k) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (idString.length() > 1) {
                return Integer.parseInt(idString.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final int w(b transition) {
        int i10 = transition.f107315a;
        if (i10 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i11 = 0; i11 < this.f107280e.size(); i11++) {
            if (this.f107280e.get(i11).f107315a == i10) {
                return i11;
            }
        }
        return -1;
    }

    public Interpolator x() {
        b bVar = this.f107278c;
        int i10 = bVar.f107319e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f107276a.getContext(), this.f107278c.f107321g);
        }
        if (i10 == -1) {
            return new a(this, C5563e.c(bVar.f107320f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public f y(Context context, int type, int target, int position) {
        b bVar = this.f107278c;
        if (bVar == null) {
            return null;
        }
        ArrayList<i> arrayList = bVar.f107325k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            i iVar = arrayList.get(i10);
            i10++;
            i iVar2 = iVar;
            for (Integer num : iVar2.e()) {
                if (target == num.intValue()) {
                    ArrayList<f> arrayListD = iVar2.d(num.intValue());
                    int size2 = arrayListD.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        f fVar = arrayListD.get(i11);
                        i11++;
                        f fVar2 = fVar;
                        if (fVar2.f106867a == position && fVar2.f106870d == type) {
                            return fVar2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void z(o motionController) {
        b bVar = this.f107278c;
        int i10 = 0;
        if (bVar != null) {
            ArrayList<i> arrayList = bVar.f107325k;
            int size = arrayList.size();
            while (i10 < size) {
                i iVar = arrayList.get(i10);
                i10++;
                iVar.b(motionController);
            }
            return;
        }
        b bVar2 = this.f107281f;
        if (bVar2 != null) {
            ArrayList<i> arrayList2 = bVar2.f107325k;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                i iVar2 = arrayList2.get(i10);
                i10++;
                iVar2.b(motionController);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f107298A = -2;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int f107299B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final int f107300C = 0;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final int f107301D = 1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int f107302E = 2;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final int f107303F = 3;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final int f107304G = 4;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final int f107305H = 5;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final int f107306I = 6;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f107307s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f107308t = 1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f107309u = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f107310v = 3;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f107311w = 4;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f107312x = 1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final int f107313y = 2;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f107314z = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f107316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f107317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f107318d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f107319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f107320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f107321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f107322h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f107323i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final u f107324j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList<i> f107325k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public x f107326l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ArrayList<a> f107327m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f107328n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f107329o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f107330p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f107331q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f107332r;

        public b(u motionScene, b global) {
            this.f107315a = -1;
            this.f107316b = false;
            this.f107317c = -1;
            this.f107318d = -1;
            this.f107319e = 0;
            this.f107320f = null;
            this.f107321g = -1;
            this.f107322h = 400;
            this.f107323i = 0.0f;
            this.f107325k = new ArrayList<>();
            this.f107326l = null;
            this.f107327m = new ArrayList<>();
            this.f107328n = 0;
            this.f107329o = false;
            this.f107330p = -1;
            this.f107331q = 0;
            this.f107332r = 0;
            this.f107324j = motionScene;
            this.f107322h = motionScene.f107287l;
            if (global != null) {
                this.f107330p = global.f107330p;
                this.f107319e = global.f107319e;
                this.f107320f = global.f107320f;
                this.f107321g = global.f107321g;
                this.f107322h = global.f107322h;
                this.f107325k = global.f107325k;
                this.f107323i = global.f107323i;
                this.f107331q = global.f107331q;
            }
        }

        public int A() {
            return this.f107322h;
        }

        public int B() {
            return this.f107317c;
        }

        public int C() {
            return this.f107315a;
        }

        public List<i> D() {
            return this.f107325k;
        }

        public int E() {
            return this.f107331q;
        }

        public List<a> F() {
            return this.f107327m;
        }

        public int G() {
            return this.f107330p;
        }

        public float H() {
            return this.f107323i;
        }

        public int I() {
            return this.f107318d;
        }

        public x J() {
            return this.f107326l;
        }

        public boolean K() {
            return !this.f107329o;
        }

        public boolean L(int flag) {
            return (flag & this.f107332r) != 0;
        }

        public void M(int id2) {
            a aVar;
            ArrayList<a> arrayList = this.f107327m;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    aVar = null;
                    break;
                }
                a aVar2 = arrayList.get(i10);
                i10++;
                aVar = aVar2;
                if (aVar.f107339b == id2) {
                    break;
                }
            }
            if (aVar != null) {
                this.f107327m.remove(aVar);
            }
        }

        public void N(int type) {
            this.f107328n = type;
        }

        public void O(int duration) {
            this.f107322h = Math.max(duration, 8);
        }

        public void P(boolean enable) {
            Q(enable);
        }

        public void Q(boolean enable) {
            this.f107329o = !enable;
        }

        public void R(int interpolator, String interpolatorString, int interpolatorID) {
            this.f107319e = interpolator;
            this.f107320f = interpolatorString;
            this.f107321g = interpolatorID;
        }

        public void S(int mode) {
            this.f107331q = mode;
        }

        public void T(v onSwipe) {
            this.f107326l = onSwipe == null ? null : new x(this.f107324j.f107276a, onSwipe);
        }

        public void U(int touchUpMode) {
            x xVarJ = J();
            if (xVarJ != null) {
                xVarJ.F(touchUpMode);
            }
        }

        public void V(int arcMode) {
            this.f107330p = arcMode;
        }

        public void W(float stagger) {
            this.f107323i = stagger;
        }

        public void X(int flag) {
            this.f107332r = flag;
        }

        public void t(i keyFrames) {
            this.f107325k.add(keyFrames);
        }

        public void u(int id2, int action) {
            ArrayList<a> arrayList = this.f107327m;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                a aVar = arrayList.get(i10);
                i10++;
                a aVar2 = aVar;
                if (aVar2.f107339b == id2) {
                    aVar2.f107340c = action;
                    return;
                }
            }
            this.f107327m.add(new a(this, id2, action));
        }

        public void v(Context context, XmlPullParser parser) {
            this.f107327m.add(new a(context, this, parser));
        }

        public String w(Context context) {
            String resourceEntryName = this.f107318d == -1 ? "null" : context.getResources().getResourceEntryName(this.f107318d);
            if (this.f107317c == -1) {
                return androidx.compose.runtime.changelist.j.a(resourceEntryName, " -> null");
            }
            StringBuilder sbA = android.support.v4.media.f.a(resourceEntryName, " -> ");
            sbA.append(context.getResources().getResourceEntryName(this.f107317c));
            return sbA.toString();
        }

        public final void x(u motionScene, Context context, TypedArray a10) {
            int indexCount = a10.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = a10.getIndex(i10);
                if (index == g.m.Zn) {
                    this.f107317c = a10.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f107317c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.w0(context, this.f107317c);
                        motionScene.f107283h.append(this.f107317c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f107317c = motionScene.a0(context, this.f107317c);
                    }
                } else if (index == g.m.ao) {
                    this.f107318d = a10.getResourceId(index, this.f107318d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f107318d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.w0(context, this.f107318d);
                        motionScene.f107283h.append(this.f107318d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f107318d = motionScene.a0(context, this.f107318d);
                    }
                } else if (index == g.m.eo) {
                    int i11 = a10.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = a10.getResourceId(index, -1);
                        this.f107321g = resourceId;
                        if (resourceId != -1) {
                            this.f107319e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = a10.getString(index);
                        this.f107320f = string;
                        if (string != null) {
                            if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                                this.f107321g = a10.getResourceId(index, -1);
                                this.f107319e = -2;
                            } else {
                                this.f107319e = -1;
                            }
                        }
                    } else {
                        this.f107319e = a10.getInteger(index, this.f107319e);
                    }
                } else if (index == g.m.bo) {
                    int i12 = a10.getInt(index, this.f107322h);
                    this.f107322h = i12;
                    if (i12 < 8) {
                        this.f107322h = 8;
                    }
                } else if (index == g.m.go) {
                    this.f107323i = a10.getFloat(index, this.f107323i);
                } else if (index == g.m.Yn) {
                    this.f107328n = a10.getInteger(index, this.f107328n);
                } else if (index == g.m.Xn) {
                    this.f107315a = a10.getResourceId(index, this.f107315a);
                } else if (index == g.m.ho) {
                    this.f107329o = a10.getBoolean(index, this.f107329o);
                } else if (index == g.m.fo) {
                    this.f107330p = a10.getInteger(index, -1);
                } else if (index == g.m.co) {
                    this.f107331q = a10.getInteger(index, 0);
                } else if (index == g.m.f110314io) {
                    this.f107332r = a10.getInteger(index, 0);
                }
            }
            if (this.f107318d == -1) {
                this.f107316b = true;
            }
        }

        public final void y(u motionScene, Context context, AttributeSet attrs) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, g.m.Wn);
            x(motionScene, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int z() {
            return this.f107328n;
        }

        public static class a implements View.OnClickListener {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f107333d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f107334e = 17;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f107335f = 16;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f107336g = 256;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f107337h = 4096;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f107338a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f107339b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f107340c;

            public a(Context context, b transition, XmlPullParser parser) {
                this.f107339b = -1;
                this.f107340c = 17;
                this.f107338a = transition;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.zk);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == g.m.Bk) {
                        this.f107339b = typedArrayObtainStyledAttributes.getResourceId(index, this.f107339b);
                    } else if (index == g.m.Ak) {
                        this.f107340c = typedArrayObtainStyledAttributes.getInt(index, this.f107340c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i10, b bVar) {
                int i11 = this.f107339b;
                View viewFindViewById = motionLayout;
                if (i11 != -1) {
                    viewFindViewById = motionLayout.findViewById(i11);
                }
                if (viewFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f107339b);
                    return;
                }
                int i12 = bVar.f107318d;
                int i13 = bVar.f107317c;
                if (i12 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i14 = this.f107340c;
                boolean z10 = false;
                boolean z11 = ((i14 & 1) != 0 && i10 == i12) | ((i14 & 1) != 0 && i10 == i12) | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13);
                if ((i14 & 4096) != 0 && i10 == i13) {
                    z10 = true;
                }
                if (z11 || z10) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            public boolean b(b current, MotionLayout tl) {
                b bVar = this.f107338a;
                if (bVar == current) {
                    return true;
                }
                int i10 = bVar.f107317c;
                int i11 = bVar.f107318d;
                if (i11 == -1) {
                    return tl.f106742f != i10;
                }
                int i12 = tl.f106742f;
                return i12 == i11 || i12 == i10;
            }

            public void c(MotionLayout motionLayout) {
                int i10 = this.f107339b;
                if (i10 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i10);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.f107339b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f107338a.f107324j.f107276a;
                if (motionLayout.D0()) {
                    b bVar = this.f107338a;
                    if (bVar.f107318d == -1) {
                        int iJ0 = motionLayout.j0();
                        if (iJ0 == -1) {
                            motionLayout.n1(this.f107338a.f107317c);
                            return;
                        }
                        b bVar2 = this.f107338a;
                        b bVar3 = new b(bVar2.f107324j, bVar2);
                        bVar3.f107318d = iJ0;
                        bVar3.f107317c = this.f107338a.f107317c;
                        motionLayout.c1(bVar3);
                        motionLayout.k1();
                        return;
                    }
                    b bVar4 = bVar.f107324j.f107278c;
                    int i10 = this.f107340c;
                    boolean z10 = false;
                    boolean z11 = ((i10 & 1) == 0 && (i10 & 256) == 0) ? false : true;
                    boolean z12 = ((i10 & 16) == 0 && (i10 & 4096) == 0) ? false : true;
                    if (z11 && z12) {
                        if (bVar4 != bVar) {
                            motionLayout.c1(bVar);
                        }
                        if (motionLayout.j0() != motionLayout.n0() && motionLayout.q0() <= 0.5f) {
                            z12 = false;
                            z10 = z11;
                        }
                    } else {
                        z10 = z11;
                    }
                    if (b(bVar4, motionLayout)) {
                        if (z10 && (this.f107340c & 1) != 0) {
                            motionLayout.c1(this.f107338a);
                            motionLayout.k1();
                            return;
                        }
                        if (z12 && (this.f107340c & 16) != 0) {
                            motionLayout.c1(this.f107338a);
                            motionLayout.m1();
                        } else if (z10 && (this.f107340c & 256) != 0) {
                            motionLayout.c1(this.f107338a);
                            motionLayout.V0(1.0f);
                        } else {
                            if (!z12 || (this.f107340c & 4096) == 0) {
                                return;
                            }
                            motionLayout.c1(this.f107338a);
                            motionLayout.V0(0.0f);
                        }
                    }
                }
            }

            public a(b transition, int id2, int action) {
                this.f107338a = transition;
                this.f107339b = id2;
                this.f107340c = action;
            }
        }

        public b(int id2, u motionScene, int constraintSetStartId, int constraintSetEndId) {
            this.f107315a = -1;
            this.f107316b = false;
            this.f107317c = -1;
            this.f107318d = -1;
            this.f107319e = 0;
            this.f107320f = null;
            this.f107321g = -1;
            this.f107322h = 400;
            this.f107323i = 0.0f;
            this.f107325k = new ArrayList<>();
            this.f107326l = null;
            this.f107327m = new ArrayList<>();
            this.f107328n = 0;
            this.f107329o = false;
            this.f107330p = -1;
            this.f107331q = 0;
            this.f107332r = 0;
            this.f107315a = id2;
            this.f107324j = motionScene;
            this.f107318d = constraintSetStartId;
            this.f107317c = constraintSetEndId;
            this.f107322h = motionScene.f107287l;
            this.f107331q = motionScene.f107288m;
        }

        public b(u motionScene, Context context, XmlPullParser parser) {
            this.f107315a = -1;
            this.f107316b = false;
            this.f107317c = -1;
            this.f107318d = -1;
            this.f107319e = 0;
            this.f107320f = null;
            this.f107321g = -1;
            this.f107322h = 400;
            this.f107323i = 0.0f;
            this.f107325k = new ArrayList<>();
            this.f107326l = null;
            this.f107327m = new ArrayList<>();
            this.f107328n = 0;
            this.f107329o = false;
            this.f107330p = -1;
            this.f107331q = 0;
            this.f107332r = 0;
            this.f107322h = motionScene.f107287l;
            this.f107331q = motionScene.f107288m;
            this.f107324j = motionScene;
            y(motionScene, context, Xml.asAttributeSet(parser));
        }
    }

    public u(Context context, MotionLayout layout, int resourceID) {
        this.f107276a = layout;
        this.f107294s = new C(layout);
        V(context, resourceID);
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f107283h;
        int i10 = g.C0275g.f109217V1;
        sparseArray.put(i10, new androidx.constraintlayout.widget.d());
        this.f107284i.put("motion_base", Integer.valueOf(i10));
    }
}
