package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f155958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f155959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f155960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f155961d;

    public void a(int i10) {
        this.f155958a = i10;
        this.f155959b = i10;
        this.f155960c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f155959b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f155958a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f155961d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f155960c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f155959b;
    }

    public int getAuthGenDataStatus() {
        return this.f155958a;
    }

    public int getAuthSerialIdStatus() {
        return this.f155960c;
    }

    public int getOtherDataStatus() {
        return this.f155961d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "authority_serial_id":
                    return this.f155960c;
                case "authority_device_id":
                    return this.f155959b;
                case "authority_general_data":
                    return this.f155958a;
                case "authority_other":
                    return this.f155961d;
            }
        }
        return 1;
    }
}
