package com.prism.gaia.naked.compat.android.content;

import U6.b;
import W6.c;
import com.prism.gaia.naked.metadata.android.content.IntentCAG;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class IntentCompat2 {
    public static final String EXTRA_USER_HANDLE;
    public static final int FLAG_RECEIVER_EXCLUDE_BACKGROUND = 8388608;
    public static final int FLAG_RECEIVER_INCLUDE_BACKGROUND = 16777216;
    public static final int FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT;

    static {
        FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT = IntentCAG.f165600C.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT() == null ? 67108864 : IntentCAG.f165600C.FLAG_RECEIVER_REGISTERED_ONLY_BEFORE_BOOT().get();
        EXTRA_USER_HANDLE = IntentCAG.f165600C.EXTRA_USER_HANDLE() == null ? b.c.f68611M : IntentCAG.f165600C.EXTRA_USER_HANDLE().get();
    }
}
