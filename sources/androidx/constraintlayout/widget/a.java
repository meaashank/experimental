package androidx.constraintlayout.widget;

import U6.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.g;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f107793h = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f107794i = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f107795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f107796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107797c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f107798d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<C0272a> f107799e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray<d> f107800f = new SparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f107801g = null;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public static class C0272a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f107803b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f107804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f107805d;

        public C0272a(Context context, XmlPullParser parser) {
            this.f107804c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.Vl);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.Wl) {
                    this.f107802a = typedArrayObtainStyledAttributes.getResourceId(index, this.f107802a);
                } else if (index == g.m.Xl) {
                    this.f107804c = typedArrayObtainStyledAttributes.getResourceId(index, this.f107804c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f107804c);
                    context.getResources().getResourceName(this.f107804c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f107805d = dVar;
                        dVar.G(context, this.f107804c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b size) {
            this.f107803b.add(size);
        }

        public int b(float width, float height) {
            for (int i10 = 0; i10 < this.f107803b.size(); i10++) {
                if (this.f107803b.get(i10).a(width, height)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f107807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f107808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f107809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f107810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f107811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d f107812g;

        public b(Context context, XmlPullParser parser) {
            this.f107807b = Float.NaN;
            this.f107808c = Float.NaN;
            this.f107809d = Float.NaN;
            this.f107810e = Float.NaN;
            this.f107811f = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.jo);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.ko) {
                    this.f107811f = typedArrayObtainStyledAttributes.getResourceId(index, this.f107811f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f107811f);
                    context.getResources().getResourceName(this.f107811f);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f107812g = dVar;
                        dVar.G(context, this.f107811f);
                    }
                } else if (index == g.m.lo) {
                    this.f107810e = typedArrayObtainStyledAttributes.getDimension(index, this.f107810e);
                } else if (index == g.m.mo) {
                    this.f107808c = typedArrayObtainStyledAttributes.getDimension(index, this.f107808c);
                } else if (index == g.m.no) {
                    this.f107809d = typedArrayObtainStyledAttributes.getDimension(index, this.f107809d);
                } else if (index == g.m.oo) {
                    this.f107807b = typedArrayObtainStyledAttributes.getDimension(index, this.f107807b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float widthDp, float heightDp) {
            if (!Float.isNaN(this.f107807b) && widthDp < this.f107807b) {
                return false;
            }
            if (!Float.isNaN(this.f107808c) && heightDp < this.f107808c) {
                return false;
            }
            if (Float.isNaN(this.f107809d) || widthDp <= this.f107809d) {
                return Float.isNaN(this.f107810e) || heightDp <= this.f107810e;
            }
            return false;
        }
    }

    public a(Context context, ConstraintLayout layout, int resourceID) {
        this.f107795a = layout;
        a(context, resourceID);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L8d
            if (r0 == 0) goto L7e
            r3 = 2
            if (r0 == r3) goto L17
            goto L81
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L50;
                case 80204913: goto L46;
                case 1382829617: goto L3d;
                case 1657696882: goto L33;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
        L24:
            goto L5a
        L25:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r6
            goto L5b
        L2f:
            r8 = move-exception
            goto L86
        L31:
            r8 = move-exception
            goto L8a
        L33:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = 0
            goto L5b
        L3d:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            goto L5b
        L46:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r3
            goto L5b
        L50:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r0 == 0) goto L5a
            r2 = r5
            goto L5b
        L5a:
            r2 = -1
        L5b:
            if (r2 == r3) goto L71
            if (r2 == r6) goto L66
            if (r2 == r5) goto L62
            goto L81
        L62:
            r7.c(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L66:
            androidx.constraintlayout.widget.a$b r0 = new androidx.constraintlayout.widget.a$b     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            if (r1 == 0) goto L81
            r1.a(r0)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L71:
            androidx.constraintlayout.widget.a$a r1 = new androidx.constraintlayout.widget.a$a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            android.util.SparseArray<androidx.constraintlayout.widget.a$a> r0 = r7.f107799e     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            int r2 = r1.f107802a     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            r0.put(r2, r1)     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto L81
        L7e:
            r9.getName()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
        L81:
            int r0 = r9.next()     // Catch: java.io.IOException -> L2f org.xmlpull.v1.XmlPullParserException -> L31
            goto Ld
        L86:
            r8.printStackTrace()
            goto L8d
        L8a:
            r8.printStackTrace()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.a(android.content.Context, int):void");
    }

    public boolean b(int id2, float width, float height) {
        int i10 = this.f107797c;
        if (i10 != id2) {
            return true;
        }
        C0272a c0272aValueAt = id2 == -1 ? this.f107799e.valueAt(0) : this.f107799e.get(i10);
        int i11 = this.f107798d;
        return (i11 == -1 || !c0272aValueAt.f107803b.get(i11).a(width, height)) && this.f107798d != c0272aValueAt.b(width, height);
    }

    public final void c(Context context, XmlPullParser parser) {
        d dVar = new d();
        int attributeCount = parser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = parser.getAttributeName(i10);
            String attributeValue = parser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains(RemoteSettings.FORWARD_SLASH_STRING) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.x0(context, parser);
                this.f107800f.put(identifier, dVar);
                return;
            }
        }
    }

    public void d(f constraintsChangedListener) {
        this.f107801g = constraintsChangedListener;
    }

    public void e(int id2, float width, float height) {
        int iB;
        int i10 = this.f107797c;
        if (i10 == id2) {
            C0272a c0272aValueAt = id2 == -1 ? this.f107799e.valueAt(0) : this.f107799e.get(i10);
            int i11 = this.f107798d;
            if ((i11 == -1 || !c0272aValueAt.f107803b.get(i11).a(width, height)) && this.f107798d != (iB = c0272aValueAt.b(width, height))) {
                d dVar = iB == -1 ? this.f107796b : c0272aValueAt.f107803b.get(iB).f107812g;
                if (iB != -1) {
                    int i12 = c0272aValueAt.f107803b.get(iB).f107811f;
                }
                if (dVar == null) {
                    return;
                }
                this.f107798d = iB;
                dVar.r(this.f107795a);
                return;
            }
            return;
        }
        this.f107797c = id2;
        C0272a c0272a = this.f107799e.get(id2);
        int iB2 = c0272a.b(width, height);
        d dVar2 = iB2 == -1 ? c0272a.f107805d : c0272a.f107803b.get(iB2).f107812g;
        if (iB2 != -1) {
            int i13 = c0272a.f107803b.get(iB2).f107811f;
        }
        if (dVar2 != null) {
            this.f107798d = iB2;
            dVar2.r(this.f107795a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + id2 + ", dim =" + width + j.f68738d + height);
    }
}
