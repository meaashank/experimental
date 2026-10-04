package com.tencent.qcloud.core.http;

import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes7.dex */
public class m {
    public static boolean a(Exception exc) {
        return (exc instanceof SocketTimeoutException) || (exc instanceof ConnectException) || (exc instanceof NoRouteToHostException) || (exc instanceof UnknownHostException);
    }
}
