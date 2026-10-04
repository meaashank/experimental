package com.prism.gaia.naked.metadata.android.app;

import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedBoolean;
import com.prism.gaia.naked.entity.NakedInt;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class DownloadManagerCAGI {

    public interface N {

        @W6.l
        @W6.j("android.app.DownloadManager$Query")
        public interface QueryN extends ClassAccessor {
            @W6.n("mIds")
            NakedObject<long[]> mIds();

            @W6.n("mOnlyIncludeVisibleInDownloadsUi")
            NakedBoolean mOnlyIncludeVisibleInDownloadsUi();

            @W6.n("mOrderByColumn")
            NakedObject<String> mOrderByColumn();

            @W6.n("mOrderDirection")
            NakedInt mOrderDirection();

            @W6.n("mStatusFlags")
            NakedObject<Integer> mStatusFlags();
        }
    }
}
