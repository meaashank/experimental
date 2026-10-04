package com.tencent.cos.xml.model.object;

import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.cos.xml.model.tag.PostResponse;
import com.tencent.cos.xml.transfer.XmlSlimParser;
import com.tencent.qcloud.core.http.h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes7.dex */
public class PostObjectResult extends CosXmlResult {
    public String eTag;
    public String location;
    public PostResponse postResponse;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(h hVar) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(hVar);
        this.eTag = hVar.f194288b.T0("ETag");
        this.location = hVar.f194288b.T0("Location");
        this.postResponse = new PostResponse();
        try {
            if (hVar.a() != null) {
                XmlSlimParser.parsePostResponseResult(hVar.a(), this.postResponse);
            }
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        return super.printResult();
    }
}
