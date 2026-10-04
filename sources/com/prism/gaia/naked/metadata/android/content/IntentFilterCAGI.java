package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import android.content.IntentFilter;
import android.util.ArraySet;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class IntentFilterCAGI {

    @l
    @i(IntentFilter.class)
    public interface U34 extends ClassAccessor {
        @n("mActions")
        NakedObject<ArraySet<String>> mActions();
    }

    @l
    @i(IntentFilter.class)
    public interface _T33 extends ClassAccessor {
        @n("mActions")
        NakedObject<List<String>> mActions();
    }
}
