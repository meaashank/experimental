package org.apache.http.params;

import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class HttpAbstractParamBean {
    protected final HttpParams params;

    public HttpAbstractParamBean(HttpParams httpParams) {
        this.params = (HttpParams) Args.notNull(httpParams, "HTTP parameters");
    }
}
