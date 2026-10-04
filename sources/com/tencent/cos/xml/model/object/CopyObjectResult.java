package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.CopyObject;
import com.tencent.cos.xml.model.tag.CosError;
import com.tencent.cos.xml.transfer.XmlSlimParser;
import com.tencent.cos.xml.utils.BaseXmlSlimParser;
import com.tencent.cos.xml.utils.CloseUtil;
import com.tencent.qcloud.core.http.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public class CopyObjectResult extends CosXmlResult {
    public CopyObject copyObject;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(h hVar) throws Throwable {
        byte[] bArrB;
        ByteArrayInputStream byteArrayInputStream;
        super.parseResponseBody(hVar);
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                this.copyObject = new CopyObject();
                bArrB = hVar.b();
                byteArrayInputStream = new ByteArrayInputStream(bArrB);
            } catch (Throwable th) {
                th = th;
            }
            try {
                XmlSlimParser.parseCopyObjectResult(byteArrayInputStream, this.copyObject);
                if (this.copyObject.eTag == null && bArrB != null && bArrB.length > 0) {
                    byteArrayInputStream.reset();
                    CosXmlServiceException cosXmlServiceException = new CosXmlServiceException("failed");
                    CosError cosError = new CosError();
                    BaseXmlSlimParser.parseError(byteArrayInputStream, cosError);
                    cosXmlServiceException.setErrorCode(cosError.code);
                    cosXmlServiceException.setErrorMessage(cosError.message);
                    cosXmlServiceException.setRequestId(cosError.requestId);
                    cosXmlServiceException.setServiceName(cosError.resource);
                    cosXmlServiceException.setStatusCode(hVar.f194288b.f225295d);
                    throw cosXmlServiceException;
                }
                CloseUtil.closeQuietly(byteArrayInputStream);
            } catch (IOException e10) {
                e = e10;
                throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e);
            } catch (XmlPullParserException e11) {
                e = e11;
                throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e);
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream2 = byteArrayInputStream;
                CloseUtil.closeQuietly(byteArrayInputStream2);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (XmlPullParserException e13) {
            e = e13;
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        CopyObject copyObject = this.copyObject;
        return copyObject != null ? copyObject.toString() : super.printResult();
    }
}
