package ub;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;

/* JADX INFO: renamed from: ub.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC5665c<T> {
    void onFailure(QCloudClientException qCloudClientException, QCloudServiceException qCloudServiceException);

    void onSuccess(T t10);
}
