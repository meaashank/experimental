package com.prism.gaia.naked.metadata.android.telephony;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import android.telephony.NeighboringCellInfo;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedInt;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class NeighboringCellInfoCAGI {

    @l
    @i(NeighboringCellInfo.class)
    public interface G extends ClassAccessor {
        @n("mCid")
        NakedInt mCid();

        @n("mLac")
        NakedInt mLac();

        @n("mRssi")
        NakedInt mRssi();
    }
}
