package com.prism.gaia.naked.metadata.android.os;

import android.os.Looper;
import android.os.MessageQueue;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class LooperCAGI {

    @W6.l
    @W6.i(Looper.class)
    public interface G extends ClassAccessor {
        @W6.n("mQueue")
        NakedObject<MessageQueue> mQueue();
    }
}
