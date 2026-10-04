package com.prism.gaia.naked.metadata.android.telephony;

import W6.b;
import W6.c;
import W6.i;
import W6.k;
import W6.l;
import W6.n;
import android.annotation.TargetApi;
import android.telephony.CellIdentityCdma;
import android.telephony.CellInfoCdma;
import android.telephony.CellSignalStrengthCdma;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
@TargetApi(17)
public final class CellInfoCdmaCAGI {

    @l
    @i(CellInfoCdma.class)
    public interface G extends ClassAccessor {
        @k
        NakedConstructor<CellInfoCdma> ctor();

        @n("mCellIdentityCdma")
        NakedObject<CellIdentityCdma> mCellIdentityCdma();

        @n("mCellSignalStrengthCdma")
        NakedObject<CellSignalStrengthCdma> mCellSignalStrengthCdma();
    }
}
