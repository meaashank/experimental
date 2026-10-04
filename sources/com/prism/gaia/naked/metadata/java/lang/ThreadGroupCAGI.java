package com.prism.gaia.naked.metadata.java.lang;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.n;
import androidx.constraintlayout.widget.d;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ThreadGroupCAGI {

    @l
    @i(ThreadGroup.class)
    public interface N24 extends ClassAccessor {
        @n("groups")
        NakedObject<ThreadGroup[]> groups();

        @n("ngroups")
        NakedObject<Integer> ngroups();

        @n(d.f107893V1)
        NakedObject<ThreadGroup> parent();

        @n("threads")
        NakedObject<Thread[]> threads();
    }

    @l
    @i(ThreadGroup.class)
    public interface _M23 extends ClassAccessor {
        @n("groups")
        NakedObject<List<ThreadGroup>> groups();

        @n(d.f107893V1)
        NakedObject<ThreadGroup> parent();
    }
}
