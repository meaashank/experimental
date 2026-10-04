package com.prism.gaia.naked.metadata.android.webkit;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.p;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class IWebViewUpdateServiceCAGI {

    @l
    @j("android.webkit.IWebViewUpdateService")
    public interface G extends ClassAccessor {

        @l
        @j("android.webkit.IWebViewUpdateService$Stub")
        public interface Stub extends ClassAccessor {

            @l
            @j("android.webkit.IWebViewUpdateService$Stub$Proxy")
            public interface Proxy extends ClassAccessor {
                @p("getCurrentWebViewPackageName")
                NakedMethod<String> getCurrentWebViewPackageName();
            }
        }
    }
}
