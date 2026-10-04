package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final int OVREGION_TYPE_CN = 2;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f161839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f161840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f161841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f161842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, Object> f161843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f161844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f161845g;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f161846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f161847b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f161848c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f161849d;

        public PglSSConfig build() {
            if (TextUtils.isEmpty(this.f161846a)) {
                return null;
            }
            int i10 = this.f161847b;
            if (i10 != 2 && i10 != 1 && i10 != 0) {
                return null;
            }
            int i11 = this.f161848c;
            if (i11 == 0 || i11 == 1) {
                return new PglSSConfig(this.f161846a, i10, i11, this.f161849d);
            }
            return null;
        }

        public Builder setAdsdkVersion(String str) {
            this.f161849d = str;
            return this;
        }

        public Builder setAppId(String str) {
            this.f161846a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.f161848c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f161847b = i10;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getAdSdkVersion() {
        return this.f161842d;
    }

    public String getAppId() {
        return this.f161839a;
    }

    public String getCnReportUrl() {
        return this.f161844f;
    }

    public String getCnTokenUrl() {
        return this.f161845g;
    }

    public int getCollectMode() {
        return this.f161841c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f161843e;
    }

    public int getOVRegionType() {
        return this.f161840b;
    }

    public void setCnReportUrl(String str) {
        this.f161844f = str;
    }

    public void setCnTokenUrl(String str) {
        this.f161845g = str;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f161843e = map;
    }

    private PglSSConfig(String str, int i10, int i11, String str2) {
        this.f161839a = str;
        this.f161840b = i10;
        this.f161841c = i11;
        this.f161842d = str2;
    }
}
