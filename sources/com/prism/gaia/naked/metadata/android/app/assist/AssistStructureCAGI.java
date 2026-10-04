package com.prism.gaia.naked.metadata.android.app.assist;

import W6.b;
import W6.j;
import W6.l;
import W6.n;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;

/* JADX INFO: loaded from: classes6.dex */
@b
public final class AssistStructureCAGI {

    @l
    @j("android.app.assist.AssistStructure")
    public interface G extends ClassAccessor {

        @l
        @j("android.app.assist.AssistStructure$ViewNode")
        public interface ViewNode extends ClassAccessor {
            @n("mWebDomain")
            NakedObject<String> mWebDomain();
        }
    }
}
