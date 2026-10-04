package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.appcompat.widget.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1498d extends DataSetObservable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Object f86295A = new Object();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Map<String, C1498d> f86296B = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f86297n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f86298o = "d";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f86299p = "historical-records";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f86300q = "historical-record";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f86301r = "activity";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f86302s = "time";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f86303t = "weight";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f86304u = "activity_choser_model_history.xml";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f86305v = 50;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f86306w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f86307x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f86308y = ".xml";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f86309z = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f86313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f86314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f86315f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f86322m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f86310a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f86311b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e> f86312c = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f86316g = new C0166d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86317h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f86318i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f86319j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86320k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f86321l = false;

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$a */
    public interface a {
        void a(C1498d c1498d);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$b */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResolveInfo f86323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f86324b;

        public b(ResolveInfo resolveInfo) {
            this.f86323a = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.f86324b) - Float.floatToIntBits(this.f86324b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.f86324b) == Float.floatToIntBits(((b) obj).f86324b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f86324b) + 31;
        }

        public String toString() {
            return "[resolveInfo:" + this.f86323a.toString() + "; weight:" + new BigDecimal(this.f86324b) + "]";
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$c */
    public interface c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$d, reason: collision with other inner class name */
    public static final class C0166d implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f86325b = 0.95f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<ComponentName, b> f86326a = new HashMap();

        @Override // androidx.appcompat.widget.C1498d.c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f86326a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = list.get(i10);
                bVar.f86324b = 0.0f;
                ActivityInfo activityInfo = bVar.f86323a.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f86327a);
                if (bVar2 != null) {
                    bVar2.f86324b = (eVar.f86329c * f10) + bVar2.f86324b;
                    f10 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f86327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f86328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f86329c;

        public e(String str, long j10, float f10) {
            this(ComponentName.unflattenFromString(str), j10, f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f86327a;
            if (componentName == null) {
                if (eVar.f86327a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f86327a)) {
                return false;
            }
            return this.f86328b == eVar.f86328b && Float.floatToIntBits(this.f86329c) == Float.floatToIntBits(eVar.f86329c);
        }

        public int hashCode() {
            ComponentName componentName = this.f86327a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.f86328b;
            return Float.floatToIntBits(this.f86329c) + ((((iHashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }

        public String toString() {
            return "[; activity:" + this.f86327a + "; time:" + this.f86328b + "; weight:" + new BigDecimal(this.f86329c) + "]";
        }

        public e(ComponentName componentName, long j10, float f10) {
            this.f86327a = componentName;
            this.f86328b = j10;
            this.f86329c = f10;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$f */
    public interface f {
        boolean a(C1498d c1498d, Intent intent);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.d$g */
    public final class g extends AsyncTask<Object, Void, Void> {
        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Void a(java.lang.Object... r15) {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1498d.g.a(java.lang.Object[]):java.lang.Void");
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Void doInBackground(Object[] objArr) {
            a(objArr);
            return null;
        }
    }

    public C1498d(Context context, String str) {
        this.f86313d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f86308y)) {
            this.f86314e = str;
        } else {
            this.f86314e = str.concat(f86308y);
        }
    }

    public static C1498d d(Context context, String str) {
        C1498d c1498d;
        synchronized (f86295A) {
            try {
                Map<String, C1498d> map = f86296B;
                c1498d = map.get(str);
                if (c1498d == null) {
                    c1498d = new C1498d(context, str);
                    map.put(str, c1498d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1498d;
    }

    public final boolean a(e eVar) {
        boolean zAdd = this.f86312c.add(eVar);
        if (zAdd) {
            this.f86320k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return zAdd;
    }

    public Intent b(int i10) {
        synchronized (this.f86310a) {
            try {
                if (this.f86315f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.f86311b.get(i10).f86323a.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f86315f);
                intent.setComponent(componentName);
                if (this.f86322m != null) {
                    this.f86322m.a(this, new Intent(intent));
                }
                a(new e(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        boolean zL = l() | o();
        n();
        if (zL) {
            v();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f86310a) {
            c();
            resolveInfo = this.f86311b.get(i10).f86323a;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f86310a) {
            c();
            size = this.f86311b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f86310a) {
            try {
                c();
                List<b> list = this.f86311b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (list.get(i10).f86323a == resolveInfo) {
                        return i10;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f86310a) {
            try {
                c();
                if (this.f86311b.isEmpty()) {
                    return null;
                }
                return this.f86311b.get(0).f86323a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int i() {
        int i10;
        synchronized (this.f86310a) {
            i10 = this.f86317h;
        }
        return i10;
    }

    public int j() {
        int size;
        synchronized (this.f86310a) {
            c();
            size = this.f86312c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f86310a) {
            intent = this.f86315f;
        }
        return intent;
    }

    public final boolean l() {
        if (!this.f86321l || this.f86315f == null) {
            return false;
        }
        this.f86321l = false;
        this.f86311b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f86313d.getPackageManager().queryIntentActivities(this.f86315f, 0);
        int size = listQueryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f86311b.add(new b(listQueryIntentActivities.get(i10)));
        }
        return true;
    }

    public final void m() {
        if (!this.f86319j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f86320k) {
            this.f86320k = false;
            if (TextUtils.isEmpty(this.f86314e)) {
                return;
            }
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f86312c), this.f86314e);
        }
    }

    public final void n() {
        int size = this.f86312c.size() - this.f86317h;
        if (size <= 0) {
            return;
        }
        this.f86320k = true;
        for (int i10 = 0; i10 < size; i10++) {
            this.f86312c.remove(0);
        }
    }

    public final boolean o() throws IOException {
        if (!this.f86318i || !this.f86320k || TextUtils.isEmpty(this.f86314e)) {
            return false;
        }
        this.f86318i = false;
        this.f86319j = true;
        p();
        return true;
    }

    public final void p() throws IOException {
        try {
            FileInputStream fileInputStreamOpenFileInput = this.f86313d.openFileInput(this.f86314e);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                    }
                    if (!f86299p.equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List<e> list = this.f86312c;
                    list.clear();
                    while (true) {
                        int next2 = xmlPullParserNewPullParser.next();
                        if (next2 == 1) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                                return;
                            }
                            return;
                        } else if (next2 != 3 && next2 != 4) {
                            if (!f86300q.equals(xmlPullParserNewPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new e(xmlPullParserNewPullParser.getAttributeValue(null, "activity"), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                } catch (IOException e10) {
                    Log.e(f86298o, "Error reading historical recrod file: " + this.f86314e, e10);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                } catch (XmlPullParserException e11) {
                    Log.e(f86298o, "Error reading historical recrod file: " + this.f86314e, e11);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                }
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException | IOException unused2) {
        }
    }

    public void q(c cVar) {
        synchronized (this.f86310a) {
            try {
                if (this.f86316g == cVar) {
                    return;
                }
                this.f86316g = cVar;
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(int i10) {
        synchronized (this.f86310a) {
            try {
                c();
                b bVar = this.f86311b.get(i10);
                b bVar2 = this.f86311b.get(0);
                float f10 = bVar2 != null ? (bVar2.f86324b - bVar.f86324b) + 5.0f : 1.0f;
                ActivityInfo activityInfo = bVar.f86323a.activityInfo;
                a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i10) {
        synchronized (this.f86310a) {
            try {
                if (this.f86317h == i10) {
                    return;
                }
                this.f86317h = i10;
                n();
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f86310a) {
            try {
                if (this.f86315f == intent) {
                    return;
                }
                this.f86315f = intent;
                this.f86321l = true;
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(f fVar) {
        synchronized (this.f86310a) {
            this.f86322m = fVar;
        }
    }

    public final boolean v() {
        if (this.f86316g == null || this.f86315f == null || this.f86311b.isEmpty() || this.f86312c.isEmpty()) {
            return false;
        }
        this.f86316g.a(this.f86315f, this.f86311b, Collections.unmodifiableList(this.f86312c));
        return true;
    }
}
