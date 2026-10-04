package com.tencent.cos.xml.model.object;

import android.support.v4.media.e;
import com.tencent.cos.xml.crypto.Headers;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlResult;
import com.tencent.qcloud.core.http.h;

/* JADX INFO: loaded from: classes7.dex */
public final class AppendObjectResult extends CosXmlResult {
    public String eTag;
    public String nextAppendPosition;

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public void parseResponseBody(h hVar) throws CosXmlServiceException, CosXmlClientException {
        super.parseResponseBody(hVar);
        this.eTag = hVar.f194288b.T0("eTag");
        this.nextAppendPosition = hVar.f194288b.T0(Headers.APPEND_OBJECT_NEXT_POSISTION);
    }

    @Override // com.tencent.cos.xml.model.CosXmlResult
    public String printResult() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.printResult());
        sb2.append("\n");
        sb2.append(this.eTag);
        sb2.append("\n");
        return e.a(sb2, this.nextAppendPosition, "\n");
    }
}
