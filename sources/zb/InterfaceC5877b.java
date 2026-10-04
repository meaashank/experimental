package zb;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: zb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC5877b<T> {
    T fromXml(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException;

    void toXml(XmlSerializer xmlSerializer, T t10, String str) throws XmlPullParserException, IOException;
}
