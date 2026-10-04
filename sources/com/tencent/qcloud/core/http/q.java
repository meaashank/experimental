package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import okhttp3.Response;
import ub.InterfaceC5664b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f194344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC5664b f194346c;

    public abstract void a();

    public abstract i<T> b(HttpRequest<T> httpRequest, Response response) throws QCloudServiceException, QCloudClientException;

    public abstract i<T> c(HttpRequest<T> httpRequest) throws QCloudServiceException, QCloudClientException;
}
