package com.prism.gaia.naked.metadata.com.android.internal.content;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.k;
import W6.l;
import W6.n;
import android.content.Intent;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ReferrerIntentCAGI {

    @l
    @j("com.android.internal.content.ReferrerIntent")
    public interface G extends ClassAccessor {
        @f({Intent.class, String.class})
        @k
        NakedConstructor<Intent> ctor();

        @n("mReferrer")
        NakedObject<String> mReferrer();
    }
}
