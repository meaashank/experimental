package com.prism.hider.vault.commons;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public interface VaultUI extends Parcelable {
    VaultUIMeta getMeta();

    boolean launchVault(Context context);
}
