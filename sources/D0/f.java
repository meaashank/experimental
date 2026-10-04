package D0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4331e;
import e.T;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y0.C5809a;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17625a = 400;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f17626b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17627c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f17628d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f17629e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17630f = 500;

    @T(21)
    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static final class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final e[] f17631a;

        public d(@NonNull e[] eVarArr) {
            this.f17631a = eVarArr;
        }

        @NonNull
        public e[] a() {
            return this.f17631a;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f17632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f17634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f17635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f17636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f17637f;

        public e(@NonNull String str, int i10, boolean z10, @Nullable String str2, int i11, int i12) {
            this.f17632a = str;
            this.f17633b = i10;
            this.f17634c = z10;
            this.f17635d = str2;
            this.f17636e = i11;
            this.f17637f = i12;
        }

        @NonNull
        public String a() {
            return this.f17632a;
        }

        public int b() {
            return this.f17637f;
        }

        public int c() {
            return this.f17636e;
        }

        @Nullable
        public String d() {
            return this.f17635d;
        }

        public int e() {
            return this.f17633b;
        }

        public boolean f() {
            return this.f17634c;
        }
    }

    public static int a(TypedArray typedArray, int i10) {
        return typedArray.getType(i10);
    }

    @Nullable
    public static b b(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static List<List<byte[]>> c(@NonNull Resources resources, @InterfaceC4331e int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    @Nullable
    public static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    @Nullable
    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5809a.j.f240850j);
        String string = typedArrayObtainAttributes.getString(C5809a.j.f240851k);
        String string2 = typedArrayObtainAttributes.getString(C5809a.j.f240856p);
        String string3 = typedArrayObtainAttributes.getString(C5809a.j.f240857q);
        String string4 = typedArrayObtainAttributes.getString(C5809a.j.f240853m);
        int resourceId = typedArrayObtainAttributes.getResourceId(C5809a.j.f240852l, 0);
        int integer = typedArrayObtainAttributes.getInteger(C5809a.j.f240854n, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C5809a.j.f240855o, 500);
        String string5 = typedArrayObtainAttributes.getString(C5809a.j.f240858r);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List<List<byte[]>> listC = c(resources, resourceId);
            return new C0017f(new Q0.j(string, string2, string3, listC), string4 != null ? new Q0.j(string, string2, string4, listC) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new d((e[]) arrayList.toArray(new e[0]));
    }

    public static e f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C5809a.j.f240859s);
        int i10 = C5809a.j.f240823B;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = C5809a.j.f240861u;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = C5809a.j.f240866z;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = C5809a.j.f240862v;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = C5809a.j.f240824C;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = C5809a.j.f240863w;
        }
        int i14 = C5809a.j.f240822A;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = C5809a.j.f240864x;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = C5809a.j.f240865y;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = C5809a.j.f240860t;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new e(string2, i11, z10, string, i15, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D0.f$f, reason: collision with other inner class name */
    public static final class C0017f implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Q0.j f17638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Q0.j f17639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f17642e;

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public C0017f(@NonNull Q0.j jVar, @Nullable Q0.j jVar2, int i10, int i11, @Nullable String str) {
            this.f17638a = jVar;
            this.f17639b = jVar2;
            this.f17641d = i10;
            this.f17640c = i11;
            this.f17642e = str;
        }

        @Nullable
        public Q0.j a() {
            return this.f17639b;
        }

        public int b() {
            return this.f17641d;
        }

        @NonNull
        public Q0.j c() {
            return this.f17638a;
        }

        @Nullable
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public String d() {
            return this.f17642e;
        }

        public int e() {
            return this.f17640c;
        }

        public C0017f(@NonNull Q0.j jVar, int i10, int i11) {
            this(jVar, null, i10, i11, null);
        }
    }
}
