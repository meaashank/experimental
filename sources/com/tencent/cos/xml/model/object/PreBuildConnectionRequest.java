package com.tencent.cos.xml.model.object;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.qcloud.core.http.x;

/* JADX INFO: loaded from: classes7.dex */
public final class PreBuildConnectionRequest extends CosXmlRequest {
    public PreBuildConnectionRequest(String str) {
        this.bucket = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        if (this.requestURL == null && this.bucket == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "bucket must not be null");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "HEAD";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getUrlPath(this.bucket, RemoteSettings.FORWARD_SLASH_STRING);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public x getRequestBody() {
        return null;
    }
}
