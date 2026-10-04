package com.prism.lib.upgrade.entity;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.prism.commons.utils.C3860y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ChecksumBase {

    @SerializedName("checksum")
    public String checksum;

    public String calcChecksum() {
        return C3860y.m(TextUtils.join("#", getChecksumFields()));
    }

    public abstract Object[] getChecksumFields();

    public boolean verifyChecksum() {
        return calcChecksum().equals(this.checksum);
    }
}
