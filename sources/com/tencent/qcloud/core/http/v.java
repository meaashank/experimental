package com.tencent.qcloud.core.http;

import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static v f194354a = new a();

    public static class a extends v {
        @Override // com.tencent.qcloud.core.http.v
        public boolean a(Request request, Response response, Exception exc) {
            return true;
        }
    }

    public abstract boolean a(Request request, Response response, Exception exc);
}
