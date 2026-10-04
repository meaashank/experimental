package com.prism.gaia.server.am;

import android.content.IntentFilter;

/* JADX INFO: loaded from: classes6.dex */
final class BroadcastFilterG extends IntentFilter {
    final int owningVuid;
    final int owningVuserId;
    final String packageName;
    final ReceiverListG receiverList;
    final String requiredPermission;

    public BroadcastFilterG(IntentFilter intentFilter, ReceiverListG receiverListG, String str, String str2, int i10, int i11) {
        super(intentFilter);
        this.receiverList = receiverListG;
        this.packageName = str;
        this.requiredPermission = str2;
        this.owningVuid = i10;
        this.owningVuserId = i11;
    }

    public String toString() {
        return "BroadcastFilter{" + Integer.toHexString(System.identityHashCode(this)) + ' ' + this.owningVuid + "/u" + this.owningVuserId + ' ' + this.receiverList + '}';
    }
}
