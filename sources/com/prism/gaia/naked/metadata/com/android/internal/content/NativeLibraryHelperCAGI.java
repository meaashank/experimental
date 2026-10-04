package com.prism.gaia.naked.metadata.com.android.internal.content;

import W6.b;
import W6.c;
import W6.f;
import W6.g;
import W6.j;
import W6.l;
import W6.s;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import java.io.File;
import w7.i;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class NativeLibraryHelperCAGI {

    @l
    @j("com.android.internal.content.NativeLibraryHelper")
    public interface G extends ClassAccessor {
    }

    @l
    @j("com.android.internal.content.NativeLibraryHelper")
    public interface L21 extends ClassAccessor {

        @l
        @j("com.android.internal.content.NativeLibraryHelper$Handle")
        public interface Handle extends ClassAccessor {
            @f({File.class})
            @s(i.f240159x)
            NakedStaticMethod<Object> create();
        }

        @g({"com.android.internal.content.NativeLibraryHelper$Handle", "java.io.File", "java.lang.String"})
        @s("copyNativeBinaries")
        NakedStaticMethod<Integer> copyNativeBinaries();

        @g({"com.android.internal.content.NativeLibraryHelper$Handle", "[Ljava.lang.String;"})
        @s("findSupportedAbi")
        NakedStaticMethod<Integer> findSupportedAbi();
    }
}
