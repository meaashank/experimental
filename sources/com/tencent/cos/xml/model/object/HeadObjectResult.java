package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.h;

/* JADX INFO: loaded from: classes7.dex */
public final class HeadObjectResult extends CosXmlResult {
    public String cosObjectType;
    public String cosStorageClass;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(h hVar) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(hVar);
        this.cosObjectType = hVar.f194288b.T0("x-cos-object-type");
        this.cosStorageClass = hVar.f194288b.T0("x-cos-storage-class");
    }
}
