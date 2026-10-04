package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.g;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f110573h = "ConstraintLayoutStates";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f110574i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f110576b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110575a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110577c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f110578d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SparseArray<a> f110579e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray<d> f110580f = new SparseArray<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f110581g = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f110583b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f110584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f110585d;

        public a(Context context, XmlPullParser parser) {
            this.f110584c = -1;
            this.f110585d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.Vl);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.Wl) {
                    this.f110582a = typedArrayObtainStyledAttributes.getResourceId(index, this.f110582a);
                } else if (index == g.m.Xl) {
                    this.f110584c = typedArrayObtainStyledAttributes.getResourceId(index, this.f110584c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f110584c);
                    context.getResources().getResourceName(this.f110584c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f110585d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b size) {
            this.f110583b.add(size);
        }

        public int b(float width, float height) {
            for (int i10 = 0; i10 < this.f110583b.size(); i10++) {
                if (this.f110583b.get(i10).a(width, height)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f110586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f110587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f110588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f110589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f110590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f110591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f110592g;

        public b(Context context, XmlPullParser parser) {
            this.f110587b = Float.NaN;
            this.f110588c = Float.NaN;
            this.f110589d = Float.NaN;
            this.f110590e = Float.NaN;
            this.f110591f = -1;
            this.f110592g = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(parser), g.m.jo);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.m.ko) {
                    this.f110591f = typedArrayObtainStyledAttributes.getResourceId(index, this.f110591f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f110591f);
                    context.getResources().getResourceName(this.f110591f);
                    if ("layout".equals(resourceTypeName)) {
                        this.f110592g = true;
                    }
                } else if (index == g.m.lo) {
                    this.f110590e = typedArrayObtainStyledAttributes.getDimension(index, this.f110590e);
                } else if (index == g.m.mo) {
                    this.f110588c = typedArrayObtainStyledAttributes.getDimension(index, this.f110588c);
                } else if (index == g.m.no) {
                    this.f110589d = typedArrayObtainStyledAttributes.getDimension(index, this.f110589d);
                } else if (index == g.m.oo) {
                    this.f110587b = typedArrayObtainStyledAttributes.getDimension(index, this.f110587b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float widthDp, float heightDp) {
            if (!Float.isNaN(this.f110587b) && widthDp < this.f110587b) {
                return false;
            }
            if (!Float.isNaN(this.f110588c) && heightDp < this.f110588c) {
                return false;
            }
            if (Float.isNaN(this.f110589d) || widthDp <= this.f110589d) {
                return Float.isNaN(this.f110590e) || heightDp <= this.f110590e;
            }
            return false;
        }
    }

    public i(Context context, XmlPullParser parser) {
        b(context, parser);
    }

    public int a(int currentConstrainSettId, int stateId, float width, float height) {
        a aVar = this.f110579e.get(stateId);
        if (aVar == null) {
            return stateId;
        }
        int i10 = 0;
        if (width != -1.0f && height != -1.0f) {
            ArrayList<b> arrayList = aVar.f110583b;
            int size = arrayList.size();
            b bVar = null;
            while (i10 < size) {
                b bVar2 = arrayList.get(i10);
                i10++;
                b bVar3 = bVar2;
                if (bVar3.a(width, height)) {
                    if (currentConstrainSettId != bVar3.f110591f) {
                        bVar = bVar3;
                    }
                }
            }
            return bVar != null ? bVar.f110591f : aVar.f110584c;
        }
        if (aVar.f110584c != currentConstrainSettId) {
            ArrayList<b> arrayList2 = aVar.f110583b;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                b bVar4 = arrayList2.get(i10);
                i10++;
                if (currentConstrainSettId == bVar4.f110591f) {
                }
            }
            return aVar.f110584c;
        }
        return currentConstrainSettId;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            r8 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r10)
            int[] r1 = androidx.constraintlayout.widget.g.m.hm
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.g.m.im
            if (r4 != r5) goto L22
            int r5 = r8.f110575a
            int r4 = r0.getResourceId(r4, r5)
            r8.f110575a = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            r0.recycle()
            int r0 = r10.getEventType()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r1 = 0
        L2d:
            r3 = 1
            if (r0 == r3) goto Laa
            if (r0 == 0) goto L9b
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L4c
            if (r0 == r5) goto L3c
            goto L9e
        L3c:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L9e
            goto Laa
        L48:
            r9 = move-exception
            goto La3
        L4a:
            r9 = move-exception
            goto La7
        L4c:
            java.lang.String r0 = r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            int r7 = r0.hashCode()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            switch(r7) {
                case 80204913: goto L73;
                case 1301459538: goto L69;
                case 1382829617: goto L62;
                case 1901439077: goto L58;
                default: goto L57;
            }     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
        L57:
            goto L7d
        L58:
            java.lang.String r3 = "Variant"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L7d
            r3 = r5
            goto L7e
        L62:
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L7d
            goto L7e
        L69:
            java.lang.String r3 = "LayoutDescription"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L7d
            r3 = r2
            goto L7e
        L73:
            java.lang.String r3 = "State"
            boolean r0 = r0.equals(r3)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r0 == 0) goto L7d
            r3 = r6
            goto L7e
        L7d:
            r3 = -1
        L7e:
            if (r3 == r6) goto L8e
            if (r3 == r5) goto L83
            goto L9e
        L83:
            androidx.constraintlayout.widget.i$b r0 = new androidx.constraintlayout.widget.i$b     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            if (r1 == 0) goto L9e
            r1.a(r0)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L9e
        L8e:
            androidx.constraintlayout.widget.i$a r1 = new androidx.constraintlayout.widget.i$a     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r1.<init>(r9, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            android.util.SparseArray<androidx.constraintlayout.widget.i$a> r0 = r8.f110579e     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            int r3 = r1.f110582a     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            r0.put(r3, r1)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L9e
        L9b:
            r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
        L9e:
            int r0 = r10.next()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a
            goto L2d
        La3:
            r9.printStackTrace()
            goto Laa
        La7:
            r9.printStackTrace()
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.i.b(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public boolean c(int id2, float width, float height) {
        int i10 = this.f110577c;
        if (i10 != id2) {
            return true;
        }
        a aVarValueAt = id2 == -1 ? this.f110579e.valueAt(0) : this.f110579e.get(i10);
        int i11 = this.f110578d;
        return (i11 == -1 || !aVarValueAt.f110583b.get(i11).a(width, height)) && this.f110578d != aVarValueAt.b(width, height);
    }

    public void d(f constraintsChangedListener) {
        this.f110581g = constraintsChangedListener;
    }

    public int e(int id2, int width, int height) {
        return f(-1, id2, width, height);
    }

    public int f(int currentId, int id2, float width, float height) {
        int iB;
        if (currentId == id2) {
            a aVarValueAt = id2 == -1 ? this.f110579e.valueAt(0) : this.f110579e.get(this.f110577c);
            if (aVarValueAt == null) {
                return -1;
            }
            return ((this.f110578d == -1 || !aVarValueAt.f110583b.get(currentId).a(width, height)) && currentId != (iB = aVarValueAt.b(width, height))) ? iB == -1 ? aVarValueAt.f110584c : aVarValueAt.f110583b.get(iB).f110591f : currentId;
        }
        a aVar = this.f110579e.get(id2);
        if (aVar == null) {
            return -1;
        }
        int iB2 = aVar.b(width, height);
        return iB2 == -1 ? aVar.f110584c : aVar.f110583b.get(iB2).f110591f;
    }
}
