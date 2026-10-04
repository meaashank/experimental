package com.prism.gaia.naked.metadata.android.telephony;

import W6.b;
import W6.c;
import W6.i;
import W6.k;
import W6.l;
import W6.n;
import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
@TargetApi(17)
public final class CellIdentityGsmCAGI {

    @l
    @i(CellIdentityGsm.class)
    public interface G extends ClassAccessor {
        @k
        NakedConstructor<CellIdentityGsm> ctor();

        @n("mCid")
        NakedInt mCid();

        @n("mLac")
        NakedInt mLac();

        @n("mMcc")
        NakedInt mMcc();

        @n("mMnc")
        NakedInt mMnc();
    }
}
