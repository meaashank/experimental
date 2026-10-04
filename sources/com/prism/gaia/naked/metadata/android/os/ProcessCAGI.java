package com.prism.gaia.naked.metadata.android.os;

import android.os.Process;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class ProcessCAGI {

    @W6.l
    @W6.i(Process.class)
    public interface G extends ClassAccessor {
        @W6.f({String.class})
        @W6.s("setArgV0")
        NakedStaticMethod<Void> setArgV0();
    }
}
