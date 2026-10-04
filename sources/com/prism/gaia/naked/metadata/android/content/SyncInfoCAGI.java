package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.f;
import W6.i;
import W6.k;
import W6.l;
import W6.n;
import W6.q;
import android.accounts.Account;
import android.content.SyncInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class SyncInfoCAGI {

    @l
    @i(SyncInfo.class)
    public interface G extends ClassAccessor {
        @q("REDACTED_ACCOUNT")
        NakedStaticObject<Account> REDACTED_ACCOUNT();

        @n("authorityId")
        NakedInt authorityId();

        @f({int.class, Account.class, String.class, long.class})
        @k
        NakedConstructor<SyncInfo> ctor();
    }
}
