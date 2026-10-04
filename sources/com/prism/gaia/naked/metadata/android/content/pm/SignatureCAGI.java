package com.prism.gaia.naked.metadata.android.content.pm;

import android.content.pm.Signature;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import java.security.cert.Certificate;

/* JADX INFO: loaded from: classes6.dex */
@W6.b
@W6.c
public final class SignatureCAGI {

    @W6.l
    @W6.i(Signature.class)
    public interface L21 extends ClassAccessor {
        @W6.f({Certificate[].class})
        @W6.k
        NakedConstructor<Object> ctor();
    }
}
