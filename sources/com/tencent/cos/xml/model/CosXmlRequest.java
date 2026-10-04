package com.tencent.cos.xml.model;

import android.text.TextUtils;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.utils.URLEncodeUtils;
import com.tencent.qcloud.core.http.k;
import com.tencent.qcloud.core.http.l;
import com.tencent.qcloud.core.http.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.e;
import tb.n;
import ub.d;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CosXmlRequest {
    protected String bucket;
    private k httpTask;
    private String keyTime;
    private l metrics;
    private OnRequestWeightListener onRequestWeightListener;
    protected d qCloudTaskStateListener;
    private String queryParameterEncodedString;
    protected String region;
    protected String requestURL;
    private boolean signInUrl;
    protected tb.l signSourceProvider;
    protected Map<String, String> queryParameters = new LinkedHashMap();
    protected Map<String, List<String>> requestHeaders = new LinkedHashMap();
    protected Set<String> noSignHeaders = new HashSet();
    protected Set<String> noSignParams = new HashSet();
    private boolean isNeedMD5 = false;
    private boolean isSupportAccelerate = false;
    protected int priority = -1;

    public interface OnRequestWeightListener {
        int onWeight();
    }

    public void addHeader(String str, String str2) {
        List<String> arrayList = this.requestHeaders.containsKey(str) ? this.requestHeaders.get(str) : new ArrayList<>();
        arrayList.add(str2);
        this.requestHeaders.put(str, arrayList);
    }

    public void addNoSignHeader(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.noSignHeaders.add(str);
    }

    public void addNoSignParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.noSignParams.add(str);
    }

    public void addQuery(String str, String str2) {
        this.queryParameters.put(str, str2);
    }

    public void attachMetrics(l lVar) {
        this.metrics = lVar;
    }

    public void checkParameters() throws CosXmlClientException {
    }

    public String getBucket() {
        return this.bucket;
    }

    public k getHttpTask() {
        return this.httpTask;
    }

    public String getKeyTime() {
        return this.keyTime;
    }

    public abstract String getMethod();

    public l getMetrics() {
        return this.metrics;
    }

    public Set<String> getNoSignHeaders() {
        return this.noSignHeaders;
    }

    public Set<String> getNoSignParams() {
        return this.noSignParams;
    }

    public abstract String getPath(CosXmlServiceConfig cosXmlServiceConfig);

    public int getPriority() {
        return this.priority;
    }

    public String getQueryEncodedString() {
        return this.queryParameterEncodedString;
    }

    public Map<String, String> getQueryString() {
        return this.queryParameters;
    }

    public String getRegion() {
        return this.region;
    }

    public abstract x getRequestBody() throws CosXmlClientException;

    public Map<String, List<String>> getRequestHeaders() {
        return this.requestHeaders;
    }

    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, this.isSupportAccelerate);
    }

    public String getRequestURL() {
        return this.requestURL;
    }

    public n[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        return new n[]{new n("name/cos:" + getClass().getSimpleName().replace("Request", ""), cosXmlServiceConfig.getBucket(this.bucket), cosXmlServiceConfig.getRegion(), getPath(cosXmlServiceConfig))};
    }

    public tb.l getSignSourceProvider() {
        if (this.signSourceProvider == null) {
            this.signSourceProvider = new e();
        }
        return this.signSourceProvider;
    }

    public int getWeight() {
        OnRequestWeightListener onRequestWeightListener = this.onRequestWeightListener;
        if (onRequestWeightListener != null) {
            return onRequestWeightListener.onWeight();
        }
        return 0;
    }

    public boolean headersHasUnsafeNonAscii() {
        return false;
    }

    public boolean isNeedMD5() {
        return this.isNeedMD5;
    }

    public boolean isSignInUrl() {
        return this.signInUrl;
    }

    public void isSupportAccelerate(boolean z10) {
        this.isSupportAccelerate = z10;
    }

    public void setNeedMD5(boolean z10) {
        this.isNeedMD5 = z10;
    }

    public void setOnRequestWeightListener(OnRequestWeightListener onRequestWeightListener) {
        this.onRequestWeightListener = onRequestWeightListener;
    }

    public void setQueryEncodedString(String str) {
        this.queryParameterEncodedString = str;
    }

    public void setQueryParameters(Map<String, String> map) {
        this.queryParameters = map;
    }

    public void setRegion(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.region = str;
    }

    public void setRequestHeaders(Map<String, List<String>> map) {
        if (map != null) {
            this.requestHeaders.putAll(map);
        }
    }

    public void setRequestURL(String str) {
        this.requestURL = str;
    }

    @Deprecated
    public void setSign(long j10) {
    }

    public void setSignInUrl(boolean z10) {
        this.signInUrl = z10;
    }

    public void setSignKeyTime(int i10) {
        long jC = com.tencent.qcloud.core.http.e.c();
        this.keyTime = jC + ";" + (((long) i10) + jC);
    }

    public void setSignParamsAndHeaders(Set<String> set, Set<String> set2) {
        e eVar = new e();
        eVar.parameters(set);
        eVar.headers(set2);
        this.signSourceProvider = eVar;
    }

    public void setSignSourceProvider(tb.l lVar) {
        this.signSourceProvider = lVar;
    }

    public void setTask(k kVar) {
        this.httpTask = kVar;
        kVar.j(this.qCloudTaskStateListener);
        kVar.f194327A = this.metrics;
    }

    public void setTaskStateListener(d dVar) {
        this.qCloudTaskStateListener = dVar;
    }

    public boolean isSupportAccelerate() {
        return this.isSupportAccelerate;
    }

    @Deprecated
    public void setRequestHeaders(String str, String str2) throws CosXmlClientException {
        if (str == null || str2 == null) {
            return;
        }
        addHeader(str, URLEncodeUtils.cosPathEncode(str2));
    }

    @Deprecated
    public void setSign(long j10, long j11) {
    }

    public void setSign(String str) {
        addHeader("Authorization", str);
    }

    public void setRequestHeaders(String str, String str2, boolean z10) throws CosXmlClientException {
        if (str == null || str2 == null) {
            return;
        }
        if (z10) {
            str2 = URLEncodeUtils.cosPathEncode(str2);
        }
        addHeader(str, str2);
    }

    @Deprecated
    public void setSign(long j10, Set<String> set, Set<String> set2) {
        setSignParamsAndHeaders(set, set2);
    }

    @Deprecated
    public void setSign(long j10, long j11, Set<String> set, Set<String> set2) {
        setSignParamsAndHeaders(set, set2);
    }
}
