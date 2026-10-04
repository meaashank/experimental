package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f115698e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap<String, Constructor<?>> f115699f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f115700g = "intent";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f115701h = "extra";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f115702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f115703b = new Object[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f115704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f115705d;

    public s(@NonNull Context context, t tVar) {
        this.f115702a = context;
        g(tVar);
    }

    public static void l(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    public final Preference a(@NonNull String str, @Nullable String[] strArr, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = f115699f.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f115702a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e10 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e11) {
                                e10 = e11;
                            }
                        }
                        if (cls == null) {
                            if (e10 != null) {
                                throw e10;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f115698e);
                    constructor.setAccessible(true);
                    f115699f.put(str, constructor);
                } catch (Exception e12) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e12);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e13) {
                throw e13;
            }
        }
        Object[] objArr = this.f115703b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? h(str, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    @NonNull
    public Context c() {
        return this.f115702a;
    }

    public String[] d() {
        return this.f115705d;
    }

    @NonNull
    public Preference e(int i10, @Nullable PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = c().getResources().getXml(i10);
        try {
            return f(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    @NonNull
    public Preference f(XmlPullParser xmlPullParser, @Nullable PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup preferenceGroupI;
        synchronized (this.f115703b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f115703b[0] = this.f115702a;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e10) {
                    throw e10;
                } catch (IOException e11) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e11.getMessage());
                    inflateException.initCause(e11);
                    throw inflateException;
                } catch (XmlPullParserException e12) {
                    InflateException inflateException2 = new InflateException(e12.getMessage());
                    inflateException2.initCause(e12);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroupI = i(preferenceGroup, (PreferenceGroup) b(xmlPullParser.getName(), attributeSetAsAttributeSet));
            j(xmlPullParser, preferenceGroupI, attributeSetAsAttributeSet);
        }
        return preferenceGroupI;
    }

    public final void g(t tVar) {
        this.f115704c = tVar;
        k(new String[]{Preference.class.getPackage().getName() + IconCache.EMPTY_CLASS_NAME, SwitchPreference.class.getPackage().getName() + IconCache.EMPTY_CLASS_NAME});
    }

    public Preference h(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return a(str, this.f115705d, attributeSet);
    }

    @NonNull
    public final PreferenceGroup i(PreferenceGroup preferenceGroup, @NonNull PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.b0(this.f115704c);
        return preferenceGroup2;
    }

    public final void j(@NonNull XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.M0(Intent.parseIntent(c().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e10);
                        throw xmlPullParserException;
                    }
                } else if (f115701h.equals(name)) {
                    c().getResources().parseBundleExtra(f115701h, attributeSet, preference.k());
                    try {
                        l(xmlPullParser);
                    } catch (IOException e11) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e11);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    ((PreferenceGroup) preference).n1(preferenceB);
                    j(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }

    public void k(String[] strArr) {
        this.f115705d = strArr;
    }
}
