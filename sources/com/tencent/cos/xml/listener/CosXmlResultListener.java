package com.tencent.cos.xml.listener;

import androidx.annotation.Nullable;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.cos.xml.model.CosXmlResult;

/* JADX INFO: loaded from: classes7.dex */
public interface CosXmlResultListener {
    void onFail(CosXmlRequest cosXmlRequest, @Nullable CosXmlClientException cosXmlClientException, @Nullable CosXmlServiceException cosXmlServiceException);

    void onSuccess(CosXmlRequest cosXmlRequest, CosXmlResult cosXmlResult);
}
