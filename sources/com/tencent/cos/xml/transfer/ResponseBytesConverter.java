package com.tencent.cos.xml.transfer;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.object.GetObjectBytesResult;
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
public class ResponseBytesConverter<T> extends y<T> {
    private GetObjectBytesResult getObjectBytesResult;

    public ResponseBytesConverter(GetObjectBytesResult getObjectBytesResult) {
        this.getObjectBytesResult = getObjectBytesResult;
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
                cosXmlServiceException.setErrorCode(cosError.code);
                cosXmlServiceException.setErrorMessage(cosError.message);
                cosXmlServiceException.setRequestId(cosError.requestId);
                cosXmlServiceException.setServiceName(cosError.resource);
                throw cosXmlServiceException;
            } catch (IOException e10) {
                throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
            } catch (XmlPullParserException e11) {
                throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.y
    public T convert(h<T> hVar) throws QCloudServiceException, QCloudClientException {
        parseCOSXMLError(hVar);
        this.getObjectBytesResult.parseResponseBody(hVar);
        return (T) this.getObjectBytesResult;
    }
}
