package com.prism.gaia.helper.utils;

import android.util.Xml;
import com.prism.commons.utils.C3843g;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
public class C {
    public static final void A(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (list == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            F(list.get(i10), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    public static void B(XmlSerializer xmlSerializer, String str, long j10) throws IOException {
        xmlSerializer.attribute(null, str, Long.toString(j10));
    }

    public static final void C(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        j jVar = new j();
        jVar.setOutput(outputStream, C3843g.f162098b);
        jVar.startDocument(null, Boolean.TRUE);
        jVar.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        D(map, null, jVar);
        jVar.flush();
    }

    public static final void D(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            F(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    public static final void E(Set set, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (set == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "set");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            F(it.next(), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "set");
    }

    public static final void F(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, "null");
            return;
        }
        if (obj instanceof String) {
            xmlSerializer.startTag(null, x.b.f238264e);
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, x.b.f238264e);
            return;
        }
        if (obj instanceof Integer) {
            str2 = "int";
        } else if (obj instanceof Long) {
            str2 = "long";
        } else if (obj instanceof Float) {
            str2 = x.b.f238262c;
        } else if (obj instanceof Double) {
            str2 = "double";
        } else {
            if (!(obj instanceof Boolean)) {
                if (obj instanceof byte[]) {
                    w((byte[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof int[]) {
                    x((int[]) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof Map) {
                    D((Map) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof List) {
                    A((List) obj, str, xmlSerializer);
                    return;
                }
                if (obj instanceof Set) {
                    E((Set) obj, str, xmlSerializer);
                    return;
                }
                if (!(obj instanceof CharSequence)) {
                    throw new RuntimeException("writeValueXml: unable to write value " + obj);
                }
                xmlSerializer.startTag(null, x.b.f238264e);
                if (str != null) {
                    xmlSerializer.attribute(null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, x.b.f238264e);
                return;
            }
            str2 = x.b.f238265f;
        }
        xmlSerializer.startTag(null, str2);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "value", obj.toString());
        xmlSerializer.endTag(null, str2);
    }

    public static final void a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        if (xmlPullParser.getName().equals(str)) {
            return;
        }
        throw new XmlPullParserException("Unexpected start tag: found " + xmlPullParser.getName() + ", expected " + str);
    }

    public static final boolean b(CharSequence charSequence, boolean z10) {
        return charSequence == null ? z10 : charSequence.equals("1") || charSequence.equals("true") || charSequence.equals("TRUE");
    }

    public static final int c(CharSequence charSequence, int i10) {
        int i11;
        int i12;
        if (charSequence == null) {
            return i10;
        }
        String string = charSequence.toString();
        int length = string.length();
        if ('-' == string.charAt(0)) {
            i12 = -1;
            i11 = 1;
        } else {
            i11 = 0;
            i12 = 1;
        }
        int i13 = 16;
        if ('0' == string.charAt(i11)) {
            if (i11 == length - 1) {
                return 0;
            }
            int i14 = i11 + 1;
            char cCharAt = string.charAt(i14);
            if ('x' == cCharAt || 'X' == cCharAt) {
                i11 += 2;
            } else {
                i13 = 8;
                i11 = i14;
            }
        } else if ('#' == string.charAt(i11)) {
            i11++;
        } else {
            i13 = 10;
        }
        return Integer.parseInt(string.substring(i11), i13) * i12;
    }

    public static final int d(CharSequence charSequence, String[] strArr, int i10) {
        if (charSequence != null) {
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (charSequence.equals(strArr[i11])) {
                    return i11;
                }
            }
        }
        return i10;
    }

    public static int e(String str, int i10) {
        return str == null ? i10 : h(str);
    }

    public static final void f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return;
            }
        } while (next != 1);
    }

    public static boolean g(XmlPullParser xmlPullParser, int i10) throws XmlPullParserException, IOException {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return false;
            }
            if (next == 3 && xmlPullParser.getDepth() == i10) {
                return false;
            }
            if (next == 2 && xmlPullParser.getDepth() == i10 + 1) {
                return true;
            }
        }
    }

    public static int h(CharSequence charSequence) {
        String string = charSequence.toString();
        int length = string.length();
        int i10 = 0;
        int i11 = 16;
        if ('0' == string.charAt(0)) {
            if (length - 1 == 0) {
                return 0;
            }
            char cCharAt = string.charAt(1);
            if ('x' == cCharAt || 'X' == cCharAt) {
                i10 = 2;
            } else {
                i11 = 8;
                i10 = 1;
            }
        } else if ('#' == string.charAt(0)) {
            i10 = 1;
        } else {
            i11 = 10;
        }
        return (int) Long.parseLong(string.substring(i10), i11);
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return Boolean.parseBoolean(xmlPullParser.getAttributeValue(null, str));
    }

    public static int j(XmlPullParser xmlPullParser, String str) throws IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(androidx.constraintlayout.motion.widget.s.a("problem parsing ", str, "=", attributeValue, " as int"));
        }
    }

    public static final ArrayList k(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return (ArrayList) t(xmlPullParserNewPullParser, new String[1]);
    }

    public static long l(XmlPullParser xmlPullParser, String str) throws IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(androidx.constraintlayout.motion.widget.s.a("problem parsing ", str, "=", attributeValue, " as long"));
        }
    }

    public static final HashMap m(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return (HashMap) t(xmlPullParserNewPullParser, new String[1]);
    }

    public static final HashSet n(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return (HashSet) t(xmlPullParserNewPullParser, new String[1]);
    }

    public static final int[] o(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
            int eventType = xmlPullParser.getEventType();
            int i10 = 0;
            do {
                if (eventType == 2) {
                    if (!xmlPullParser.getName().equals("item")) {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                    try {
                        iArr[i10] = Integer.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                    } catch (NullPointerException unused) {
                        throw new XmlPullParserException("Need value attribute in item");
                    } catch (NumberFormatException unused2) {
                        throw new XmlPullParserException("Not a number in value attribute in item");
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        StringBuilder sbA = androidx.activity.result.i.a("Expected ", str, " end tag at: ");
                        sbA.append(xmlPullParser.getName());
                        throw new XmlPullParserException(sbA.toString());
                    }
                    i10++;
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException(android.support.v4.media.i.a("Document ended before ", str, " end tag"));
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final ArrayList p(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(s(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                StringBuilder sbA = androidx.activity.result.i.a("Expected ", str, " end tag at: ");
                sbA.append(xmlPullParser.getName());
                throw new XmlPullParserException(sbA.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException(android.support.v4.media.i.a("Document ended before ", str, " end tag"));
    }

    public static final HashMap q(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object objS = s(xmlPullParser, strArr);
                String str2 = strArr[0];
                if (str2 == null) {
                    throw new XmlPullParserException("Map value without name attribute: " + xmlPullParser.getName());
                }
                map.put(str2, objS);
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return map;
                }
                StringBuilder sbA = androidx.activity.result.i.a("Expected ", str, " end tag at: ");
                sbA.append(xmlPullParser.getName());
                throw new XmlPullParserException(sbA.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException(android.support.v4.media.i.a("Document ended before ", str, " end tag"));
    }

    public static final HashSet r(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(s(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                StringBuilder sbA = androidx.activity.result.i.a("Expected ", str, " end tag at: ");
                sbA.append(xmlPullParser.getName());
                throw new XmlPullParserException(sbA.toString());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException(android.support.v4.media.i.a("Document ended before ", str, " end tag"));
    }

    public static final Object s(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next;
        Object d10;
        Object objValueOf = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals(x.b.f238264e)) {
                String string = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    }
                    if (next2 == 3) {
                        if (xmlPullParser.getName().equals(x.b.f238264e)) {
                            strArr[0] = attributeValue;
                            return string;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    }
                    if (next2 == 4) {
                        StringBuilder sbA = androidx.compose.runtime.changelist.a.a(string);
                        sbA.append(xmlPullParser.getText());
                        string = sbA.toString();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else if (name.equals("int")) {
                objValueOf = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                objValueOf = Long.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else {
                if (name.equals(x.b.f238262c)) {
                    d10 = new Float(xmlPullParser.getAttributeValue(null, "value"));
                } else if (name.equals("double")) {
                    d10 = new Double(xmlPullParser.getAttributeValue(null, "value"));
                } else {
                    if (!name.equals(x.b.f238265f)) {
                        if (name.equals("int-array")) {
                            xmlPullParser.next();
                            int[] iArrO = o(xmlPullParser, "int-array", strArr);
                            strArr[0] = attributeValue;
                            return iArrO;
                        }
                        if (name.equals("map")) {
                            xmlPullParser.next();
                            HashMap mapQ = q(xmlPullParser, "map", strArr);
                            strArr[0] = attributeValue;
                            return mapQ;
                        }
                        if (name.equals("list")) {
                            xmlPullParser.next();
                            ArrayList arrayListP = p(xmlPullParser, "list", strArr);
                            strArr[0] = attributeValue;
                            return arrayListP;
                        }
                        if (!name.equals("set")) {
                            throw new XmlPullParserException("Unknown tag: ".concat(name));
                        }
                        xmlPullParser.next();
                        HashSet hashSetR = r(xmlPullParser, "set", strArr);
                        strArr[0] = attributeValue;
                        return hashSetR;
                    }
                    objValueOf = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
                }
                objValueOf = d10;
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException(android.support.v4.media.i.a("Unexpected end of document in <", name, ">"));
            }
            if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return objValueOf;
                }
                StringBuilder sbA2 = androidx.activity.result.i.a("Unexpected end tag in <", name, ">: ");
                sbA2.append(xmlPullParser.getName());
                throw new XmlPullParserException(sbA2.toString());
            }
            if (next == 4) {
                StringBuilder sbA3 = androidx.activity.result.i.a("Unexpected text in <", name, ">: ");
                sbA3.append(xmlPullParser.getName());
                throw new XmlPullParserException(sbA3.toString());
            }
        } while (next != 2);
        StringBuilder sbA4 = androidx.activity.result.i.a("Unexpected start tag in <", name, ">: ");
        sbA4.append(xmlPullParser.getName());
        throw new XmlPullParserException(sbA4.toString());
    }

    public static final Object t(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            }
            if (eventType == 4) {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            }
            eventType = xmlPullParser.next();
            if (eventType == 1) {
                throw new XmlPullParserException("Unexpected end of document");
            }
        }
        return s(xmlPullParser, strArr);
    }

    public static void u(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    public static void v(XmlSerializer xmlSerializer, String str, boolean z10) throws IOException {
        xmlSerializer.attribute(null, str, Boolean.toString(z10));
    }

    public static final void w(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (bArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(bArr.length));
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 >> 4;
            sb2.append(i10 >= 10 ? i10 + 87 : i10 + 48);
            int i11 = b10 & 255;
            sb2.append(i11 >= 10 ? i11 + 87 : i11 + 48);
        }
        xmlSerializer.text(sb2.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    public static final void x(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (iArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(iArr.length));
        for (int i10 : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(i10));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    public static void y(XmlSerializer xmlSerializer, String str, int i10) throws IOException {
        xmlSerializer.attribute(null, str, Integer.toString(i10));
    }

    public static final void z(List list, OutputStream outputStream) throws XmlPullParserException, IOException {
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(outputStream, C3843g.f162098b);
        xmlSerializerNewSerializer.startDocument(null, Boolean.TRUE);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        A(list, null, xmlSerializerNewSerializer);
        xmlSerializerNewSerializer.endDocument();
    }
}
