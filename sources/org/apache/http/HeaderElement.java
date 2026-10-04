package org.apache.http;

/* JADX INFO: loaded from: classes6.dex */
public interface HeaderElement {
    String getName();

    NameValuePair getParameter(int i10);

    NameValuePair getParameterByName(String str);

    int getParameterCount();

    NameValuePair[] getParameters();

    String getValue();
}
