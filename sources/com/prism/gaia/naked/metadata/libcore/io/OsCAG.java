package com.prism.gaia.naked.metadata.libcore.io;

import W6.c;
import W6.l;
import com.prism.gaia.naked.core.InitOnceClass;
import com.prism.gaia.naked.metadata.libcore.io.OsCAGI;

/* JADX INFO: loaded from: classes6.dex */
@c
public final class OsCAG {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Impl_G f166018G = new Impl_G();
    public static Impl_GUtil GUtil = new Impl_GUtil();

    @l
    public static final class Impl_G implements OsCAGI.G {
        private InitOnceClass __ORG_CLASS = new InitOnceClass("libcore.io.Os");

        @Override // com.prism.gaia.naked.core.ClassAccessor
        public Class ORG_CLASS() {
            return this.__ORG_CLASS.get();
        }
    }

    public static final class Impl_GUtil implements OsCAGI.GUtil {
    }
}
