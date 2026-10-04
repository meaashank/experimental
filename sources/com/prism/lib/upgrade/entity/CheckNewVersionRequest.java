package com.prism.lib.upgrade.entity;

import com.google.gson.annotations.SerializedName;
import db.C4313c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class CheckNewVersionRequest extends BaseRequest {

    @SerializedName("android_sdk_int")
    public int androidSdkInt;

    @SerializedName("android_version")
    public String androidVersion;

    @SerializedName("app_channel")
    public String appChannel;

    @SerializedName("app_client_id")
    public String appClientID;

    @SerializedName("app_version_code")
    public int appVersionCode;

    @SerializedName("app_version_name")
    public String appVersionName;

    @SerializedName("device_brand")
    public String deviceBrand;

    @SerializedName("device_manufacturer")
    public String deviceManufacturer;

    @SerializedName("device_name")
    public String deviceName;

    @SerializedName("pkg_name")
    public String pkgName;

    @SerializedName("pkg_source")
    public String pkgSource;

    @Override // com.prism.lib.upgrade.entity.ChecksumBase
    public Object[] getChecksumFields() {
        return new Object[]{C4313c.f199890f, this.pkgName, this.pkgSource, this.appVersionName, Integer.valueOf(this.appVersionCode), this.appChannel, this.appClientID, this.deviceManufacturer, this.deviceBrand, this.deviceName, this.androidVersion, Integer.valueOf(this.androidSdkInt), Long.valueOf(this.timestamp)};
    }

    public Map<String, Object> toFieldMap() {
        HashMap map = new HashMap();
        map.put("pkg_name", this.pkgName);
        map.put("pkg_source", this.pkgSource);
        map.put("app_version_name", this.appVersionName);
        map.put("app_version_code", Integer.valueOf(this.appVersionCode));
        map.put("app_channel", this.appChannel);
        map.put("app_client_id", this.appClientID);
        map.put("device_manufacturer", this.deviceManufacturer);
        map.put("device_brand", this.deviceBrand);
        map.put("device_name", this.deviceName);
        map.put("android_version", this.androidVersion);
        map.put("android_sdk_int", Integer.valueOf(this.androidSdkInt));
        map.put("timestamp", Long.valueOf(this.timestamp));
        map.put("checksum", this.checksum);
        return map;
    }
}
