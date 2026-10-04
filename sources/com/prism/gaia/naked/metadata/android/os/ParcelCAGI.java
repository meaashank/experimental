package com.prism.gaia.naked.metadata.android.os;

import android.os.Parcelable;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public class ParcelCAGI {

    @W6.l
    @W6.j("android.os.Parcel")
    public interface G extends ClassAccessor {
        @W6.n("mRecycled")
        NakedBoolean mRecycled();

        @W6.f({ClassLoader.class})
        @W6.s("readParcelableCreator")
        NakedMethod<Parcelable.Creator<?>> readParcelableCreator();
    }
}
