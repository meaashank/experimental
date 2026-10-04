package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build;
import com.bykv.vk.openvk.preload.a.a.b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.gaia.client.stub.PermissionListActivity;

/* JADX INFO: loaded from: classes2.dex */
public class Common {

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    @b(a = CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)
    public String f140578ac;

    @b(a = "aid")
    public long aid;

    @b(a = PermissionListActivity.f164366k)
    public String appName;

    @b(a = "app_version")
    public String appVersion;

    @b(a = "device_id")
    public String deviceId;

    @b(a = "device_model")
    public String deviceModel;

    @b(a = "device_platform")
    public String devicePlatform;

    @b(a = "os")
    public int os = 0;

    @b(a = "os_version")
    public String osVersion;

    @b(a = "region")
    public String region;

    @b(a = "sdk_version")
    public String sdkVersion;

    @b(a = "uid")
    public String uid;

    public Common(long j10, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j10;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f140578ac = str4;
    }

    public Common(long j10, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        this.osVersion = sb2.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j10;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f140578ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
