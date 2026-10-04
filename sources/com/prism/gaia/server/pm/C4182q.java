package com.prism.gaia.server.pm;

import android.R;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat;
import com.android.launcher3.IconCache;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.prism.gaia.server.pm.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4182q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f167622b = "AndroidManifest.xml";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f167623c = "manifest";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f167624d = "property";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f167625e = "application";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f167621a = "asdf-".concat(C4182q.class.getSimpleName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f167626f = {"activity", "activity-alias", NotificationCompat.CATEGORY_SERVICE, "provider", "receiver"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f167627g = {R.attr.value};

    public static void a(AssetManager assetManager) {
        try {
            assetManager.close();
        } catch (Throwable unused) {
        }
    }

    public static String b(XmlResourceParser xmlResourceParser, String str, int i10) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            if (i10 != -1) {
                if (xmlResourceParser.getAttributeNameResource(i11) == i10) {
                    return xmlResourceParser.getAttributeValue(i11);
                }
            } else if (str.equals(xmlResourceParser.getAttributeName(i11)) && xmlResourceParser.getAttributeNameResource(i11) == 0) {
                return xmlResourceParser.getAttributeValue(i11);
            }
        }
        return null;
    }

    public static Boolean c(XmlResourceParser xmlResourceParser, int i10) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i11 = 0;
        while (true) {
            if (i11 >= attributeCount) {
                break;
            }
            if (xmlResourceParser.getAttributeNameResource(i11) != i10) {
                i11++;
            } else {
                boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(i11, true);
                if (attributeBooleanValue == xmlResourceParser.getAttributeBooleanValue(i11, false)) {
                    return Boolean.valueOf(attributeBooleanValue);
                }
            }
        }
        return null;
    }

    public static boolean d(String str) {
        for (String str2 : f167626f) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static z e(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        String strF;
        z zVar = new z();
        ArrayList arrayList = new ArrayList();
        String strB = null;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return zVar;
            }
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (f167623c.equals(name)) {
                    strB = b(xmlResourceParser, "package", -1);
                } else if ("application".equals(name) && arrayList.isEmpty()) {
                    Boolean boolC = c(xmlResourceParser, R.attr.enabled);
                    if (boolC != null) {
                        zVar.f167683c = boolC;
                    }
                } else if (f167624d.equals(name)) {
                    try {
                        g(xmlResourceParser, resources, zVar, arrayList.isEmpty() ? null : (String) arrayList.get(arrayList.size() - 1), true ^ arrayList.isEmpty());
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                } else if (d(name)) {
                    try {
                        strF = f(strB, b(xmlResourceParser, "name", R.attr.name));
                    } catch (Throwable th2) {
                        th2.getMessage();
                        strF = null;
                    }
                    arrayList.add(strF);
                }
            } else if (next == 3 && d(xmlResourceParser.getName()) && !arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public static String f(String str, String str2) {
        if (str2 != null && str != null) {
            if (str2.startsWith(IconCache.EMPTY_CLASS_NAME)) {
                return str.concat(str2);
            }
            if (str2.indexOf(46) < 0) {
                return androidx.concurrent.futures.a.a(str, IconCache.EMPTY_CLASS_NAME, str2);
            }
        }
        return str2;
    }

    public static void g(XmlResourceParser xmlResourceParser, Resources resources, z zVar, String str, boolean z10) {
        D dI;
        String strB = b(xmlResourceParser, "name", R.attr.name);
        if (strB == null || (dI = i(xmlResourceParser, resources)) == null) {
            return;
        }
        if (!z10) {
            zVar.j(strB, dI);
        } else {
            if (str == null) {
                return;
            }
            zVar.k(str, strB, dI);
        }
    }

    public static D h(XmlResourceParser xmlResourceParser, Resources resources) {
        TypedArray typedArrayObtainAttributes;
        if (resources == null) {
            return null;
        }
        try {
            typedArrayObtainAttributes = resources.obtainAttributes(xmlResourceParser, f167627g);
        } catch (Throwable th) {
            th = th;
            typedArrayObtainAttributes = null;
        }
        try {
            TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
            if (typedValuePeekValue == null) {
                typedArrayObtainAttributes.recycle();
                return null;
            }
            int i10 = typedValuePeekValue.type;
            if (i10 == 1 || i10 == 2) {
                D dE = D.e(typedValuePeekValue.data);
                typedArrayObtainAttributes.recycle();
                return dE;
            }
            if (i10 == 3) {
                CharSequence charSequence = typedValuePeekValue.string;
                D dF = D.f(charSequence == null ? null : charSequence.toString());
                typedArrayObtainAttributes.recycle();
                return dF;
            }
            if (i10 == 4) {
                D dC = D.c(Float.intBitsToFloat(typedValuePeekValue.data));
                typedArrayObtainAttributes.recycle();
                return dC;
            }
            if (i10 == 18) {
                D dB = D.b(typedValuePeekValue.data != 0);
                typedArrayObtainAttributes.recycle();
                return dB;
            }
            if (i10 < 16 || i10 > 31) {
                typedArrayObtainAttributes.recycle();
                return null;
            }
            D d10 = D.d(typedValuePeekValue.data);
            typedArrayObtainAttributes.recycle();
            return d10;
        } catch (Throwable th2) {
            th = th2;
            try {
                th.getMessage();
                return null;
            } finally {
                if (typedArrayObtainAttributes != null) {
                    typedArrayObtainAttributes.recycle();
                }
            }
        }
    }

    public static D i(XmlResourceParser xmlResourceParser, Resources resources) {
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            int attributeNameResource = xmlResourceParser.getAttributeNameResource(i10);
            if (attributeNameResource == 16842789) {
                return D.e(xmlResourceParser.getAttributeResourceValue(i10, 0));
            }
            if (attributeNameResource == 16842788) {
                D dH = h(xmlResourceParser, resources);
                return dH != null ? dH : D.g(xmlResourceParser.getAttributeValue(i10));
            }
        }
        return null;
    }

    public static Resources j(AssetManager assetManager) {
        try {
            Resources system = Resources.getSystem();
            return new Resources(assetManager, system.getDisplayMetrics(), system.getConfiguration());
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.prism.gaia.server.pm.z k(java.lang.String r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L10
            return r0
        L10:
            com.prism.gaia.naked.metadata.android.content.res.AssetManagerCAG$Impl_G r1 = com.prism.gaia.naked.metadata.android.content.res.AssetManagerCAG.f165804G     // Catch: java.lang.Throwable -> L5a
            com.prism.gaia.naked.entity.NakedConstructor r1 = r1.ctor()     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> L5a
            android.content.res.AssetManager r1 = (android.content.res.AssetManager) r1     // Catch: java.lang.Throwable -> L5a
            com.prism.gaia.naked.metadata.android.content.res.AssetManagerCAG$Impl_G r2 = com.prism.gaia.naked.metadata.android.content.res.AssetManagerCAG.f165804G     // Catch: java.lang.Throwable -> L4e
            com.prism.gaia.naked.entity.NakedMethod r2 = r2.addAssetPath()     // Catch: java.lang.Throwable -> L4e
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L57
            r4 = 0
            r3[r4] = r5     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r2.call(r1, r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L51
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L4e
            if (r5 != 0) goto L37
            goto L51
        L37:
            java.lang.String r5 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r5 = r1.openXmlResourceParser(r5)     // Catch: java.lang.Throwable -> L4e
            android.content.res.Resources r2 = j(r1)     // Catch: java.lang.Throwable -> L4c
            com.prism.gaia.server.pm.z r0 = e(r5, r2)     // Catch: java.lang.Throwable -> L4c
            r5.close()
            r1.close()     // Catch: java.lang.Throwable -> L4b
        L4b:
            return r0
        L4c:
            r2 = move-exception
            goto L5d
        L4e:
            r2 = move-exception
        L4f:
            r5 = r0
            goto L5d
        L51:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.lang.Throwable -> L56
        L56:
            return r0
        L57:
            r5 = move-exception
            r2 = r5
            goto L4f
        L5a:
            r2 = move-exception
            r5 = r0
            r1 = r5
        L5d:
            r2.getMessage()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L65
            r5.close()
        L65:
            if (r1 == 0) goto L6a
            r1.close()     // Catch: java.lang.Throwable -> L6a
        L6a:
            return r0
        L6b:
            r0 = move-exception
            if (r5 == 0) goto L71
            r5.close()
        L71:
            if (r1 == 0) goto L76
            r1.close()     // Catch: java.lang.Throwable -> L76
        L76:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.pm.C4182q.k(java.lang.String):com.prism.gaia.server.pm.z");
    }
}
