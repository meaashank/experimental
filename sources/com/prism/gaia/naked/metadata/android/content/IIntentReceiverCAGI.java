package com.prism.gaia.naked.metadata.android.content;

import W6.b;
import W6.c;
import W6.f;
import W6.j;
import W6.l;
import W6.p;
import android.content.Intent;
import android.os.Bundle;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class IIntentReceiverCAGI {

    @l
    @j("android.content.IIntentReceiver")
    public interface J17 extends ClassAccessor {
        @p("performReceive")
        @f({Intent.class, int.class, String.class, Bundle.class, boolean.class, boolean.class, int.class})
        NakedMethod<Void> performReceive();
    }

    @l
    @j("android.content.IIntentReceiver")
    public interface _J16 extends ClassAccessor {
        @p("performReceive")
        @f({Intent.class, int.class, String.class, Bundle.class, boolean.class, boolean.class})
        NakedMethod<Void> performReceive();
    }
}
