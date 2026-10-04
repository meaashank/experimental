package com.tencent.cos.xml.transfer;

import android.content.ContentResolver;
import android.net.Uri;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.qcloud.core.http.h;
import com.tencent.qcloud.core.http.z;

/* JADX INFO: loaded from: classes7.dex */
public class ResponseFileBodySerializer<T2> extends z<T2> {
    private GetObjectResult getObjectResult;

    public ResponseFileBodySerializer(GetObjectResult getObjectResult, String str, long j10) {
        super(str, j10);
        this.getObjectResult = getObjectResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        throw r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void parseCOSXMLError(com.tencent.qcloud.core.http.h r4) throws com.tencent.cos.xml.exception.CosXmlServiceException, com.tencent.cos.xml.exception.CosXmlClientException {
        /*
            r3 = this;
            okhttp3.Response r0 = r4.f194288b
            int r1 = r0.f225295d
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 < r2) goto Ld
            r2 = 300(0x12c, float:4.2E-43)
            if (r1 >= r2) goto Ld
            return
        Ld:
            java.lang.String r0 = r0.f225294c
            com.tencent.cos.xml.exception.CosXmlServiceException r2 = new com.tencent.cos.xml.exception.CosXmlServiceException
            r2.<init>(r0)
            r2.setStatusCode(r1)
            java.lang.String r0 = "x-cos-request-id"
            okhttp3.Response r1 = r4.f194288b
            java.lang.String r0 = r1.T0(r0)
            r2.setRequestId(r0)
            java.io.InputStream r4 = r4.a()
            if (r4 == 0) goto L53
            com.tencent.cos.xml.model.tag.CosError r0 = new com.tencent.cos.xml.model.tag.CosError
            r0.<init>()
            com.tencent.cos.xml.utils.BaseXmlSlimParser.parseError(r4, r0)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r4 = r0.code     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            r2.setErrorCode(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r4 = r0.message     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            r2.setErrorMessage(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r4 = r0.requestId     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            r2.setRequestId(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            java.lang.String r4 = r0.resource     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            r2.setServiceName(r4)     // Catch: java.io.IOException -> L45 org.xmlpull.v1.XmlPullParserException -> L52
            goto L53
        L45:
            r4 = move-exception
            com.tencent.cos.xml.exception.CosXmlClientException r0 = new com.tencent.cos.xml.exception.CosXmlClientException
            com.tencent.cos.xml.common.ClientErrorCode r1 = com.tencent.cos.xml.common.ClientErrorCode.POOR_NETWORK
            int r1 = r1.getCode()
            r0.<init>(r1, r4)
            throw r0
        L52:
            throw r2
        L53:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.cos.xml.transfer.ResponseFileBodySerializer.parseCOSXMLError(com.tencent.qcloud.core.http.h):void");
    }

    @Override // com.tencent.qcloud.core.http.z, com.tencent.qcloud.core.http.y
    public T2 convert(h hVar) throws Throwable {
        parseCOSXMLError(hVar);
        this.getObjectResult.parseResponseBody(hVar);
        super.convert(hVar);
        return (T2) this.getObjectResult;
    }

    public ResponseFileBodySerializer(GetObjectResult getObjectResult, Uri uri, ContentResolver contentResolver, long j10) {
        super(uri, contentResolver, j10);
        this.getObjectResult = getObjectResult;
    }
}
