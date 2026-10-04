package com.prism.gaia.naked.metadata.android.app;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class PendingIntentCAGI {

    @W6.l
    @W6.i(PendingIntent.class)
    public interface G extends ClassAccessor {
        @W6.n("mTarget")
        NakedObject<IInterface> mTarget();
    }

    @W6.l
    @W6.i(PendingIntent.class)
    public interface J18 extends ClassAccessor {
        @W6.p("getIntent")
        NakedMethod<Intent> getIntent();
    }
}
