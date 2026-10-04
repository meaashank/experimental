package com.prism.gaia.naked.metadata.android.app.servertransaction;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.n;
import android.os.IBinder;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ClientTransactionCAGI {

    @l
    @j("android.app.servertransaction.ClientTransaction")
    public interface P28 extends ClassAccessor {
        @n("mActivityCallbacks")
        NakedObject<List<Object>> mActivityCallbacks();

        @n("mActivityToken")
        NakedObject<IBinder> mActivityToken();
    }
}
