package com.prism.gaia.naked.metadata.android.rms.resource;

import W6.b;
import W6.c;
import W6.j;
import W6.m;
import W6.n;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class ReceiverResourceCAGI {

    public interface D {

        public interface HuaWei {

            @m
            @j("android.rms.resource.ReceiverResource")
            public interface CL extends ClassAccessor {
                @n("mResourceConfig")
                NakedObject<Object> mResourceConfig();
            }

            @m
            @j("android.rms.resource.ReceiverResource")
            public interface CM extends ClassAccessor {
                @n("mWhiteList")
                NakedObject<String[]> mWhiteList();
            }

            @m
            @j("android.rms.resource.ReceiverResource")
            public interface CN24 extends ClassAccessor {
                @n("mWhiteList")
                NakedObject<List<String>> mWhiteList();
            }
        }
    }
}
