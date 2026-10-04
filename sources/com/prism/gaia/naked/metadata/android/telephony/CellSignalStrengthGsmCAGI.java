package com.prism.gaia.naked.metadata.android.telephony;

import W6.b;
import W6.c;
import W6.i;
import W6.k;
import W6.l;
import W6.n;
import android.annotation.TargetApi;
import android.telephony.CellSignalStrengthGsm;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedInt;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
@TargetApi(17)
public final class CellSignalStrengthGsmCAGI {

    @l
    @i(CellSignalStrengthGsm.class)
    public interface G extends ClassAccessor {
        @k
        NakedConstructor<CellSignalStrengthGsm> ctor();

        @n("mBitErrorRate")
        NakedInt mBitErrorRate();

        @n("mSignalStrength")
        NakedInt mSignalStrength();
    }
}
