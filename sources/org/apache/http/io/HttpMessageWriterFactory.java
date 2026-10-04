package org.apache.http.io;

import org.apache.http.HttpMessage;

/* JADX INFO: loaded from: classes6.dex */
public interface HttpMessageWriterFactory<T extends HttpMessage> {
    HttpMessageWriter<T> create(SessionOutputBuffer sessionOutputBuffer);
}
