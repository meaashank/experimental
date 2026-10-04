package com.tencent.qcloud.core.http.interceptor;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class CircuitBreakerDeniedException extends IOException {
    public CircuitBreakerDeniedException(String str) {
        super(str);
    }
}
