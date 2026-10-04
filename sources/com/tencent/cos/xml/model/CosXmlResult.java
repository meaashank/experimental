package com.tencent.cos.xml.model;

import androidx.annotation.Nullable;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.exception.CosXmlServiceException;
import com.tencent.qcloud.core.http.h;
import java.util.List;
import java.util.Map;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CosXmlResult {
    public String accessUrl;
    public Map<String, List<String>> headers;
    public int httpCode;
    public String httpMessage;

    @Nullable
    public String getHeader(String str) {
        List<String> list;
        if (!this.headers.containsKey(str) || (list = this.headers.get(str)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void parseResponseBody(h hVar) throws CosXmlServiceException, CosXmlClientException {
        Response response = hVar.f194288b;
        this.httpCode = response.f225295d;
        this.httpMessage = response.f225294c;
        this.headers = hVar.g();
    }

    public String printResult() {
        return this.httpCode + "|" + this.httpMessage;
    }
}
