package com.prism.gaia.helper.utils;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes6.dex */
public interface B<T> {
    void a(T t10, XmlSerializer xmlSerializer) throws IOException;

    T b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException;
}
