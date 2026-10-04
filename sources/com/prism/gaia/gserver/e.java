package com.prism.gaia.gserver;

import U6.b;
import android.content.pm.FeatureInfo;
import android.os.Environment;
import android.os.Process;
import android.util.SparseArray;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C1498d;
import com.prism.gaia.helper.utils.C;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f164891h = "SystemConfig";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static e f164892i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f164893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<HashSet<String>> f164894b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B8.a<String, String> f164895c = new B8.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap<String, FeatureInfo> f164896d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B8.a<String, a> f164897e = new B8.a<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B8.b<String> f164898f = new B8.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B8.b<String> f164899g = new B8.b<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int[] f164901b;

        public a(String str) {
            this.f164900a = str;
        }
    }

    public e() {
        m(c(Environment.getRootDirectory(), "etc", "sysconfig"), false);
        m(c(Environment.getRootDirectory(), "etc", Z3.f.f79420q), false);
    }

    @NonNull
    public static int[] a(@Nullable int[] iArr, int i10) {
        return b(iArr, i10, false);
    }

    @NonNull
    public static int[] b(@Nullable int[] iArr, int i10, boolean z10) {
        if (iArr == null) {
            return new int[]{i10};
        }
        int length = iArr.length;
        if (!z10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return iArr;
                }
            }
        }
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i10;
        return iArr2;
    }

    public static File c(File file, String... strArr) {
        for (String str : strArr) {
            file = file == null ? new File(str) : new File(file, str);
        }
        return file;
    }

    public static e h() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f164892i == null) {
                    f164892i = new e();
                }
                eVar = f164892i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public B8.b<String> d() {
        return this.f164898f;
    }

    public HashMap<String, FeatureInfo> e() {
        return this.f164896d;
    }

    public B8.b<String> f() {
        return this.f164899g;
    }

    public int[] g() {
        return this.f164893a;
    }

    public B8.a<String, a> i() {
        return this.f164897e;
    }

    public B8.a<String, String> j() {
        return this.f164895c;
    }

    public SparseArray<HashSet<String>> k() {
        return this.f164894b;
    }

    public void l(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strIntern = str.intern();
        if (this.f164897e.get(strIntern) == null) {
            this.f164897e.put(strIntern, new a(strIntern));
        }
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
            if (next != 3 && next != 4) {
                if ("group".equals(xmlPullParser.getName()) && xmlPullParser.getAttributeValue(null, "gid") == null) {
                    xmlPullParser.getPositionDescription();
                }
                C.u(xmlPullParser);
            }
        }
    }

    public void m(File file, boolean z10) {
        if (!file.exists() || !file.isDirectory()) {
            if (z10) {
                return;
            }
            file.toString();
            return;
        }
        if (!file.canRead()) {
            file.toString();
            return;
        }
        for (File file2 : file.listFiles()) {
            if (!file2.getPath().endsWith("etc/permissions/platform.xml")) {
                if (!file2.getPath().endsWith(C1498d.f86308y)) {
                    file2.toString();
                    file.toString();
                } else if (file2.canRead()) {
                    n(file2, z10);
                } else {
                    file2.toString();
                }
            }
        }
        n(new File(Environment.getRootDirectory(), "etc/permissions/platform.xml"), z10);
    }

    public final void n(File file, boolean z10) {
        int next;
        try {
            FileReader fileReader = new FileReader(file);
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                xmlPullParserNewPullParser.setInput(fileReader);
                do {
                    next = xmlPullParserNewPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!xmlPullParserNewPullParser.getName().equals(Z3.f.f79420q) && !xmlPullParserNewPullParser.getName().equals("config")) {
                    throw new XmlPullParserException("Unexpected start tag: found " + xmlPullParserNewPullParser.getName() + ", expected 'permissions' or 'config'");
                }
                while (true) {
                    C.f(xmlPullParserNewPullParser);
                    if (xmlPullParserNewPullParser.getEventType() == 1) {
                        fileReader.close();
                        return;
                    }
                    String name = xmlPullParserNewPullParser.getName();
                    if ("group".equals(name) && !z10) {
                        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "gid");
                        if (attributeValue != null) {
                            this.f164893a = b(this.f164893a, Process.getGidForName(attributeValue), false);
                        } else {
                            xmlPullParserNewPullParser.getPositionDescription();
                        }
                        C.u(xmlPullParserNewPullParser);
                    } else if ("permission".equals(name) && !z10) {
                        String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "name");
                        if (attributeValue2 == null) {
                            xmlPullParserNewPullParser.getPositionDescription();
                            C.u(xmlPullParserNewPullParser);
                        } else {
                            l(xmlPullParserNewPullParser, attributeValue2.intern());
                        }
                    } else if (!"assign-permission".equals(name) || z10) {
                        if ("library".equals(name) && !z10) {
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(null, "name");
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(null, b.h.f68653a);
                            if (attributeValue3 == null || attributeValue4 == null) {
                                xmlPullParserNewPullParser.getPositionDescription();
                            } else {
                                this.f164895c.put(attributeValue3, attributeValue4);
                            }
                            C.u(xmlPullParserNewPullParser);
                        } else if ("feature".equals(name)) {
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(null, "name");
                            if (attributeValue5 == null) {
                                xmlPullParserNewPullParser.getPositionDescription();
                            } else {
                                FeatureInfo featureInfo = new FeatureInfo();
                                featureInfo.name = attributeValue5;
                                this.f164896d.put(attributeValue5, featureInfo);
                            }
                            C.u(xmlPullParserNewPullParser);
                        } else if ("allow-in-power-save".equals(name)) {
                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(null, "package");
                            if (attributeValue6 == null) {
                                xmlPullParserNewPullParser.getPositionDescription();
                            } else {
                                this.f164898f.add(attributeValue6);
                            }
                            C.u(xmlPullParserNewPullParser);
                        } else if ("fixed-ime-app".equals(name)) {
                            String attributeValue7 = xmlPullParserNewPullParser.getAttributeValue(null, "package");
                            if (attributeValue7 == null) {
                                xmlPullParserNewPullParser.getPositionDescription();
                            } else {
                                this.f164899g.add(attributeValue7);
                            }
                            C.u(xmlPullParserNewPullParser);
                        } else {
                            C.u(xmlPullParserNewPullParser);
                        }
                    } else if (xmlPullParserNewPullParser.getAttributeValue(null, "name") == null) {
                        xmlPullParserNewPullParser.getPositionDescription();
                        C.u(xmlPullParserNewPullParser);
                    } else if (xmlPullParserNewPullParser.getAttributeValue(null, "uid") == null) {
                        xmlPullParserNewPullParser.getPositionDescription();
                        C.u(xmlPullParserNewPullParser);
                    } else {
                        xmlPullParserNewPullParser.getPositionDescription();
                        C.u(xmlPullParserNewPullParser);
                    }
                }
            } catch (IOException | XmlPullParserException unused) {
            }
        } catch (FileNotFoundException unused2) {
            Objects.toString(file);
        }
    }
}
