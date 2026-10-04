package com.prism.gaia.naked.metadata.android.os;

import android.os.Message;
import androidx.core.graphics.drawable.IconCompat;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticMethod;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class MessageCAGI {

    @W6.l
    @W6.i(Message.class)
    public interface G extends ClassAccessor {
        @W6.n(IconCompat.f111190A)
        NakedObject<Object> obj();
    }

    @W6.l
    @W6.i(Message.class)
    public interface L21 extends ClassAccessor {
        @W6.f({int.class})
        @W6.s("updateCheckRecycle")
        NakedStaticMethod<Void> updateCheckRecycle();
    }
}
