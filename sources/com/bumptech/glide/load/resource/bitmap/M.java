package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class M extends VideoDecoder<ParcelFileDescriptor> {
    public M(Context context) {
        this(com.bumptech.glide.c.e(context).h());
    }

    public M(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(eVar, new VideoDecoder.g());
    }
}
