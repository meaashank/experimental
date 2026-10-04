package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.CompleteMultipartUploadResult;
import com.tencent.qcloud.core.http.h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import zb.C5878c;

/* JADX INFO: loaded from: classes7.dex */
public final class CompleteMultiUploadResult extends CosXmlResult {
    public CompleteMultipartUploadResult completeMultipartUpload;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(h hVar) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(hVar);
        this.completeMultipartUpload = new CompleteMultipartUploadResult();
        try {
            this.completeMultipartUpload = (CompleteMultipartUploadResult) C5878c.b(hVar.a(), CompleteMultipartUploadResult.class);
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        CompleteMultipartUploadResult completeMultipartUploadResult = this.completeMultipartUpload;
        return completeMultipartUploadResult != null ? completeMultipartUploadResult.toString() : super.printResult();
    }
}
