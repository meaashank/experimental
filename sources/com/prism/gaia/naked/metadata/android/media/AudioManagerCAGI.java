package com.prism.gaia.naked.metadata.android.media;

import W6.b;
import W6.c;
import W6.i;
import W6.l;
import W6.q;
import W6.s;
import android.media.AudioManager;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedStaticMethod;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class AudioManagerCAGI {

    @l
    @i(AudioManager.class)
    public interface G extends ClassAccessor {
        @s("getService")
        NakedStaticMethod getService();

        @q("sService")
        NakedStaticObject<IInterface> sService();
    }
}
