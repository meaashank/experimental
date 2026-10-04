package com.tencent.cos.xml.transfer;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.CosError;
import com.tencent.cos.xml.utils.BaseXmlSlimParser;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.h;
import com.tencent.qcloud.core.http.y;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Response;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public class ResponseXmlS3BodySerializer<T> extends y<T> {
    private CosXmlResult cosXmlResult;

    public ResponseXmlS3BodySerializer(CosXmlResult cosXmlResult) {
        this.cosXmlResult = cosXmlResult;
    }

    private void parseCOSXMLError(h hVar) throws CosXmlServiceException, CosXmlClientException {
        Response response = hVar.f194288b;
        int i10 = response.f225295d;
        if (i10 < 200 || i10 >= 300) {
            CosXmlServiceException cosXmlServiceException = new CosXmlServiceException(response.f225294c);
            cosXmlServiceException.setStatusCode(i10);
            cosXmlServiceException.setRequestId(hVar.f194288b.T0(Headers.REQUEST_ID));
            InputStream inputStreamA = hVar.a();
            if (inputStreamA == null) {
                throw cosXmlServiceException;
            }
            CosError cosError = new CosError();
            try {
                BaseXmlSlimParser.parseError(inputStreamA, cosError);
                String str = cosError.code;
                if (str != null) {
                    cosXmlServiceException.setErrorCode(str);
                }
                String str2 = cosError.message;
                if (str2 != null) {
                    cosXmlServiceException.setErrorMessage(str2);
                }
                String str3 = cosError.requestId;
                if (str3 != null) {
                    cosXmlServiceException.setRequestId(str3);
                }
                String str4 = cosError.resource;
                if (str4 == null) {
                    throw cosXmlServiceException;
                }
                cosXmlServiceException.setServiceName(str4);
                throw cosXmlServiceException;
            } catch (IOException e10) {
                throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
            } catch (XmlPullParserException e11) {
                throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.y
    public T convert(h hVar) throws QCloudServiceException, QCloudClientException {
        parseCOSXMLError(hVar);
        this.cosXmlResult.parseResponseBody(hVar);
        return (T) this.cosXmlResult;
    }
}
