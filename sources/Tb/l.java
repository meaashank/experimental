package tb;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.HttpRequest;

/* JADX INFO: loaded from: classes7.dex */
public interface l {
    <T> void onSignRequestSuccess(HttpRequest<T> httpRequest, h hVar, String str) throws QCloudClientException;

    <T> String source(HttpRequest<T> httpRequest) throws QCloudClientException;
}
