package com.prism.gaia.naked.metadata.android.rms;

import W6.b;
import W6.c;
import W6.j;
import W6.m;
import W6.n;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class HwSysResImplCAGI {

    public interface D {

        public interface HuaWei {

            @m
            @j("android.rms.HwSysResImpl")
            public interface CO26 extends ClassAccessor {
                @n("mWhiteListMap")
                NakedObject<Map<Integer, List<String>>> mWhiteListMap();
            }
        }
    }
}
