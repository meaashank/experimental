package com.prism.gaia.naked.metadata.android.media;

import W6.b;
import W6.c;
import W6.j;
import W6.l;
import W6.n;
import W6.q;
import android.os.IInterface;
import com.prism.gaia.naked.core.ClassAccessor;
import com.prism.gaia.naked.entity.NakedObject;
import com.prism.gaia.naked.entity.NakedStaticObject;

/* JADX INFO: loaded from: classes6.dex */
@b
@c
public final class MediaRouterCAGI {

    @l
    @j("android.media.MediaRouter")
    public interface G extends ClassAccessor {

        @l
        @j("android.media.MediaRouter$Static")
        public interface Static extends ClassAccessor {
            @n("mAudioService")
            NakedObject<IInterface> mAudioService();
        }

        @q("sStatic")
        NakedStaticObject sStatic();
    }
}
