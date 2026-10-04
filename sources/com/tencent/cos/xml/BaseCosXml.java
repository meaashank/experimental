package com.tencent.cos.xml;

import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.listener.CosXmlResultListener;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.object.BasePutObjectRequest;
import com.tencent.cos.xml.model.object.BasePutObjectResult;
import com.tencent.cos.xml.model.object.GetObjectRequest;
import com.tencent.cos.xml.model.object.GetObjectResult;
import com.tencent.cos.xml.model.object.UploadPartRequest;
import com.tencent.cos.xml.model.object.UploadPartResult;

/* JADX INFO: loaded from: classes7.dex */
public interface BaseCosXml {
    BasePutObjectResult basePutObject(BasePutObjectRequest basePutObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    void basePutObjectAsync(BasePutObjectRequest basePutObjectRequest, CosXmlResultListener cosXmlResultListener);

    void cancel(CosXmlRequest cosXmlRequest);

    void cancelAll();

    GetObjectResult getObject(GetObjectRequest getObjectRequest) throws CosXmlServiceException, CosXmlClientException;

    byte[] getObject(String str, String str2) throws CosXmlServiceException, CosXmlClientException;

    void getObjectAsync(GetObjectRequest getObjectRequest, CosXmlResultListener cosXmlResultListener);

    String getObjectUrl(String str, String str2, String str3);

    void release();

    UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) throws CosXmlServiceException, CosXmlClientException;

    void uploadPartAsync(UploadPartRequest uploadPartRequest, CosXmlResultListener cosXmlResultListener);
}
