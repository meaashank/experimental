package org.apache.http;

/* JADX INFO: loaded from: classes6.dex */
public interface RequestLine {
    String getMethod();

    ProtocolVersion getProtocolVersion();

    String getUri();
}
