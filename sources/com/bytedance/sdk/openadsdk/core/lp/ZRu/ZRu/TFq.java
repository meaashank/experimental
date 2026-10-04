package com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import com.bytedance.sdk.openadsdk.core.lp.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.lp.ZRu.NOt;
import com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu;
import com.prism.hider.vault.calculator.C4261m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class TFq extends com.bytedance.sdk.openadsdk.core.lp.ZRu.NOt {
    public static final String Mm = null;

    public TFq(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    public static int NOt(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    private void mZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(Collections.singletonList(new mZ.ZRu(str).ZRu()), this.ZRu > 0 ? com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu.UNDEFINED_ERROR, -1L, null), (mZ.NOt) null);
    }

    private static List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> uR(String str) {
        return ZRu(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    @Override // com.bytedance.sdk.openadsdk.core.lp.ZRu.NOt
    public com.bytedance.sdk.openadsdk.core.lp.ZRu ZRu(String str, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        this.TFq = 0;
        ?? r32 = 0;
        if (this.NOt == null) {
            this.TFq = -1;
            return null;
        }
        ?? IsEmpty = TextUtils.isEmpty(str);
        try {
            if (IsEmpty != 0) {
                this.TFq = -2;
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, "UTF-8");
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.lp.ZRu ZRu2 = ZRu(xmlPullParserNewPullParser, list);
                    ZRu(ZRu2);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return ZRu2;
                } catch (Exception unused2) {
                    this.TFq = -3;
                    ZRu((com.bytedance.sdk.openadsdk.core.lp.ZRu) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Exception unused4) {
                byteArrayInputStream = null;
            } catch (Throwable th) {
                th = th;
                if (r32 != 0) {
                    try {
                        r32.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r32 = IsEmpty;
        }
    }

    public static class ZRu {
        ZRu.EnumC0453ZRu NOt;
        String ZRu;
        ZRu.NOt mZ;
        String uR;
        final List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> TFq = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> Ht = new ArrayList();
        float Mm = Float.MIN_VALUE;

        public ZRu() {
        }

        public void NOt(String str) {
            this.Ht.add(new mZ.ZRu(str).ZRu());
        }

        public void ZRu(String str, ZRu.EnumC0453ZRu enumC0453ZRu, ZRu.NOt nOt) {
            this.ZRu = str;
            this.NOt = enumC0453ZRu;
            this.mZ = nOt;
        }

        public void ZRu(String str) {
            this.TFq.add(new mZ.ZRu(str).ZRu());
        }

        public ZRu(String str, ZRu.EnumC0453ZRu enumC0453ZRu, ZRu.NOt nOt) {
            ZRu(str, enumC0453ZRu, nOt);
        }
    }

    public static String NOt(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = Mm;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0017, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.lp.ZRu NOt(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu.TFq.NOt(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.lp.ZRu");
    }

    private void ZRu(com.bytedance.sdk.openadsdk.core.lp.ZRu zRu) {
        if (this.Ht == null) {
            this.Ht = new NOt.ZRu();
        }
        NOt.ZRu zRu2 = this.Ht;
        zRu2.ZRu = this.TFq;
        zRu2.NOt = this.ZRu;
        if (zRu != null) {
            zRu2.mZ = zRu.ZRu().NOt.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.lp.ZRu ZRu(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list3;
        xmlPullParser.require(2, Mm, "VAST");
        boolean z10 = false;
        String strNOt = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (C4261m.f168559e.equals(name)) {
                    strNOt = NOt(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (ZRu(xmlPullParser.getAttributeValue(Mm, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z10 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.lp.ZRu ZRu2 = NOt.ZRu(this.NOt, xmlPullParser3, list3, this.mZ, this.uR);
                                        if (ZRu2 != null) {
                                            if (!TextUtils.isEmpty(ZRu2.Mm())) {
                                                return ZRu2;
                                            }
                                            this.TFq = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.lp.ZRu zRuNOt = NOt(xmlPullParser3, list3);
                                            if (zRuNOt != null) {
                                                return zRuNOt;
                                            }
                                        } else {
                                            ZRu(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            ZRu(xmlPullParser);
                            z10 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        ZRu(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z10) {
            this.TFq = -4;
            mZ(strNOt);
        }
        if (this.TFq == 0) {
            this.TFq = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> ZRu(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return uR(NOt(xmlPullParser, str));
    }

    public static void ZRu(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void ZRu(XmlPullParser xmlPullParser, String str, int i10) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> ZRu(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new mZ.ZRu(str).ZRu(z10).ZRu());
    }
}
