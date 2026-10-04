package com.prism.gaia.naked.metadata.android.telephony;

import W6.b;
import W6.c;
import W6.i;
import W6.k;
import W6.l;
import W6.n;
import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthGsm;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
@TargetApi(17)
public final class CellInfoGsmCAGI {

    @l
    @i(CellInfoGsm.class)
    public interface G extends ClassAccessor {
        @k
        NakedConstructor<CellInfoGsm> ctor();

        @n("mCellIdentityGsm")
        NakedObject<CellIdentityGsm> mCellIdentityGsm();

        @n("mCellSignalStrengthGsm")
        NakedObject<CellSignalStrengthGsm> mCellSignalStrengthGsm();
    }
}
