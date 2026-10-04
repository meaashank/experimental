package org.apache.http;

/* JADX INFO: loaded from: classes6.dex */
public interface StatusLine {
    ProtocolVersion getProtocolVersion();

    String getReasonPhrase();

    int getStatusCode();
}
