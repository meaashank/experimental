package zb;

import android.util.Xml;
import androidx.constraintlayout.motion.widget.s;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: zb.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C5878c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Class<?>, InterfaceC5877b<?>> f241331a = new HashMap();

    public static <T> InterfaceC5877b<T> a(Class<?> cls) {
        Map<Class<?>, InterfaceC5877b<?>> map = f241331a;
        InterfaceC5877b<T> interfaceC5877b = (InterfaceC5877b) map.get(cls);
        if (interfaceC5877b != null) {
            return interfaceC5877b;
        }
        String name = cls.getName();
        try {
            InterfaceC5877b<T> interfaceC5877b2 = (InterfaceC5877b) Class.forName(name.concat("$$XmlAdapter")).newInstance();
            map.put(cls, (InterfaceC5877b<?>) interfaceC5877b2);
            return interfaceC5877b2;
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(s.a("No IXmlAdapter for class ", name, " found. Expected name of the xml adapter is ", name, "$$XmlAdapter"), e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(s.a("No IXmlAdapter for class ", name, " found. Expected name of the xml adapter is ", name, "$$XmlAdapter"), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(s.a("No IXmlAdapter for class ", name, " found. Expected name of the xml adapter is ", name, "$$XmlAdapter"), e12);
        }
    }

    public static <T> T b(InputStream inputStream, Class<T> cls) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "UTF-8");
        return (T) d(xmlPullParserNewPullParser, cls, null);
    }

    public static <T> T c(XmlPullParser xmlPullParser, Class<T> cls) throws XmlPullParserException, IOException {
        return (T) d(xmlPullParser, cls, null);
    }

    public static <T> T d(XmlPullParser xmlPullParser, Class<T> cls, String str) throws XmlPullParserException, IOException {
        return (T) a(cls).fromXml(xmlPullParser, str);
    }

    public static String e(String str) {
        return (str == null || !str.startsWith("<?xml")) ? str : str.substring(str.indexOf("?>") + 2);
    }

    public static <T> String f(T t10) throws XmlPullParserException, IOException {
        if (t10 == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializerNewSerializer.setOutput(stringWriter);
        xmlSerializerNewSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        xmlSerializerNewSerializer.startDocument("UTF-8", null);
        h(xmlSerializerNewSerializer, t10, null);
        xmlSerializerNewSerializer.endDocument();
        return e(stringWriter.toString());
    }

    public static <T> void g(XmlSerializer xmlSerializer, T t10) throws XmlPullParserException, IOException {
        h(xmlSerializer, t10, null);
    }

    public static <T> void h(XmlSerializer xmlSerializer, T t10, String str) throws XmlPullParserException, IOException {
        a(t10.getClass()).toXml(xmlSerializer, t10, str);
    }
}
