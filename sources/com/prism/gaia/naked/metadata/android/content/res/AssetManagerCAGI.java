package com.prism.gaia.naked.metadata.android.content.res;

import W6.b;
import W6.c;
import W6.f;
import W6.i;
import W6.k;
import W6.l;
import W6.p;
import android.content.res.AssetManager;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedConstructor;
import com.prism.gaia.naked.entity.NakedMethod;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class AssetManagerCAGI {

    @l
    @i(AssetManager.class)
    public interface G extends ClassAccessor {
        @p("addAssetPath")
        @f({String.class})
        NakedMethod<Integer> addAssetPath();

        @k
        NakedConstructor<AssetManager> ctor();
    }
}
