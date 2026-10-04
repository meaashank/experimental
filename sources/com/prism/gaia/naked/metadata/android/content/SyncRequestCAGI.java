package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.SyncRequest;
import android.os.Bundle;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedLong;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
@TargetApi(19)
public final class SyncRequestCAGI {

    @l
    @i(SyncRequest.class)
    public interface G extends ClassAccessor {
        @n("mAccountToSync")
        NakedObject<Account> mAccountToSync();

        @n("mAuthority")
        NakedObject<String> mAuthority();

        @n("mExtras")
        NakedObject<Bundle> mExtras();

        @n("mIsAuthority")
        NakedBoolean mIsAuthority();

        @n("mIsPeriodic")
        NakedBoolean mIsPeriodic();

        @n("mSyncFlexTimeSecs")
        NakedLong mSyncFlexTimeSecs();

        @n("mSyncRunTimeSecs")
        NakedLong mSyncRunTimeSecs();
    }
}
