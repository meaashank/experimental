package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.x;

/* JADX INFO: loaded from: classes7.dex */
public final class GetObjectBytesRequest extends ObjectRequest {
    public GetObjectBytesRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return "GET";
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public x getRequestBody() throws CosXmlClientException {
        return null;
    }
}
