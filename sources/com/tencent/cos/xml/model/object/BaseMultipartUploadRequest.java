package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.CosXmlServiceConfig;
import tb.n;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseMultipartUploadRequest extends UploadRequest {
    public BaseMultipartUploadRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public n[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        String[] strArr = {"name/cos:InitiateMultipartUpload", "name/cos:ListParts", "name/cos:UploadPart", "name/cos:CompleteMultipartUpload", "name/cos:AbortMultipartUpload"};
        n[] nVarArr = new n[5];
        int i10 = 0;
        int i11 = 0;
        while (i10 < 5) {
            nVarArr[i11] = new n(strArr[i10], cosXmlServiceConfig.getBucket(this.bucket), cosXmlServiceConfig.getRegion(), getPath(cosXmlServiceConfig));
            i10++;
            i11++;
        }
        return nVarArr;
    }
}
