package com.tencent.cos.xml.model;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.x;

/* JADX INFO: loaded from: classes7.dex */
public class PresignedUrlRequest extends CosXmlRequest {
    private String cosPath;
    private String requestMethod = "GET";

    public PresignedUrlRequest(String str, String str2) {
        this.bucket = str;
        this.cosPath = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        String str = this.bucket;
        if (str == null || str.length() < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "bucket must not be null ");
        }
        String str2 = this.cosPath;
        if (str2 == null || str2.length() < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), "cosPath must not be null ");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return this.requestMethod;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getUrlPath(this.bucket, this.cosPath);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public x getRequestBody() throws CosXmlClientException {
        return null;
    }

    public void setCosPath(String str) {
        if (str != null) {
            if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                this.cosPath = str;
            } else {
                this.cosPath = RemoteSettings.FORWARD_SLASH_STRING.concat(str);
            }
        }
    }

    public void setRequestMethod(String str) {
        this.requestMethod = str;
    }
}
