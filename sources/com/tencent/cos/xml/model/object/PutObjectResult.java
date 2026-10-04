package com.tencent.cos.xml.model.object;

import androidx.annotation.Nullable;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.tag.pic.PicUploadResult;
import com.tencent.qcloud.core.http.h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import zb.C5878c;

/* JADX INFO: loaded from: classes7.dex */
public final class PutObjectResult extends BasePutObjectResult {
    public PicUploadResult picUploadResult;

    @Override // com.tencent.cos.xml.model.object.BasePutObjectResult, com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(h hVar) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(hVar);
        try {
            this.picUploadResult = (PicUploadResult) C5878c.b(hVar.a(), PicUploadResult.class);
        } catch (IOException e10) {
            throw new CosXmlClientException(ClientErrorCode.POOR_NETWORK.getCode(), e10);
        } catch (XmlPullParserException e11) {
            throw new CosXmlClientException(ClientErrorCode.SERVERERROR.getCode(), e11);
        }
    }

    @Nullable
    public PicUploadResult picUploadResult() {
        return this.picUploadResult;
    }
}
